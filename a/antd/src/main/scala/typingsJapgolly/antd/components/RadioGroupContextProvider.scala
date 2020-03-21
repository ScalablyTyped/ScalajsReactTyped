package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.radioInterfaceMod.RadioGroupContextProps
import typingsJapgolly.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroupContextProvider {
  def apply(
    value: RadioGroupContextProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProviderProps[RadioGroupContextProps | Null], 
    MountedWithRawType[
      ProviderProps[RadioGroupContextProps | Null], 
      js.Object, 
      RawMounted[ProviderProps[RadioGroupContextProps | Null], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.antd.radioInterfaceMod.RadioGroupContextProps | scala.Null], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.antd.radioInterfaceMod.RadioGroupContextProps | scala.Null]])(children: _*)
  }
  @JSImport("antd/lib/radio/context", "RadioGroupContextProvider")
  @js.native
  object componentImport extends js.Object
  
}

