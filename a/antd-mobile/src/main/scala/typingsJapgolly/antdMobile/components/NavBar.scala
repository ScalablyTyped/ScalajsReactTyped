package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.antdMobileStrings.dark
import typingsJapgolly.antdMobile.antdMobileStrings.light
import typingsJapgolly.antdMobile.navBarMod.default
import typingsJapgolly.antdMobile.navBarPropsTypeMod.NavBarProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavBar {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    icon: VdomNode = null,
    leftContent: VdomNode = null,
    mode: dark | light = null,
    onLeftClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    rightContent: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NavBarProps, default, Unit, NavBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.rawNode.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onLeftClick != null) __obj.updateDynamic("onLeftClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLeftClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.navBarPropsTypeMod.NavBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.navBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.navBarPropsTypeMod.NavBarProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/nav-bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

