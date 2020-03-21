package typingsJapgolly.three

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.AudioBufferSourceNode
import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.GainNode
import org.scalajs.dom.raw.HTMLMediaElement
import typingsJapgolly.three.audioListenerMod.AudioListener
import typingsJapgolly.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/Audio", JSImport.Namespace)
@js.native
object audioMod extends js.Object {
  @js.native
  class Audio protected () extends Object3D {
    def this(listener: AudioListener) = this()
    var autoplay: Boolean = js.native
    var buffer: Null | Audio = js.native
    var context: AudioContext = js.native
    var detune: Double = js.native
    var duration: js.UndefOr[Double] = js.native
    var filters: js.Array[_] = js.native
    var gain: GainNode = js.native
    var hasPlaybackControl: Boolean = js.native
    var isPlaying: Boolean = js.native
    var loop: Boolean = js.native
    var offset: Double = js.native
    var playbackRate: Double = js.native
    var source: AudioBufferSourceNode = js.native
    var sourceType: String = js.native
    var startTime: Double = js.native
    @JSName("type")
    var type_Audio: typingsJapgolly.three.threeStrings.Audio = js.native
    def connect(): this.type = js.native
    def disconnect(): this.type = js.native
    def getDetune(): Double = js.native
    def getFilter(): js.Any = js.native
    def getFilters(): js.Array[_] = js.native
    def getLoop(): Boolean = js.native
    def getOutput(): GainNode = js.native
    def getPlaybackRate(): Double = js.native
    def getVolume(): Double = js.native
    /**
    	 * @deprecated Use {@link AudioLoader} instead.
    	 */
    def load(file: String): Audio = js.native
    def onEnded(): Unit = js.native
    def pause(): this.type = js.native
    def play(): this.type = js.native
    def setBuffer(audioBuffer: AudioBuffer): this.type = js.native
    def setDetune(value: Double): this.type = js.native
    def setFilter(filter: js.Any): this.type = js.native
    def setFilter(value: js.Array[_]): this.type = js.native
    def setLoop(value: Boolean): Unit = js.native
    def setMediaElementSource(mediaElement: HTMLMediaElement): this.type = js.native
    def setMediaStreamSource(mediaStream: MediaStream): this.type = js.native
    def setNodeSource(audioNode: AudioBufferSourceNode): this.type = js.native
    def setPlaybackRate(value: Double): this.type = js.native
    def setVolume(value: Double): this.type = js.native
    def stop(): this.type = js.native
  }
  
  @js.native
  class AudioBuffer protected () extends js.Object {
    def this(context: js.Any) = this()
    var context: js.Any = js.native
    var ready: Boolean = js.native
    var readyCallbacks: js.Array[js.Function] = js.native
    def load(file: String): AudioBuffer = js.native
    def onReady(callback: js.Function): Unit = js.native
  }
  
}

