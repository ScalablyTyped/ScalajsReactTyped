package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MobileStepper.MobileStepperClassKey>> */
trait PartialStyleRulesMobileStepperClassKey extends js.Object {
  var dot: js.UndefOr[CSSProperties] = js.undefined
  var dotActive: js.UndefOr[CSSProperties] = js.undefined
  var dots: js.UndefOr[CSSProperties] = js.undefined
  var positionBottom: js.UndefOr[CSSProperties] = js.undefined
  var positionStatic: js.UndefOr[CSSProperties] = js.undefined
  var positionTop: js.UndefOr[CSSProperties] = js.undefined
  var progress: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesMobileStepperClassKey {
  @scala.inline
  def apply(
    dot: CSSProperties = null,
    dotActive: CSSProperties = null,
    dots: CSSProperties = null,
    positionBottom: CSSProperties = null,
    positionStatic: CSSProperties = null,
    positionTop: CSSProperties = null,
    progress: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesMobileStepperClassKey = {
    val __obj = js.Dynamic.literal()
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (dotActive != null) __obj.updateDynamic("dotActive")(dotActive.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (positionBottom != null) __obj.updateDynamic("positionBottom")(positionBottom.asInstanceOf[js.Any])
    if (positionStatic != null) __obj.updateDynamic("positionStatic")(positionStatic.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesMobileStepperClassKey]
  }
}

