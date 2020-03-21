package typingsJapgolly.rmcNukaCarousel.carouselMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcNukaCarousel.AnonBeginValue
import typingsJapgolly.rmcNukaCarousel.AnonBottom
import typingsJapgolly.rmcNukaCarousel.AnonBottomPosition
import typingsJapgolly.rmcNukaCarousel.AnonBoxSizing
import typingsJapgolly.rmcNukaCarousel.AnonLeft
import typingsJapgolly.rmcNukaCarousel.AnonMsTransform
import typingsJapgolly.rmcNukaCarousel.AnonOnMouseDown
import typingsJapgolly.rmcNukaCarousel.AnonOnTouchCancel
import typingsJapgolly.rmcNukaCarousel.AnonPosition
import typingsJapgolly.rmcNukaCarousel.AnonRight
import typingsJapgolly.rmcNukaCarousel.AnonTextAlign
import typingsJapgolly.rmcNukaCarousel.AnonTop
import typingsJapgolly.rmcNukaCarousel.AnonTransform
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselNumbers.`-1`
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselNumbers.`0`
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[ICarouselProps, js.Any, js.Any] {
  var _rafID: js.Any = js.native
  var autoplayID: js.Any = js.native
  var autoplayPaused: js.Any = js.native
  var clickSafe: Boolean = js.native
  var touchObject: js.Any = js.native
  def _rafCb(): Unit = js.native
  def animateSlide(): Unit = js.native
  def animateSlide(easing: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
  def autoplayIterator(): Unit = js.native
  def bindEvents(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MCarousel(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCarousel(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def formatChildren(children: js.Any): js.Array[Element] = js.native
  def getDecoratorStyles(position: js.Any): AnonLeft | AnonMsTransform | AnonPosition | AnonTop | AnonTransform | AnonRight | AnonBottom | AnonTextAlign | AnonBottomPosition = js.native
  def getFrameStyles(): CSSProperties = js.native
  def getListStyles(): CSSProperties = js.native
  def getMouseEvents(): AnonOnMouseDown | Null = js.native
  def getSlideStyles(index: js.Any, positionValue: js.Any): CSSProperties = js.native
  def getSlideTargetPosition(index: js.Any, positionValue: js.Any): Double = js.native
  def getSliderStyles(): AnonBoxSizing = js.native
  def getStyleTagStyles(): String = js.native
  def getTargetLeft(): Double = js.native
  def getTargetLeft(touchOffset: js.Any): Double = js.native
  def getTargetLeft(touchOffset: js.Any, slide: js.Any): Double = js.native
  def getTouchEvents(): AnonOnTouchCancel | Null = js.native
  def getTweeningValue(path: js.Any): js.Any = js.native
  def goToSlide(index: js.Any): Unit = js.native
  def handleClick(e: js.Any): Unit = js.native
  def handleMouseOut(): Unit = js.native
  def handleMouseOver(): Unit = js.native
  def handleSwipe(_underscore: js.Any): Unit = js.native
  def nextSlide(): Unit = js.native
  def onReadyStateChange(): Unit = js.native
  def onResize(): Unit = js.native
  def previousSlide(): Unit = js.native
  def resetAutoplay(): Unit = js.native
  def setDimensions(): Unit = js.native
  def setDimensions(props: js.Any): Unit = js.native
  def setExternalData(): Unit = js.native
  def setInitialDimensions(): Unit = js.native
  def setLeft(): Unit = js.native
  def startAutoplay(): Unit = js.native
  def stopAutoplay(): Unit = js.native
  def swipeDirection(x1: js.Any, x2: js.Any, y1: js.Any, y2: js.Any): `0` | `1` | `-1` = js.native
  def tweenState(path: js.Any, hasEasingDurationDelayBeginValueEndValueOnEndStackBehavior: AnonBeginValue): Unit = js.native
  def unbindEvents(): Unit = js.native
}

