package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.multiple
import typingsJapgolly.antd.antdStrings.tags
import typingsJapgolly.antd.selectMod.SelectProps
import typingsJapgolly.antd.selectMod.SelectValue
import typingsJapgolly.antd.selectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  def apply[ValueType /* <: SelectValue */](
    mode: multiple | tags = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectProps[ValueType], default[ValueType], Unit, SelectProps[ValueType]] = {
    val __obj = js.Dynamic.literal()
  
      if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.selectMod.SelectProps[ValueType], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.selectMod.default[ValueType]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.selectMod.SelectProps[ValueType]])(children: _*)
  }
  @JSImport("antd/lib/select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

