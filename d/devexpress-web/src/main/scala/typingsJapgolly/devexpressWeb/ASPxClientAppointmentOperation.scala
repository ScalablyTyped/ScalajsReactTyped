package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains methods allowing you to perform or cancel an operation.
  */
trait ASPxClientAppointmentOperation extends StObject {
  
  /**
    * Passes parameters to the corresponding callback function to accomplish the operation.
    */
  def Apply(): Unit
  
  /**
    * Cancels the operation.
    */
  def Cancel(): Unit
}
object ASPxClientAppointmentOperation {
  
  inline def apply(Apply: Callback, Cancel: Callback): ASPxClientAppointmentOperation = {
    val __obj = js.Dynamic.literal(Apply = Apply.toJsFn, Cancel = Cancel.toJsFn)
    __obj.asInstanceOf[ASPxClientAppointmentOperation]
  }
  
  extension [Self <: ASPxClientAppointmentOperation](x: Self) {
    
    inline def setApply(value: Callback): Self = StObject.set(x, "Apply", value.toJsFn)
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "Cancel", value.toJsFn)
  }
}
