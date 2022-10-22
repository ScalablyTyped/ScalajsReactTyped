package typingsJapgolly.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class for configuring the imported voice or video stream in {@link addInjectStreamUrl}.
  *
  * @example **Sample code**
  * ```javascript
  * var InjectStreamConfig = {
  *   width: 0,
  *   height: 0,
  *   videoGop: 30,
  *   videoFramerate: 15,
  *   videoBitrate: 400,
  *   audioSampleRate: 44100,
  *   audioChannels: 1,
  * };
  * ```
  */
trait InjectStreamConfig extends StObject {
  
  /**
    * Audio bitrate of the added stream to the interactive streaming.
    *
    * Positive integer. The default value is 48. The value range is [1, 10000].
    *
    * **Note**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioBitrate: js.UndefOr[Double] = js.undefined
  
  /**
    * Audio channels to add into the interactive streaming.
    *
    * Positive integer. The default value is 1. The value range is [1, 2].
    *
    * **Note**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioChannels: js.UndefOr[Double] = js.undefined
  
  /**
    * Audio sampling rate of the added stream to the interactive streaming.
    *
    * - 32000: 32 kHz
    * - 44100: (Default) 44.1 kHz
    * - 48000: 48 kHz
    *
    * **Note**
    *
    * Agora recommends that you stay with the default value and not reset it at this point of time.
    */
  var audioSampleRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Height of the added stream to the interactive streaming.
    *
    * Integer, the default value is 0, which is the same height as the original stream. The value range is [0, 10000].
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Video bitrate of the added stream to the interactive streaming.
    *
    * Positive integer. The default value is 400 Kbps. The value range is [1, 10000].
    *
    * **Note**
    *
    * The setting of the video bitrate is closely linked to the resolution. If the video bitrate you set is beyond the reasonable range, the SDK will set it within the reasonable range instead.
    */
  var videoBitrate: js.UndefOr[Double] = js.undefined
  
  /**
    * Video frame rate of the added stream to the interactive streaming.
    *
    * Positive integer. The default value is 15 fps. The value range is [1, 10000].
    */
  var videoFramerate: js.UndefOr[Double] = js.undefined
  
  /**
    * Video GOP of the added stream to the interactive streaming.
    *
    * Positive integer. The default value is 30 frames. The value range is [1, 10000].
    */
  var videoGop: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the added stream to the interactive streaming.
    *
    * Integer, the default value is 0, which is the same width as the original stream. The value range is [0, 10000].
    */
  var width: js.UndefOr[Double] = js.undefined
}
object InjectStreamConfig {
  
  inline def apply(): InjectStreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectStreamConfig]
  }
  
  extension [Self <: InjectStreamConfig](x: Self) {
    
    inline def setAudioBitrate(value: Double): Self = StObject.set(x, "audioBitrate", value.asInstanceOf[js.Any])
    
    inline def setAudioBitrateUndefined: Self = StObject.set(x, "audioBitrate", js.undefined)
    
    inline def setAudioChannels(value: Double): Self = StObject.set(x, "audioChannels", value.asInstanceOf[js.Any])
    
    inline def setAudioChannelsUndefined: Self = StObject.set(x, "audioChannels", js.undefined)
    
    inline def setAudioSampleRate(value: Double): Self = StObject.set(x, "audioSampleRate", value.asInstanceOf[js.Any])
    
    inline def setAudioSampleRateUndefined: Self = StObject.set(x, "audioSampleRate", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setVideoBitrate(value: Double): Self = StObject.set(x, "videoBitrate", value.asInstanceOf[js.Any])
    
    inline def setVideoBitrateUndefined: Self = StObject.set(x, "videoBitrate", js.undefined)
    
    inline def setVideoFramerate(value: Double): Self = StObject.set(x, "videoFramerate", value.asInstanceOf[js.Any])
    
    inline def setVideoFramerateUndefined: Self = StObject.set(x, "videoFramerate", js.undefined)
    
    inline def setVideoGop(value: Double): Self = StObject.set(x, "videoGop", value.asInstanceOf[js.Any])
    
    inline def setVideoGopUndefined: Self = StObject.set(x, "videoGop", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
