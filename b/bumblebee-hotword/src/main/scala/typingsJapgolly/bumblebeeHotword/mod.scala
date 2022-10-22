package typingsJapgolly.bumblebeeHotword

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AnalyserNode
import org.scalajs.dom.GainNode
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bumblebee-hotword", JSImport.Namespace)
  @js.native
  open class ^ () extends Bumblebee
  
  @JSImport("bumblebee-hotword", "SpectrumAnalyser")
  @js.native
  open class SpectrumAnalyser protected () extends StObject {
    def this(analyser: AnalyserNode, canvas: HTMLCanvasElement) = this()
    
    def draw(): Unit = js.native
    
    def setBackgroundColor(bgColor: String): Unit = js.native
    
    def setColors(linecolor: String, bgcolor: String): Unit = js.native
    
    def setLineColor(linecolor: String): Unit = js.native
    
    def setMuted(muted: Boolean): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait Bumblebee extends EventEmitter {
    
    def addHotword(name: String): Unit = js.native
    def addHotword(name: String, data: js.typedarray.Uint8Array): Unit = js.native
    def addHotword(name: String, data: js.typedarray.Uint8Array, sensitivity: Double): Unit = js.native
    def addHotword(name: String, data: Unit, sensitivity: Double): Unit = js.native
    
    def audioAnalyserCallback(audioAnalyser: AnalyserNode, gainNode: GainNode): Unit = js.native
    
    def audioProcessCallback(data: Any, sampleRate: Any): Unit = js.native
    
    def detectionCallback(keyword: String): Unit = js.native
    
    def errorCallback(e: js.Error): Unit = js.native
    
    def setHotword(w: String): Unit = js.native
    
    def setMicVolume(vol: Double): Unit = js.native
    
    def setMuted(muted: Boolean): Unit = js.native
    
    def setSensitivity(s: Double): Unit = js.native
    
    def setVoiceProcessor(Proc: VoiceProcessor): Unit = js.native
    
    def setWorkersPath(path: String): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait VoiceEngine extends StObject {
    
    def processFrame(data: Any): Unit
  }
  object VoiceEngine {
    
    inline def apply(processFrame: Any => Callback): VoiceEngine = {
      val __obj = js.Dynamic.literal(processFrame = js.Any.fromFunction1((t0: Any) => processFrame(t0).runNow()))
      __obj.asInstanceOf[VoiceEngine]
    }
    
    extension [Self <: VoiceEngine](x: Self) {
      
      inline def setProcessFrame(value: Any => Callback): Self = StObject.set(x, "processFrame", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait VoiceProcessor extends StObject {
    
    def start(
      engines: js.Array[VoiceEngine],
      volume: Double,
      downsamplerScript: String,
      errorCallback: js.Function1[/* e */ js.Error, Unit],
      audioProcessCallback: js.Function1[/* data */ Any, Unit],
      audioContextCallback: js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]
    ): Unit
    
    def stop(): Unit
  }
  object VoiceProcessor {
    
    inline def apply(
      start: (js.Array[VoiceEngine], Double, String, js.Function1[/* e */ js.Error, Unit], js.Function1[/* data */ Any, Unit], js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => Callback,
      stop: Callback
    ): VoiceProcessor = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction6((t0: js.Array[VoiceEngine], t1: Double, t2: String, t3: js.Function1[/* e */ js.Error, Unit], t4: js.Function1[/* data */ Any, Unit], t5: js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => (start(t0, t1, t2, t3, t4, t5)).runNow()), stop = stop.toJsFn)
      __obj.asInstanceOf[VoiceProcessor]
    }
    
    extension [Self <: VoiceProcessor](x: Self) {
      
      inline def setStart(
        value: (js.Array[VoiceEngine], Double, String, js.Function1[/* e */ js.Error, Unit], js.Function1[/* data */ Any, Unit], js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => Callback
      ): Self = StObject.set(x, "start", js.Any.fromFunction6((t0: js.Array[VoiceEngine], t1: Double, t2: String, t3: js.Function1[/* e */ js.Error, Unit], t4: js.Function1[/* data */ Any, Unit], t5: js.Function2[/* analyzer */ AnalyserNode, /* gainNode */ GainNode, Unit]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
