package typingsJapgolly.storybookComponents.withTooltipMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.storybookComponents.storybookComponentsStrings.`right-click`
import typingsJapgolly.storybookComponents.storybookComponentsStrings.click
import typingsJapgolly.storybookComponents.storybookComponentsStrings.hover
import typingsJapgolly.storybookComponents.storybookComponentsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTooltipPureProps extends js.Object {
  var children: Node = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var hasChrome: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var svg: js.UndefOr[Boolean] = js.native
  var tooltip: Node | (js.Function1[/* p */ WithHideFn, Node]) = js.native
  var tooltipShown: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[none | hover | click | `right-click`] = js.native
}

object WithTooltipPureProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onDoubleClick: js.UndefOr[Callback] = js.undefined,
    onVisibilityChange: /* visibility */ Boolean => Callback = null,
    placement: Placement = null,
    svg: js.UndefOr[Boolean] = js.undefined,
    tooltip: Node | (js.Function1[/* p */ WithHideFn, Node]) = null,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    trigger: none | hover | click | `right-click` = null
  ): WithTooltipPureProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    onDoubleClick.foreach(p => __obj.updateDynamic("onDoubleClick")(p.toJsFn))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1((t0: /* visibility */ scala.Boolean) => onVisibilityChange(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipPureProps]
  }
}

