package typingsJapgolly.reactSelect.stateManagerMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSelect.typesMod.ActionMeta
import typingsJapgolly.reactSelect.typesMod.InputActionMeta
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/stateManager", "StateManager")
@js.native
class StateManager[OptionType /* <: OptionTypeBase */, T /* <: typingsJapgolly.reactSelect.selectMod.default[OptionType] */] ()
  extends Component[
      StateProps[typingsJapgolly.reactSelect.selectMod.Props[OptionType]] with Props[OptionType] with typingsJapgolly.reactSelect.selectMod.Props[OptionType], 
      State[OptionType], 
      js.Any
    ] {
  var select: T = js.native
  def blur(): Unit = js.native
  def callProp(name: String, args: js.Any*): js.Any = js.native
  def focus(): Unit = js.native
  def getProp(key: String): js.Any = js.native
  def onChange(value: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
  def onInputChange(value: ValueType[OptionType], actionMeta: InputActionMeta): Unit = js.native
  def onMenuClose(): Unit = js.native
  def onMenuOpen(): Unit = js.native
}

/* static members */
@JSImport("react-select/src/stateManager", "StateManager")
@js.native
object StateManager extends js.Object {
  var defaultProps: DefaultProps[_] = js.native
}

