package typingsJapgolly.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelParameters extends js.Object {
  var channels: js.Array[String]
  var device: String
  var pushGateway: String
}

object PushChannelParameters {
  @scala.inline
  def apply(channels: js.Array[String], device: String, pushGateway: String): PushChannelParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PushChannelParameters]
  }
}

