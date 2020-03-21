package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Avatar.AvatarClassKey>> */
@js.native
trait PartialStyleRulesAvatarCl extends js.Object {
  var colorDefault: js.UndefOr[CSSProperties] = js.native
  var img: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesAvatarCl {
  @scala.inline
  def apply(colorDefault: CSSProperties = null, img: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesAvatarCl = {
    val __obj = js.Dynamic.literal()
    if (colorDefault != null) __obj.updateDynamic("colorDefault")(colorDefault.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesAvatarCl]
  }
}

