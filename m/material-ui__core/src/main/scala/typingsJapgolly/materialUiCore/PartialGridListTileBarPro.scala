package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.bottom
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.top
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarProps> */
@js.native
trait PartialGridListTileBarPro extends js.Object {
  var actionIcon: js.UndefOr[Node] = js.native
  var actionPosition: js.UndefOr[left | right] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapGridLiActionIcon] = js.native
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[Node] = js.native
  var title: js.UndefOr[Node] = js.native
  var titlePosition: js.UndefOr[top | bottom] = js.native
}

object PartialGridListTileBarPro {
  @scala.inline
  def apply(
    actionIcon: VdomNode = null,
    actionPosition: left | right = null,
    className: String = null,
    classes: PartialClassNameMapGridLiActionIcon = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null,
    subtitle: VdomNode = null,
    title: VdomNode = null,
    titlePosition: top | bottom = null
  ): PartialGridListTileBarPro = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.rawNode.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGridListTileBarPro]
  }
}

