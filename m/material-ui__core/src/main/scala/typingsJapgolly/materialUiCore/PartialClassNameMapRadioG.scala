package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey>> */
@js.native
trait PartialClassNameMapRadioG extends js.Object {
  var root: js.UndefOr[String] = js.native
  var row: js.UndefOr[String] = js.native
}

object PartialClassNameMapRadioG {
  @scala.inline
  def apply(root: String = null, row: String = null): PartialClassNameMapRadioG = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapRadioG]
  }
}

