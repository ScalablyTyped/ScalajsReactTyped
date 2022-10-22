package typingsJapgolly.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMLModelInput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel.
    */
  var MLModelId: EntityId
}
object DeleteMLModelInput {
  
  inline def apply(MLModelId: EntityId): DeleteMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMLModelInput]
  }
  
  extension [Self <: DeleteMLModelInput](x: Self) {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
  }
}
