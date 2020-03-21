package typingsJapgolly.reactFileInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactFileInput.mod.FileInputProps
import typingsJapgolly.reactFileInput.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFileInput {
  def apply(
    accept: String,
    className: String,
    name: String,
    placeholder: String,
    onChange: ReactEventFrom[Element] => Callback,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FileInputProps, ^, Unit, FileInputProps] = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFileInput.mod.FileInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFileInput.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFileInput.mod.FileInputProps])(children: _*)
  }
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

