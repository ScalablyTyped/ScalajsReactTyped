package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antDesignPro.antDesignProStrings.bottomCenter
import typingsJapgolly.antDesignPro.antDesignProStrings.bottomLeft
import typingsJapgolly.antDesignPro.antDesignProStrings.bottomRight
import typingsJapgolly.antDesignPro.antDesignProStrings.topCenter
import typingsJapgolly.antDesignPro.antDesignProStrings.topLeft
import typingsJapgolly.antDesignPro.antDesignProStrings.topRight
import typingsJapgolly.antDesignPro.headerDropdownMod.HeaderDropdownProps
import typingsJapgolly.antDesignPro.headerDropdownMod.OverlayFunc
import typingsJapgolly.antDesignPro.headerDropdownMod.default
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.contextMenu
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.dropdownDropdownMod.Align
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderDropdown {
  def apply(
    align: Align = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    openClassName: String = null,
    overlay: Node | OverlayFunc = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: js.Array[click | hover | contextMenu] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HeaderDropdownProps, default, Unit, HeaderDropdownProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.headerDropdownMod.HeaderDropdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.headerDropdownMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.headerDropdownMod.HeaderDropdownProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/HeaderDropdown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

