package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.libPopoverMod.PopoverProps
import typingsJapgolly.antd.libPopoverMod.default
import typingsJapgolly.antd.libTooltipMod.TooltipAlignConfig
import typingsJapgolly.antd.libTooltipMod.TooltipPlacement
import typingsJapgolly.antd.libTooltipMod.TooltipTrigger
import typingsJapgolly.antd.libTooltipPlacementsMod.AdjustOverflow
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    align: TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    className: String = null,
    content: VdomNode = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    getTooltipContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    transitionName: String = null,
    trigger: TooltipTrigger = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, default, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getTooltipContainer(t0).runNow()))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libPopoverMod.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libPopoverMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libPopoverMod.PopoverProps])(children: _*)
  }
  @JSImport("antd/lib/popover", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

