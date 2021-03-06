package typingsJapgolly.reactSelect.srcCreatableMod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSelect.typesMod.ActionMeta
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Creatable", "Creatable")
@js.native
class Creatable[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var select: Ref = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
}

/* static members */
@JSImport("react-select/src/Creatable", "Creatable")
@js.native
object Creatable extends js.Object {
  var defaultProps: Props[_] = js.native
}

