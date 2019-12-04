package typingsJapgolly.rcDashMenu.libDOMWrapMod

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMWrap
  extends Component[DOMWrapProps, DOMWrapState, js.Any] {
  var menuItemSizes: js.Array[Double] = js.native
  var mutationObserver: js.Any = js.native
  var originalTotalWidth: Double = js.native
  var overflowedIndicatorWidth: Double = js.native
  var overflowedItems: js.Array[Element] = js.native
  var resizeObserver: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDOMWrap(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDOMWrap(): Unit = js.native
  def getMenuItemNodes(): js.Array[HTMLElement] = js.native
  def getOverflowedSubMenuItem(keyPrefix: String, overflowedItems: js.Array[Element]): Element = js.native
  def getOverflowedSubMenuItem(keyPrefix: String, overflowedItems: js.Array[Element], renderPlaceholder: Boolean): Element = js.native
  def handleResize(): Unit = js.native
  def renderChildren(children: js.Array[Element]): js.Array[Element] = js.native
  def setChildrenWidthAndResize(): Unit = js.native
}

