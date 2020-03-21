package typingsJapgolly.reactSelect.srcAsyncMod

import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSelect.typesMod.InputActionMeta
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Async", "Async")
@js.native
class Async[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: Boolean = js.native
  var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
  var select: Ref = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
}

/* static members */
@JSImport("react-select/src/Async", "Async")
@js.native
object Async extends js.Object {
  var defaultProps: Props[_] = js.native
}

