package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.ethereumProtocol.mod.AbiType.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAbi extends AbiDefinition {
  var anonymous: Boolean
  var inputs: js.Array[EventParameter]
  var name: String
  var `type`: Event
}

object EventAbi {
  @scala.inline
  def apply(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAbi]
  }
}

