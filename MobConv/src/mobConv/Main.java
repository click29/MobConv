/**
 * 
 */
package mobConv;

/**
 * @author click
 *
 */

import java.io.IOException;
import java.util.List;

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
		Document doc = null;
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
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements newsHeadlines = doc.select("#mp-itn b a");
	}

}
