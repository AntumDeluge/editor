/**
 * Copyright (c) 2015, rpgtoolkit.net <help@rpgtoolkit.net>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.rpgtoolkit.editor.ui.toolbar;

import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import net.rpgtoolkit.editor.properties.EditorProperties;
import net.rpgtoolkit.editor.properties.EditorProperty;
import net.rpgtoolkit.editor.ui.EditorButton;
import net.rpgtoolkit.editor.ui.actions.BucketAction;
import net.rpgtoolkit.editor.ui.actions.EraserAction;
import net.rpgtoolkit.editor.ui.actions.HelpAction;
import net.rpgtoolkit.editor.ui.actions.LightAction;
import net.rpgtoolkit.editor.ui.actions.OpenFileAction;
import net.rpgtoolkit.editor.ui.actions.PencilAction;
import net.rpgtoolkit.editor.ui.actions.RunAction;
import net.rpgtoolkit.editor.ui.actions.SaveAction;
import net.rpgtoolkit.editor.ui.actions.SelectionAction;
import net.rpgtoolkit.editor.ui.actions.SpriteAction;
import net.rpgtoolkit.editor.ui.actions.StartPositionAction;
import net.rpgtoolkit.editor.ui.actions.StopAction;
import net.rpgtoolkit.editor.ui.actions.VectorAction;
import net.rpgtoolkit.editor.ui.actions.ZoomInAction;
import net.rpgtoolkit.editor.ui.actions.ZoomOutAction;
import net.rpgtoolkit.editor.ui.resources.Icons;

/**
 *
 * @author Joshua Michael Daly
 */
public class MainToolBar extends JToolBar {

  private final JPopupMenu popupMenu;
  private final JMenuItem newAnimationMenu;
  private final JMenuItem newProjectMenu;

  private final EditorButton newButton;
  private final EditorButton openButton;
  private final EditorButton saveButton;
  private final EditorButton saveAllButton;

  private final EditorButton cutButton;
  private final EditorButton copyButton;
  private final EditorButton pasteButton;
  private final EditorButton deleteButton;

  private final EditorButton undoButton;
  private final EditorButton redoButton;

  private final ButtonGroup toolButtonGroup;
  private final JToggleButton pencilButton;
  private final JToggleButton selectionButton;
  private final JToggleButton bucketButton;
  private final JToggleButton eraserButton;
  
  private final JToggleButton vectorButton;
  private final JToggleButton spriteButton;
  private final JToggleButton lightButton;
  private final JToggleButton startPositionButton;

  private final EditorButton zoomInButton;
  private final EditorButton zoomOutButton;

  private final EditorButton runButton;
  private final EditorButton stopButton;

  private final EditorButton helpButton;

