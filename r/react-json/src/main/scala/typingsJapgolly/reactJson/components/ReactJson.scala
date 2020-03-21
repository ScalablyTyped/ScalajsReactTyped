package typingsJapgolly.reactJson.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactJson.mod.JsonProperties
import typingsJapgolly.reactJson.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJson {
  def apply(
    value: js.Any,
    onChange: /* value */ js.Any => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[JsonProperties, ^, Unit, JsonProperties] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJson.mod.JsonProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJson.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJson.mod.JsonProperties])(children: _*)
  }
  @JSImport("react-json", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

