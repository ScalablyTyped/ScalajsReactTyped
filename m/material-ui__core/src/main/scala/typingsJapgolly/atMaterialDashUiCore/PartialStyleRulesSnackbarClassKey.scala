package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Snackbar.SnackbarClassKey>> */
trait PartialStyleRulesSnackbarClassKey extends js.Object {
  var anchorOriginBottomCenter: js.UndefOr[CSSProperties] = js.undefined
  var anchorOriginBottomLeft: js.UndefOr[CSSProperties] = js.undefined
  var anchorOriginBottomRight: js.UndefOr[CSSProperties] = js.undefined
  var anchorOriginTopCenter: js.UndefOr[CSSProperties] = js.undefined
  var anchorOriginTopLeft: js.UndefOr[CSSProperties] = js.undefined
  var anchorOriginTopRight: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesSnackbarClassKey {
  @scala.inline
  def apply(
    anchorOriginBottomCenter: CSSProperties = null,
    anchorOriginBottomLeft: CSSProperties = null,
    anchorOriginBottomRight: CSSProperties = null,
    anchorOriginTopCenter: CSSProperties = null,
    anchorOriginTopLeft: CSSProperties = null,
    anchorOriginTopRight: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesSnackbarClassKey = {
    val __obj = js.Dynamic.literal()
    if (anchorOriginBottomCenter != null) __obj.updateDynamic("anchorOriginBottomCenter")(anchorOriginBottomCenter.asInstanceOf[js.Any])
    if (anchorOriginBottomLeft != null) __obj.updateDynamic("anchorOriginBottomLeft")(anchorOriginBottomLeft.asInstanceOf[js.Any])
    if (anchorOriginBottomRight != null) __obj.updateDynamic("anchorOriginBottomRight")(anchorOriginBottomRight.asInstanceOf[js.Any])
    if (anchorOriginTopCenter != null) __obj.updateDynamic("anchorOriginTopCenter")(anchorOriginTopCenter.asInstanceOf[js.Any])
    if (anchorOriginTopLeft != null) __obj.updateDynamic("anchorOriginTopLeft")(anchorOriginTopLeft.asInstanceOf[js.Any])
    if (anchorOriginTopRight != null) __obj.updateDynamic("anchorOriginTopRight")(anchorOriginTopRight.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesSnackbarClassKey]
  }
}

