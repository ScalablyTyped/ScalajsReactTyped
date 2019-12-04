package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libLocaleDashProviderLocaleReceiverMod.LocaleReceiverProps
import typingsJapgolly.antd.libLocaleDashProviderLocaleReceiverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleReceiver {
  def apply(
    componentName: String = null,
    defaultLocale: js.Object | js.Function = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Object, js.UndefOr[String], js.UndefOr[js.Object]) => CallbackTo[Node]
  ): UnmountedWithRoot[LocaleReceiverProps, default, Unit, LocaleReceiverProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction3((t0: js.Object, t1: js.UndefOr[java.lang.String], t2: js.UndefOr[js.Object]) => children(t0, t1, t2).runNow()))
    if (componentName != null) __obj.updateDynamic("componentName")(componentName.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libLocaleDashProviderLocaleReceiverMod.LocaleReceiverProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antd.libLocaleDashProviderLocaleReceiverMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libLocaleDashProviderLocaleReceiverMod.LocaleReceiverProps])
  }
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

