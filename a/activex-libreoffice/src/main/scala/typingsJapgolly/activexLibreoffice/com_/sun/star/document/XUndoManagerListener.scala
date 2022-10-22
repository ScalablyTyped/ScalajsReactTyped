package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implemented by components which want to be notified of changes in the Undo/Redo stacks of an Undo manager.
  * @see XUndoManager
  * @since OOo 3.4
  */
trait XUndoManagerListener
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /**
    * is called when the top-most action of the Redo stack has been re-applied.
    * @see XUndoManager.redo
    */
  def actionRedone(iEvent: UndoManagerEvent): Unit
  
  /**
    * is called when the top-most action of the undo stack has been undone.
    * @see XUndoManager.undo
    */
  def actionUndone(iEvent: UndoManagerEvent): Unit
  
  /**
    * is called when both the Undo and the Redo stack have been cleared from all Undo actions.
    * @see XUndoManager.clear
    */
  def allActionsCleared(iEvent: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject): Unit
  
  /**
    * is called when an Undo context has been left, but no actions have been added within this context.
    *
    * In such a case, the context which has just been left will not contribute to the undo stack, but instead be silently removed. Consequently, the {@link
    * UndoManagerEvent.UndoActionTitle} is empty.
    * @see XUndoManager.leaveUndoContext
    * @see leftContext
    * @see leftHiddenContext
    */
  def cancelledContext(iEvent: UndoManagerEvent): Unit
  
  /**
    * is called when a new Undo context has been entered.
    *
    * {@link UndoManagerEvent.UndoActionTitle} carries the title of the Undo context, and {@link UndoManagerEvent.UndoContextDepth} the number of open Undo
    * contexts, including the one just entered.
    * @see XUndoManager.enterUndoContext
    */
  def enteredContext(iEvent: UndoManagerEvent): Unit
  
  /**
    * is called when a new hidden Undo context has been entered.
    *
    * {@link UndoManagerEvent.UndoActionTitle} carries the title of the Undo context, and {@link UndoManagerEvent.UndoContextDepth} the number of open Undo
    * contexts, including the one just entered.
    * @see XUndoManager.enterUndoContext
    */
  def enteredHiddenContext(iEvent: UndoManagerEvent): Unit
  
  /**
    * is called when an Undo context has been left.
    *
    * {@link UndoManagerEvent.UndoActionTitle} carries the title of the Undo context, and {@link UndoManagerEvent.UndoContextDepth} the number of open Undo
    * contexts, exluding the one just left.
    * @see XUndoManager.leaveUndoContext
    * @see leftHiddenUndocontext
    * @see cancelledContext
    */
  def leftContext(iEvent: UndoManagerEvent): Unit
  
  /**
    * is calledn when a hidden Undo context has been left.
    *
    * {@link UndoManagerEvent.UndoActionTitle} is empty, as hidden Undo contexts don't have a title.
    * @see XUndoManager.leaveHiddenUndoContext
    * @see leftContext
    * @see cancelledContext
    */
  def leftHiddenContext(iEvent: UndoManagerEvent): Unit
  
  /**
    * is called when the Redo stack has been cleared.
    * @see XUndoManager.clearRedo
    */
  def redoActionsCleared(iEvent: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject): Unit
  
  /** called when the complete undo manager has been reset */
  def resetAll(iEvent: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject): Unit
  
  /**
    * is called when an undo action is added to the undo stack.
    *
    * Note that the action must not necessarily be the new top element of the stack: In case there's an open Undo context, {@link
    * UndoManagerEvent.UndoContextDepth} will be greater `0` , and the newly added action will be subordinate of the context action.
    * @see XUndoManager.addUndoAction
    */
  def undoActionAdded(iEvent: UndoManagerEvent): Unit
}
object XUndoManagerListener {
  
  inline def apply(
    acquire: Callback,
    actionRedone: UndoManagerEvent => Callback,
    actionUndone: UndoManagerEvent => Callback,
    allActionsCleared: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    cancelledContext: UndoManagerEvent => Callback,
    disposing: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    enteredContext: UndoManagerEvent => Callback,
    enteredHiddenContext: UndoManagerEvent => Callback,
    leftContext: UndoManagerEvent => Callback,
    leftHiddenContext: UndoManagerEvent => Callback,
    queryInterface: `type` => Any,
    redoActionsCleared: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    release: Callback,
    resetAll: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    undoActionAdded: UndoManagerEvent => Callback
  ): XUndoManagerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, actionRedone = js.Any.fromFunction1((t0: UndoManagerEvent) => actionRedone(t0).runNow()), actionUndone = js.Any.fromFunction1((t0: UndoManagerEvent) => actionUndone(t0).runNow()), allActionsCleared = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => allActionsCleared(t0).runNow()), cancelledContext = js.Any.fromFunction1((t0: UndoManagerEvent) => cancelledContext(t0).runNow()), disposing = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => disposing(t0).runNow()), enteredContext = js.Any.fromFunction1((t0: UndoManagerEvent) => enteredContext(t0).runNow()), enteredHiddenContext = js.Any.fromFunction1((t0: UndoManagerEvent) => enteredHiddenContext(t0).runNow()), leftContext = js.Any.fromFunction1((t0: UndoManagerEvent) => leftContext(t0).runNow()), leftHiddenContext = js.Any.fromFunction1((t0: UndoManagerEvent) => leftHiddenContext(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), redoActionsCleared = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => redoActionsCleared(t0).runNow()), release = release.toJsFn, resetAll = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => resetAll(t0).runNow()), undoActionAdded = js.Any.fromFunction1((t0: UndoManagerEvent) => undoActionAdded(t0).runNow()))
    __obj.asInstanceOf[XUndoManagerListener]
  }
  
  extension [Self <: XUndoManagerListener](x: Self) {
    
    inline def setActionRedone(value: UndoManagerEvent => Callback): Self = StObject.set(x, "actionRedone", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setActionUndone(value: UndoManagerEvent => Callback): Self = StObject.set(x, "actionUndone", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setAllActionsCleared(value: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback): Self = StObject.set(x, "allActionsCleared", js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => value(t0).runNow()))
    
    inline def setCancelledContext(value: UndoManagerEvent => Callback): Self = StObject.set(x, "cancelledContext", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setEnteredContext(value: UndoManagerEvent => Callback): Self = StObject.set(x, "enteredContext", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setEnteredHiddenContext(value: UndoManagerEvent => Callback): Self = StObject.set(x, "enteredHiddenContext", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setLeftContext(value: UndoManagerEvent => Callback): Self = StObject.set(x, "leftContext", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setLeftHiddenContext(value: UndoManagerEvent => Callback): Self = StObject.set(x, "leftHiddenContext", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
    
    inline def setRedoActionsCleared(value: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback): Self = StObject.set(x, "redoActionsCleared", js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => value(t0).runNow()))
    
    inline def setResetAll(value: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback): Self = StObject.set(x, "resetAll", js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => value(t0).runNow()))
    
    inline def setUndoActionAdded(value: UndoManagerEvent => Callback): Self = StObject.set(x, "undoActionAdded", js.Any.fromFunction1((t0: UndoManagerEvent) => value(t0).runNow()))
  }
}
