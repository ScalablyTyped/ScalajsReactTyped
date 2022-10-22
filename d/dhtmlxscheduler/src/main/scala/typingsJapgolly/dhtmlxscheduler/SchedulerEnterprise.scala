package typingsJapgolly.dhtmlxscheduler

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerEnterprise extends StObject {
  
  /**
    * Creates a new instance of Scheduler
    */
  def getSchedulerInstance(): SchedulerStatic
}
object SchedulerEnterprise {
  
  inline def apply(getSchedulerInstance: CallbackTo[SchedulerStatic]): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal(getSchedulerInstance = getSchedulerInstance.toJsFn)
    __obj.asInstanceOf[SchedulerEnterprise]
  }
  
  extension [Self <: SchedulerEnterprise](x: Self) {
    
    inline def setGetSchedulerInstance(value: CallbackTo[SchedulerStatic]): Self = StObject.set(x, "getSchedulerInstance", value.toJsFn)
  }
}
