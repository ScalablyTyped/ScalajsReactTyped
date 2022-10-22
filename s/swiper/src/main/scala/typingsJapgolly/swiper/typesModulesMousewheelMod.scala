package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.WheelEvent
import typingsJapgolly.swiper.swiperStrings.container
import typingsJapgolly.swiper.swiperStrings.wrapper
import typingsJapgolly.swiper.typesSharedMod.CSSSelector
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesMousewheelMod {
  
  trait MousewheelEvents extends StObject {
    
    /**
      * Event will be fired on mousewheel scroll
      */
    def scroll(swiper: default, event: WheelEvent): Unit
  }
  object MousewheelEvents {
    
    inline def apply(scroll: (default, WheelEvent) => Callback): MousewheelEvents = {
      val __obj = js.Dynamic.literal(scroll = js.Any.fromFunction2((t0: default, t1: WheelEvent) => (scroll(t0, t1)).runNow()))
      __obj.asInstanceOf[MousewheelEvents]
    }
    
    extension [Self <: MousewheelEvents](x: Self) {
      
      inline def setScroll(value: (default, WheelEvent) => Callback): Self = StObject.set(x, "scroll", js.Any.fromFunction2((t0: default, t1: WheelEvent) => (value(t0, t1)).runNow()))
    }
  }
  
  trait MousewheelMethods extends StObject {
    
    /**
      * Disable mousewheel control
      */
    def disable(): Unit
    
    /**
      * Enable mousewheel control
      */
    def enable(): Unit
    
    /**
      * Whether the mousewheel control is enabled
      */
    var enabled: Boolean
  }
  object MousewheelMethods {
    
    inline def apply(disable: Callback, enable: Callback, enabled: Boolean): MousewheelMethods = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[MousewheelMethods]
    }
    
    extension [Self <: MousewheelMethods](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait MousewheelOptions extends StObject {
    
    /**
      * String with CSS selector or HTML element of the container accepting mousewheel events. By default it is swiper
      *
      * @default 'container'
      */
    var eventsTarget: js.UndefOr[container | wrapper | CSSSelector | HTMLElement] = js.undefined
    
    /**
      * Set to `true` to force mousewheel swipes to axis. So in horizontal mode mousewheel will work only with horizontal mousewheel scrolling, and only with vertical scrolling in vertical mode.
      *
      * @default false
      */
    var forceToAxis: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to invert sliding direction
      *
      * @default false
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` and swiper will release mousewheel event and allow page scrolling when swiper is on edge positions (in the beginning or in the end)
      *
      * @default false
      */
    var releaseOnEdges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Multiplier of mousewheel data, allows to tweak mouse wheel sensitivity
      *
      * @default 1
      */
    var sensitivity: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum mousewheel scroll delta to trigger swiper slide change
      *
      * @default null
      */
    var thresholdDelta: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Minimum mousewheel scroll time delta (in ms) to trigger swiper slide change
      *
      * @default null
      */
    var thresholdTime: js.UndefOr[Double | Null] = js.undefined
  }
  object MousewheelOptions {
    
    inline def apply(): MousewheelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MousewheelOptions]
    }
    
    extension [Self <: MousewheelOptions](x: Self) {
      
      inline def setEventsTarget(value: container | wrapper | CSSSelector | HTMLElement): Self = StObject.set(x, "eventsTarget", value.asInstanceOf[js.Any])
      
      inline def setEventsTargetUndefined: Self = StObject.set(x, "eventsTarget", js.undefined)
      
      inline def setForceToAxis(value: Boolean): Self = StObject.set(x, "forceToAxis", value.asInstanceOf[js.Any])
      
      inline def setForceToAxisUndefined: Self = StObject.set(x, "forceToAxis", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setReleaseOnEdges(value: Boolean): Self = StObject.set(x, "releaseOnEdges", value.asInstanceOf[js.Any])
      
      inline def setReleaseOnEdgesUndefined: Self = StObject.set(x, "releaseOnEdges", js.undefined)
      
      inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      inline def setThresholdDelta(value: Double): Self = StObject.set(x, "thresholdDelta", value.asInstanceOf[js.Any])
      
      inline def setThresholdDeltaNull: Self = StObject.set(x, "thresholdDelta", null)
      
      inline def setThresholdDeltaUndefined: Self = StObject.set(x, "thresholdDelta", js.undefined)
      
      inline def setThresholdTime(value: Double): Self = StObject.set(x, "thresholdTime", value.asInstanceOf[js.Any])
      
      inline def setThresholdTimeNull: Self = StObject.set(x, "thresholdTime", null)
      
      inline def setThresholdTimeUndefined: Self = StObject.set(x, "thresholdTime", js.undefined)
    }
  }
}
