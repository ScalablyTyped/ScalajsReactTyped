package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.AnonKey
import typingsJapgolly.antDesignProLayout.blockCheckboxMod.BlockCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockCheckbox {
  def apply(
    value: String,
    onChange: String => Callback,
    list: js.Array[AnonKey] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BlockCheckboxProps, 
    MountedWithRawType[BlockCheckboxProps, js.Object, RawMounted[BlockCheckboxProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.blockCheckboxMod.BlockCheckboxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.blockCheckboxMod.BlockCheckboxProps])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/BlockCheckbox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

