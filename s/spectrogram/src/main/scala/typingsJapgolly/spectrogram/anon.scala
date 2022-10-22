package typingsJapgolly.spectrogram

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enable extends StObject {
    
    var enable: js.UndefOr[Boolean] = js.undefined
  }
  object Enable {
    
    inline def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    extension [Self <: Enable](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var width: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double | js.Function0[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "height", value.toJsFn)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
