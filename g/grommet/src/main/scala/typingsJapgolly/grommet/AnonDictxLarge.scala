package typingsJapgolly.grommet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictxLarge
  extends /* x */ StringDictionary[js.UndefOr[String]] {
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
}

object AnonDictxLarge {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.UndefOr[String]] = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null
  ): AnonDictxLarge = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictxLarge]
  }
}

