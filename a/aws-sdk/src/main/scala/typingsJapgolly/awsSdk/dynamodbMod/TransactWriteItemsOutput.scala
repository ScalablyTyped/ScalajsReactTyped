package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactWriteItemsOutput extends js.Object {
  /**
    * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
  /**
    * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem, or DeleteItem operations. 
    */
  var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.native
}

object TransactWriteItemsOutput {
  @scala.inline
  def apply(
    ConsumedCapacity: ConsumedCapacityMultiple = null,
    ItemCollectionMetrics: ItemCollectionMetricsPerTable = null
  ): TransactWriteItemsOutput = {
    val __obj = js.Dynamic.literal()
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity.asInstanceOf[js.Any])
    if (ItemCollectionMetrics != null) __obj.updateDynamic("ItemCollectionMetrics")(ItemCollectionMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactWriteItemsOutput]
  }
}

