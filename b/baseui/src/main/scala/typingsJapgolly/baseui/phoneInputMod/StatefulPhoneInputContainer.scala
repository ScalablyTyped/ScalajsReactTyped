package typingsJapgolly.baseui.phoneInputMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.ReadonlyState
import typingsJapgolly.baseui.selectMod.OnChangeParams
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/phone-input", "StatefulPhoneInputContainer")
@js.native
class StatefulPhoneInputContainer ()
  extends Component[StatefulPhoneInputContainerProps, State, js.Any] {
  def internalSetState(`type`: StateChange, nextState: ReadonlyState): Unit = js.native
  def onCountryChange(event: OnChangeParams): Unit = js.native
  def onTextChange(event: ReactEventFrom[HTMLInputElement]): Unit = js.native
}

