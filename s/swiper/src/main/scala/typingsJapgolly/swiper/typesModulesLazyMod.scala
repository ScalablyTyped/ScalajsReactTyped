package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.dom7.mod.Dom7Array
import typingsJapgolly.swiper.typesSharedMod.CSSSelector
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesLazyMod {
  
  trait LazyEvents extends StObject {
    
    /**
      * Event will be fired in the beginning of lazy loading of image
      */
    def lazyImageLoad(swiper: default, slideEl: HTMLElement, imageEl: HTMLElement): Unit
    
    /**
      * Event will be fired when lazy loading image will be loaded
      */
    def lazyImageReady(swiper: default, slideEl: HTMLElement, imageEl: HTMLElement): Unit
  }
  object LazyEvents {
    
    inline def apply(
      lazyImageLoad: (default, HTMLElement, HTMLElement) => Callback,
      lazyImageReady: (default, HTMLElement, HTMLElement) => Callback
    ): LazyEvents = {
      val __obj = js.Dynamic.literal(lazyImageLoad = js.Any.fromFunction3((t0: default, t1: HTMLElement, t2: HTMLElement) => (lazyImageLoad(t0, t1, t2)).runNow()), lazyImageReady = js.Any.fromFunction3((t0: default, t1: HTMLElement, t2: HTMLElement) => (lazyImageReady(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[LazyEvents]
    }
    
    extension [Self <: LazyEvents](x: Self) {
      
      inline def setLazyImageLoad(value: (default, HTMLElement, HTMLElement) => Callback): Self = StObject.set(x, "lazyImageLoad", js.Any.fromFunction3((t0: default, t1: HTMLElement, t2: HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setLazyImageReady(value: (default, HTMLElement, HTMLElement) => Callback): Self = StObject.set(x, "lazyImageReady", js.Any.fromFunction3((t0: default, t1: HTMLElement, t2: HTMLElement) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait LazyMethods extends StObject {
    
    /**
      * Load/update lazy images based on current slider state (position)
      */
    def load(): Unit
    
    /**
      * Force to load lazy images in slide by specified index
      * @param number index number of slide to load lazy images in
      */
    def loadInSlide(index: Double): Unit
  }
  object LazyMethods {
    
    inline def apply(load: Callback, loadInSlide: Double => Callback): LazyMethods = {
      val __obj = js.Dynamic.literal(load = load.toJsFn, loadInSlide = js.Any.fromFunction1((t0: Double) => loadInSlide(t0).runNow()))
      __obj.asInstanceOf[LazyMethods]
    }
    
    extension [Self <: LazyMethods](x: Self) {
      
      inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setLoadInSlide(value: Double => Callback): Self = StObject.set(x, "loadInSlide", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait LazyOptions extends StObject {
    
    /**
      * Enables to check is the Swiper in view before lazy loading images on initial slides
      *
      * @default false
      */
    var checkInView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of lazy element
      *
      * @default 'swiper-lazy'
      */
    var elementClass: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the lazy loading images is enabled
      *
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Swiper will load lazy images after transition to this slide, so you may enable this parameter if you need it to start loading of new image in the beginning of transition
      *
      * @default false
      */
    var loadOnTransitionStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to enable lazy loading for the closest slides images (for previous and next slide images)
      *
      * @default false
      */
    var loadPrevNext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Amount of next/prev slides to preload lazy images in. Can't be less than `slidesPerView`
      *
      * @default 1
      */
    var loadPrevNextAmount: js.UndefOr[Double] = js.undefined
    
    /**
      * CSS class name of lazy loaded element
      *
      * @default 'swiper-lazy-loaded'
      */
    var loadedClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of lazy loading element
      *
      * @default 'swiper-lazy-loading'
      */
    var loadingClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of lazy preloader
      *
      * @default 'swiper-lazy-preloader'
      */
    var preloaderClass: js.UndefOr[String] = js.undefined
    
    /**
      * Element to check scrolling on for `checkInView`. Defaults to `window`
      */
    var scrollingElement: js.UndefOr[CSSSelector | Null | Dom7Array | HTMLElement] = js.undefined
  }
  object LazyOptions {
    
    inline def apply(): LazyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyOptions]
    }
    
    extension [Self <: LazyOptions](x: Self) {
      
      inline def setCheckInView(value: Boolean): Self = StObject.set(x, "checkInView", value.asInstanceOf[js.Any])
      
      inline def setCheckInViewUndefined: Self = StObject.set(x, "checkInView", js.undefined)
      
      inline def setElementClass(value: String): Self = StObject.set(x, "elementClass", value.asInstanceOf[js.Any])
      
      inline def setElementClassUndefined: Self = StObject.set(x, "elementClass", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLoadOnTransitionStart(value: Boolean): Self = StObject.set(x, "loadOnTransitionStart", value.asInstanceOf[js.Any])
      
      inline def setLoadOnTransitionStartUndefined: Self = StObject.set(x, "loadOnTransitionStart", js.undefined)
      
      inline def setLoadPrevNext(value: Boolean): Self = StObject.set(x, "loadPrevNext", value.asInstanceOf[js.Any])
      
      inline def setLoadPrevNextAmount(value: Double): Self = StObject.set(x, "loadPrevNextAmount", value.asInstanceOf[js.Any])
      
      inline def setLoadPrevNextAmountUndefined: Self = StObject.set(x, "loadPrevNextAmount", js.undefined)
      
      inline def setLoadPrevNextUndefined: Self = StObject.set(x, "loadPrevNext", js.undefined)
      
      inline def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
      
      inline def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
      
      inline def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      inline def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      inline def setPreloaderClass(value: String): Self = StObject.set(x, "preloaderClass", value.asInstanceOf[js.Any])
      
      inline def setPreloaderClassUndefined: Self = StObject.set(x, "preloaderClass", js.undefined)
      
      inline def setScrollingElement(value: CSSSelector | Dom7Array | HTMLElement): Self = StObject.set(x, "scrollingElement", value.asInstanceOf[js.Any])
      
      inline def setScrollingElementNull: Self = StObject.set(x, "scrollingElement", null)
      
      inline def setScrollingElementUndefined: Self = StObject.set(x, "scrollingElement", js.undefined)
    }
  }
}
