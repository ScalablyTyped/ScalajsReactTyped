package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Drawer/Drawer.DrawerClassKey>> */
@js.native
trait PartialClassNameMapDrawer extends js.Object {
  var docked: js.UndefOr[String] = js.native
  var modal: js.UndefOr[String] = js.native
  var paper: js.UndefOr[String] = js.native
  var paperAnchorBottom: js.UndefOr[String] = js.native
  var paperAnchorDockedBottom: js.UndefOr[String] = js.native
  var paperAnchorDockedLeft: js.UndefOr[String] = js.native
  var paperAnchorDockedRight: js.UndefOr[String] = js.native
  var paperAnchorDockedTop: js.UndefOr[String] = js.native
  var paperAnchorLeft: js.UndefOr[String] = js.native
  var paperAnchorRight: js.UndefOr[String] = js.native
  var paperAnchorTop: js.UndefOr[String] = js.native
}

object PartialClassNameMapDrawer {
  @scala.inline
  def apply(
    docked: String = null,
    modal: String = null,
    paper: String = null,
    paperAnchorBottom: String = null,
    paperAnchorDockedBottom: String = null,
    paperAnchorDockedLeft: String = null,
    paperAnchorDockedRight: String = null,
    paperAnchorDockedTop: String = null,
    paperAnchorLeft: String = null,
    paperAnchorRight: String = null,
    paperAnchorTop: String = null
  ): PartialClassNameMapDrawer = {
    val __obj = js.Dynamic.literal()
    if (docked != null) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    if (paperAnchorBottom != null) __obj.updateDynamic("paperAnchorBottom")(paperAnchorBottom.asInstanceOf[js.Any])
    if (paperAnchorDockedBottom != null) __obj.updateDynamic("paperAnchorDockedBottom")(paperAnchorDockedBottom.asInstanceOf[js.Any])
    if (paperAnchorDockedLeft != null) __obj.updateDynamic("paperAnchorDockedLeft")(paperAnchorDockedLeft.asInstanceOf[js.Any])
    if (paperAnchorDockedRight != null) __obj.updateDynamic("paperAnchorDockedRight")(paperAnchorDockedRight.asInstanceOf[js.Any])
    if (paperAnchorDockedTop != null) __obj.updateDynamic("paperAnchorDockedTop")(paperAnchorDockedTop.asInstanceOf[js.Any])
    if (paperAnchorLeft != null) __obj.updateDynamic("paperAnchorLeft")(paperAnchorLeft.asInstanceOf[js.Any])
    if (paperAnchorRight != null) __obj.updateDynamic("paperAnchorRight")(paperAnchorRight.asInstanceOf[js.Any])
    if (paperAnchorTop != null) __obj.updateDynamic("paperAnchorTop")(paperAnchorTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapDrawer]
  }
}

