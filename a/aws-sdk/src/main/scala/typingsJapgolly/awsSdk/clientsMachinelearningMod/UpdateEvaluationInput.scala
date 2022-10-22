package typingsJapgolly.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEvaluationInput extends StObject {
  
  /**
    * The ID assigned to the Evaluation during creation.
    */
  var EvaluationId: EntityId
  
  /**
    * A new user-supplied name or description of the Evaluation that will replace the current content. 
    */
  var EvaluationName: EntityName
}
object UpdateEvaluationInput {
  
  inline def apply(EvaluationId: EntityId, EvaluationName: EntityName): UpdateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any], EvaluationName = EvaluationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvaluationInput]
  }
  
  extension [Self <: UpdateEvaluationInput](x: Self) {
    
    inline def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationName(value: EntityName): Self = StObject.set(x, "EvaluationName", value.asInstanceOf[js.Any])
  }
}
