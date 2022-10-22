package typingsJapgolly.jupyterlabSharedModels.libApiMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedDocument
  extends StObject
     with ISharedBase {
  
  /**
    * The changed signal.
    */
  val changed: ISignal[this.type, DocumentChange]
  
  /**
    * Whether the document is saved to disk or not.
    */
  val dirty: Boolean
}
object ISharedDocument {
  
  inline def apply(
    canRedo: CallbackTo[Boolean],
    canUndo: CallbackTo[Boolean],
    changed: ISignal[ISharedDocument, DocumentChange],
    clearUndoHistory: Callback,
    dirty: Boolean,
    dispose: Callback,
    isDisposed: Boolean,
    redo: Callback,
    transact: js.Function0[Unit] => Callback,
    undo: Callback
  ): ISharedDocument = {
    val __obj = js.Dynamic.literal(canRedo = canRedo.toJsFn, canUndo = canUndo.toJsFn, changed = changed.asInstanceOf[js.Any], clearUndoHistory = clearUndoHistory.toJsFn, dirty = dirty.asInstanceOf[js.Any], dispose = dispose.toJsFn, isDisposed = isDisposed.asInstanceOf[js.Any], redo = redo.toJsFn, transact = js.Any.fromFunction1((t0: js.Function0[Unit]) => transact(t0).runNow()), undo = undo.toJsFn)
    __obj.asInstanceOf[ISharedDocument]
  }
  
  extension [Self <: ISharedDocument](x: Self) {
    
    inline def setChanged(value: ISignal[ISharedDocument, DocumentChange]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
  }
}
