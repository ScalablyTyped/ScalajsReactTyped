package typingsJapgolly.baseui.buttonGroupMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/button-group", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulButtonGroupProps, State, js.Any] {
  def changeState(nextState: State): Unit = js.native
  def onClick(event: ReactMouseEventFrom[HTMLButtonElement], index: Double): Unit = js.native
}

