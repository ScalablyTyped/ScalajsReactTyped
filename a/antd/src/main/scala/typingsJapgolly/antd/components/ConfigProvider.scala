package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonGhost
import typingsJapgolly.antd.AnonValidateMessages
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.configProviderMod.ConfigProviderProps
import typingsJapgolly.antd.configProviderMod.default
import typingsJapgolly.antd.contextMod.CSPConfig
import typingsJapgolly.antd.localeProviderMod.Locale
import typingsJapgolly.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigProvider {
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    componentSize: SizeType = null,
    csp: CSPConfig = null,
    direction: ltr | rtl = null,
    form: AnonValidateMessages = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    locale: Locale = null,
    pageHeader: AnonGhost = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ConfigProviderProps, default, Unit, ConfigProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton.asInstanceOf[js.Any])
    if (componentSize != null) __obj.updateDynamic("componentSize")(componentSize.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageHeader != null) __obj.updateDynamic("pageHeader")(pageHeader.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1((t0: /* componentName */ js.UndefOr[java.lang.String]) => renderEmpty(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.configProviderMod.ConfigProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.configProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.configProviderMod.ConfigProviderProps])(children: _*)
  }
  @JSImport("antd/lib/config-provider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

