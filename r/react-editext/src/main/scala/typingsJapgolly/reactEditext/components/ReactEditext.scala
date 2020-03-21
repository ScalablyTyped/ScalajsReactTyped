package typingsJapgolly.reactEditext.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactEditext.mod.EdiTextProps
import typingsJapgolly.reactEditext.mod.EdiTextType
import typingsJapgolly.reactEditext.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEditext {
  def apply(
    value: String,
    onSave: /* repeated */ String => CallbackTo[js.Any],
    `type`: EdiTextType,
    cancelButtonClassName: String = null,
    cancelButtonContent: js.Any = null,
    editButtonClassName: String = null,
    editButtonContent: js.Any = null,
    hideIcons: js.UndefOr[Boolean] = js.undefined,
    hint: VdomNode = null,
    inputProps: js.Object = null,
    onCancel: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onValidationFail: /* repeated */ String => CallbackTo[js.Any] = null,
    saveButtonClassName: String = null,
    saveButtonContent: js.Any = null,
    validation: /* repeated */ String => CallbackTo[Boolean] = null,
    validationMessage: String = null,
    viewProps: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EdiTextProps, default, Unit, EdiTextProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onSave")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => onSave(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cancelButtonClassName != null) __obj.updateDynamic("cancelButtonClassName")(cancelButtonClassName.asInstanceOf[js.Any])
    if (cancelButtonContent != null) __obj.updateDynamic("cancelButtonContent")(cancelButtonContent.asInstanceOf[js.Any])
    if (editButtonClassName != null) __obj.updateDynamic("editButtonClassName")(editButtonClassName.asInstanceOf[js.Any])
    if (editButtonContent != null) __obj.updateDynamic("editButtonContent")(editButtonContent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcons)) __obj.updateDynamic("hideIcons")(hideIcons.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.rawNode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onCancel(t0).runNow()))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => onValidationFail(t0).runNow()))
    if (saveButtonClassName != null) __obj.updateDynamic("saveButtonClassName")(saveButtonClassName.asInstanceOf[js.Any])
    if (saveButtonContent != null) __obj.updateDynamic("saveButtonContent")(saveButtonContent.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => validation(t0).runNow()))
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    if (viewProps != null) __obj.updateDynamic("viewProps")(viewProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEditext.mod.EdiTextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEditext.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEditext.mod.EdiTextProps])(children: _*)
  }
  @JSImport("react-editext", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