  public MainToolBar() {
    super();

    setFloatable(false);

    popupMenu = new JPopupMenu();
    newAnimationMenu = new JMenuItem("Animation");
    newProjectMenu = new JMenuItem("Project");

    popupMenu.add(newAnimationMenu);
    popupMenu.add(newProjectMenu);

    newButton = new EditorButton();
    newButton.setIcon(Icons.getSmallIcon("new"));
    newButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_NEW));
    newButton.setEnabled(false);

    openButton = new EditorButton();
    openButton.setAction(new OpenFileAction());
    openButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_OPEN));
    openButton.setIcon(Icons.getSmallIcon("open"));
    
    saveButton = new EditorButton();
    saveButton.setAction(new SaveAction());
    saveButton.setIcon(Icons.getSmallIcon("save"));
    saveButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_SAVE));

    saveAllButton = new EditorButton();
    saveAllButton.setIcon(Icons.getSmallIcon("save-all"));
    saveAllButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_SAVE_ALL));
    saveAllButton.setEnabled(false);

    cutButton = new EditorButton();
    cutButton.setIcon(Icons.getSmallIcon("cut"));
    cutButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_CUT));
    cutButton.setEnabled(false);

    copyButton = new EditorButton();
    copyButton.setIcon(Icons.getSmallIcon("copy"));
    copyButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_COPY));
    copyButton.setEnabled(false);

    pasteButton = new EditorButton();
    pasteButton.setIcon(Icons.getSmallIcon("paste"));
    pasteButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_PASTE));
    pasteButton.setEnabled(false);

    deleteButton = new EditorButton();
    deleteButton.setIcon(Icons.getSmallIcon("delete"));
    deleteButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_DELETE));
    deleteButton.setEnabled(false);

    undoButton = new EditorButton();
    undoButton.setIcon(Icons.getSmallIcon("undo"));
    undoButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_UNDO));
    undoButton.setEnabled(false);
    
    redoButton = new EditorButton();
    redoButton.setIcon(Icons.getSmallIcon("redo"));
    redoButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_REDO));
    redoButton.setEnabled(false);

    pencilButton = new JToggleButton();
    pencilButton.setFocusable(false);
    pencilButton.setAction(new PencilAction());
    pencilButton.setIcon(Icons.getSmallIcon("pencil"));
    pencilButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_DRAW_TILE));

    selectionButton = new JToggleButton();
    selectionButton.setFocusable(false);
    selectionButton.setAction(new SelectionAction());
    selectionButton.setIcon(Icons.getSmallIcon("selection"));
    selectionButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_SELECT_REGION));

    bucketButton = new JToggleButton();
    bucketButton.setFocusable(false);
    bucketButton.setAction(new BucketAction());
    bucketButton.setIcon(Icons.getSmallIcon("bucket"));
    bucketButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_FILL_REGION));

    eraserButton = new JToggleButton();
    eraserButton.setFocusable(false);
    eraserButton.setAction(new EraserAction());
    eraserButton.setIcon(Icons.getSmallIcon("eraser"));
    eraserButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_ERASE_REGION));

    vectorButton = new JToggleButton();
    vectorButton.setFocusable(false);
    vectorButton.setAction(new VectorAction());
    vectorButton.setIcon(Icons.getSmallIcon("layer-shape-polyline"));
    vectorButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_DRAW_VECTOR));

    spriteButton = new JToggleButton();
    spriteButton.setFocusable(false);
    spriteButton.setAction(new SpriteAction());
    spriteButton.setIcon(Icons.getSmallIcon("character"));
    spriteButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_SET_BOARD_SPRITE));

    lightButton = new JToggleButton();
    lightButton.setFocusable(false);
    lightButton.setAction(new LightAction());
    lightButton.setIcon(Icons.getSmallIcon("flashlight-shine"));
    lightButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_SET_BOARD_LIGHT));
    lightButton.setEnabled(false);
    
    startPositionButton = new JToggleButton();
    startPositionButton.setFocusable(false);
    startPositionButton.setAction(new StartPositionAction());
    startPositionButton.setIcon(Icons.getSmallIcon("flag-checker"));
    startPositionButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_SET_START_POSITION));

    zoomInButton = new EditorButton();
    zoomInButton.setAction(new ZoomInAction());
    zoomInButton.setIcon(Icons.getSmallIcon("zoom-in"));
    zoomInButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_ZOOM_IN));

    zoomOutButton = new EditorButton();
    zoomOutButton.setAction(new ZoomOutAction());
    zoomOutButton.setIcon(Icons.getSmallIcon("zoom-out"));
    zoomOutButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_ZOOM_OUT));
    
    runButton = new EditorButton();
    runButton.setAction(new RunAction());
    runButton.setIcon(Icons.getSmallIcon("run"));
    runButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_RUN_GAME));
    runButton.setEnabled(false);

    stopButton = new EditorButton();
    stopButton.setAction(new StopAction());
    stopButton.setIcon(Icons.getSmallIcon("stop"));
    stopButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_STOP_GAME));
    stopButton.setEnabled(false);

    helpButton = new EditorButton();
    helpButton.setAction(new HelpAction());
    helpButton.setIcon(Icons.getSmallIcon("help"));
    helpButton.setToolTipText(EditorProperties.getProperty(EditorProperty.EDITOR_UI_TOOLTIP_HELP));
    helpButton.setEnabled(false);

    // Disable all the buttons for now
    toggleButtonStates(false);

    toolButtonGroup = new ButtonGroup();
    toolButtonGroup.add(pencilButton);
    toolButtonGroup.add(selectionButton);
    toolButtonGroup.add(bucketButton);
    toolButtonGroup.add(eraserButton);
    toolButtonGroup.add(vectorButton);
    toolButtonGroup.add(spriteButton);
    toolButtonGroup.add(lightButton);
    toolButtonGroup.add(startPositionButton);

    add(newButton);
    add(openButton);
    add(saveButton);
    add(saveAllButton);
    addSeparator();
    add(cutButton);
    add(copyButton);
    add(pasteButton);
    add(deleteButton);
    addSeparator();
    add(undoButton);
    add(redoButton);
    addSeparator();
    add(pencilButton);
    add(selectionButton);
    add(bucketButton);
    add(eraserButton);
    add(vectorButton);
    add(spriteButton);
