package typingsJapgolly.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageConfig extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var `type`: String
}

object MessageConfig {
  @scala.inline
  def apply(`type`: String, name: String = null): MessageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageConfig]
  }
}

