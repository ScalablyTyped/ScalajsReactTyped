package typingsJapgolly.antdMobileRn.carouselIndexNativeMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[CarouselProps, CarouselState, js.Any] {
  var androidScrollEndTimer: js.Any = js.native
  var autoplayTimer: js.Any = js.native
  var scrollEndTimter: js.Any = js.native
  var scrollviewRef: js.Any = js.native
  def autoplay(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def getChildrenCount(children: Node): Double = js.native
  def loopJump(): Unit = js.native
  def onChildLayout(e: LayoutChangeEvent): Unit = js.native
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  def onScrollBegin(e: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def onScrollEnd(e: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def onScrollEndDrag(e: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def paging(offsetY: Double): Unit = js.native
  def renderContent(pages: Node): japgolly.scalajs.react.raw.React.Element = js.native
  def renderDots(index: Double): js.UndefOr[js.Object | Null] = js.native
  def scrollNextPage(): Unit = js.native
  def updateIndex(offset: CarouselOffset): Unit = js.native
}

