package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
@js.native
trait PartialStyleRulesFormCont extends js.Object {
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var marginDense: js.UndefOr[CSSProperties] = js.native
  var marginNormal: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFormCont {
  @scala.inline
  def apply(
    fullWidth: CSSProperties = null,
    marginDense: CSSProperties = null,
    marginNormal: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesFormCont = {
    val __obj = js.Dynamic.literal()
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense.asInstanceOf[js.Any])
    if (marginNormal != null) __obj.updateDynamic("marginNormal")(marginNormal.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesFormCont]
  }
}

