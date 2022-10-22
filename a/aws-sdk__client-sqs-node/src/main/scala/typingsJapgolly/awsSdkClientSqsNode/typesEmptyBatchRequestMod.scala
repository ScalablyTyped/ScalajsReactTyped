package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEmptyBatchRequestMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_EmptyBatchRequestDetails> * / any */ trait EmptyBatchRequest
    extends StObject
       with ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest
  }
  object EmptyBatchRequest {
    
    inline def apply(): EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = "EmptyBatchRequest")
      __obj.asInstanceOf[EmptyBatchRequest]
    }
    
    extension [Self <: EmptyBatchRequest](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmptyBatchRequestDetails extends StObject
}
