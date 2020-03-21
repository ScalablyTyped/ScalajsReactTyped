package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactColor.editableInputMod.EditableInputProps
import typingsJapgolly.reactColor.editableInputMod.EditableInputStyles
import typingsJapgolly.reactColor.editableInputMod.default
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableInput {
  def apply(
    color: Color = null,
    dragLabel: String = null,
    dragMax: String = null,
    label: String = null,
    onChange: /* color */ ColorResult => Callback = null,
    style: EditableInputStyles = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EditableInputProps, default, Unit, EditableInputProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dragLabel != null) __obj.updateDynamic("dragLabel")(dragLabel.asInstanceOf[js.Any])
    if (dragMax != null) __obj.updateDynamic("dragMax")(dragMax.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactColor.editableInputMod.EditableInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactColor.editableInputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactColor.editableInputMod.EditableInputProps])(children: _*)
  }
  @JSImport("react-color/lib/components/common/EditableInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

