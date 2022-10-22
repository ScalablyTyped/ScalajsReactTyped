package typingsJapgolly.reactMic

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactMic.anon.AudioBitsPerSecond
import typingsJapgolly.reactMic.reactMicInts.`1`
import typingsJapgolly.reactMic.reactMicInts.`2`
import typingsJapgolly.reactMic.reactMicStrings.audioSlashwav
import typingsJapgolly.reactMic.reactMicStrings.audioSlashwebm
import typingsJapgolly.reactMic.reactMicStrings.frequencyBars
import typingsJapgolly.reactMic.reactMicStrings.sinewave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mic", "ReactMic")
  @js.native
  open class ReactMic protected ()
    extends PureComponent[ReactMicProps, js.Object, Any] {
    def this(props: ReactMicProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactMicProps, context: Any) = this()
  }
  
  trait ReactMicProps extends StObject {
    
    /** Enables/disables auto gain control, defaults -> false */
    var autoGainControl: js.UndefOr[Boolean] = js.undefined
    
    /** Background color */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify 1 for mono, defaults -> 2 (stereo) */
    var channelCount: js.UndefOr[`1` | `2`] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Enables/disables echo cancellation, defaults -> false */
    var echoCancellation: js.UndefOr[Boolean] = js.undefined
    
    /** defaults -> "audio/webm".  Set to "audio/wav" for WAV or "audio/mp3" for MP3 audio format (available in React-Mic-Gold) */
    var mimeType: js.UndefOr[audioSlashwebm | audioSlashwav] = js.undefined
    
    /** Enables/disables background noise suppression, defaults -> false */
    var noiseSuppression: js.UndefOr[Boolean] = js.undefined
    
    /** Callback that is executed when chunk of audio is available */
    var onData: js.UndefOr[js.Function1[/* recordedData */ Blob, Unit]] = js.undefined
    
    /** Callback that is executed when audio stops recording */
    var onStop: js.UndefOr[js.Function1[/* recordedData */ ReactMicStopEvent, Unit]] = js.undefined
    
    /** Available in React-Mic-Plus upgrade only */
    var pause: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true to begin recording */
    var record: js.UndefOr[Boolean] = js.undefined
    
    /** Sound wave color */
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var visualSetting: js.UndefOr[sinewave | frequencyBars] = js.undefined
  }
  object ReactMicProps {
    
    inline def apply(): ReactMicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactMicProps]
    }
    
    extension [Self <: ReactMicProps](x: Self) {
      
      inline def setAutoGainControl(value: Boolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
      
      inline def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setChannelCount(value: `1` | `2`): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
      
      inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
      
      inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
      
      inline def setMimeType(value: audioSlashwebm | audioSlashwav): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setNoiseSuppression(value: Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
      
      inline def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
      
      inline def setOnData(value: /* recordedData */ Blob => Callback): Self = StObject.set(x, "onData", js.Any.fromFunction1((t0: /* recordedData */ Blob) => value(t0).runNow()))
      
      inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
      
      inline def setOnStop(value: /* recordedData */ ReactMicStopEvent => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: /* recordedData */ ReactMicStopEvent) => value(t0).runNow()))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setVisualSetting(value: sinewave | frequencyBars): Self = StObject.set(x, "visualSetting", value.asInstanceOf[js.Any])
      
      inline def setVisualSettingUndefined: Self = StObject.set(x, "visualSetting", js.undefined)
    }
  }
  
  trait ReactMicStopEvent extends StObject {
    
    var blob: Blob
    
    var blobURL: String
    
    var option: AudioBitsPerSecond
    
    var startTime: Double
    
    var stopTime: Double
  }
  object ReactMicStopEvent {
    
    inline def apply(blob: Blob, blobURL: String, option: AudioBitsPerSecond, startTime: Double, stopTime: Double): ReactMicStopEvent = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], blobURL = blobURL.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopTime = stopTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMicStopEvent]
    }
    
    extension [Self <: ReactMicStopEvent](x: Self) {
      
      inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setBlobURL(value: String): Self = StObject.set(x, "blobURL", value.asInstanceOf[js.Any])
      
      inline def setOption(value: AudioBitsPerSecond): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStopTime(value: Double): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    }
  }
}
