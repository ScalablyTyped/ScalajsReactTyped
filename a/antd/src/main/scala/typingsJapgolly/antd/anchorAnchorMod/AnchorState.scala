package typingsJapgolly.antd.anchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorState extends js.Object {
  var activeLink: Null | String
}

object AnchorState {
  @scala.inline
  def apply(activeLink: String = null): AnchorState = {
    val __obj = js.Dynamic.literal()
    if (activeLink != null) __obj.updateDynamic("activeLink")(activeLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorState]
  }
}

