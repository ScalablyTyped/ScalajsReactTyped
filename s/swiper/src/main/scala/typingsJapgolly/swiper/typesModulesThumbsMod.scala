package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesThumbsMod {
  
  trait ThumbsEvents extends StObject
  
  trait ThumbsMethods extends StObject {
    
    /**
      * Initialize thumbs
      */
    def init(): Boolean
    
    /**
      * Swiper instance of thumbs swiper
      */
    var swiper: default
    
    /**
      * Update thumbs
      */
    def update(initial: Boolean): Unit
  }
  object ThumbsMethods {
    
    inline def apply(init: CallbackTo[Boolean], swiper: default, update: Boolean => Callback): ThumbsMethods = {
      val __obj = js.Dynamic.literal(init = init.toJsFn, swiper = swiper.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Boolean) => update(t0).runNow()))
      __obj.asInstanceOf[ThumbsMethods]
    }
    
    extension [Self <: ThumbsMethods](x: Self) {
      
      inline def setInit(value: CallbackTo[Boolean]): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setSwiper(value: default): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Boolean => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait ThumbsOptions extends StObject {
    
    /**
      * Allows to set on which thumbs active slide from edge it should automatically move scroll thumbs. For example, if set to 1 and last visible thumb will be activated (1 from edge) it will auto scroll thumbs
      *
      * @default 0
      */
    var autoScrollOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * When enabled multiple thumbnail slides may get activated
      *
      * @default true
      */
    var multipleActiveThumbs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional class that will be added to activated thumbs swiper slide
      *
      * @default 'swiper-slide-thumb-active'
      */
    var slideThumbActiveClass: js.UndefOr[String] = js.undefined
    
    /**
      * Swiper instance of swiper used as thumbs or object with Swiper parameters to initialize thumbs swiper
      *
      * @default null
      */
    var swiper: js.UndefOr[default | Null] = js.undefined
    
    /**
      * Additional class that will be added to thumbs swiper
      *
      * @default 'swiper-thumbs'
      */
    var thumbsContainerClass: js.UndefOr[String] = js.undefined
  }
  object ThumbsOptions {
    
    inline def apply(): ThumbsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsOptions]
    }
    
    extension [Self <: ThumbsOptions](x: Self) {
      
      inline def setAutoScrollOffset(value: Double): Self = StObject.set(x, "autoScrollOffset", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollOffsetUndefined: Self = StObject.set(x, "autoScrollOffset", js.undefined)
      
      inline def setMultipleActiveThumbs(value: Boolean): Self = StObject.set(x, "multipleActiveThumbs", value.asInstanceOf[js.Any])
      
      inline def setMultipleActiveThumbsUndefined: Self = StObject.set(x, "multipleActiveThumbs", js.undefined)
      
      inline def setSlideThumbActiveClass(value: String): Self = StObject.set(x, "slideThumbActiveClass", value.asInstanceOf[js.Any])
      
      inline def setSlideThumbActiveClassUndefined: Self = StObject.set(x, "slideThumbActiveClass", js.undefined)
      
      inline def setSwiper(value: default): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
      
      inline def setSwiperNull: Self = StObject.set(x, "swiper", null)
      
      inline def setSwiperUndefined: Self = StObject.set(x, "swiper", js.undefined)
      
      inline def setThumbsContainerClass(value: String): Self = StObject.set(x, "thumbsContainerClass", value.asInstanceOf[js.Any])
      
      inline def setThumbsContainerClassUndefined: Self = StObject.set(x, "thumbsContainerClass", js.undefined)
    }
  }
}
