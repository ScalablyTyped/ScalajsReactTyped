package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  def cancel(): scala.Unit
}
object Cancelable {
  
  inline def apply(cancel: japgolly.scalajs.react.Callback): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[Cancelable]
  }
  
  extension [Self <: Cancelable](x: Self) {
    
    inline def setCancel(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
