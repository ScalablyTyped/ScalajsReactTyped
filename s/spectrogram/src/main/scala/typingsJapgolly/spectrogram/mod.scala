package typingsJapgolly.spectrogram

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.AnalyserNode
import org.scalajs.dom.AudioBuffer
import org.scalajs.dom.AudioContext
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.spectrogram.anon.Enable
import typingsJapgolly.spectrogram.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("spectrogram", JSImport.Namespace)
  @js.native
  val ^ : SpectrogramConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("spectrogram", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Spectrogram {
    def this(canvas: HTMLCanvasElement, options: SpectrogramOptions) = this()
  }
  
  @js.native
  trait Spectrogram extends StObject {
    
    def clear(canvasContext: CanvasRenderingContext2D): Unit = js.native
    
    def connectSource(analyserNode: AnalyserNode, audioContext: AudioContext): Unit = js.native
    def connectSource(audioBuffer: AudioBuffer): Unit = js.native
    def connectSource(audioBuffer: AudioBuffer, audioContext: AudioContext): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def start(): Unit = js.native
    def start(offset: Double): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait SpectrogramConstructor
    extends StObject
       with Instantiable2[/* canvas */ HTMLCanvasElement, /* options */ SpectrogramOptions, Spectrogram] {
    
    def apply(canvas: HTMLCanvasElement, options: SpectrogramOptions): Spectrogram = js.native
  }
  
  trait SpectrogramOptions extends StObject {
    
    var audio: js.UndefOr[Enable] = js.undefined
    
    var canvas: js.UndefOr[Height] = js.undefined
    
    var colors: js.UndefOr[
        js.Function1[/* steps */ Double, js.Array[String | CanvasGradient | CanvasPattern]]
      ] = js.undefined
  }
  object SpectrogramOptions {
    
    inline def apply(): SpectrogramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpectrogramOptions]
    }
    
    extension [Self <: SpectrogramOptions](x: Self) {
      
      inline def setAudio(value: Enable): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setCanvas(value: Height): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setColors(value: /* steps */ Double => js.Array[String | CanvasGradient | CanvasPattern]): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    }
  }
  
  type _To = SpectrogramConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SpectrogramConstructor = ^
}
