package typingsJapgolly.audioPlay

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AudioBuffer
import org.scalajs.dom.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buffer: AudioBuffer, how: Options, cb: js.Function0[Unit]): AudioPlayHandle = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], how.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[AudioPlayHandle]
  
  @JSImport("audio-play", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AudioPlayHandle extends StObject {
    
    var currentTime: Double
    
    def pause(): Any
    
    def play(): Any
  }
  object AudioPlayHandle {
    
    inline def apply(currentTime: Double, pause: CallbackTo[Any], play: CallbackTo[Any]): AudioPlayHandle = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], pause = pause.toJsFn, play = play.toJsFn)
      __obj.asInstanceOf[AudioPlayHandle]
    }
    
    extension [Self <: AudioPlayHandle](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setPause(value: CallbackTo[Any]): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setPlay(value: CallbackTo[Any]): Self = StObject.set(x, "play", value.toJsFn)
    }
  }
  
  /**
    * Various options for audio playback
    * @param start The timestamp at which to start the audio. Can be negative to start from end. (Default: 0)
    * @param end The timestamp the audio ends at. (Default: length of audio buffer)
    * @param autoplay Plays back the audio immediately upon loading. (Default: false)
    * @param loop Continuously loops the buffer until paused. (Default: false)
    * @param context Handle to an audio context. If not provided, one is provided for you.
    * @param volume (not implemented) Playback the audio at a percentage of full volume. (Default: 1)
    * @param detune (not implemented) Percentage of fine-tuning. (Default: 0)
    * @param rate (not implemented) Playback rate, in percent, of the audio. (Default: 1)
    */
  trait Options extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[AudioContext] = js.undefined
    
    var detune: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
      
      inline def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
