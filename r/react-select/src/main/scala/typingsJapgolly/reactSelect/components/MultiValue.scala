package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSelect.AnonOnClick
import typingsJapgolly.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsJapgolly.reactSelect.componentsMultiValueMod.default
import typingsJapgolly.reactSelect.selectMod.Props
import typingsJapgolly.reactSelect.typesMod.ActionTypes
import typingsJapgolly.reactSelect.typesMod.ClassNamesState
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValue {
  def apply[OptionType /* <: OptionTypeBase */](
    components: js.Any,
    cropWithEllipsis: Boolean,
    data: OptionType,
    hasValue: Boolean,
    innerProps: js.Any,
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    options: OptionsType[OptionType],
    removeProps: AnonOnClick,
    selectProps: Props[OptionType],
    clearValue: Callback,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => CallbackTo[String | Unit],
    getStyles: (String, js.Any) => CallbackTo[js.Object],
    getValue: CallbackTo[ValueType[OptionType]],
    selectOption: OptionType => Callback,
    setValue: (ValueType[OptionType], ActionTypes) => Callback,
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MultiValueProps[OptionType], default[OptionType], Unit, MultiValueProps[OptionType]] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], removeProps = removeProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
  
      __obj.updateDynamic("clearValue")(clearValue.toJsFn)
    __obj.updateDynamic("cx")(js.Any.fromFunction3((t0: js.UndefOr[scala.Null | java.lang.String], t1: js.UndefOr[typingsJapgolly.reactSelect.typesMod.ClassNamesState], t2: js.UndefOr[java.lang.String]) => cx(t0, t1, t2).runNow()))
    __obj.updateDynamic("getStyles")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getStyles(t0, t1).runNow()))
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("selectOption")(js.Any.fromFunction1((t0: OptionType) => selectOption(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: typingsJapgolly.reactSelect.typesMod.ValueType[OptionType], t1: typingsJapgolly.reactSelect.typesMod.ActionTypes) => setValue(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSelect.componentsMultiValueMod.MultiValueProps[OptionType], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSelect.componentsMultiValueMod.default[OptionType]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.componentsMultiValueMod.MultiValueProps[OptionType]])(children: _*)
  }
  @JSImport("react-select/src/components/MultiValue", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

