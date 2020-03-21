package typingsJapgolly.antd.modalModalMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
  def handleOk(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
  def renderFooter(locale: ModalLocale): Element = js.native
  def renderModal(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

