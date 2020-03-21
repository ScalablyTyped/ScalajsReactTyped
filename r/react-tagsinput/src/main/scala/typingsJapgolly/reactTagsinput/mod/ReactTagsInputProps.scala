package typingsJapgolly.reactTagsinput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsInputProps extends Props[TagsInput] {
  var addKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var addOnBlur: js.UndefOr[Boolean] = js.undefined
  var addOnPaste: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var currentValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focusedClassName: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[InputProps] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var maxTags: js.UndefOr[Double] = js.undefined
  var onChangeInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.undefined
  var onlyUnique: js.UndefOr[Boolean] = js.undefined
  var pasteSplit: js.UndefOr[js.Function1[/* data */ String, js.Array[String]]] = js.undefined
  var preventSubmit: js.UndefOr[Boolean] = js.undefined
  var removeKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps, Node]] = js.undefined
  var renderLayout: js.UndefOr[RenderLayout] = js.undefined
  var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps, Node]] = js.undefined
  var tagDisplayProp: js.UndefOr[String | Null] = js.undefined
  var tagProps: js.UndefOr[TagProps] = js.undefined
  var validationRegex: js.UndefOr[js.RegExp] = js.undefined
  var value: js.Array[Tag]
  def onChange(tags: js.Array[Tag], changed: js.Array[Tag], changedIndexes: js.Array[Double]): Unit
}

object ReactTagsInputProps {
  @scala.inline
  def apply(
    onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Callback,
    value: js.Array[Tag],
    addKeys: js.Array[Double | String] = null,
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    currentValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusedClassName: String = null,
    inputProps: InputProps = null,
    inputValue: String = null,
    key: Key = null,
    maxTags: Int | Double = null,
    onChangeInput: /* value */ String => Callback = null,
    onValidationReject: /* tags */ js.Array[String] => Callback = null,
    onlyUnique: js.UndefOr[Boolean] = js.undefined,
    pasteSplit: /* data */ String => CallbackTo[js.Array[String]] = null,
    preventSubmit: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[TagsInput] = null,
    removeKeys: js.Array[Double] = null,
    renderInput: /* props */ RenderInputProps => CallbackTo[Node] = null,
    renderLayout: (/* tagElements */ js.Array[Element], /* inputElement */ Element) => CallbackTo[ReactChild] = null,
    renderTag: /* props */ RenderTagProps => CallbackTo[Node] = null,
    tagDisplayProp: String = null,
    tagProps: TagProps = null,
    validationRegex: js.RegExp = null
  ): ReactTagsInputProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.reactTagsinput.mod.Tag], t1: js.Array[typingsJapgolly.reactTagsinput.mod.Tag], t2: js.Array[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (addKeys != null) __obj.updateDynamic("addKeys")(addKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusedClassName != null) __obj.updateDynamic("focusedClassName")(focusedClassName.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (onChangeInput != null) __obj.updateDynamic("onChangeInput")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChangeInput(t0).runNow()))
    if (onValidationReject != null) __obj.updateDynamic("onValidationReject")(js.Any.fromFunction1((t0: /* tags */ js.Array[java.lang.String]) => onValidationReject(t0).runNow()))
    if (!js.isUndefined(onlyUnique)) __obj.updateDynamic("onlyUnique")(onlyUnique.asInstanceOf[js.Any])
    if (pasteSplit != null) __obj.updateDynamic("pasteSplit")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => pasteSplit(t0).runNow()))
    if (!js.isUndefined(preventSubmit)) __obj.updateDynamic("preventSubmit")(preventSubmit.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (removeKeys != null) __obj.updateDynamic("removeKeys")(removeKeys.asInstanceOf[js.Any])
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactTagsinput.mod.RenderInputProps) => renderInput(t0).runNow()))
    if (renderLayout != null) __obj.updateDynamic("renderLayout")(js.Any.fromFunction2((t0: /* tagElements */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* inputElement */ japgolly.scalajs.react.raw.React.Element) => renderLayout(t0, t1).runNow()))
    if (renderTag != null) __obj.updateDynamic("renderTag")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactTagsinput.mod.RenderTagProps) => renderTag(t0).runNow()))
    if (tagDisplayProp != null) __obj.updateDynamic("tagDisplayProp")(tagDisplayProp.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTagsInputProps]
  }
}

