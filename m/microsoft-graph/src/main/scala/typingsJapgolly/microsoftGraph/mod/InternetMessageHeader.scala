package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetMessageHeader extends js.Object {
  // Represents the key in a key-value pair.
  var name: js.UndefOr[String] = js.undefined
  // The value in a key-value pair.
  var value: js.UndefOr[String] = js.undefined
}

object InternetMessageHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): InternetMessageHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternetMessageHeader]
  }
}

