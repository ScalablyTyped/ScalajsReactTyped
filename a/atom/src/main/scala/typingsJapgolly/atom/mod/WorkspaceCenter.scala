package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.AnonPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceCenter extends js.Object {
  /** Make the next pane active. */
  def activateNextPane(): Unit
  /** Make the previous pane active. */
  def activatePreviousPane(): Unit
  /** Destroy (close) the active pane. */
  def destroyActivePane(): Unit
  /** Get the active Pane. */
  def getActivePane(): Pane
  /** Get the active Pane's active item. */
  def getActivePaneItem(): js.UndefOr[js.Object]
  /** Get the active item if it is an TextEditor. */
  def getActiveTextEditor(): js.UndefOr[TextEditor]
  // Pane Items
  /** Get all pane items in the workspace center. */
  def getPaneItems(): js.Array[js.Object]
  // Panes
  /** Get all panes in the workspace center. */
  def getPanes(): js.Array[Pane]
  /** Get all text editors in the workspace center. */
  def getTextEditors(): js.Array[TextEditor]
  /**
    *  Invoke the given callback with the current active pane and when the active pane
    *  changes.
    */
  def observeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
  /**
    *  Invoke the given callback with the current active pane item and with all future
    *  active pane items in the workspace center.
    */
  def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
  /**
    *  Invoke the given callback with all current and future panes items in the
    *  workspace center.
    */
  def observePaneItems(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
  /** Invoke the given callback with all current and future panes in the workspace center. */
  def observePanes(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
  // Event Subscription
  /**
    *  Invoke the given callback with all current and future text editors in the
    *  workspace center.
    */
  def observeTextEditors(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable
  /** Invoke the given callback when a pane is added to the workspace center. */
  def onDidAddPane(callback: js.Function1[/* event */ AnonPane, Unit]): Disposable
  /** Invoke the given callback when a pane item is added to the workspace center. */
  def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
  /** Invoke the given callback when a text editor is added to the workspace center. */
  def onDidAddTextEditor(callback: js.Function1[/* event */ TextEditorObservedEvent, Unit]): Disposable
  /** Invoke the given callback when the active pane changes. */
  def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
  /** Invoke the given callback when the active pane item changes. */
  def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
  /** Invoke the given callback when a pane is destroyed in the workspace center. */
  def onDidDestroyPane(callback: js.Function1[/* event */ AnonPane, Unit]): Disposable
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
  /** Invoke the given callback before a pane is destroyed in the workspace center. */
  def onWillDestroyPane(callback: js.Function1[/* event */ AnonPane, Unit]): Disposable
  /**
    *  Invoke the given callback when a pane item is about to be destroyed, before the user
    *  is prompted to save it.
    *  @param callback The function to be called before pane items are destroyed.
    *      If this function returns a Promise, then the item will not be destroyed
    *      until the promise resolves.
    */
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]]): Disposable
  /** Retrieve the Pane associated with the given item. */
  def paneForItem(item: js.Object): js.UndefOr[Pane]
  /** Retrieve the Pane associated with the given URI. */
  def paneForURI(uri: String): js.UndefOr[Pane]
  /** Save all pane items. */
  def saveAll(): Unit
}

