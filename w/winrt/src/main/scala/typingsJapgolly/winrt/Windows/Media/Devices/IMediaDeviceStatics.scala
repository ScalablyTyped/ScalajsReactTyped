package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaDeviceStatics extends StObject {
  
  def getAudioCaptureSelector(): String
  
  def getAudioRenderSelector(): String
  
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String
  
  def getDefaultAudioRenderId(role: AudioDeviceRole): String
  
  def getVideoCaptureSelector(): String
  
  var ondefaultaudiocapturedevicechanged: Any
  
  var ondefaultaudiorenderdevicechanged: Any
}
object IMediaDeviceStatics {
  
  inline def apply(
    getAudioCaptureSelector: CallbackTo[String],
    getAudioRenderSelector: CallbackTo[String],
    getDefaultAudioCaptureId: AudioDeviceRole => String,
    getDefaultAudioRenderId: AudioDeviceRole => String,
    getVideoCaptureSelector: CallbackTo[String],
    ondefaultaudiocapturedevicechanged: Any,
    ondefaultaudiorenderdevicechanged: Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(getAudioCaptureSelector = getAudioCaptureSelector.toJsFn, getAudioRenderSelector = getAudioRenderSelector.toJsFn, getDefaultAudioCaptureId = js.Any.fromFunction1(getDefaultAudioCaptureId), getDefaultAudioRenderId = js.Any.fromFunction1(getDefaultAudioRenderId), getVideoCaptureSelector = getVideoCaptureSelector.toJsFn, ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged.asInstanceOf[js.Any], ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
  
  extension [Self <: IMediaDeviceStatics](x: Self) {
    
    inline def setGetAudioCaptureSelector(value: CallbackTo[String]): Self = StObject.set(x, "getAudioCaptureSelector", value.toJsFn)
    
    inline def setGetAudioRenderSelector(value: CallbackTo[String]): Self = StObject.set(x, "getAudioRenderSelector", value.toJsFn)
    
    inline def setGetDefaultAudioCaptureId(value: AudioDeviceRole => String): Self = StObject.set(x, "getDefaultAudioCaptureId", js.Any.fromFunction1(value))
    
    inline def setGetDefaultAudioRenderId(value: AudioDeviceRole => String): Self = StObject.set(x, "getDefaultAudioRenderId", js.Any.fromFunction1(value))
    
    inline def setGetVideoCaptureSelector(value: CallbackTo[String]): Self = StObject.set(x, "getVideoCaptureSelector", value.toJsFn)
    
    inline def setOndefaultaudiocapturedevicechanged(value: Any): Self = StObject.set(x, "ondefaultaudiocapturedevicechanged", value.asInstanceOf[js.Any])
    
    inline def setOndefaultaudiorenderdevicechanged(value: Any): Self = StObject.set(x, "ondefaultaudiorenderdevicechanged", value.asInstanceOf[js.Any])
  }
}
