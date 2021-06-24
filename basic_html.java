package Example;

import java.io.File;
import java.io.IOException;
import com.itextpdf.html2pdf.HtmlConverter;

public class HtmlToPDFExample {

    public static final String DEST = "output_file_path/output_pdf.pdf";
    public static final String SRC = "input_file_path/input_html.html";

    public static void main(String[] args) throws IOException
    {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new HtmlToPDFExample().createPdf(SRC, DEST);
    }

    public void createPdf(String src, String dest) throws IOException
    {
        HtmlConverter.convertToPdf(new File(src), new File(dest));
    }
}