object WorkspaceCenter {
  @scala.inline
  def apply(
    activateNextPane: Callback,
    activatePreviousPane: Callback,
    destroyActivePane: Callback,
    getActivePane: CallbackTo[Pane],
    getActivePaneItem: CallbackTo[js.UndefOr[js.Object]],
    getActiveTextEditor: CallbackTo[js.UndefOr[TextEditor]],
    getPaneItems: CallbackTo[js.Array[js.Object]],
    getPanes: CallbackTo[js.Array[Pane]],
    getTextEditors: CallbackTo[js.Array[TextEditor]],
    observeActivePane: js.Function1[/* pane */ Pane, Unit] => CallbackTo[Disposable],
    observeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    observePaneItems: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    observePanes: js.Function1[/* pane */ Pane, Unit] => CallbackTo[Disposable],
    observeTextEditors: js.Function1[/* editor */ TextEditor, Unit] => CallbackTo[Disposable],
    onDidAddPane: js.Function1[/* event */ AnonPane, Unit] => CallbackTo[Disposable],
    onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => CallbackTo[Disposable],
    onDidAddTextEditor: js.Function1[/* event */ TextEditorObservedEvent, Unit] => CallbackTo[Disposable],
    onDidChangeActivePane: js.Function1[/* pane */ Pane, Unit] => CallbackTo[Disposable],
    onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    onDidDestroyPane: js.Function1[/* event */ AnonPane, Unit] => CallbackTo[Disposable],
    onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => CallbackTo[Disposable],
    onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    onWillDestroyPane: js.Function1[/* event */ AnonPane, Unit] => CallbackTo[Disposable],
    onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => CallbackTo[Disposable],
    paneForItem: js.Object => CallbackTo[js.UndefOr[Pane]],
    paneForURI: String => CallbackTo[js.UndefOr[Pane]],
    saveAll: Callback
  ): WorkspaceCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateNextPane")(activateNextPane.toJsFn)
    __obj.updateDynamic("activatePreviousPane")(activatePreviousPane.toJsFn)
    __obj.updateDynamic("destroyActivePane")(destroyActivePane.toJsFn)
    __obj.updateDynamic("getActivePane")(getActivePane.toJsFn)
    __obj.updateDynamic("getActivePaneItem")(getActivePaneItem.toJsFn)
    __obj.updateDynamic("getActiveTextEditor")(getActiveTextEditor.toJsFn)
    __obj.updateDynamic("getPaneItems")(getPaneItems.toJsFn)
    __obj.updateDynamic("getPanes")(getPanes.toJsFn)
    __obj.updateDynamic("getTextEditors")(getTextEditors.toJsFn)
    __obj.updateDynamic("observeActivePane")(js.Any.fromFunction1((t0: js.Function1[/* pane */ typingsJapgolly.atom.mod.Pane, scala.Unit]) => observeActivePane(t0).runNow()))
    __obj.updateDynamic("observeActivePaneItem")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => observeActivePaneItem(t0).runNow()))
    __obj.updateDynamic("observePaneItems")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => observePaneItems(t0).runNow()))
    __obj.updateDynamic("observePanes")(js.Any.fromFunction1((t0: js.Function1[/* pane */ typingsJapgolly.atom.mod.Pane, scala.Unit]) => observePanes(t0).runNow()))
    __obj.updateDynamic("observeTextEditors")(js.Any.fromFunction1((t0: js.Function1[/* editor */ typingsJapgolly.atom.mod.TextEditor, scala.Unit]) => observeTextEditors(t0).runNow()))
    __obj.updateDynamic("onDidAddPane")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.AnonPane, scala.Unit]) => onDidAddPane(t0).runNow()))
    __obj.updateDynamic("onDidAddPaneItem")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.mod.PaneItemObservedEvent, scala.Unit]) => onDidAddPaneItem(t0).runNow()))
    __obj.updateDynamic("onDidAddTextEditor")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.mod.TextEditorObservedEvent, scala.Unit]) => onDidAddTextEditor(t0).runNow()))
    __obj.updateDynamic("onDidChangeActivePane")(js.Any.fromFunction1((t0: js.Function1[/* pane */ typingsJapgolly.atom.mod.Pane, scala.Unit]) => onDidChangeActivePane(t0).runNow()))
    __obj.updateDynamic("onDidChangeActivePaneItem")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => onDidChangeActivePaneItem(t0).runNow()))
    __obj.updateDynamic("onDidDestroyPane")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.AnonPane, scala.Unit]) => onDidDestroyPane(t0).runNow()))
    __obj.updateDynamic("onDidDestroyPaneItem")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.mod.PaneItemObservedEvent, scala.Unit]) => onDidDestroyPaneItem(t0).runNow()))
    __obj.updateDynamic("onDidStopChangingActivePaneItem")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => onDidStopChangingActivePaneItem(t0).runNow()))
    __obj.updateDynamic("onWillDestroyPane")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.AnonPane, scala.Unit]) => onWillDestroyPane(t0).runNow()))
    __obj.updateDynamic("onWillDestroyPaneItem")(js.Any.fromFunction1((t0: js.Function1[
  /* event */ typingsJapgolly.atom.mod.PaneItemObservedEvent, 
  scala.Unit | js.Promise[scala.Unit]]) => onWillDestroyPaneItem(t0).runNow()))
    __obj.updateDynamic("paneForItem")(js.Any.fromFunction1((t0: js.Object) => paneForItem(t0).runNow()))
    __obj.updateDynamic("paneForURI")(js.Any.fromFunction1((t0: java.lang.String) => paneForURI(t0).runNow()))
    __obj.updateDynamic("saveAll")(saveAll.toJsFn)
    __obj.asInstanceOf[WorkspaceCenter]
  }
}

