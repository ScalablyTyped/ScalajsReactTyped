package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonAddTab
import typingsJapgolly.antDesignPro.loginTabMod.LoginTabProps
import typingsJapgolly.antDesignPro.loginTabMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginTab {
  def apply(
    tabUtil: AnonAddTab,
    tab: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LoginTabProps, default, Unit, LoginTabProps] = {
    val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
  
      if (tab != null) __obj.updateDynamic("tab")(tab.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.loginTabMod.LoginTabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.loginTabMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.loginTabMod.LoginTabProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

