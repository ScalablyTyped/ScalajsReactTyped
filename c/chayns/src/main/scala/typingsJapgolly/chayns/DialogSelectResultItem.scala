package typingsJapgolly.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectResultItem extends js.Object {
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object DialogSelectResultItem {
  @scala.inline
  def apply(name: String, value: String = null): DialogSelectResultItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResultItem]
  }
}

