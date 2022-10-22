package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerAppointmentOperation extends StObject {
  
  @JSName("apply")
  def apply(): Unit
  
  def cancel(): Unit
  
  /* protected */ val instance: Any
}
object BootstrapSchedulerAppointmentOperation {
  
  inline def apply(apply: Callback, cancel: Callback, instance: Any): BootstrapSchedulerAppointmentOperation = {
    val __obj = js.Dynamic.literal(apply = apply.toJsFn, cancel = cancel.toJsFn, instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentOperation]
  }
  
  extension [Self <: BootstrapSchedulerAppointmentOperation](x: Self) {
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
