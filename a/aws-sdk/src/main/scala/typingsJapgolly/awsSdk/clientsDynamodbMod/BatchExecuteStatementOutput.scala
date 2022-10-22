package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchExecuteStatementOutput extends StObject {
  
  /**
    * The capacity units consumed by the entire operation. The values of the list are ordered according to the ordering of the statements.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
  
  /**
    * The response to each PartiQL statement in the batch.
    */
  var Responses: js.UndefOr[PartiQLBatchResponse] = js.undefined
}
object BatchExecuteStatementOutput {
  
  inline def apply(): BatchExecuteStatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchExecuteStatementOutput]
  }
  
  extension [Self <: BatchExecuteStatementOutput](x: Self) {
    
    inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setResponses(value: PartiQLBatchResponse): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setResponsesVarargs(value: BatchStatementResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
  }
}
