package typingsJapgolly.wavesurferJs

import org.scalajs.dom.AnalyserNode
import org.scalajs.dom.AudioBuffer
import org.scalajs.dom.AudioContext
import org.scalajs.dom.GainNode
import typingsJapgolly.wavesurferJs.anon.End
import typingsJapgolly.wavesurferJs.typesBackendMod.WaveSurferBackend
import typingsJapgolly.wavesurferJs.typesBackendMod.WebAudioBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebaudioMod {
  
  @JSImport("wavesurfer.js/src/webaudio", JSImport.Default)
  @js.native
  open class default ()
    extends WebAudio
       with WaveSurferBackend
  
  @js.native
  trait WebAudio extends WebAudioBackend {
    
    val ac: AudioContext = js.native
    
    val analyser: AnalyserNode | Null = js.native
    
    val destroyed: Boolean = js.native
    
    val gainNode: GainNode | Null = js.native
    
    /** Returns the current time in seconds relative to the audio-clip's duration. */
    def getCurrentTime(): Double = js.native
    
    def load(buffer: AudioBuffer): Unit = js.native
    
    val scriptNode: Null = js.native
    
    def seekTo(start: Double, end: Double): End = js.native
  }
}
