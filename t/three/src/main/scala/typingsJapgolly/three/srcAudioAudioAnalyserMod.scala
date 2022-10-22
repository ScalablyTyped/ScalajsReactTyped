package typingsJapgolly.three

import org.scalajs.dom.AnalyserNode
import org.scalajs.dom.AudioNode
import typingsJapgolly.three.srcAudioAudioMod.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioAudioAnalyserMod {
  
  @JSImport("three/src/audio/AudioAnalyser", "AudioAnalyser")
  @js.native
  open class AudioAnalyser protected () extends StObject {
    /**
      * @param audio
      * @param [fftSize=2048]
      */
    def this(audio: Audio[AudioNode]) = this()
    def this(audio: Audio[AudioNode], fftSize: Double) = this()
    
    var analyser: AnalyserNode = js.native
    
    var data: js.typedarray.Uint8Array = js.native
    
    def getAverageFrequency(): Double = js.native
    
    /**
      * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
      */
    def getData(file: Any): Any = js.native
    
    def getFrequencyData(): js.typedarray.Uint8Array = js.native
  }
}
