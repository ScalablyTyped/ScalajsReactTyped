package typingsJapgolly.bleno.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptorOptions extends js.Object {
  var uuid: String
  var value: js.UndefOr[Buffer | String | Null] = js.undefined
}

object DescriptorOptions {
  @scala.inline
  def apply(uuid: String, value: Buffer | String = null): DescriptorOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorOptions]
  }
}

