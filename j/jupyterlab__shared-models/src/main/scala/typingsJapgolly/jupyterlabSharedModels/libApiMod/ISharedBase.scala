package typingsJapgolly.jupyterlabSharedModels.libApiMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedBase
  extends StObject
     with IDisposable {
  
  /**
    * Whether the object can undo changes.
    */
  def canRedo(): Boolean
  
  /**
    * Whether the object can redo changes.
    */
  def canUndo(): Boolean
  
  /**
    * Clear the change stack.
    */
  def clearUndoHistory(): Unit
  
  /**
    * Redo an operation.
    */
  def redo(): Unit
  
  /**
    * Perform a transaction. While the function f is called, all changes to the shared
    * document are bundled into a single event.
    */
  def transact(f: js.Function0[Unit]): Unit
  
  /**
    * Undo an operation.
    */
  def undo(): Unit
}
object ISharedBase {
  
  inline def apply(
    canRedo: CallbackTo[Boolean],
    canUndo: CallbackTo[Boolean],
    clearUndoHistory: Callback,
    dispose: Callback,
    isDisposed: Boolean,
    redo: Callback,
    transact: js.Function0[Unit] => Callback,
    undo: Callback
  ): ISharedBase = {
    val __obj = js.Dynamic.literal(canRedo = canRedo.toJsFn, canUndo = canUndo.toJsFn, clearUndoHistory = clearUndoHistory.toJsFn, dispose = dispose.toJsFn, isDisposed = isDisposed.asInstanceOf[js.Any], redo = redo.toJsFn, transact = js.Any.fromFunction1((t0: js.Function0[Unit]) => transact(t0).runNow()), undo = undo.toJsFn)
    __obj.asInstanceOf[ISharedBase]
  }
  
  extension [Self <: ISharedBase](x: Self) {
    
    inline def setCanRedo(value: CallbackTo[Boolean]): Self = StObject.set(x, "canRedo", value.toJsFn)
    
    inline def setCanUndo(value: CallbackTo[Boolean]): Self = StObject.set(x, "canUndo", value.toJsFn)
    
    inline def setClearUndoHistory(value: Callback): Self = StObject.set(x, "clearUndoHistory", value.toJsFn)
    
    inline def setRedo(value: Callback): Self = StObject.set(x, "redo", value.toJsFn)
    
    inline def setTransact(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "transact", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setUndo(value: Callback): Self = StObject.set(x, "undo", value.toJsFn)
  }
}
