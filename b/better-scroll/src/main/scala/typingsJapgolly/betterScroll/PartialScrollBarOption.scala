package typingsJapgolly.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.ScrollBarOption> */
trait PartialScrollBarOption extends js.Object {
  var fade: js.UndefOr[Boolean] = js.undefined
}

object PartialScrollBarOption {
  @scala.inline
  def apply(fade: js.UndefOr[Boolean] = js.undefined): PartialScrollBarOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollBarOption]
  }
}

