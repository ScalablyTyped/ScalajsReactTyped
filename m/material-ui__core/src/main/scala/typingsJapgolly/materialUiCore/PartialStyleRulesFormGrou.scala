package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormGroup.FormGroupClassKey>> */
@js.native
trait PartialStyleRulesFormGrou extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
  var row: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFormGrou {
  @scala.inline
  def apply(root: CSSProperties = null, row: CSSProperties = null): PartialStyleRulesFormGrou = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesFormGrou]
  }
}

