package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Ghost
import typingsJapgolly.antd.libConfigDashProviderContextMod.CSPConfig
import typingsJapgolly.antd.libConfigDashProviderMod.ConfigProviderProps
import typingsJapgolly.antd.libLocaleDashProviderMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ConfigProviderProps1091728907[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    csp: CSPConfig = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    locale: Locale = null,
    pageHeader: Anon_Ghost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ConfigProviderProps, ComponentRef, Unit, ConfigProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1((t0: /* componentName */ js.UndefOr[java.lang.String]) => renderEmpty(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libConfigDashProviderMod.ConfigProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libConfigDashProviderMod.ConfigProviderProps])(children: _*)
  }
}

