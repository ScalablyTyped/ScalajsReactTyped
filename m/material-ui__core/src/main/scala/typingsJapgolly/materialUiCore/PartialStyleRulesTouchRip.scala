package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase/TouchRipple.TouchRippleClassKey>> */
@js.native
trait PartialStyleRulesTouchRip extends js.Object {
  var child: js.UndefOr[CSSProperties] = js.native
  var childLeaving: js.UndefOr[CSSProperties] = js.native
  var childPulsate: js.UndefOr[CSSProperties] = js.native
  var ripple: js.UndefOr[CSSProperties] = js.native
  var ripplePulsate: js.UndefOr[CSSProperties] = js.native
  var rippleVisible: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTouchRip {
  @scala.inline
  def apply(
    child: CSSProperties = null,
    childLeaving: CSSProperties = null,
    childPulsate: CSSProperties = null,
    ripple: CSSProperties = null,
    ripplePulsate: CSSProperties = null,
    rippleVisible: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesTouchRip = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (childLeaving != null) __obj.updateDynamic("childLeaving")(childLeaving.asInstanceOf[js.Any])
    if (childPulsate != null) __obj.updateDynamic("childPulsate")(childPulsate.asInstanceOf[js.Any])
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (ripplePulsate != null) __obj.updateDynamic("ripplePulsate")(ripplePulsate.asInstanceOf[js.Any])
    if (rippleVisible != null) __obj.updateDynamic("rippleVisible")(rippleVisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTouchRip]
  }
}

