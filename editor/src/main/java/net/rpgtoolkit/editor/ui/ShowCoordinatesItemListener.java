/**
 * Copyright (c) 2015, rpgtoolkit.net <help@rpgtoolkit.net>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of
 * the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.rpgtoolkit.editor.ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

/**
 *
 * @author Joshua Michael Daly
 */
public class ShowCoordinatesItemListener implements ItemListener {

  @Override
  public void itemStateChanged(ItemEvent e) {
    JCheckBoxMenuItem showCoordinatesMenuItem = (JCheckBoxMenuItem) e.getItem();

    MainWindow.getInstance().toogleCoordinatesOnBoardEditor(
            showCoordinatesMenuItem.isSelected());
  }
}
