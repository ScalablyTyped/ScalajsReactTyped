package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TextField/TextField.TextFieldClassKey>> */
@js.native
trait PartialClassNameMapTextFi extends js.Object {
  var fullWidth: js.UndefOr[String] = js.native
  var marginDense: js.UndefOr[String] = js.native
  var marginNormal: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTextFi {
  @scala.inline
  def apply(
    fullWidth: String = null,
    marginDense: String = null,
    marginNormal: String = null,
    root: String = null
  ): PartialClassNameMapTextFi = {
    val __obj = js.Dynamic.literal()
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense.asInstanceOf[js.Any])
    if (marginNormal != null) __obj.updateDynamic("marginNormal")(marginNormal.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTextFi]
  }
}

