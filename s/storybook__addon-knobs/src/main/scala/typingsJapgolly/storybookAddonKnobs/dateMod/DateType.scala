package typingsJapgolly.storybookAddonKnobs.dateMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateType
  extends Component[DateTypeProps, DateTypeState, js.Any] {
  var dateInput: HTMLInputElement = js.native
  var timeInput: HTMLInputElement = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateType(): Unit = js.native
  def onDateChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def onTimeChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
}

