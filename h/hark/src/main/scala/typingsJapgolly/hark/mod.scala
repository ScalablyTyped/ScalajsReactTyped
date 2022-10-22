package typingsJapgolly.hark

import org.scalajs.dom.AudioContext
import org.scalajs.dom.HTMLAudioElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.MediaStream
import typingsJapgolly.hark.harkStrings.speaking
import typingsJapgolly.hark.harkStrings.state_change
import typingsJapgolly.hark.harkStrings.stopped_speaking
import typingsJapgolly.hark.harkStrings.volume_change
import typingsJapgolly.std.AudioContextState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: HTMLAudioElement): Harker = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Harker]
  inline def apply(stream: HTMLAudioElement, option: Option): Harker = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Harker]
  inline def apply(stream: HTMLVideoElement): Harker = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Harker]
  inline def apply(stream: HTMLVideoElement, option: Option): Harker = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Harker]
  inline def apply(stream: MediaStream): Harker = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Harker]
  inline def apply(stream: MediaStream, option: Option): Harker = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Harker]
  
  @JSImport("hark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Harker extends StObject {
    
    def on(event: speaking | stopped_speaking, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_statechange(event: state_change, listener: js.Function1[/* state */ AudioContextState, Unit]): Unit = js.native
    @JSName("on")
    def on_volumechange(
      event: volume_change,
      listener: js.Function2[/* currentVolume */ Double, /* threshold */ Double, Unit]
    ): Unit = js.native
    
    def resume(): js.Promise[Unit] = js.native
    
    def setInterval(i: Double): Unit = js.native
    
    def setThreshold(t: Double): Unit = js.native
    
    var speaking: Boolean = js.native
    
    var speakingHistory: js.Array[Double] = js.native
    
    val state: AudioContextState = js.native
    
    def stop(): Unit = js.native
    
    def suspend(): js.Promise[Unit] = js.native
  }
  
  trait Option extends StObject {
    
    var audioContext: js.UndefOr[AudioContext] = js.undefined
    
    var history: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var play: js.UndefOr[Boolean] = js.undefined
    
    var smoothing: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      inline def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
      
      inline def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
      
      inline def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
