package typingsJapgolly.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttribute extends js.Object {
  var attribute: js.UndefOr[js.Array[String]] = js.undefined
  var name: Boolean
}

object AnonAttribute {
  @scala.inline
  def apply(name: Boolean, attribute: js.Array[String] = null): AnonAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttribute]
  }
}

