package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.mod.TextEditor
import typingsJapgolly.atom.srcOtherTypesMod.TextEditorObservedEvent
import typingsJapgolly.atom.srcPaneMod.Pane
import typingsJapgolly.atom.srcPaneMod.PaneItemObservedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceCenterMod {
  
  trait WorkspaceCenter extends StObject {
    
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
    def onDidAddPane(callback: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit]): Disposable
    
    /** Invoke the given callback when a pane item is added to the workspace center. */
    def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
    
    /** Invoke the given callback when a text editor is added to the workspace center. */
    def onDidAddTextEditor(callback: js.Function1[/* event */ TextEditorObservedEvent, Unit]): Disposable
    
    /** Invoke the given callback when the active pane changes. */
    def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
    
    /** Invoke the given callback when the active pane item changes. */
    def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
    
    /** Invoke the given callback when a pane is destroyed in the workspace center. */
    def onDidDestroyPane(callback: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit]): Disposable
    
    /** Invoke the given callback when a pane item is destroyed. */
    def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
    
    /** Invoke the given callback when the active pane item stops changing. */
    def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
    
    /** Invoke the given callback before a pane is destroyed in the workspace center. */
    def onWillDestroyPane(callback: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit]): Disposable
    
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
    
    inline def apply(
      activateNextPane: Callback,
      activatePreviousPane: Callback,
      destroyActivePane: Callback,
      getActivePane: CallbackTo[Pane],
      getActivePaneItem: CallbackTo[js.UndefOr[js.Object]],
      getActiveTextEditor: CallbackTo[js.UndefOr[TextEditor]],
      getPaneItems: CallbackTo[js.Array[js.Object]],
      getPanes: CallbackTo[js.Array[Pane]],
      getTextEditors: CallbackTo[js.Array[TextEditor]],
      observeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
      observeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
      observePaneItems: js.Function1[/* item */ js.Object, Unit] => Disposable,
      observePanes: js.Function1[/* pane */ Pane, Unit] => Disposable,
      observeTextEditors: js.Function1[/* editor */ TextEditor, Unit] => Disposable,
      onDidAddPane: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable,
      onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
      onDidAddTextEditor: js.Function1[/* event */ TextEditorObservedEvent, Unit] => Disposable,
      onDidChangeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
      onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
      onDidDestroyPane: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable,
      onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
      onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
      onWillDestroyPane: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable,
      onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable,
      paneForItem: js.Object => js.UndefOr[Pane],
      paneForURI: String => js.UndefOr[Pane],
      saveAll: Callback
    ): WorkspaceCenter = {
      val __obj = js.Dynamic.literal(activateNextPane = activateNextPane.toJsFn, activatePreviousPane = activatePreviousPane.toJsFn, destroyActivePane = destroyActivePane.toJsFn, getActivePane = getActivePane.toJsFn, getActivePaneItem = getActivePaneItem.toJsFn, getActiveTextEditor = getActiveTextEditor.toJsFn, getPaneItems = getPaneItems.toJsFn, getPanes = getPanes.toJsFn, getTextEditors = getTextEditors.toJsFn, observeActivePane = js.Any.fromFunction1(observeActivePane), observeActivePaneItem = js.Any.fromFunction1(observeActivePaneItem), observePaneItems = js.Any.fromFunction1(observePaneItems), observePanes = js.Any.fromFunction1(observePanes), observeTextEditors = js.Any.fromFunction1(observeTextEditors), onDidAddPane = js.Any.fromFunction1(onDidAddPane), onDidAddPaneItem = js.Any.fromFunction1(onDidAddPaneItem), onDidAddTextEditor = js.Any.fromFunction1(onDidAddTextEditor), onDidChangeActivePane = js.Any.fromFunction1(onDidChangeActivePane), onDidChangeActivePaneItem = js.Any.fromFunction1(onDidChangeActivePaneItem), onDidDestroyPane = js.Any.fromFunction1(onDidDestroyPane), onDidDestroyPaneItem = js.Any.fromFunction1(onDidDestroyPaneItem), onDidStopChangingActivePaneItem = js.Any.fromFunction1(onDidStopChangingActivePaneItem), onWillDestroyPane = js.Any.fromFunction1(onWillDestroyPane), onWillDestroyPaneItem = js.Any.fromFunction1(onWillDestroyPaneItem), paneForItem = js.Any.fromFunction1(paneForItem), paneForURI = js.Any.fromFunction1(paneForURI), saveAll = saveAll.toJsFn)
      __obj.asInstanceOf[WorkspaceCenter]
    }
    
    extension [Self <: WorkspaceCenter](x: Self) {
      
      inline def setActivateNextPane(value: Callback): Self = StObject.set(x, "activateNextPane", value.toJsFn)
      
      inline def setActivatePreviousPane(value: Callback): Self = StObject.set(x, "activatePreviousPane", value.toJsFn)
      
      inline def setDestroyActivePane(value: Callback): Self = StObject.set(x, "destroyActivePane", value.toJsFn)
      
      inline def setGetActivePane(value: CallbackTo[Pane]): Self = StObject.set(x, "getActivePane", value.toJsFn)
      
      inline def setGetActivePaneItem(value: CallbackTo[js.UndefOr[js.Object]]): Self = StObject.set(x, "getActivePaneItem", value.toJsFn)
      
      inline def setGetActiveTextEditor(value: CallbackTo[js.UndefOr[TextEditor]]): Self = StObject.set(x, "getActiveTextEditor", value.toJsFn)
      
      inline def setGetPaneItems(value: CallbackTo[js.Array[js.Object]]): Self = StObject.set(x, "getPaneItems", value.toJsFn)
      
      inline def setGetPanes(value: CallbackTo[js.Array[Pane]]): Self = StObject.set(x, "getPanes", value.toJsFn)
      
      inline def setGetTextEditors(value: CallbackTo[js.Array[TextEditor]]): Self = StObject.set(x, "getTextEditors", value.toJsFn)
      
      inline def setObserveActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = StObject.set(x, "observeActivePane", js.Any.fromFunction1(value))
      
      inline def setObserveActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "observeActivePaneItem", js.Any.fromFunction1(value))
      
      inline def setObservePaneItems(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "observePaneItems", js.Any.fromFunction1(value))
      
      inline def setObservePanes(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = StObject.set(x, "observePanes", js.Any.fromFunction1(value))
      
      inline def setObserveTextEditors(value: js.Function1[/* editor */ TextEditor, Unit] => Disposable): Self = StObject.set(x, "observeTextEditors", js.Any.fromFunction1(value))
      
      inline def setOnDidAddPane(value: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable): Self = StObject.set(x, "onDidAddPane", js.Any.fromFunction1(value))
      
      inline def setOnDidAddPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidAddPaneItem", js.Any.fromFunction1(value))
      
      inline def setOnDidAddTextEditor(value: js.Function1[/* event */ TextEditorObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidAddTextEditor", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = StObject.set(x, "onDidChangeActivePane", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "onDidChangeActivePaneItem", js.Any.fromFunction1(value))
      
      inline def setOnDidDestroyPane(value: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable): Self = StObject.set(x, "onDidDestroyPane", js.Any.fromFunction1(value))
      
      inline def setOnDidDestroyPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidDestroyPaneItem", js.Any.fromFunction1(value))
      
      inline def setOnDidStopChangingActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "onDidStopChangingActivePaneItem", js.Any.fromFunction1(value))
      
      inline def setOnWillDestroyPane(value: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable): Self = StObject.set(x, "onWillDestroyPane", js.Any.fromFunction1(value))
      
      inline def setOnWillDestroyPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable): Self = StObject.set(x, "onWillDestroyPaneItem", js.Any.fromFunction1(value))
      
      inline def setPaneForItem(value: js.Object => js.UndefOr[Pane]): Self = StObject.set(x, "paneForItem", js.Any.fromFunction1(value))
      
      inline def setPaneForURI(value: String => js.UndefOr[Pane]): Self = StObject.set(x, "paneForURI", js.Any.fromFunction1(value))
      
      inline def setSaveAll(value: Callback): Self = StObject.set(x, "saveAll", value.toJsFn)
    }
  }
}
