package typingsJapgolly.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientProps extends js.Object {
  var cx: js.UndefOr[NumberProp] = js.undefined
  var cy: js.UndefOr[NumberProp] = js.undefined
  var fx: js.UndefOr[NumberProp] = js.undefined
  var fy: js.UndefOr[NumberProp] = js.undefined
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  var gradientUnits: js.UndefOr[Units] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var r: js.UndefOr[NumberProp] = js.undefined
  var rx: js.UndefOr[NumberProp] = js.undefined
  var ry: js.UndefOr[NumberProp] = js.undefined
}

object RadialGradientProps {
  @scala.inline
  def apply(
    cx: NumberProp = null,
    cy: NumberProp = null,
    fx: NumberProp = null,
    fy: NumberProp = null,
    gradientTransform: ColumnMajorTransformMatrix | String = null,
    gradientUnits: Units = null,
    id: String = null,
    r: NumberProp = null,
    rx: NumberProp = null,
    ry: NumberProp = null
  ): RadialGradientProps = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientProps]
  }
}

