package typingsJapgolly.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey>> */
trait PartialClassNameMapBackdropClassKey extends js.Object {
  var invisible: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapBackdropClassKey {
  @scala.inline
  def apply(invisible: String = null, root: String = null): PartialClassNameMapBackdropClassKey = {
    val __obj = js.Dynamic.literal()
    if (invisible != null) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapBackdropClassKey]
  }
}

