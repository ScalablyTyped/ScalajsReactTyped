package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.editableTextMod.IEditableTextProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableText {
  def apply(
    alwaysRenderInput: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    confirmOnEnterKey: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    maxLines: Int | Double = null,
    minLines: Int | Double = null,
    minWidth: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onCancel: /* value */ String => Callback = null,
    onChange: /* value */ String => Callback = null,
    onConfirm: /* value */ String => Callback = null,
    onEdit: /* value */ String => Callback = null,
    placeholder: String = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IEditableTextProps, 
    typingsJapgolly.blueprintjsCore.mod.EditableText, 
    Unit, 
    IEditableTextProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(alwaysRenderInput)) __obj.updateDynamic("alwaysRenderInput")(alwaysRenderInput.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmOnEnterKey)) __obj.updateDynamic("confirmOnEnterKey")(confirmOnEnterKey.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onCancel(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onConfirm(t0).runNow()))
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onEdit(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.editableTextMod.IEditableTextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.EditableText](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.editableTextMod.IEditableTextProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "EditableText")
  @js.native
  object componentImport extends js.Object
  
}

