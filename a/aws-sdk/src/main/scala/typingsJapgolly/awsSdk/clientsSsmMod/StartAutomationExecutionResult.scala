package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAutomationExecutionResult extends StObject {
  
  /**
    * The unique ID of a newly scheduled automation execution.
    */
  var AutomationExecutionId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AutomationExecutionId] = js.undefined
}
object StartAutomationExecutionResult {
  
  inline def apply(): StartAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAutomationExecutionResult]
  }
  
  extension [Self <: StartAutomationExecutionResult](x: Self) {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
  }
}
