package typingsJapgolly.nukaCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nukaCarousel.libTypesMod.Alignment
import typingsJapgolly.nukaCarousel.libTypesMod.ControlProps
import typingsJapgolly.nukaCarousel.libTypesMod.DefaultControlsConfig
import typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreviousButton {
  
  inline def apply(
    cellAlign: Alignment,
    cellSpacing: Double,
    currentSlide: Double,
    defaultControlsConfig: DefaultControlsConfig,
    goToSlide: Double => Callback,
    nextDisabled: Boolean,
    nextSlide: Callback,
    onUserNavigation: /* e */ ReactTouchEventFrom[Element] | ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback,
    pagingDotsIndices: js.Array[Double],
    previousDisabled: Boolean,
    previousSlide: Callback,
    scrollMode: ScrollMode,
    slideCount: Double,
    slidesToScroll: Double,
    slidesToShow: Double,
    vertical: Boolean,
    wrapAround: Boolean
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaultControlsConfig = defaultControlsConfig.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1((t0: Double) => goToSlide(t0).runNow()), nextDisabled = nextDisabled.asInstanceOf[js.Any], nextSlide = nextSlide.toJsFn, onUserNavigation = js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[Element] | ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => onUserNavigation(t0).runNow()), pagingDotsIndices = pagingDotsIndices.asInstanceOf[js.Any], previousDisabled = previousDisabled.asInstanceOf[js.Any], previousSlide = previousSlide.toJsFn, scrollMode = scrollMode.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ControlProps]))
  }
  
  @JSImport("nuka-carousel", "PreviousButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ControlProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
