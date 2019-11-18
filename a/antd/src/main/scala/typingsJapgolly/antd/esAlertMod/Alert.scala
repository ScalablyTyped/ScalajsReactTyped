package typingsJapgolly.antd.esAlertMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends Component[AlertProps, AlertState, js.Any] {
  def animationEnd(): Unit = js.native
  def handleClose(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
  def renderAlert(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
}

