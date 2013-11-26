package mobConv;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.jsoup.nodes.Document;

public class SiteMobilizer {

	URL url;
	Document doc;
	StringBuilder css;
	StringBuilder js;
	int generatedClassCount = 0;
	
	SiteMobilizer (URL url) {
		this.url = url;
		// pobierz strone
		
		// wczytaj do stringBuildera
	}
	
	public void ViewSite (String site, String path)
	{
		File file = new File(path);
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(site);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("ERROR: " + e.getMessage() + " :");
			e.printStackTrace();
		}
		
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *  Metoda wyłuskująca style osadzone w html <style></styl>
	 */
	private void cssFromHtmlStyleTag ()
	{
		
	}
	

	/**
	 *  Metoda wyłuskująca style osadzone w html <a style:"..."> </a>
	 */
	private void cssFromHtmlTags ()
	{
		
	}
	
	/**
	 * Metoda wyłuskująca style z plików zewnętrznych
	 */
	private void cssFromExternalFile ()
	{
		
	}
	
	/**
	 * Metoda usuwa zbędne właściwości z bufora z css-em
	 */
	private void cssClean ()
	{
		
	}
	
	
	/**
	 * Metoda dodaje do strony gotowy bufor z css-em 
	 */
	private void cssAddAllToHTML ()
	{
		
	}
	
	
	/**
	 * Metoda usuwa argumenty width i Hight ze znaczników html 
	 */
	private void   htmlRemoveWidthAndHight ()
	{
		
	}
	
	/**
	 * Metoda dodaje argument shape="rect" do linków 
	 */
	private void   htmlAddRectToHref()
	{
		
	}
	
}
