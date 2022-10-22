package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.srcPaneMod.Pane
import typingsJapgolly.atom.srcPaneMod.PaneItemObservedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDockMod {
  
  trait Dock extends StObject {
    
    // Methods
    /** Show the dock and focus its active Pane. */
    def activate(): Unit
    
    /** Make the next pane active. */
    def activateNextPane(): Boolean
    
    /** Make the previous pane active. */
    def activatePreviousPane(): Boolean
    
    /** Get the active Pane. */
    def getActivePane(): Pane
    
    /** Get the active Pane's active item. */
    def getActivePaneItem(): js.Object
    
    // Pane Items
    /** Get all pane items in the dock. */
    def getPaneItems(): js.Array[js.Object]
    
    // Panes
    /** Returns an Array of Panes. */
    def getPanes(): js.Array[Pane]
    
    /**
      *  Hide the dock and activate the WorkspaceCenter if the dock was was previously
      *  focused.
      */
    def hide(): Unit
    
    /** Check if the dock is visible. */
    def isVisible(): Boolean
    
    /**
      *  Invoke the given callback with the current active pane and when the active
      *  pane changes.
      */
    def observeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
    
    /**
      *  Invoke the given callback with the current active pane item and with all future
      *  active pane items in the dock.
      */
    def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
    
    /** Invoke the given callback with all current and future panes items in the dock. */
    def observePaneItems(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
    
    /** Invoke the given callback with all current and future panes in the dock. */
    def observePanes(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
    
    /**
      *  Invoke the given callback with the current and all future visibilities of
      *  the dock.
      */
    def observeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable
    
    /** Invoke the given callback when a pane is added to the dock. */
    def onDidAddPane(callback: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit]): Disposable
    
    /** Invoke the given callback when a pane item is added to the dock. */
    def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
    
    /** Invoke the given callback when the active pane changes. */
    def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable
    
    /**
      *  Invoke the given callback when the active pane item changes.
      *
      *  Because observers are invoked synchronously, it's important not to perform any
      *  expensive operations via this method. Consider ::onDidStopChangingActivePaneItem
      *  to delay operations until after changes stop occurring.
      */
    def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
    
    /**
      *  Invoke the given callback when the hovered state of the dock changes.
      *  @param hovered Is the dock now hovered?
      */
    def onDidChangeHovered(callback: js.Function1[/* hovered */ Boolean, Unit]): Disposable
    
    // Event Subscription
    /** Invoke the given callback when the visibility of the dock changes. */
    def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable
    
    /** Invoke the given callback when a pane is destroyed in the dock. */
    def onDidDestroyPane(callback: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit]): Disposable
    
    /** Invoke the given callback when a pane item is destroyed. */
    def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
    
    /** Invoke the given callback when the active pane item stops changing. */
    def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
    
    /** Invoke the given callback before a pane is destroyed in the dock. */
    def onWillDestroyPane(callback: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit]): Disposable
    
    /**
      *  Invoke the given callback when a pane item is about to be destroyed, before the user is
      *  prompted to save it.
      *  @param callback The function to be called before pane items are destroyed.
      *      If this function returns a Promise, then the item will not be destroyed
      *      until the promise resolves.
      */
    def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]]): Disposable
    
    /** Show the dock without focusing it. */
    def show(): Unit
    
    /**
      *  Toggle the dock's visibility without changing the Workspace's active pane
      *  container.
      */
    def toggle(): Unit
  }
  object Dock {
    
    inline def apply(
      activate: Callback,
      activateNextPane: CallbackTo[Boolean],
      activatePreviousPane: CallbackTo[Boolean],
      getActivePane: CallbackTo[Pane],
      getActivePaneItem: CallbackTo[js.Object],
      getPaneItems: CallbackTo[js.Array[js.Object]],
      getPanes: CallbackTo[js.Array[Pane]],
      hide: Callback,
      isVisible: CallbackTo[Boolean],
      observeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
      observeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
      observePaneItems: js.Function1[/* item */ js.Object, Unit] => Disposable,
      observePanes: js.Function1[/* pane */ Pane, Unit] => Disposable,
      observeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
      onDidAddPane: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable,
      onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
      onDidChangeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
      onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
      onDidChangeHovered: js.Function1[/* hovered */ Boolean, Unit] => Disposable,
      onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
      onDidDestroyPane: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable,
      onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
      onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
      onWillDestroyPane: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable,
      onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable,
      show: Callback,
      toggle: Callback
    ): Dock = {
      val __obj = js.Dynamic.literal(activate = activate.toJsFn, activateNextPane = activateNextPane.toJsFn, activatePreviousPane = activatePreviousPane.toJsFn, getActivePane = getActivePane.toJsFn, getActivePaneItem = getActivePaneItem.toJsFn, getPaneItems = getPaneItems.toJsFn, getPanes = getPanes.toJsFn, hide = hide.toJsFn, isVisible = isVisible.toJsFn, observeActivePane = js.Any.fromFunction1(observeActivePane), observeActivePaneItem = js.Any.fromFunction1(observeActivePaneItem), observePaneItems = js.Any.fromFunction1(observePaneItems), observePanes = js.Any.fromFunction1(observePanes), observeVisible = js.Any.fromFunction1(observeVisible), onDidAddPane = js.Any.fromFunction1(onDidAddPane), onDidAddPaneItem = js.Any.fromFunction1(onDidAddPaneItem), onDidChangeActivePane = js.Any.fromFunction1(onDidChangeActivePane), onDidChangeActivePaneItem = js.Any.fromFunction1(onDidChangeActivePaneItem), onDidChangeHovered = js.Any.fromFunction1(onDidChangeHovered), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroyPane = js.Any.fromFunction1(onDidDestroyPane), onDidDestroyPaneItem = js.Any.fromFunction1(onDidDestroyPaneItem), onDidStopChangingActivePaneItem = js.Any.fromFunction1(onDidStopChangingActivePaneItem), onWillDestroyPane = js.Any.fromFunction1(onWillDestroyPane), onWillDestroyPaneItem = js.Any.fromFunction1(onWillDestroyPaneItem), show = show.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[Dock]
    }
    
    extension [Self <: Dock](x: Self) {
      
      inline def setActivate(value: Callback): Self = StObject.set(x, "activate", value.toJsFn)
      
      inline def setActivateNextPane(value: CallbackTo[Boolean]): Self = StObject.set(x, "activateNextPane", value.toJsFn)
      
      inline def setActivatePreviousPane(value: CallbackTo[Boolean]): Self = StObject.set(x, "activatePreviousPane", value.toJsFn)
      
      inline def setGetActivePane(value: CallbackTo[Pane]): Self = StObject.set(x, "getActivePane", value.toJsFn)
      
      inline def setGetActivePaneItem(value: CallbackTo[js.Object]): Self = StObject.set(x, "getActivePaneItem", value.toJsFn)
      
      inline def setGetPaneItems(value: CallbackTo[js.Array[js.Object]]): Self = StObject.set(x, "getPaneItems", value.toJsFn)
      
      inline def setGetPanes(value: CallbackTo[js.Array[Pane]]): Self = StObject.set(x, "getPanes", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
      
      inline def setObserveActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = StObject.set(x, "observeActivePane", js.Any.fromFunction1(value))
      
      inline def setObserveActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "observeActivePaneItem", js.Any.fromFunction1(value))
      
      inline def setObservePaneItems(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "observePaneItems", js.Any.fromFunction1(value))
      
      inline def setObservePanes(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = StObject.set(x, "observePanes", js.Any.fromFunction1(value))
      
      inline def setObserveVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = StObject.set(x, "observeVisible", js.Any.fromFunction1(value))
      
      inline def setOnDidAddPane(value: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable): Self = StObject.set(x, "onDidAddPane", js.Any.fromFunction1(value))
      
      inline def setOnDidAddPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidAddPaneItem", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = StObject.set(x, "onDidChangeActivePane", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "onDidChangeActivePaneItem", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeHovered(value: js.Function1[/* hovered */ Boolean, Unit] => Disposable): Self = StObject.set(x, "onDidChangeHovered", js.Any.fromFunction1(value))
      
      inline def setOnDidChangeVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = StObject.set(x, "onDidChangeVisible", js.Any.fromFunction1(value))
      
      inline def setOnDidDestroyPane(value: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable): Self = StObject.set(x, "onDidDestroyPane", js.Any.fromFunction1(value))
      
      inline def setOnDidDestroyPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidDestroyPaneItem", js.Any.fromFunction1(value))
      
      inline def setOnDidStopChangingActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = StObject.set(x, "onDidStopChangingActivePaneItem", js.Any.fromFunction1(value))
      
      inline def setOnWillDestroyPane(value: js.Function1[/* event */ typingsJapgolly.atom.anon.Pane, Unit] => Disposable): Self = StObject.set(x, "onWillDestroyPane", js.Any.fromFunction1(value))
      
      inline def setOnWillDestroyPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable): Self = StObject.set(x, "onWillDestroyPaneItem", js.Any.fromFunction1(value))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
}
