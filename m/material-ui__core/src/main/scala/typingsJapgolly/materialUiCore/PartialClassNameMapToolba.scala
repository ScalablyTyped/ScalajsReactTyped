package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Toolbar/Toolbar.ToolbarClassKey>> */
@js.native
trait PartialClassNameMapToolba extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var gutters: js.UndefOr[String] = js.native
  var regular: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapToolba {
  @scala.inline
  def apply(dense: String = null, gutters: String = null, regular: String = null, root: String = null): PartialClassNameMapToolba = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (regular != null) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapToolba]
  }
}

