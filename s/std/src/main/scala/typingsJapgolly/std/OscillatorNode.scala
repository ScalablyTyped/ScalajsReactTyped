package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone. */
@js.native
trait OscillatorNode
  extends StObject
     with AudioScheduledSourceNode {
  
  /* standard dom */
  val detune: org.scalajs.dom.AudioParam = js.native
  
  /* standard dom */
  val frequency: org.scalajs.dom.AudioParam = js.native
  
  /* standard dom */
  def setPeriodicWave(periodicWave: org.scalajs.dom.PeriodicWave): Unit = js.native
  
  /* standard dom */
  var `type`: OscillatorType = js.native
}
