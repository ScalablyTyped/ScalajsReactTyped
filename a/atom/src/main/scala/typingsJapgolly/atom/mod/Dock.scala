package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.AnonPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dock extends js.Object {
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
  def onDidAddPane(callback: js.Function1[/* event */ AnonPane, Unit]): Disposable
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
  def onDidDestroyPane(callback: js.Function1[/* event */ AnonPane, Unit]): Disposable
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable
  /** Invoke the given callback before a pane is destroyed in the dock. */
  def onWillDestroyPane(callback: js.Function1[/* event */ AnonPane, Unit]): Disposable
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
  @scala.inline
  def apply(
    activate: Callback,
    activateNextPane: CallbackTo[Boolean],
    activatePreviousPane: CallbackTo[Boolean],
    getActivePane: CallbackTo[Pane],
    getActivePaneItem: CallbackTo[js.Object],
    getPaneItems: CallbackTo[js.Array[js.Object]],
    getPanes: CallbackTo[js.Array[Pane]],
    hide: Callback,
    isVisible: CallbackTo[Boolean],
    observeActivePane: js.Function1[/* pane */ Pane, Unit] => CallbackTo[Disposable],
    observeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    observePaneItems: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    observePanes: js.Function1[/* pane */ Pane, Unit] => CallbackTo[Disposable],
    observeVisible: js.Function1[/* visible */ Boolean, Unit] => CallbackTo[Disposable],
    onDidAddPane: js.Function1[/* event */ AnonPane, Unit] => CallbackTo[Disposable],
    onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => CallbackTo[Disposable],
    onDidChangeActivePane: js.Function1[/* pane */ Pane, Unit] => CallbackTo[Disposable],
    onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    onDidChangeHovered: js.Function1[/* hovered */ Boolean, Unit] => CallbackTo[Disposable],
    onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => CallbackTo[Disposable],
    onDidDestroyPane: js.Function1[/* event */ AnonPane, Unit] => CallbackTo[Disposable],
    onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => CallbackTo[Disposable],
    onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, Unit] => CallbackTo[Disposable],
    onWillDestroyPane: js.Function1[/* event */ AnonPane, Unit] => CallbackTo[Disposable],
    onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => CallbackTo[Disposable],
    show: Callback,
    toggle: Callback
  ): Dock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(activate.toJsFn)
    __obj.updateDynamic("activateNextPane")(activateNextPane.toJsFn)
    __obj.updateDynamic("activatePreviousPane")(activatePreviousPane.toJsFn)
    __obj.updateDynamic("getActivePane")(getActivePane.toJsFn)
    __obj.updateDynamic("getActivePaneItem")(getActivePaneItem.toJsFn)
    __obj.updateDynamic("getPaneItems")(getPaneItems.toJsFn)
    __obj.updateDynamic("getPanes")(getPanes.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.updateDynamic("observeActivePane")(js.Any.fromFunction1((t0: js.Function1[/* pane */ typingsJapgolly.atom.mod.Pane, scala.Unit]) => observeActivePane(t0).runNow()))
    __obj.updateDynamic("observeActivePaneItem")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => observeActivePaneItem(t0).runNow()))
    __obj.updateDynamic("observePaneItems")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => observePaneItems(t0).runNow()))
    __obj.updateDynamic("observePanes")(js.Any.fromFunction1((t0: js.Function1[/* pane */ typingsJapgolly.atom.mod.Pane, scala.Unit]) => observePanes(t0).runNow()))
    __obj.updateDynamic("observeVisible")(js.Any.fromFunction1((t0: js.Function1[/* visible */ scala.Boolean, scala.Unit]) => observeVisible(t0).runNow()))
    __obj.updateDynamic("onDidAddPane")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.AnonPane, scala.Unit]) => onDidAddPane(t0).runNow()))
    __obj.updateDynamic("onDidAddPaneItem")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.mod.PaneItemObservedEvent, scala.Unit]) => onDidAddPaneItem(t0).runNow()))
    __obj.updateDynamic("onDidChangeActivePane")(js.Any.fromFunction1((t0: js.Function1[/* pane */ typingsJapgolly.atom.mod.Pane, scala.Unit]) => onDidChangeActivePane(t0).runNow()))
    __obj.updateDynamic("onDidChangeActivePaneItem")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => onDidChangeActivePaneItem(t0).runNow()))
    __obj.updateDynamic("onDidChangeHovered")(js.Any.fromFunction1((t0: js.Function1[/* hovered */ scala.Boolean, scala.Unit]) => onDidChangeHovered(t0).runNow()))
    __obj.updateDynamic("onDidChangeVisible")(js.Any.fromFunction1((t0: js.Function1[/* visible */ scala.Boolean, scala.Unit]) => onDidChangeVisible(t0).runNow()))
    __obj.updateDynamic("onDidDestroyPane")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.AnonPane, scala.Unit]) => onDidDestroyPane(t0).runNow()))
    __obj.updateDynamic("onDidDestroyPaneItem")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.mod.PaneItemObservedEvent, scala.Unit]) => onDidDestroyPaneItem(t0).runNow()))
    __obj.updateDynamic("onDidStopChangingActivePaneItem")(js.Any.fromFunction1((t0: js.Function1[/* item */ js.Object, scala.Unit]) => onDidStopChangingActivePaneItem(t0).runNow()))
    __obj.updateDynamic("onWillDestroyPane")(js.Any.fromFunction1((t0: js.Function1[/* event */ typingsJapgolly.atom.AnonPane, scala.Unit]) => onWillDestroyPane(t0).runNow()))
    __obj.updateDynamic("onWillDestroyPaneItem")(js.Any.fromFunction1((t0: js.Function1[
  /* event */ typingsJapgolly.atom.mod.PaneItemObservedEvent, 
  scala.Unit | js.Promise[scala.Unit]]) => onWillDestroyPaneItem(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Dock]
  }
}

