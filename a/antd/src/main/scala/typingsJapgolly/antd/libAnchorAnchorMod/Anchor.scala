package typingsJapgolly.antd.libAnchorAnchorMod

import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.antd.Anon_ActiveLink
import typingsJapgolly.antd.Anon_AntAnchor_1899638441
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor
  extends Component[AnchorProps, AnchorState, js.Any] {
  var animating: js.Any = js.native
  var inkNode: js.Any = js.native
  var links: js.Any = js.native
  var prefixCls: js.UndefOr[js.Any] = js.native
  var scrollContainer: js.Any = js.native
  var scrollEvent: js.Any = js.native
  @JSName("state")
  var state_Anchor: Anon_ActiveLink = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchor(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchor(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchor(): Unit = js.native
  def getChildContext(): Anon_AntAnchor_1899638441 = js.native
  def getCurrentAnchor(): String = js.native
  def getCurrentAnchor(offsetTop: Double): String = js.native
  def getCurrentAnchor(offsetTop: Double, bounds: Double): String = js.native
  def handleScroll(): Unit = js.native
  def handleScrollTo(link: String): Unit = js.native
  def renderAnchor(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveInkNode(node: HTMLSpanElement): Unit = js.native
  def setCurrentActiveLink(link: String): Unit = js.native
  def updateInk(): Unit = js.native
}

