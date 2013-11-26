/**
 * 
 */
package mobConv;

/**
 * @author szpiega
 *
 */

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.print.attribute.standard.Copies;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Document doc = null;
		try {
			doc = Jsoup.connect("http://hacking.pl/").get();
			Elements el = doc.select("link[rel=stylesheet]");
			for (Element element : el) {
			//	System.out.println(element.toString());
			}
			
			List<Node> l = doc.body().childNodes();
			
			for (Node n : l)
			{
			 System.out.println(n.nodeName() + ": ");
			}
			System.out.println("");
			System.out.println("");
			System.out.println(l.get(1).nodeName());
			System.out.println(l.get(1).toString());
			//aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			//erwerwqer
			
			File file = new File("strona.html");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(l.get(1).toString());
			bw.close();

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(file);
			}
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements newsHeadlines = doc.select("#mp-itn b a");
		try {
			URL url = new URL("http://hacking.pl/");
			CopyOfSiteMobilizer c = new CopyOfSiteMobilizer(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
