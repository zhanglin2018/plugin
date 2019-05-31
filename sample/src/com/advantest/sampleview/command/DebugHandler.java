package com.advantest.sampleview.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class DebugHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("debug this application.");
		MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), "debug title", "debug this application");
		return null;
	}

}
