package typingsJapgolly.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormControlLabel/FormControlLabel.FormControlLabelClassKey>> */
trait PartialClassNameMapFormControlLabelClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapFormControlLabelClassKey {
  @scala.inline
  def apply(disabled: String = null, label: String = null, root: String = null, start: String = null): PartialClassNameMapFormControlLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapFormControlLabelClassKey]
  }
}

