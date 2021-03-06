package typingsJapgolly.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemCollectionSizeLimitExceededException
  extends ServiceException[ItemCollectionSizeLimitExceededExceptionDetails]
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with PutItemExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ItemCollectionSizeLimitExceededException: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException = js.native
}

