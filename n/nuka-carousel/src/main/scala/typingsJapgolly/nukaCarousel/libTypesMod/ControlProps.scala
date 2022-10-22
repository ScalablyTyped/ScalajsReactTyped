package typingsJapgolly.nukaCarousel.libTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<nuka-carousel.nuka-carousel/lib/types.InternalCarouselProps, 'cellAlign' | 'cellSpacing' | 'defaultControlsConfig' | 'onUserNavigation' | 'scrollMode' | 'slidesToScroll' | 'slidesToShow' | 'vertical' | 'wrapAround'> */
trait ControlProps extends StObject {
  
  var cellAlign: Alignment
  
  var cellSpacing: Double
  
  /**
    * Current slide index
    */
  var currentSlide: Double
  
  var defaultControlsConfig: DefaultControlsConfig
  
  /**
    * Go to a specific slide
    * @param targetIndex Index to go to
    */
  def goToSlide(targetIndex: Double): Unit
  
  /**
    * Whether the "next" button should be disabled or not
    */
  var nextDisabled: Boolean
  
  /**
    * Go to the next slide
    */
  def nextSlide(): Unit
  
  var onUserNavigation: js.Function1[
    /* e */ ReactTouchEventFrom[Element] | ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], 
    Unit
  ]
  
  /**
    * The indices for the paging dots
    */
  var pagingDotsIndices: js.Array[Double]
  
  /**
    * Whether the "previous" button should be disabled or not
    */
  var previousDisabled: Boolean
  
  /**
    * Go to the previous slide
    */
  def previousSlide(): Unit
  
  var scrollMode: ScrollMode
  
  /**
    * Total number of slides
    */
  var slideCount: Double
  
  var slidesToScroll: Double
  
  var slidesToShow: Double
  
  var vertical: Boolean
  
  var wrapAround: Boolean
}
object ControlProps {
  
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
  ): ControlProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaultControlsConfig = defaultControlsConfig.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1((t0: Double) => goToSlide(t0).runNow()), nextDisabled = nextDisabled.asInstanceOf[js.Any], nextSlide = nextSlide.toJsFn, onUserNavigation = js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[Element] | ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => onUserNavigation(t0).runNow()), pagingDotsIndices = pagingDotsIndices.asInstanceOf[js.Any], previousDisabled = previousDisabled.asInstanceOf[js.Any], previousSlide = previousSlide.toJsFn, scrollMode = scrollMode.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlProps]
  }
  
  extension [Self <: ControlProps](x: Self) {
    
    inline def setCellAlign(value: Alignment): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
    
    inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    inline def setDefaultControlsConfig(value: DefaultControlsConfig): Self = StObject.set(x, "defaultControlsConfig", value.asInstanceOf[js.Any])
    
    inline def setGoToSlide(value: Double => Callback): Self = StObject.set(x, "goToSlide", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setNextDisabled(value: Boolean): Self = StObject.set(x, "nextDisabled", value.asInstanceOf[js.Any])
    
    inline def setNextSlide(value: Callback): Self = StObject.set(x, "nextSlide", value.toJsFn)
    
    inline def setOnUserNavigation(
      value: /* e */ ReactTouchEventFrom[Element] | ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback
    ): Self = StObject.set(x, "onUserNavigation", js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[Element] | ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
    
    inline def setPagingDotsIndices(value: js.Array[Double]): Self = StObject.set(x, "pagingDotsIndices", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsIndicesVarargs(value: Double*): Self = StObject.set(x, "pagingDotsIndices", js.Array(value*))
    
    inline def setPreviousDisabled(value: Boolean): Self = StObject.set(x, "previousDisabled", value.asInstanceOf[js.Any])
    
    inline def setPreviousSlide(value: Callback): Self = StObject.set(x, "previousSlide", value.toJsFn)
    
    inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
    
    inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
    
    inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
  }
}
