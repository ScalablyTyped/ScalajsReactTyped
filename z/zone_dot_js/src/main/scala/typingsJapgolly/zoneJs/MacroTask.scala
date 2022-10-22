package typingsJapgolly.zoneJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.zoneJs.zoneJsStrings.macroTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacroTask
  extends StObject
     with Task {
  
  @JSName("type")
  var type_MacroTask: macroTask
}
object MacroTask {
  
  inline def apply(
    callback: js.Function,
    cancelScheduleRequest: Callback,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    zone: Zone
  ): MacroTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = cancelScheduleRequest.toJsFn, invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("macroTask")
    __obj.asInstanceOf[MacroTask]
  }
  
  extension [Self <: MacroTask](x: Self) {
    
    inline def setType(value: macroTask): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
