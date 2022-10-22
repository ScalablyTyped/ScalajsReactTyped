package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.reactstrapBooleans.`false`
import typingsJapgolly.reactstrap.reactstrapStrings.carousel
import typingsJapgolly.reactstrap.reactstrapStrings.hover
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCarouselMod {
  
  @JSImport("reactstrap/types/lib/Carousel", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselProps, js.Object, Any]
  
  type Carousel = japgolly.scalajs.react.facade.React.Component[CarouselProps & js.Object, js.Object]
  
  trait CarouselProps
    extends StObject
       with CommonCarouselProps {
    
    def next(): Unit
    
    def previous(): Unit
  }
  object CarouselProps {
    
    inline def apply(next: Callback, previous: Callback): CarouselProps = {
      val __obj = js.Dynamic.literal(next = next.toJsFn, previous = previous.toJsFn)
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setPrevious(value: Callback): Self = StObject.set(x, "previous", value.toJsFn)
    }
  }
  
  trait CommonCarouselProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var dark: js.UndefOr[Boolean] = js.undefined
    
    var enableTouch: js.UndefOr[Boolean] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double | String | Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mouseExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pause: js.UndefOr[hover | `false`] = js.undefined
    
    var ride: js.UndefOr[carousel] = js.undefined
    
    var slide: js.UndefOr[Boolean] = js.undefined
  }
  object CommonCarouselProps {
    
    inline def apply(): CommonCarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonCarouselProps]
    }
    
    extension [Self <: CommonCarouselProps](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setEnableTouch(value: Boolean): Self = StObject.set(x, "enableTouch", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchUndefined: Self = StObject.set(x, "enableTouch", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setInterval(value: Double | String | Boolean): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMouseEnter(value: Callback): Self = StObject.set(x, "mouseEnter", value.toJsFn)
      
      inline def setMouseEnterUndefined: Self = StObject.set(x, "mouseEnter", js.undefined)
      
      inline def setMouseExit(value: Callback): Self = StObject.set(x, "mouseExit", value.toJsFn)
      
      inline def setMouseExitUndefined: Self = StObject.set(x, "mouseExit", js.undefined)
      
      inline def setPause(value: hover | `false`): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setRide(value: carousel): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
      
      inline def setRideUndefined: Self = StObject.set(x, "ride", js.undefined)
      
      inline def setSlide(value: Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    }
  }
  
  trait UncontrolledCarouselProps
    extends StObject
       with CommonCarouselProps {
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var indicators: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[Any]
    
    var next: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var previous: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object UncontrolledCarouselProps {
    
    inline def apply(items: js.Array[Any]): UncontrolledCarouselProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledCarouselProps]
    }
    
    extension [Self <: UncontrolledCarouselProps](x: Self) {
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: Callback): Self = StObject.set(x, "previous", value.toJsFn)
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}
