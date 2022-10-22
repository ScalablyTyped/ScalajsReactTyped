package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemCollectionSizeLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ItemCollectionSizeLimitExceededExceptionDetails> * / any */ trait ItemCollectionSizeLimitExceededException
    extends StObject
       with BatchWriteItemExceptionsUnion
       with DeleteItemExceptionsUnion
       with PutItemExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ItemCollectionSizeLimitExceededException
  }
  object ItemCollectionSizeLimitExceededException {
    
    inline def apply(): ItemCollectionSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "ItemCollectionSizeLimitExceededException")
      __obj.asInstanceOf[ItemCollectionSizeLimitExceededException]
    }
    
    extension [Self <: ItemCollectionSizeLimitExceededException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ItemCollectionSizeLimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemCollectionSizeLimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>The total size of an item collection has exceeded the maximum limit of 10 gigabytes.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ItemCollectionSizeLimitExceededExceptionDetails {
    
    inline def apply(): ItemCollectionSizeLimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionSizeLimitExceededExceptionDetails]
    }
    
    extension [Self <: ItemCollectionSizeLimitExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
