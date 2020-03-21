package typingsJapgolly.reactI18next.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.i18next.mod.i18n
import typingsJapgolly.reactI18next.mod.I18nextProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18nextProvider {
  def apply(
    i18n: i18n,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    I18nextProviderProps, 
    MountedWithRawType[I18nextProviderProps, js.Object, RawMounted[I18nextProviderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactI18next.mod.I18nextProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactI18next.mod.I18nextProviderProps])(children: _*)
  }
  @JSImport("react-i18next", "I18nextProvider")
  @js.native
  object componentImport extends js.Object
  
}

