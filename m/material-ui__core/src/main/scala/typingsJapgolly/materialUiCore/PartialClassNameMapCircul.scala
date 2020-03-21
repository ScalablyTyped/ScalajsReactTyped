package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CircularProgress/CircularProgress.CircularProgressClassKey>> */
@js.native
trait PartialClassNameMapCircul extends js.Object {
  var circle: js.UndefOr[String] = js.native
  var circleDisableShrink: js.UndefOr[String] = js.native
  var circleIndeterminate: js.UndefOr[String] = js.native
  var circleStatic: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var indeterminate: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var static: js.UndefOr[String] = js.native
  var svg: js.UndefOr[String] = js.native
}

object PartialClassNameMapCircul {
  @scala.inline
  def apply(
    circle: String = null,
    circleDisableShrink: String = null,
    circleIndeterminate: String = null,
    circleStatic: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    indeterminate: String = null,
    root: String = null,
    static: String = null,
    svg: String = null
  ): PartialClassNameMapCircul = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (circleDisableShrink != null) __obj.updateDynamic("circleDisableShrink")(circleDisableShrink.asInstanceOf[js.Any])
    if (circleIndeterminate != null) __obj.updateDynamic("circleIndeterminate")(circleIndeterminate.asInstanceOf[js.Any])
    if (circleStatic != null) __obj.updateDynamic("circleStatic")(circleStatic.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (indeterminate != null) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapCircul]
  }
}

