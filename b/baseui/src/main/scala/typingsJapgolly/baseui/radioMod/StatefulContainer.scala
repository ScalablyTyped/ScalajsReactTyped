package typingsJapgolly.baseui.radioMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/radio", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps, State, js.Any] {
  def onChange(e: ChangeEventHandler[HTMLInputElement]): Unit = js.native
  def stateReducer(`type`: String, e: ReactEventFrom[HTMLInputElement]): Unit = js.native
}

