package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Camera.FlightCancelledCallback
import typingsJapgolly.cesium.mod.Camera.FlightCompleteCallback
import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  
  var convert: js.UndefOr[Boolean] = js.undefined
  
  var destination: Cartesian3 | typingsJapgolly.cesium.mod.Rectangle
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easingFunction: js.UndefOr[typingsJapgolly.cesium.mod.EasingFunction.Callback] = js.undefined
  
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  
  var maximumHeight: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[Any] = js.undefined
  
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}
object Cancel {
  
  inline def apply(destination: Cartesian3 | typingsJapgolly.cesium.mod.Rectangle): Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComplete(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setDestination(value: Cartesian3 | typingsJapgolly.cesium.mod.Rectangle): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasingFunction(value: /* time */ Double => Double): Self = StObject.set(x, "easingFunction", js.Any.fromFunction1(value))
    
    inline def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
    
    inline def setEndTransform(value: Matrix4): Self = StObject.set(x, "endTransform", value.asInstanceOf[js.Any])
    
    inline def setEndTransformUndefined: Self = StObject.set(x, "endTransform", js.undefined)
    
    inline def setFlyOverLongitude(value: Double): Self = StObject.set(x, "flyOverLongitude", value.asInstanceOf[js.Any])
    
    inline def setFlyOverLongitudeUndefined: Self = StObject.set(x, "flyOverLongitude", js.undefined)
    
    inline def setFlyOverLongitudeWeight(value: Double): Self = StObject.set(x, "flyOverLongitudeWeight", value.asInstanceOf[js.Any])
    
    inline def setFlyOverLongitudeWeightUndefined: Self = StObject.set(x, "flyOverLongitudeWeight", js.undefined)
    
    inline def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
    
    inline def setMaximumHeightUndefined: Self = StObject.set(x, "maximumHeight", js.undefined)
    
    inline def setOrientation(value: Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPitchAdjustHeight(value: Double): Self = StObject.set(x, "pitchAdjustHeight", value.asInstanceOf[js.Any])
    
    inline def setPitchAdjustHeightUndefined: Self = StObject.set(x, "pitchAdjustHeight", js.undefined)
  }
}
