package pl.edu.pw.mini.zpoif.gradedtask.second.document;

import java.util.Random;

public abstract class Document {
	protected int id = (new Random()).nextInt();
	public abstract void destroyMe();
}
