package typingsJapgolly.swiper.anon

import typingsJapgolly.swiper.swiperStrings.`class`
import typingsJapgolly.swiper.swiperStrings.`data-swiper-autoplay`
import typingsJapgolly.swiper.swiperStrings.ngClass
import typingsJapgolly.swiper.swiperStrings.virtualIndex
import typingsJapgolly.swiper.swiperStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoplayDelay extends StObject {
  
  var autoplayDelay: `data-swiper-autoplay`
  
  var `class`: typingsJapgolly.swiper.swiperStrings.`class`
  
  var ngClass: typingsJapgolly.swiper.swiperStrings.ngClass
  
  var virtualIndex: typingsJapgolly.swiper.swiperStrings.virtualIndex
  
  var zoom: typingsJapgolly.swiper.swiperStrings.zoom
}
object AutoplayDelay {
  
  inline def apply(): AutoplayDelay = {
    val __obj = js.Dynamic.literal(autoplayDelay = "data-swiper-autoplay", ngClass = "ngClass", virtualIndex = "virtualIndex", zoom = "zoom")
    __obj.updateDynamic("class")("class")
    __obj.asInstanceOf[AutoplayDelay]
  }
  
  extension [Self <: AutoplayDelay](x: Self) {
    
    inline def setAutoplayDelay(value: `data-swiper-autoplay`): Self = StObject.set(x, "autoplayDelay", value.asInstanceOf[js.Any])
    
    inline def setClass(value: `class`): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setNgClass(value: ngClass): Self = StObject.set(x, "ngClass", value.asInstanceOf[js.Any])
    
    inline def setVirtualIndex(value: virtualIndex): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: zoom): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
