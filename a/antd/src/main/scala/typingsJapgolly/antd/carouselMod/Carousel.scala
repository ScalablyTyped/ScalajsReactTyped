package typingsJapgolly.antd.carouselMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[CarouselProps, js.Object, js.Any] {
  var innerSlider: js.Any = js.native
  var slick: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCarousel(prevProps: CarouselProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def getDotPosition(): DotPosition = js.native
  def goTo(slide: Double): Unit = js.native
  def goTo(slide: Double, dontAnimate: Boolean): Unit = js.native
  def next(): Unit = js.native
  def onWindowResized(): Unit = js.native
  def prev(): Unit = js.native
  def renderCarousel(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def saveSlick(node: js.Any): Unit = js.native
}

