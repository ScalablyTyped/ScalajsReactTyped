package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait listenerRegistration extends StObject {
  
  def removeListener(): Unit
}
object listenerRegistration {
  
  inline def apply(removeListener: Callback): listenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = removeListener.toJsFn)
    __obj.asInstanceOf[listenerRegistration]
  }
  
  extension [Self <: listenerRegistration](x: Self) {
    
    inline def setRemoveListener(value: Callback): Self = StObject.set(x, "removeListener", value.toJsFn)
  }
}
