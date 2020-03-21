package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSelect.optionMod.InnerProps
import typingsJapgolly.reactSelect.optionMod.OptionProps
import typingsJapgolly.reactSelect.optionMod.default
import typingsJapgolly.reactSelect.reactSelectStrings.option
import typingsJapgolly.reactSelect.selectMod.Props
import typingsJapgolly.reactSelect.typesMod.ActionTypes
import typingsJapgolly.reactSelect.typesMod.ClassNamesState
import typingsJapgolly.reactSelect.typesMod.InnerRef
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Option {
  def apply(
    data: js.Any,
    hasValue: Boolean,
    innerProps: InnerProps,
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    isSelected: Boolean,
    label: String,
    options: OptionsType[js.Any],
    selectProps: Props[js.Any],
    clearValue: Callback,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => CallbackTo[String | Unit],
    getStyles: (String, js.Any) => CallbackTo[js.Object],
    getValue: CallbackTo[ValueType[js.Any]],
    selectOption: js.Any => Callback,
    setValue: (ValueType[js.Any], ActionTypes) => Callback,
    `type`: option,
    className: String = null,
    innerRef: InnerRef = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OptionProps[js.Any], default, Unit, OptionProps[js.Any]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
  
      __obj.updateDynamic("clearValue")(clearValue.toJsFn)
    __obj.updateDynamic("cx")(js.Any.fromFunction3((t0: js.UndefOr[scala.Null | java.lang.String], t1: js.UndefOr[typingsJapgolly.reactSelect.typesMod.ClassNamesState], t2: js.UndefOr[java.lang.String]) => cx(t0, t1, t2).runNow()))
    __obj.updateDynamic("getStyles")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getStyles(t0, t1).runNow()))
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("selectOption")(js.Any.fromFunction1((t0: js.Any) => selectOption(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: typingsJapgolly.reactSelect.typesMod.ValueType[js.Any], t1: typingsJapgolly.reactSelect.typesMod.ActionTypes) => setValue(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSelect.optionMod.OptionProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSelect.optionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.optionMod.OptionProps[js.Any]])(children: _*)
  }
  @JSImport("react-select/src/components/Option", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

