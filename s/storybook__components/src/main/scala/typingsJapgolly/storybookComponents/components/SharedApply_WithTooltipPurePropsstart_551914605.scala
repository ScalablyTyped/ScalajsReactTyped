package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.storybookComponents.WithTooltipPurePropsstart
import typingsJapgolly.storybookComponents.storybookComponentsStrings.`right-click`
import typingsJapgolly.storybookComponents.storybookComponentsStrings.click
import typingsJapgolly.storybookComponents.storybookComponentsStrings.hover
import typingsJapgolly.storybookComponents.storybookComponentsStrings.none
import typingsJapgolly.storybookComponents.withTooltipMod.WithHideFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_WithTooltipPurePropsstart_551914605 () {
  val componentImport: js.Any
  def apply(
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onDoubleClick: js.UndefOr[Callback] = js.undefined,
    onVisibilityChange: /* visibility */ Boolean => Callback = null,
    placement: Placement = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    svg: js.UndefOr[Boolean] = js.undefined,
    tooltip: Node | (js.Function1[/* p */ WithHideFn, Node]) = null,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    trigger: none | hover | click | `right-click` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    WithTooltipPurePropsstart, 
    MountedWithRawType[
      WithTooltipPurePropsstart, 
      js.Object, 
      RawMounted[WithTooltipPurePropsstart, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    onDoubleClick.foreach(p => __obj.updateDynamic("onDoubleClick")(p.toJsFn))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1((t0: /* visibility */ scala.Boolean) => onVisibilityChange(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.WithTooltipPurePropsstart, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.WithTooltipPurePropsstart])(children: _*)
  }
}

