package typingsJapgolly.antd.alertMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.AnonClosed
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  @JSName("state")
  var state_Alert: AnonClosed = js.native
  def animationEnd(): Unit = js.native
  def handleClose(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
  def renderAlert(hasGetPrefixClsDirection: ConfigConsumerProps): Element | Null = js.native
}

