package typingsJapgolly.antdMobileRn.iconPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconPropsType extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var `type`: String
}

object IconPropsType {
  @scala.inline
  def apply(`type`: String, color: String = null): IconPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconPropsType]
  }
}

