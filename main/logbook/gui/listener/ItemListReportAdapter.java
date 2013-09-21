/**
 * No Rights Reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Public Domain.
 */
package logbook.gui.listener;

import logbook.gui.TableDialog;
import logbook.gui.logic.CreateReportLogic;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;

/**
 * 所有装備一覧ボタンのリスナー
 * 
 */
public final class ItemListReportAdapter extends AbstractReportAdapter {

    /**
     * @param shell シェル
     */
    public ItemListReportAdapter(Shell shell) {
        super(shell);
    }

    @Override
    public void widgetSelected(SelectionEvent paramSelectionEvent) {
        new TableDialog(this.shell, "所有装備一覧", CreateReportLogic.getItemListHeader(),
                CreateReportLogic.getItemListBody(), CreateReportLogic.DEFAULT_TABLE_ITEM_CREATOR).open();
    }
}