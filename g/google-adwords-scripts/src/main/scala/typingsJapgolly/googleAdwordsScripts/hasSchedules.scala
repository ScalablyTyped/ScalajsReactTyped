package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSchedules extends StObject {
  
  def getSchedules(): ExtensionSchedule
  
  def setSchedules(schedules: ExtensionScheduleInput): Unit
}
object hasSchedules {
  
  inline def apply(getSchedules: CallbackTo[ExtensionSchedule], setSchedules: ExtensionScheduleInput => Callback): hasSchedules = {
    val __obj = js.Dynamic.literal(getSchedules = getSchedules.toJsFn, setSchedules = js.Any.fromFunction1((t0: ExtensionScheduleInput) => setSchedules(t0).runNow()))
    __obj.asInstanceOf[hasSchedules]
  }
  
  extension [Self <: hasSchedules](x: Self) {
    
    inline def setGetSchedules(value: CallbackTo[ExtensionSchedule]): Self = StObject.set(x, "getSchedules", value.toJsFn)
    
    inline def setSetSchedules(value: ExtensionScheduleInput => Callback): Self = StObject.set(x, "setSchedules", js.Any.fromFunction1((t0: ExtensionScheduleInput) => value(t0).runNow()))
  }
}