//    add(lightButton);
    add(startPositionButton);
    addSeparator();
    add(zoomInButton);
    add(zoomOutButton);
    addSeparator();
    add(runButton);
    add(stopButton);
    addSeparator();
    add(helpButton);
  }

  public JPopupMenu getPopupMenu() {
    return popupMenu;
  }

  public JMenuItem getNewAnimationMenu() {
    return newAnimationMenu;
  }

  public JMenuItem getNewProjectMenu() {
    return newProjectMenu;
  }

  public EditorButton getNewButton() {
    return newButton;
  }

  public EditorButton getOpenButton() {
    return openButton;
  }

  public EditorButton getSaveButton() {
    return saveButton;
  }

  public EditorButton getSaveAllButton() {
    return saveAllButton;
  }

  public EditorButton getCutButton() {
    return cutButton;
  }

  public EditorButton getCopyButton() {
    return copyButton;
  }

  public EditorButton getPasteButton() {
    return pasteButton;
  }

  public EditorButton getDeleteButton() {
    return deleteButton;
  }

  public EditorButton getUndoButton() {
    return undoButton;
  }

  public EditorButton getRedoButton() {
    return redoButton;
  }

  public ButtonGroup getToolButtonGroup() {
    return toolButtonGroup;
  }

  public JToggleButton getPencilButton() {
    return pencilButton;
  }

  public JToggleButton getSelectionButton() {
    return selectionButton;
  }

  public JToggleButton getBucketButton() {
    return bucketButton;
  }

  public JToggleButton getEraserButton() {
    return eraserButton;
  }

  public EditorButton getZoomInButton() {
    return zoomInButton;
  }

  public EditorButton getZoomOutButton() {
    return zoomOutButton;
  }

  public EditorButton getRunButton() {
    return runButton;
  }

  public EditorButton getStopButton() {
    return stopButton;
  }

  public EditorButton getHelpButton() {
    return helpButton;
  }

  public final void toggleButtonStates(boolean enable) {
//    newButton.setEnabled(enable);
    openButton.setEnabled(enable);
    saveButton.setEnabled(enable);
//    saveAllButton.setEnabled(enable);
//    cutButton.setEnabled(enable);
//    copyButton.setEnabled(enable);
//    pasteButton.setEnabled(enable);
//    deleteButton.setEnabled(enable);
//    undoButton.setEnabled(enable);
//    redoButton.setEnabled(enable);
    pencilButton.setEnabled(enable);
    selectionButton.setEnabled(enable);
    bucketButton.setEnabled(enable);
    eraserButton.setEnabled(enable);
    vectorButton.setEnabled(enable);
    spriteButton.setEnabled(enable);
    //lightButton.setEnabled(enable);
    startPositionButton.setEnabled(enable);
    zoomInButton.setEnabled(enable);
    zoomOutButton.setEnabled(enable);
    runButton.setEnabled(enable);
//    stopButton.setEnabled(enable);
//    helpButton.setEnabled(enable);
  }

}
