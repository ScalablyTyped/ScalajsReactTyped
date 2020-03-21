package typingsJapgolly.roslib

import typingsJapgolly.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompression extends js.Object {
  var compression: js.UndefOr[String] = js.undefined
  var latch: js.UndefOr[Boolean] = js.undefined
  var messageType: String
  var name: String
  var queue_length: js.UndefOr[Double] = js.undefined
  var queue_size: js.UndefOr[Double] = js.undefined
  var ros: Ros
  var throttle_rate: js.UndefOr[Double] = js.undefined
}

object AnonCompression {
  @scala.inline
  def apply(
    messageType: String,
    name: String,
    ros: Ros,
    compression: String = null,
    latch: js.UndefOr[Boolean] = js.undefined,
    queue_length: Int | Double = null,
    queue_size: Int | Double = null,
    throttle_rate: Int | Double = null
  ): AnonCompression = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(latch)) __obj.updateDynamic("latch")(latch.asInstanceOf[js.Any])
    if (queue_length != null) __obj.updateDynamic("queue_length")(queue_length.asInstanceOf[js.Any])
    if (queue_size != null) __obj.updateDynamic("queue_size")(queue_size.asInstanceOf[js.Any])
    if (throttle_rate != null) __obj.updateDynamic("throttle_rate")(throttle_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompression]
  }
}

