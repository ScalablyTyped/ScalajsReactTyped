package typingsJapgolly.heremaps.H.service

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property id {number} - the ID associated internally with this request
  * @property cancel {function()} - this function cancels the request and invokes the errback function
  */
trait JsonpRequestHandle extends StObject {
  
  def cancel(): Unit
  
  var id: Double
}
object JsonpRequestHandle {
  
  inline def apply(cancel: Callback, id: Double): JsonpRequestHandle = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpRequestHandle]
  }
  
  extension [Self <: JsonpRequestHandle](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
