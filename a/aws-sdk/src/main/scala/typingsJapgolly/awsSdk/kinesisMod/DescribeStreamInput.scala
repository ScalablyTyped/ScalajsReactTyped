package typingsJapgolly.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamInput extends js.Object {
  /**
    * The shard ID of the shard to start with.
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  /**
    * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater than 100, at most 100 shards are returned.
    */
  var Limit: js.UndefOr[DescribeStreamInputLimit] = js.native
  /**
    * The name of the stream to describe.
    */
  var StreamName: typingsJapgolly.awsSdk.kinesisMod.StreamName = js.native
}

object DescribeStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, ExclusiveStartShardId: ShardId = null, Limit: Int | Double = null): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    if (ExclusiveStartShardId != null) __obj.updateDynamic("ExclusiveStartShardId")(ExclusiveStartShardId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
}

