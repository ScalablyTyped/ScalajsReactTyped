package typingsJapgolly.reactSelect.menuMod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSelect.AnonGetPortalPlacement
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "Menu")
@js.native
class Menu[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuProps[OptionType], MenuState, js.Any] {
  def getPlacement(ref: Ref): Unit = js.native
  def getState(): MenuProps[OptionType] with MenuState = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "Menu")
@js.native
object Menu extends js.Object {
  var contextTypes: AnonGetPortalPlacement = js.native
}

