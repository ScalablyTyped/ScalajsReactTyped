package typingsJapgolly.trezorConnect.mod

import typingsJapgolly.trezorConnect.trezorConnectStrings.`send-max`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMaxOutput extends Output {
  var address: String
  var `type`: `send-max`
}

object SendMaxOutput {
  @scala.inline
  def apply(address: String, `type`: `send-max`): SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMaxOutput]
  }
}

