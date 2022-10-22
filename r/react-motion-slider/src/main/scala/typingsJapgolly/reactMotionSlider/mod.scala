package typingsJapgolly.reactMotionSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactMotion.mod.OpaqueConfig
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.center
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.left
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.mouse
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.right
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-motion-slider", JSImport.Default)
  @js.native
  open class default () extends Slider
  
  @js.native
  trait Slider
    extends Component[SliderProps, js.Object, Any] {
    
    /**
      * Moves to next slide
      */
    def next(): Unit = js.native
    
    /**
      * Move to previous slide
      */
    def prev(): Unit = js.native
  }
  
  trait SliderProps extends StObject {
    
    /**
      * Prop callback fired after slide change.
      * @param currentIndex
      */
    var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    /**
      * Offsets the slide to align either left, center, or right.
      * @default "left"
      */
    var align: js.UndefOr[left | center | right] = js.undefined
    
    /**
      * Animates the wrapper height to fit the current slide.
      * @default false
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prop callback fired before slide change.
      * @param currentIndex
      * @param nextIndex
      */
    var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* nextIndex */ Double, Unit]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Move to a slide by its index.
      */
    var currentIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Move to a slide by its key.
      */
    var currentKey: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The amount of time in milliseconds that determines if a swipe was a flick or not.
      */
    var flickTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of slides to move upon using prev and next methods.
      * @default 1
      */
    var slidesToMove: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of slides shown in view
      * @default 1
      */
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    /**
      * Accepts a React Motion spring config.
      */
    var springConfig: js.UndefOr[OpaqueConfig] = js.undefined
    
    /**
      * Enable touch and/or mouse dragging
      * @default true
      */
    var swipe: js.UndefOr[Boolean | touch | mouse] = js.undefined
    
    /**
      * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
      * @default 0.5
      */
    var swipeThreshold: js.UndefOr[Double] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setAfterSlide(value: /* currentIndex */ Double => Callback): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
      
      inline def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setBeforeSlide(value: (/* currentIndex */ Double, /* nextIndex */ Double) => Callback): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2((t0: /* currentIndex */ Double, t1: /* nextIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndexUndefined: Self = StObject.set(x, "currentIndex", js.undefined)
      
      inline def setCurrentKey(value: String | Double): Self = StObject.set(x, "currentKey", value.asInstanceOf[js.Any])
      
      inline def setCurrentKeyUndefined: Self = StObject.set(x, "currentKey", js.undefined)
      
      inline def setFlickTimeout(value: Double): Self = StObject.set(x, "flickTimeout", value.asInstanceOf[js.Any])
      
      inline def setFlickTimeoutUndefined: Self = StObject.set(x, "flickTimeout", js.undefined)
      
      inline def setSlidesToMove(value: Double): Self = StObject.set(x, "slidesToMove", value.asInstanceOf[js.Any])
      
      inline def setSlidesToMoveUndefined: Self = StObject.set(x, "slidesToMove", js.undefined)
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      inline def setSpringConfig(value: OpaqueConfig): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setSwipe(value: Boolean | touch | mouse): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    }
  }
}
