package typingsJapgolly.atMaterialDashUiCore.withWidthWithWidthMod

import typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithWidthOptions extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.undefined
  var noSSR: js.UndefOr[Boolean] = js.undefined
  var resizeInterval: js.UndefOr[Double] = js.undefined
  var withTheme: js.UndefOr[Boolean] = js.undefined
}

object WithWidthOptions {
  @scala.inline
  def apply(
    initialWidth: Breakpoint = null,
    noSSR: js.UndefOr[Boolean] = js.undefined,
    resizeInterval: Int | Double = null,
    withTheme: js.UndefOr[Boolean] = js.undefined
  ): WithWidthOptions = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noSSR)) __obj.updateDynamic("noSSR")(noSSR.asInstanceOf[js.Any])
    if (resizeInterval != null) __obj.updateDynamic("resizeInterval")(resizeInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithWidthOptions]
  }
}

