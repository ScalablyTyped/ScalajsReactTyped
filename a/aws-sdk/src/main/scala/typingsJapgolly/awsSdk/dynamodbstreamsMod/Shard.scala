package typingsJapgolly.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * The shard ID of the current shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: js.UndefOr[typingsJapgolly.awsSdk.dynamodbstreamsMod.SequenceNumberRange] = js.native
  /**
    * The system-generated identifier for this shard.
    */
  var ShardId: js.UndefOr[typingsJapgolly.awsSdk.dynamodbstreamsMod.ShardId] = js.native
}

object Shard {
  @scala.inline
  def apply(
    ParentShardId: ShardId = null,
    SequenceNumberRange: SequenceNumberRange = null,
    ShardId: ShardId = null
  ): Shard = {
    val __obj = js.Dynamic.literal()
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId.asInstanceOf[js.Any])
    if (SequenceNumberRange != null) __obj.updateDynamic("SequenceNumberRange")(SequenceNumberRange.asInstanceOf[js.Any])
    if (ShardId != null) __obj.updateDynamic("ShardId")(ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
}

