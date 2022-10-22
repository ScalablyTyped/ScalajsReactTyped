package typingsJapgolly.w3cImageCapture

import typingsJapgolly.w3cImageCapture.W3C.ConstrainPoint2D
import typingsJapgolly.webrtc.W3C.ConstrainBoolean
import typingsJapgolly.webrtc.W3C.ConstrainDouble
import typingsJapgolly.webrtc.W3C.ConstrainString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraintSet extends StObject {
  
  var brightness: js.UndefOr[ConstrainDouble] = js.undefined
  
  var colorTemperature: js.UndefOr[ConstrainDouble] = js.undefined
  
  var contrast: js.UndefOr[ConstrainDouble] = js.undefined
  
  var exposureCompensation: js.UndefOr[ConstrainDouble] = js.undefined
  
  var exposureMode: js.UndefOr[ConstrainString] = js.undefined
  
  var focusDistance: js.UndefOr[ConstrainDouble] = js.undefined
  
  var focusMode: js.UndefOr[ConstrainString] = js.undefined
  
  var iso: js.UndefOr[ConstrainDouble] = js.undefined
  
  var pan: js.UndefOr[Boolean | ConstrainDouble] = js.undefined
  
  var pointsOfInterest: js.UndefOr[ConstrainPoint2D] = js.undefined
  
  var saturation: js.UndefOr[ConstrainDouble] = js.undefined
  
  var sharpness: js.UndefOr[ConstrainDouble] = js.undefined
  
  var tilt: js.UndefOr[Boolean | ConstrainDouble] = js.undefined
  
  var torch: js.UndefOr[ConstrainBoolean] = js.undefined
  
  var whiteBalanceMode: js.UndefOr[ConstrainString] = js.undefined
  
  var zoom: js.UndefOr[Boolean | ConstrainDouble] = js.undefined
}
object MediaTrackConstraintSet {
  
  inline def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  
  extension [Self <: MediaTrackConstraintSet](x: Self) {
    
    inline def setBrightness(value: ConstrainDouble): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setColorTemperature(value: ConstrainDouble): Self = StObject.set(x, "colorTemperature", value.asInstanceOf[js.Any])
    
    inline def setColorTemperatureUndefined: Self = StObject.set(x, "colorTemperature", js.undefined)
    
    inline def setContrast(value: ConstrainDouble): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setExposureCompensation(value: ConstrainDouble): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    inline def setExposureCompensationUndefined: Self = StObject.set(x, "exposureCompensation", js.undefined)
    
    inline def setExposureMode(value: ConstrainString): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    inline def setExposureModeUndefined: Self = StObject.set(x, "exposureMode", js.undefined)
    
    inline def setExposureModeVarargs(value: String*): Self = StObject.set(x, "exposureMode", js.Array(value*))
    
    inline def setFocusDistance(value: ConstrainDouble): Self = StObject.set(x, "focusDistance", value.asInstanceOf[js.Any])
    
    inline def setFocusDistanceUndefined: Self = StObject.set(x, "focusDistance", js.undefined)
    
    inline def setFocusMode(value: ConstrainString): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    inline def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
    
    inline def setFocusModeVarargs(value: String*): Self = StObject.set(x, "focusMode", js.Array(value*))
    
    inline def setIso(value: ConstrainDouble): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
    
    inline def setPan(value: Boolean | ConstrainDouble): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPointsOfInterest(value: ConstrainPoint2D): Self = StObject.set(x, "pointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setPointsOfInterestUndefined: Self = StObject.set(x, "pointsOfInterest", js.undefined)
    
    inline def setPointsOfInterestVarargs(value: Point2D*): Self = StObject.set(x, "pointsOfInterest", js.Array(value*))
    
    inline def setSaturation(value: ConstrainDouble): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    inline def setSharpness(value: ConstrainDouble): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    inline def setSharpnessUndefined: Self = StObject.set(x, "sharpness", js.undefined)
    
    inline def setTilt(value: Boolean | ConstrainDouble): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setTorch(value: ConstrainBoolean): Self = StObject.set(x, "torch", value.asInstanceOf[js.Any])
    
    inline def setTorchUndefined: Self = StObject.set(x, "torch", js.undefined)
    
    inline def setWhiteBalanceMode(value: ConstrainString): Self = StObject.set(x, "whiteBalanceMode", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceModeUndefined: Self = StObject.set(x, "whiteBalanceMode", js.undefined)
    
    inline def setWhiteBalanceModeVarargs(value: String*): Self = StObject.set(x, "whiteBalanceMode", js.Array(value*))
    
    inline def setZoom(value: Boolean | ConstrainDouble): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
