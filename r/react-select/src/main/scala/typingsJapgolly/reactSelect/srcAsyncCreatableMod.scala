package typingsJapgolly.reactSelect

import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSelect.typesMod.ActionMeta
import typingsJapgolly.reactSelect.typesMod.InputActionMeta
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/AsyncCreatable", JSImport.Namespace)
@js.native
object srcAsyncCreatableMod extends js.Object {
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] ()
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    var mounted: Boolean = js.native
    var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
    var select: Ref = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
    def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
    def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
    def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] () extends AsyncCreatable[OptionType]
  
  /* static members */
  @js.native
  object AsyncCreatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  type Props[OptionType /* <: OptionTypeBase */] = typingsJapgolly.reactSelect.srcAsyncMod.Props[OptionType] with typingsJapgolly.reactSelect.srcCreatableMod.Props[OptionType]
  type State[OptionType /* <: OptionTypeBase */] = typingsJapgolly.reactSelect.srcAsyncMod.State[OptionType] with typingsJapgolly.reactSelect.srcCreatableMod.State[OptionType]
}

