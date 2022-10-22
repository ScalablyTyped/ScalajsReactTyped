package typingsJapgolly.concurrently.anon

import typingsJapgolly.concurrently.distSrcFlowControlKillOthersMod.ProcessCloseCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  var conditions: ProcessCloseCondition | js.Array[ProcessCloseCondition]
  
  var logger: typingsJapgolly.concurrently.distSrcLoggerMod.Logger
}
object Conditions {
  
  inline def apply(
    conditions: ProcessCloseCondition | js.Array[ProcessCloseCondition],
    logger: typingsJapgolly.concurrently.distSrcLoggerMod.Logger
  ): Conditions = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditions]
  }
  
  extension [Self <: Conditions](x: Self) {
    
    inline def setConditions(value: ProcessCloseCondition | js.Array[ProcessCloseCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: ProcessCloseCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLogger(value: typingsJapgolly.concurrently.distSrcLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
