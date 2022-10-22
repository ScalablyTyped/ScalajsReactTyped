package typingsJapgolly.reactNativePopupDialog

import typingsJapgolly.reactNativePopupDialog.mod.SlideFromTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnimationDuration extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var toValue: js.UndefOr[Double] = js.undefined
  }
  object AnimationDuration {
    
    inline def apply(): AnimationDuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationDuration]
    }
    
    extension [Self <: AnimationDuration](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    }
  }
  
  trait SlideFrom extends StObject {
    
    var slideFrom: js.UndefOr[SlideFromTypes] = js.undefined
    
    var toValue: js.UndefOr[Double] = js.undefined
  }
  object SlideFrom {
    
    inline def apply(): SlideFrom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideFrom]
    }
    
    extension [Self <: SlideFrom](x: Self) {
      
      inline def setSlideFrom(value: SlideFromTypes): Self = StObject.set(x, "slideFrom", value.asInstanceOf[js.Any])
      
      inline def setSlideFromUndefined: Self = StObject.set(x, "slideFrom", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    }
  }
}
