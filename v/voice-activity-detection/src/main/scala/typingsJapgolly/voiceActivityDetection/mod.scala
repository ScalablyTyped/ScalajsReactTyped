package typingsJapgolly.voiceActivityDetection

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AudioContext
import org.scalajs.dom.MediaStream
import typingsJapgolly.voiceActivityDetection.anon.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(audioContext: AudioContext, stream: MediaStream): Connect = (^.asInstanceOf[js.Dynamic].apply(audioContext.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Connect]
  inline def apply(audioContext: AudioContext, stream: MediaStream, options: VoiceActivityDetectionOptions): Connect = (^.asInstanceOf[js.Dynamic].apply(audioContext.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connect]
  
  @JSImport("voice-activity-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait VoiceActivityDetectionOptions extends StObject {
    
    var avgNoiseMultiplier: js.UndefOr[Double] = js.undefined
    
    var bufferLen: js.UndefOr[Double] = js.undefined
    
    var fftSize: js.UndefOr[Double] = js.undefined
    
    var maxCaptureFreq: js.UndefOr[Double] = js.undefined
    
    var maxNoiseLevel: js.UndefOr[Double] = js.undefined
    
    var minCaptureFreq: js.UndefOr[Double] = js.undefined
    
    var minNoiseLevel: js.UndefOr[Double] = js.undefined
    
    var noiseCaptureDuration: js.UndefOr[Double] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* val */ Double, Unit]] = js.undefined
    
    var onVoiceStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVoiceStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var smoothingTimeConstant: js.UndefOr[Double] = js.undefined
  }
  object VoiceActivityDetectionOptions {
    
    inline def apply(): VoiceActivityDetectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoiceActivityDetectionOptions]
    }
    
    extension [Self <: VoiceActivityDetectionOptions](x: Self) {
      
      inline def setAvgNoiseMultiplier(value: Double): Self = StObject.set(x, "avgNoiseMultiplier", value.asInstanceOf[js.Any])
      
      inline def setAvgNoiseMultiplierUndefined: Self = StObject.set(x, "avgNoiseMultiplier", js.undefined)
      
      inline def setBufferLen(value: Double): Self = StObject.set(x, "bufferLen", value.asInstanceOf[js.Any])
      
      inline def setBufferLenUndefined: Self = StObject.set(x, "bufferLen", js.undefined)
      
      inline def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
      
      inline def setFftSizeUndefined: Self = StObject.set(x, "fftSize", js.undefined)
      
      inline def setMaxCaptureFreq(value: Double): Self = StObject.set(x, "maxCaptureFreq", value.asInstanceOf[js.Any])
      
      inline def setMaxCaptureFreqUndefined: Self = StObject.set(x, "maxCaptureFreq", js.undefined)
      
      inline def setMaxNoiseLevel(value: Double): Self = StObject.set(x, "maxNoiseLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxNoiseLevelUndefined: Self = StObject.set(x, "maxNoiseLevel", js.undefined)
      
      inline def setMinCaptureFreq(value: Double): Self = StObject.set(x, "minCaptureFreq", value.asInstanceOf[js.Any])
      
      inline def setMinCaptureFreqUndefined: Self = StObject.set(x, "minCaptureFreq", js.undefined)
      
      inline def setMinNoiseLevel(value: Double): Self = StObject.set(x, "minNoiseLevel", value.asInstanceOf[js.Any])
      
      inline def setMinNoiseLevelUndefined: Self = StObject.set(x, "minNoiseLevel", js.undefined)
      
      inline def setNoiseCaptureDuration(value: Double): Self = StObject.set(x, "noiseCaptureDuration", value.asInstanceOf[js.Any])
      
      inline def setNoiseCaptureDurationUndefined: Self = StObject.set(x, "noiseCaptureDuration", js.undefined)
      
      inline def setOnUpdate(value: /* val */ Double => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* val */ Double) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setOnVoiceStart(value: Callback): Self = StObject.set(x, "onVoiceStart", value.toJsFn)
      
      inline def setOnVoiceStartUndefined: Self = StObject.set(x, "onVoiceStart", js.undefined)
      
      inline def setOnVoiceStop(value: Callback): Self = StObject.set(x, "onVoiceStop", value.toJsFn)
      
      inline def setOnVoiceStopUndefined: Self = StObject.set(x, "onVoiceStop", js.undefined)
      
      inline def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
      
      inline def setSmoothingTimeConstantUndefined: Self = StObject.set(x, "smoothingTimeConstant", js.undefined)
    }
  }
}
