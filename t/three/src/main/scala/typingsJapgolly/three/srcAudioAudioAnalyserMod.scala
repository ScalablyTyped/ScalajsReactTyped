package typingsJapgolly.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/AudioAnalyser", JSImport.Namespace)
@js.native
object srcAudioAudioAnalyserMod extends js.Object {
  @js.native
  class AudioAnalyser protected () extends js.Object {
    def this(audio: js.Any, fftSize: Double) = this()
    var analyser: js.Any = js.native
    var data: scala.scalajs.js.typedarray.Uint8Array = js.native
    def getAverageFrequency(): Double = js.native
    /**
    	 * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
    	 */
    def getData(file: js.Any): js.Any = js.native
    def getFrequencyData(): scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
}

