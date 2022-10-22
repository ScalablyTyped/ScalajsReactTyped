package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for calendar triggers.
  */
trait CalendarTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onEventUpdated(): CalendarTriggerBuilder
}
object CalendarTriggerBuilder {
  
  inline def apply(create: CallbackTo[Trigger], onEventUpdated: CallbackTo[CalendarTriggerBuilder]): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, onEventUpdated = onEventUpdated.toJsFn)
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
  
  extension [Self <: CalendarTriggerBuilder](x: Self) {
    
    inline def setCreate(value: CallbackTo[Trigger]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setOnEventUpdated(value: CallbackTo[CalendarTriggerBuilder]): Self = StObject.set(x, "onEventUpdated", value.toJsFn)
  }
}
