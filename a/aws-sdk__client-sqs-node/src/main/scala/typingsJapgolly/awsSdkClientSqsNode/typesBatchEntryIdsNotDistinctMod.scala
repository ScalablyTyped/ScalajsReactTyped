package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchEntryIdsNotDistinctMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BatchEntryIdsNotDistinctDetails> * / any */ trait BatchEntryIdsNotDistinct
    extends StObject
       with ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct
  }
  object BatchEntryIdsNotDistinct {
    
    inline def apply(): BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = "BatchEntryIdsNotDistinct")
      __obj.asInstanceOf[BatchEntryIdsNotDistinct]
    }
    
    extension [Self <: BatchEntryIdsNotDistinct](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchEntryIdsNotDistinctDetails extends StObject
}
