package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.swiper.typesSharedMod.CSSSelector
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesNavigationMod {
  
  trait NavigationEvents extends StObject {
    
    /**
      * Event will be fired on navigation hide
      */
    def navigationHide(swiper: default): Unit
    
    /**
      * Event will be fired on navigation next button click
      */
    def navigationNext(swiper: default): Unit
    
    /**
      * Event will be fired on navigation prev button click
      */
    def navigationPrev(swiper: default): Unit
    
    /**
      * Event will be fired on navigation show
      */
    def navigationShow(swiper: default): Unit
  }
  object NavigationEvents {
    
    inline def apply(
      navigationHide: default => Callback,
      navigationNext: default => Callback,
      navigationPrev: default => Callback,
      navigationShow: default => Callback
    ): NavigationEvents = {
      val __obj = js.Dynamic.literal(navigationHide = js.Any.fromFunction1((t0: default) => navigationHide(t0).runNow()), navigationNext = js.Any.fromFunction1((t0: default) => navigationNext(t0).runNow()), navigationPrev = js.Any.fromFunction1((t0: default) => navigationPrev(t0).runNow()), navigationShow = js.Any.fromFunction1((t0: default) => navigationShow(t0).runNow()))
      __obj.asInstanceOf[NavigationEvents]
    }
    
    extension [Self <: NavigationEvents](x: Self) {
      
      inline def setNavigationHide(value: default => Callback): Self = StObject.set(x, "navigationHide", js.Any.fromFunction1((t0: default) => value(t0).runNow()))
      
      inline def setNavigationNext(value: default => Callback): Self = StObject.set(x, "navigationNext", js.Any.fromFunction1((t0: default) => value(t0).runNow()))
      
      inline def setNavigationPrev(value: default => Callback): Self = StObject.set(x, "navigationPrev", js.Any.fromFunction1((t0: default) => value(t0).runNow()))
      
      inline def setNavigationShow(value: default => Callback): Self = StObject.set(x, "navigationShow", js.Any.fromFunction1((t0: default) => value(t0).runNow()))
    }
  }
  
  trait NavigationMethods extends StObject {
    
    /**
      * Destroy navigation
      */
    def destroy(): Unit
    
    /**
      * Initialize navigation
      */
    def init(): Unit
    
    /**
      * HTMLElement of "next" navigation button
      */
    var nextEl: HTMLElement
    
    /**
      * HTMLElement of "previous" navigation button
      */
    var prevEl: HTMLElement
    
    /**
      * Update navigation buttons state (enabled/disabled)
      */
    def update(): Unit
  }
  object NavigationMethods {
    
    inline def apply(destroy: Callback, init: Callback, nextEl: HTMLElement, prevEl: HTMLElement, update: Callback): NavigationMethods = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, init = init.toJsFn, nextEl = nextEl.asInstanceOf[js.Any], prevEl = prevEl.asInstanceOf[js.Any], update = update.toJsFn)
      __obj.asInstanceOf[NavigationMethods]
    }
    
    extension [Self <: NavigationMethods](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setNextEl(value: HTMLElement): Self = StObject.set(x, "nextEl", value.asInstanceOf[js.Any])
      
      inline def setPrevEl(value: HTMLElement): Self = StObject.set(x, "prevEl", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  trait NavigationOptions extends StObject {
    
    /**
      * CSS class name added to navigation button when it becomes disabled
      *
      * @default 'swiper-button-disabled'
      */
    var disabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean property to use with breakpoints to enable/disable navigation on certain breakpoints
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name added to navigation button when it becomes hidden
      *
      * @default 'swiper-button-hidden'
      */
    var hiddenClass: js.UndefOr[String] = js.undefined
    
    /**
      * Toggle navigation buttons visibility after click on Slider's container
      *
      * @default false
      */
    var hideOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name added to navigation button when it is disabled
      *
      * @default 'swiper-button-lock'
      */
    var lockClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name added on swiper container when navigation is disabled by breakpoint
      *
      * @default 'swiper-navigation-disabled'
      */
    var navigationDisabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * String with CSS selector or HTML element of the element that will work
      * like "next" button after click on it
      *
      * @default null
      */
    var nextEl: js.UndefOr[CSSSelector | HTMLElement | Null] = js.undefined
    
    /**
      * String with CSS selector or HTML element of the element that will work
      * like "prev" button after click on it
      *
      * @default null
      */
    var prevEl: js.UndefOr[CSSSelector | HTMLElement | Null] = js.undefined
  }
  object NavigationOptions {
    
    inline def apply(): NavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions]
    }
    
    extension [Self <: NavigationOptions](x: Self) {
      
      inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHiddenClass(value: String): Self = StObject.set(x, "hiddenClass", value.asInstanceOf[js.Any])
      
      inline def setHiddenClassUndefined: Self = StObject.set(x, "hiddenClass", js.undefined)
      
      inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      inline def setLockClass(value: String): Self = StObject.set(x, "lockClass", value.asInstanceOf[js.Any])
      
      inline def setLockClassUndefined: Self = StObject.set(x, "lockClass", js.undefined)
      
      inline def setNavigationDisabledClass(value: String): Self = StObject.set(x, "navigationDisabledClass", value.asInstanceOf[js.Any])
      
      inline def setNavigationDisabledClassUndefined: Self = StObject.set(x, "navigationDisabledClass", js.undefined)
      
      inline def setNextEl(value: CSSSelector | HTMLElement): Self = StObject.set(x, "nextEl", value.asInstanceOf[js.Any])
      
      inline def setNextElNull: Self = StObject.set(x, "nextEl", null)
      
      inline def setNextElUndefined: Self = StObject.set(x, "nextEl", js.undefined)
      
      inline def setPrevEl(value: CSSSelector | HTMLElement): Self = StObject.set(x, "prevEl", value.asInstanceOf[js.Any])
      
      inline def setPrevElNull: Self = StObject.set(x, "prevEl", null)
      
      inline def setPrevElUndefined: Self = StObject.set(x, "prevEl", js.undefined)
    }
  }
}
