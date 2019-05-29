package com.plugindev.addressbook.example;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ObjExampleAction implements IObjectActionDelegate {
	private IWorkbenchPart targetPart;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	public void run(IAction action) {
		MessageDialog.openInformation(targetPart.getSite().getShell(),
				"message", "ObjExampleAction has been called.");
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}
}
