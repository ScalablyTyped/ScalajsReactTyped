package typingsJapgolly.reactSelect

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.containersMod.ValueContainerProps
import typingsJapgolly.reactSelect.selectMod.Props
import typingsJapgolly.reactSelect.typesMod.ActionTypes
import typingsJapgolly.reactSelect.typesMod.ClassNamesState
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/ValueContainer", JSImport.Namespace)
@js.native
object valueContainerMod extends js.Object {
  /* Inlined react-select.react-select/src/components/containers.ValueContainerProps<OptionType> */
  @js.native
  trait AnimatedValueContainerProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    /** The children to be rendered. */
    var children: Node = js.native
    var className: js.UndefOr[String] = js.native
    /** Whether the value container currently holds a value. */
    var hasValue: Boolean = js.native
    /** Set when the value container should hold multiple values */
    var isMulti: Boolean = js.native
    var options: OptionsType[OptionType] = js.native
    var selectProps: Props[OptionType] = js.native
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
  
  def AnimatedValueContainer[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[ValueContainerProps[OptionType]]): ComponentType[AnimatedValueContainerProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[ValueContainerProps[OptionType]]): ComponentType[AnimatedValueContainerProps[OptionType]] = js.native
}

