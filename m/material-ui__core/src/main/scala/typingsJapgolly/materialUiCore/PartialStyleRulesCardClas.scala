package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Card.CardClassKey>> */
@js.native
trait PartialStyleRulesCardClas extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCardClas {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesCardClas = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardClas]
  }
}

