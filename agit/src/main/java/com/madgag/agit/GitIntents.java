package com.madgag.agit;

import java.io.File;

import org.eclipse.jgit.revwalk.RevCommit;

import android.content.Intent;
import android.util.Log;

public class GitIntents {

	private static final String TAG="GitIntents";
	
	public static File gitDirFrom(Intent intent) {
		String gitdirString = intent.getStringExtra("gitdir");
		Log.i(TAG, "gitdirString = "+gitdirString);
		File gitdir=new File(gitdirString);
		Log.i(TAG, "gitdir for "+intent+" = "+gitdir.getAbsolutePath());
		return gitdir;
	}

	public static void addGitDirTo(Intent intent, File gitdir) {
		intent.putExtra("gitdir", gitdir.getAbsolutePath());
	}
	
	public static void addRevCommitTo(Intent intent, RevCommit revCommit) {
		intent.putExtra("commit", revCommit.name());
	}
}
