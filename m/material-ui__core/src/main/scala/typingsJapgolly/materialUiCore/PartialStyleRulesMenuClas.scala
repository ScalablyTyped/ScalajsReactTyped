package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Menu.MenuClassKey>> */
@js.native
trait PartialStyleRulesMenuClas extends js.Object {
  var paper: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesMenuClas {
  @scala.inline
  def apply(paper: CSSProperties = null): PartialStyleRulesMenuClas = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesMenuClas]
  }
}

