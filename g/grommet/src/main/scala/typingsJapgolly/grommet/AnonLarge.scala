package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLarge extends js.Object {
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
  var xsmall: js.UndefOr[String] = js.undefined
}

object AnonLarge {
  @scala.inline
  def apply(
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null,
    xsmall: String = null
  ): AnonLarge = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLarge]
  }
}

