package typingsJapgolly.antd.esPopconfirmMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popconfirm
  extends Component[PopconfirmProps, PopconfirmState, js.Any] {
  var tooltip: js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def onCancel(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
  def onConfirm(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderConfirm(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String, popconfirmLocale: PopconfirmLocale): Element = js.native
  def saveTooltip(node: js.Any): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setVisible(visible: Boolean, e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
}

