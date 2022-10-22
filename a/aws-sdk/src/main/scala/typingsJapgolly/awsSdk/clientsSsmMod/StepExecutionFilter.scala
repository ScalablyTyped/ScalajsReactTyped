package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepExecutionFilter extends StObject {
  
  /**
    * One or more keys to limit the results. Valid filter keys include the following: StepName, Action, StepExecutionId, StepExecutionStatus, StartTimeBefore, StartTimeAfter.
    */
  var Key: StepExecutionFilterKey
  
  /**
    * The values of the filter key.
    */
  var Values: StepExecutionFilterValueList
}
object StepExecutionFilter {
  
  inline def apply(Key: StepExecutionFilterKey, Values: StepExecutionFilterValueList): StepExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionFilter]
  }
  
  extension [Self <: StepExecutionFilter](x: Self) {
    
    inline def setKey(value: StepExecutionFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StepExecutionFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: StepExecutionFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
