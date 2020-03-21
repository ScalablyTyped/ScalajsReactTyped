package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/List.ListClassKey>> */
@js.native
trait PartialStyleRulesListClas extends js.Object {
  var dense: js.UndefOr[CSSProperties] = js.native
  var padding: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var subheader: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesListClas {
  @scala.inline
  def apply(
    dense: CSSProperties = null,
    padding: CSSProperties = null,
    root: CSSProperties = null,
    subheader: CSSProperties = null
  ): PartialStyleRulesListClas = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesListClas]
  }
}

