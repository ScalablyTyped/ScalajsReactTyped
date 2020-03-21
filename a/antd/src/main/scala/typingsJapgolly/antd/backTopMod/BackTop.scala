package typingsJapgolly.antd.backTopMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackTop
  extends Component[BackTopProps, js.Any, js.Any] {
  var scrollEvent: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBackTop(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBackTop(): Unit = js.native
  def handleScroll(): Unit = js.native
  def renderBackTop(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def scrollToTop(e: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
}

