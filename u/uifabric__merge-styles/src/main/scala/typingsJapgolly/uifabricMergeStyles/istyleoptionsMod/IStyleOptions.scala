package typingsJapgolly.uifabricMergeStyles.istyleoptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleOptions extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.undefined
}

object IStyleOptions {
  @scala.inline
  def apply(rtl: js.UndefOr[Boolean] = js.undefined): IStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleOptions]
  }
}

