package typingsJapgolly.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackCapabilities extends StObject {
  
  var brightness: MediaSettingsRange
  
  var colorTemperature: MediaSettingsRange
  
  var contrast: MediaSettingsRange
  
  var exposureCompensation: MediaSettingsRange
  
  var exposureMode: js.Array[MeteringMode]
  
  var focusDistance: MediaSettingsRange
  
  var focusMode: js.Array[MeteringMode]
  
  var iso: MediaSettingsRange
  
  var pan: MediaSettingsRange
  
  var saturation: MediaSettingsRange
  
  var sharpness: MediaSettingsRange
  
  var tilt: MediaSettingsRange
  
  var torch: Boolean
  
  var whiteBalanceMode: js.Array[MeteringMode]
  
  var zoom: MediaSettingsRange
}
object MediaTrackCapabilities {
  
  inline def apply(
    brightness: MediaSettingsRange,
    colorTemperature: MediaSettingsRange,
    contrast: MediaSettingsRange,
    exposureCompensation: MediaSettingsRange,
    exposureMode: js.Array[MeteringMode],
    focusDistance: MediaSettingsRange,
    focusMode: js.Array[MeteringMode],
    iso: MediaSettingsRange,
    pan: MediaSettingsRange,
    saturation: MediaSettingsRange,
    sharpness: MediaSettingsRange,
    tilt: MediaSettingsRange,
    torch: Boolean,
    whiteBalanceMode: js.Array[MeteringMode],
    zoom: MediaSettingsRange
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  
  extension [Self <: MediaTrackCapabilities](x: Self) {
    
    inline def setBrightness(value: MediaSettingsRange): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setColorTemperature(value: MediaSettingsRange): Self = StObject.set(x, "colorTemperature", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: MediaSettingsRange): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setExposureCompensation(value: MediaSettingsRange): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    inline def setExposureMode(value: js.Array[MeteringMode]): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    inline def setExposureModeVarargs(value: MeteringMode*): Self = StObject.set(x, "exposureMode", js.Array(value*))
    
    inline def setFocusDistance(value: MediaSettingsRange): Self = StObject.set(x, "focusDistance", value.asInstanceOf[js.Any])
    
    inline def setFocusMode(value: js.Array[MeteringMode]): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    inline def setFocusModeVarargs(value: MeteringMode*): Self = StObject.set(x, "focusMode", js.Array(value*))
    
    inline def setIso(value: MediaSettingsRange): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setPan(value: MediaSettingsRange): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setSaturation(value: MediaSettingsRange): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSharpness(value: MediaSettingsRange): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    inline def setTilt(value: MediaSettingsRange): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTorch(value: Boolean): Self = StObject.set(x, "torch", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceMode(value: js.Array[MeteringMode]): Self = StObject.set(x, "whiteBalanceMode", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceModeVarargs(value: MeteringMode*): Self = StObject.set(x, "whiteBalanceMode", js.Array(value*))
    
    inline def setZoom(value: MediaSettingsRange): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
