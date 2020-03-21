package typingsJapgolly.kafkaNode.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var highWaterOffset: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String | Buffer] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var partition: js.UndefOr[Double] = js.undefined
  var topic: String
  var value: String | Buffer
}

object Message {
  @scala.inline
  def apply(
    topic: String,
    value: String | Buffer,
    highWaterOffset: Int | Double = null,
    key: String | Buffer = null,
    offset: Int | Double = null,
    partition: Int | Double = null
  ): Message = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (highWaterOffset != null) __obj.updateDynamic("highWaterOffset")(highWaterOffset.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

