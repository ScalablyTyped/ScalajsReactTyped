package typingsJapgolly.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightSpacingNumber extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
}

object Anon_HeightSpacingNumber {
  @scala.inline
  def apply(height: Int | Double = null, spacing: Int | Double = null): Anon_HeightSpacingNumber = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightSpacingNumber]
  }
}

