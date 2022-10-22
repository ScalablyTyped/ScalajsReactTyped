package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOrientationEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var alpha: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var beta: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var gamma: js.UndefOr[Double | Null] = js.undefined
}
object DeviceOrientationEventInit {
  
  inline def apply(): DeviceOrientationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOrientationEventInit]
  }
  
  extension [Self <: DeviceOrientationEventInit](x: Self) {
    
    inline def setAbsolute(value: scala.Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setBetaNull: Self = StObject.set(x, "beta", null)
    
    inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaNull: Self = StObject.set(x, "gamma", null)
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
  }
}
