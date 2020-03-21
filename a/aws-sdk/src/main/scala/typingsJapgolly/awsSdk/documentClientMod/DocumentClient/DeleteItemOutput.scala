package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteItemOutput extends js.Object {
  /**
    * A map of attribute names to AttributeValue objects, representing the item as it appeared before the DeleteItem operation. This map appears in the response only if ReturnValues was specified as ALL_OLD in the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  /**
    * The capacity units consumed by the DeleteItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Mode in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
  /**
    * Information about item collections, if any, that were affected by the DeleteItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
    */
  var ItemCollectionMetrics: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics] = js.native
}

object DeleteItemOutput {
  @scala.inline
  def apply(
    Attributes: AttributeMap = null,
    ConsumedCapacity: ConsumedCapacity = null,
    ItemCollectionMetrics: ItemCollectionMetrics = null
  ): DeleteItemOutput = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (ItemCollectionMetrics != null) __obj.updateDynamic("ItemCollectionMetrics")(ItemCollectionMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteItemOutput]
  }
}

