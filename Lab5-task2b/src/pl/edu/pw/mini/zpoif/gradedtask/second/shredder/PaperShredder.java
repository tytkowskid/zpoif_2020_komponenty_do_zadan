package pl.edu.pw.mini.zpoif.gradedtask.second.shredder;

import java.util.Random;

import pl.edu.pw.mini.zpoif.gradedtask.second.document.Document;

public abstract class PaperShredder {
	
	protected static final String EU_NORM_NAME = "DIN 32757";
	protected int shredderId = (new Random()).nextInt();
	
	protected void destroyDocument(Document document) {
		document.destroyMe();
	}
	
}
