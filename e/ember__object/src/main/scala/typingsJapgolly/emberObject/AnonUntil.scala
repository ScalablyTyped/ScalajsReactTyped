package typingsJapgolly.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUntil extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object AnonUntil {
  @scala.inline
  def apply(id: String = null, until: String = null): AnonUntil = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUntil]
  }
}

