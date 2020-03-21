package typingsJapgolly.reactSelect.optionMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactSelect.reactSelectStrings.option
import typingsJapgolly.reactSelect.selectMod.Props
import typingsJapgolly.reactSelect.typesMod.ActionTypes
import typingsJapgolly.reactSelect.typesMod.ClassNamesState
import typingsJapgolly.reactSelect.typesMod.InnerRef
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.PropsWithStyles & react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/components/Option.State & {  children  :react.react.ReactNode,   innerRef  :react-select.react-select/src/types.InnerRef,   innerProps  :react-select.react-select/src/components/Option.InnerProps,   label  :string,   type  :'option',   data  :any} */
@js.native
trait OptionProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered. */
  var children: Node = js.native
  var className: js.UndefOr[String] = js.native
  /* The data of the selected option. */
  var data: js.Any = js.native
  var hasValue: Boolean = js.native
  /** props passed to the wrapping element for the group. */
  var innerProps: InnerProps = js.native
  /** Inner ref to DOM Node */
  var innerRef: InnerRef = js.native
  /** Whether the option is disabled. */
  var isDisabled: Boolean = js.native
  /** Whether the option is focused. */
  var isFocused: Boolean = js.native
  var isMulti: Boolean = js.native
  /** Whether the option is selected. */
  var isSelected: Boolean = js.native
  /* Text to be displayed representing the option. */
  var label: String = js.native
  var options: OptionsType[OptionType] = js.native
  var selectProps: Props[OptionType] = js.native
  /* Type is used by the menu to determine whether this is an option or a group.
    In the case of option this is always `option`. */
  var `type`: option = js.native
  def clearValue(): Unit = js.native
  def cx(): String | Unit = js.native
  def cx(a: String): String | Unit = js.native
  def cx(a: String, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
  def cx(a: String, b: ClassNamesState): String | Unit = js.native
  def cx(a: Null, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
  def cx(a: Null, b: ClassNamesState): String | Unit = js.native
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  def getValue(): ValueType[OptionType] = js.native
  def selectOption(option: OptionType): Unit = js.native
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

