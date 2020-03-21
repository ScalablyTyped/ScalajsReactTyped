package typingsJapgolly.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvelope[T] extends js.Object {
  /*Uses DEFAULT_CHANNEL if no channel is provided*/
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[T] = js.undefined
  var timeStamp: js.UndefOr[String] = js.undefined
  var topic: String
}

object IEnvelope {
  @scala.inline
  def apply[T](topic: String, channel: String = null, data: T = null, timeStamp: String = null): IEnvelope[T] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvelope[T]]
  }
}

