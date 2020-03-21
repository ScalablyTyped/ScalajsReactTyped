package typingsJapgolly.rcResizeObserver.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.rcResizeObserver.AnonHeight
import typingsJapgolly.react.mod.Component
import typingsJapgolly.resizeObserverPolyfill.mod.ResizeObserver
import typingsJapgolly.resizeObserverPolyfill.mod._Global_.ResizeObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactResizeObserver
  extends Component[ResizeObserverProps, ResizeObserverState, js.Any] {
  var childNode: RefNode = js.native
  var currentElement: Element | Null = js.native
  var onResize: ResizeObserverCallback = js.native
  var resizeObserver: ResizeObserver | Null = js.native
  @JSName("state")
  var state_ReactResizeObserver: AnonHeight = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactResizeObserver(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactResizeObserver(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactResizeObserver(): Unit = js.native
  def destroyObserver(): Unit = js.native
  def onComponentUpdated(): Unit = js.native
  def setChildNode(node: RefNode): Unit = js.native
}

