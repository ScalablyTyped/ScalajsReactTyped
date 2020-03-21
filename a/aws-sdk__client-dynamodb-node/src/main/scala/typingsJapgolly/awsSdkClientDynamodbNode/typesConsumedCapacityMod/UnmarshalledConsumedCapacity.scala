package typingsJapgolly.awsSdkClientDynamodbNode.typesConsumedCapacityMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientDynamodbNode.typesCapacityMod.UnmarshalledCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledConsumedCapacity extends ConsumedCapacity {
  /**
    * <p>The amount of throughput consumed on each global index affected by the operation.</p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.undefined
  /**
    * <p>The amount of throughput consumed on each local index affected by the operation.</p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.undefined
  /**
    * <p>The amount of throughput consumed on the table affected by the operation.</p>
    */
  @JSName("Table")
  var Table_UnmarshalledConsumedCapacity: js.UndefOr[UnmarshalledCapacity] = js.undefined
}

object UnmarshalledConsumedCapacity {
  @scala.inline
  def apply(
    CapacityUnits: Int | Double = null,
    GlobalSecondaryIndexes: StringDictionary[UnmarshalledCapacity] = null,
    LocalSecondaryIndexes: StringDictionary[UnmarshalledCapacity] = null,
    Table: UnmarshalledCapacity = null,
    TableName: String = null
  ): UnmarshalledConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledConsumedCapacity]
  }
}

