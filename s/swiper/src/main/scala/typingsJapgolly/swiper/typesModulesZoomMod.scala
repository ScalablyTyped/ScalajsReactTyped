package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesZoomMod {
  
  trait ZoomEvents extends StObject {
    
    /**
      * Event will be fired on zoom change
      */
    def zoomChange(swiper: default, scale: Double, imageEl: HTMLElement, slideEl: HTMLElement): Unit
  }
  object ZoomEvents {
    
    inline def apply(zoomChange: (default, Double, HTMLElement, HTMLElement) => Callback): ZoomEvents = {
      val __obj = js.Dynamic.literal(zoomChange = js.Any.fromFunction4((t0: default, t1: Double, t2: HTMLElement, t3: HTMLElement) => (zoomChange(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[ZoomEvents]
    }
    
    extension [Self <: ZoomEvents](x: Self) {
      
      inline def setZoomChange(value: (default, Double, HTMLElement, HTMLElement) => Callback): Self = StObject.set(x, "zoomChange", js.Any.fromFunction4((t0: default, t1: Double, t2: HTMLElement, t3: HTMLElement) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait ZoomMethods extends StObject {
    
    /**
      * Disable zoom module
      */
    def disable(): Unit
    
    /**
      * Enable zoom module
      */
    def enable(): Unit
    
    /**
      * Whether the zoom module is enabled
      */
    var enabled: Boolean
    
    /**
      * Zoom in image of the currently active slide
      */
    def in(): Unit
    
    /**
      * Zoom out image of the currently active slide
      */
    def out(): Unit
    
    /**
      * Current image scale ratio
      */
    var scale: Double
    
    /**
      * Toggle image zoom of the currently active slide
      */
    def toggle(): Unit
  }
  object ZoomMethods {
    
    inline def apply(
      disable: Callback,
      enable: Callback,
      enabled: Boolean,
      in: Callback,
      out: Callback,
      scale: Double,
      toggle: Callback
    ): ZoomMethods = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, enabled = enabled.asInstanceOf[js.Any], in = in.toJsFn, out = out.toJsFn, scale = scale.asInstanceOf[js.Any], toggle = toggle.toJsFn)
      __obj.asInstanceOf[ZoomMethods]
    }
    
    extension [Self <: ZoomMethods](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setIn(value: Callback): Self = StObject.set(x, "in", value.toJsFn)
      
      inline def setOut(value: Callback): Self = StObject.set(x, "out", value.toJsFn)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  trait ZoomOptions extends StObject {
    
    /**
      * CSS class name of zoom container
      *
      * @default 'swiper-zoom-container'
      */
    var containerClass: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum image zoom multiplier
      *
      * @default 3
      */
    var maxRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimal image zoom multiplier
      *
      * @default 1
      */
    var minRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable/disable zoom-in by slide's double tap
      *
      * @default true
      */
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of zoomed in container
      *
      * @default 'swiper-slide-zoomed'
      */
    var zoomedSlideClass: js.UndefOr[String] = js.undefined
  }
  object ZoomOptions {
    
    inline def apply(): ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOptions]
    }
    
    extension [Self <: ZoomOptions](x: Self) {
      
      inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      inline def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
      
      inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
      
      inline def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setZoomedSlideClass(value: String): Self = StObject.set(x, "zoomedSlideClass", value.asInstanceOf[js.Any])
      
      inline def setZoomedSlideClassUndefined: Self = StObject.set(x, "zoomedSlideClass", js.undefined)
    }
  }
}
