package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageBatchExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
    - typingsJapgolly.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
    - typingsJapgolly.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
    - typingsJapgolly.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong
    - typingsJapgolly.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
    - typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
  */
  trait SendMessageBatchExceptionsUnion extends StObject
  object SendMessageBatchExceptionsUnion {
    
    inline def BatchEntryIdsNotDistinct(): typingsJapgolly.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = "BatchEntryIdsNotDistinct")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct]
    }
    
    inline def BatchRequestTooLong(): typingsJapgolly.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong = {
      val __obj = js.Dynamic.literal(name = "BatchRequestTooLong")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong]
    }
    
    inline def EmptyBatchRequest(): typingsJapgolly.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = "EmptyBatchRequest")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest]
    }
    
    inline def InvalidBatchEntryId(): typingsJapgolly.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId = {
      val __obj = js.Dynamic.literal(name = "InvalidBatchEntryId")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId]
    }
    
    inline def TooManyEntriesInBatchRequest(): typingsJapgolly.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = "TooManyEntriesInBatchRequest")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest]
    }
    
    inline def UnsupportedOperation(): typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperation")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation]
    }
  }
}
