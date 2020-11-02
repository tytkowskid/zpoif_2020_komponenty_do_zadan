package pl.edu.pw.mini.zpoif.gradedtask.second.multishredder;

import java.util.List;

import pl.edu.pw.mini.zpoif.gradedtask.second.document.Document;

public abstract class MultiShredder {
	
	protected interface Summaryable {
		public abstract int getNumberOfTopSecretDocuments();
	}
	
	public abstract void destroyAllDocuments(List<Document> internalDocuments);
	
	protected abstract void destroyInternalDocument(Document document);
	protected abstract void destroyConfidentialDocument(Document document);
	protected abstract void destroySecretDocument(Document document);
	protected abstract void destroyAnyDocument(Document document);
	
	protected abstract void summary(Summaryable summaryable);
}
