package typingsJapgolly.grommet

import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMarginMarginType extends js.Object {
  var margin: js.UndefOr[MarginType] = js.undefined
}

object AnonMarginMarginType {
  @scala.inline
  def apply(margin: MarginType = null): AnonMarginMarginType = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarginMarginType]
  }
}

