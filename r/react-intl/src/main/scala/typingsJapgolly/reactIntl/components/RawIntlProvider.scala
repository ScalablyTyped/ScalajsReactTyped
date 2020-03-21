package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactIntl.mod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RawIntlProvider {
  def apply(
    value: IntlShape,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProviderProps[IntlShape], 
    MountedWithRawType[ProviderProps[IntlShape], js.Object, RawMounted[ProviderProps[IntlShape], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.reactIntl.mod.IntlShape], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.reactIntl.mod.IntlShape]])(children: _*)
  }
  @JSImport("react-intl", "RawIntlProvider")
  @js.native
  object componentImport extends js.Object
  
}

