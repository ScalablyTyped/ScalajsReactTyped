package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.layered
import typingsJapgolly.devextreme.devextremeStrings.off
import typingsJapgolly.devextreme.devextremeStrings.tree
import typingsJapgolly.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrientation extends js.Object {
  var orientation: js.UndefOr[auto | vertical | horizontal] = js.undefined
  var `type`: js.UndefOr[off | tree | layered] = js.undefined
}

object AnonOrientation {
  @scala.inline
  def apply(orientation: auto | vertical | horizontal = null, `type`: off | tree | layered = null): AnonOrientation = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrientation]
  }
}

