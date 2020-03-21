package typingsJapgolly.reactTagsinput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactTagsinput.mod.InputProps
import typingsJapgolly.reactTagsinput.mod.ReactTagsInputProps
import typingsJapgolly.reactTagsinput.mod.RenderInputProps
import typingsJapgolly.reactTagsinput.mod.RenderTagProps
import typingsJapgolly.reactTagsinput.mod.Tag
import typingsJapgolly.reactTagsinput.mod.TagProps
import typingsJapgolly.reactTagsinput.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagsinput {
  def apply(
    value: js.Array[Tag],
    onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Callback,
    addKeys: js.Array[Double | String] = null,
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    currentValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusedClassName: String = null,
    inputProps: InputProps = null,
    inputValue: String = null,
    maxTags: Int | Double = null,
    onChangeInput: /* value */ String => Callback = null,
    onValidationReject: /* tags */ js.Array[String] => Callback = null,
    onlyUnique: js.UndefOr[Boolean] = js.undefined,
    pasteSplit: /* data */ String => CallbackTo[js.Array[String]] = null,
    preventSubmit: js.UndefOr[Boolean] = js.undefined,
    removeKeys: js.Array[Double] = null,
    renderInput: /* props */ RenderInputProps => CallbackTo[Node] = null,
    renderLayout: (/* tagElements */ js.Array[Element], /* inputElement */ Element) => CallbackTo[ReactChild] = null,
    renderTag: /* props */ RenderTagProps => CallbackTo[Node] = null,
    tagDisplayProp: String = null,
    tagProps: TagProps = null,
    validationRegex: js.RegExp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactTagsInputProps, ^, Unit, ReactTagsInputProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.reactTagsinput.mod.Tag], t1: js.Array[typingsJapgolly.reactTagsinput.mod.Tag], t2: js.Array[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (addKeys != null) __obj.updateDynamic("addKeys")(addKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusedClassName != null) __obj.updateDynamic("focusedClassName")(focusedClassName.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (onChangeInput != null) __obj.updateDynamic("onChangeInput")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChangeInput(t0).runNow()))
    if (onValidationReject != null) __obj.updateDynamic("onValidationReject")(js.Any.fromFunction1((t0: /* tags */ js.Array[java.lang.String]) => onValidationReject(t0).runNow()))
    if (!js.isUndefined(onlyUnique)) __obj.updateDynamic("onlyUnique")(onlyUnique.asInstanceOf[js.Any])
    if (pasteSplit != null) __obj.updateDynamic("pasteSplit")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => pasteSplit(t0).runNow()))
    if (!js.isUndefined(preventSubmit)) __obj.updateDynamic("preventSubmit")(preventSubmit.asInstanceOf[js.Any])
    if (removeKeys != null) __obj.updateDynamic("removeKeys")(removeKeys.asInstanceOf[js.Any])
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactTagsinput.mod.RenderInputProps) => renderInput(t0).runNow()))
    if (renderLayout != null) __obj.updateDynamic("renderLayout")(js.Any.fromFunction2((t0: /* tagElements */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* inputElement */ japgolly.scalajs.react.raw.React.Element) => renderLayout(t0, t1).runNow()))
    if (renderTag != null) __obj.updateDynamic("renderTag")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactTagsinput.mod.RenderTagProps) => renderTag(t0).runNow()))
    if (tagDisplayProp != null) __obj.updateDynamic("tagDisplayProp")(tagDisplayProp.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTagsinput.mod.ReactTagsInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTagsinput.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTagsinput.mod.ReactTagsInputProps])(children: _*)
  }
  @JSImport("react-tagsinput", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

