package typingsJapgolly.wavesurferJs

import org.scalajs.dom.AudioBuffer
import org.scalajs.dom.AudioContext
import org.scalajs.dom.MediaStream
import org.scalajs.dom.MediaStreamAudioSourceNode
import org.scalajs.dom.MediaStreamConstraints
import typingsJapgolly.std.AudioProcessingEvent
import typingsJapgolly.std.ScriptProcessorNode
import typingsJapgolly.wavesurferJs.typesPluginMod.PluginDefinition
import typingsJapgolly.wavesurferJs.typesPluginMod.PluginParams
import typingsJapgolly.wavesurferJs.wavesurferJsStrings.`Not a supported browserDot`
import typingsJapgolly.wavesurferJs.wavesurferJsStrings.chrome
import typingsJapgolly.wavesurferJs.wavesurferJsStrings.edge
import typingsJapgolly.wavesurferJs.wavesurferJsStrings.firefox
import typingsJapgolly.wavesurferJs.wavesurferJsStrings.safari
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginMicrophoneMod {
  
  @JSImport("wavesurfer.js/src/plugin/microphone", JSImport.Default)
  @js.native
  open class default protected () extends MicrophonePlugin {
    def this(params: MicrophonePluginParams, ws: typingsJapgolly.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/microphone", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: MicrophonePluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  trait Browser extends StObject {
    
    var browser: firefox | chrome | edge | safari | (`Not a supported browserDot`)
    
    var minVersion: Double | Null
    
    var version: Double | Null
  }
  object Browser {
    
    inline def apply(browser: firefox | chrome | edge | safari | (`Not a supported browserDot`)): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], minVersion = null, version = null)
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBrowser(value: firefox | chrome | edge | safari | (`Not a supported browserDot`)): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setMinVersion(value: Double): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionNull: Self = StObject.set(x, "minVersion", null)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`256`
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`512`
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`1024`
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`2048`
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`4096`
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`8192`
    - typingsJapgolly.wavesurferJs.wavesurferJsInts.`16384`
  */
  trait BufferSize extends StObject
  object BufferSize {
    
    inline def `1024`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`1024` = 1024.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`1024`]
    
    inline def `16384`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`16384` = 16384.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`16384`]
    
    inline def `2048`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`2048` = 2048.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`2048`]
    
    inline def `256`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`256` = 256.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`256`]
    
    inline def `4096`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`4096` = 4096.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`4096`]
    
    inline def `512`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`512` = 512.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`512`]
    
    inline def `8192`: typingsJapgolly.wavesurferJs.wavesurferJsInts.`8192` = 8192.asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsInts.`8192`]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait MicrophonePlugin
    extends typingsJapgolly.wavesurferJs.srcUtilObserverMod.default {
    
    val active: Boolean = js.native
    
    val browser: Browser = js.native
    
    val bufferSize: Double = js.native
    
    /** Connect the media sources that feed the visualization. */
    def connect(): Unit = js.native
    
    val constraints: MediaStreamConstraints = js.native
    
    def destroy(): Unit = js.native
    
    /** Browser detector. */
    def detectBrowser(): Browser = js.native
    
    /** Device error callback. */
    def deviceError(code: String): Unit = js.native
    
    /** Disconnect the media sources that feed the visualization. */
    def disconnect(): Unit = js.native
    
    /** Extract browser version out of the provided user agent string. */
    def extractVersion(uastring: String, expr: String, pos: Double): Double = js.native
    
    /** Audio input device is ready. */
    def gotStream(stream: MediaStream): Unit = js.native
    
    def init(): Unit = js.native
    
    val levelChecker: ScriptProcessorNode = js.native
    
    val localAudioBuffer: AudioBuffer = js.native
    
    val mediaStreamSource: MediaStreamAudioSourceNode = js.native
    
    val micContext: AudioContext = js.native
    
    val numberOfInputChannels: Double = js.native
    
    val numberOfOutputChannels: Double = js.native
    
    val params: MicrophonePluginParams = js.native
    
    /** Pause visualization. */
    def pause(): Unit = js.native
    
    /** Play visualization. */
    def play(): Unit = js.native
    
    /** Redraw the waveform. */
    def reloadBuffer(event: AudioProcessingEvent): Unit = js.native
    
    def reloadBufferFunction(event: AudioProcessingEvent): Unit = js.native
    
    /** Allow user to select audio input device. */
    def start(): Unit = js.native
    
    /** Stop the device stream and remove any remaining waveform drawing from the wavesurfer canvas. */
    def stop(): Unit = js.native
    
    /** Stop the device and the visualization. */
    def stopDevice(): Unit = js.native
    
    val stream: MediaStream = js.native
    
    /** Pause/resume visualization. */
    def togglePlay(): Unit = js.native
    
    val wavesurfer: typingsJapgolly.wavesurferJs.srcWavesurferMod.default = js.native
  }
  
  trait MicrophonePluginParams
    extends StObject
       with PluginParams {
    
    /** The buffer size in units of sample-frames (default: 4096). */
    var bufferSize: js.UndefOr[BufferSize] = js.undefined
    
    /** Constraints describing the media types requested. */
    var constraints: js.UndefOr[MediaStreamConstraints] = js.undefined
    
    /** Integer specifying the number of channels for this node's input (default: 1). Values of up to 32 are supported. */
    var numberOfInputChannels: js.UndefOr[Double] = js.undefined
    
    /** Integer specifying the number of channels for this node's output. */
    var numberOfOutputChannels: js.UndefOr[Double] = js.undefined
  }
  object MicrophonePluginParams {
    
    inline def apply(): MicrophonePluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophonePluginParams]
    }
    
    extension [Self <: MicrophonePluginParams](x: Self) {
      
      inline def setBufferSize(value: BufferSize): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setConstraints(value: MediaStreamConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setNumberOfInputChannels(value: Double): Self = StObject.set(x, "numberOfInputChannels", value.asInstanceOf[js.Any])
      
      inline def setNumberOfInputChannelsUndefined: Self = StObject.set(x, "numberOfInputChannels", js.undefined)
      
      inline def setNumberOfOutputChannels(value: Double): Self = StObject.set(x, "numberOfOutputChannels", value.asInstanceOf[js.Any])
      
      inline def setNumberOfOutputChannelsUndefined: Self = StObject.set(x, "numberOfOutputChannels", js.undefined)
    }
  }
}
