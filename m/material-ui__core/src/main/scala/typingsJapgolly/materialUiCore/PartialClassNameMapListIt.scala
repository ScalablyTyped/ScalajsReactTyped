package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItem/ListItem.ListItemClassKey>> */
@js.native
trait PartialClassNameMapListIt extends js.Object {
  var button: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var default: js.UndefOr[String] = js.native
  var dense: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var divider: js.UndefOr[String] = js.native
  var focusVisible: js.UndefOr[String] = js.native
  var gutters: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var secondaryAction: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
}

object PartialClassNameMapListIt {
  @scala.inline
  def apply(
    button: String = null,
    container: String = null,
    default: String = null,
    dense: String = null,
    disabled: String = null,
    divider: String = null,
    focusVisible: String = null,
    gutters: String = null,
    root: String = null,
    secondaryAction: String = null,
    selected: String = null
  ): PartialClassNameMapListIt = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondaryAction != null) __obj.updateDynamic("secondaryAction")(secondaryAction.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapListIt]
  }
}

