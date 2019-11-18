package typingsJapgolly.atMaterialDashUiCore.gridListTileBarGridListTileBarMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapGridListTileBarClassKey
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey, never> */
trait GridListTileBarProps extends js.Object {
  var actionIcon: js.UndefOr[Node] = js.undefined
  var actionPosition: js.UndefOr[left | right] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapGridListTileBarClassKey] = js.undefined
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var titlePosition: js.UndefOr[top | bottom] = js.undefined
}

object GridListTileBarProps {
  @scala.inline
  def apply(
    actionIcon: VdomNode = null,
    actionPosition: left | right = null,
    className: String = null,
    classes: PartialClassNameMapGridListTileBarClassKey = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null,
    subtitle: VdomNode = null,
    title: VdomNode = null,
    titlePosition: top | bottom = null
  ): GridListTileBarProps = {
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
    __obj.asInstanceOf[GridListTileBarProps]
  }
}

