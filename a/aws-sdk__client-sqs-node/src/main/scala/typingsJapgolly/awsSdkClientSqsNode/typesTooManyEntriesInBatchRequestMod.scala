package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTooManyEntriesInBatchRequestMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TooManyEntriesInBatchRequestDetails> * / any */ trait TooManyEntriesInBatchRequest
    extends StObject
       with ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest
  }
  object TooManyEntriesInBatchRequest {
    
    inline def apply(): TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = "TooManyEntriesInBatchRequest")
      __obj.asInstanceOf[TooManyEntriesInBatchRequest]
    }
    
    extension [Self <: TooManyEntriesInBatchRequest](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooManyEntriesInBatchRequestDetails extends StObject
}
