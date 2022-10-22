package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasState extends StObject {
  
  /* standard dom */
  def restore(): Unit
  
  /* standard dom */
  def save(): Unit
}
object CanvasState {
  
  inline def apply(restore: Callback, save: Callback): CanvasState = {
    val __obj = js.Dynamic.literal(restore = restore.toJsFn, save = save.toJsFn)
    __obj.asInstanceOf[CanvasState]
  }
  
  extension [Self <: CanvasState](x: Self) {
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
  }
}
