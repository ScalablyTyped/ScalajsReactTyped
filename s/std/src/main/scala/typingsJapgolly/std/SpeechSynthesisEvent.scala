package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service. */
@js.native
trait SpeechSynthesisEvent extends Event {
  val charIndex: Double = js.native
  val elapsedTime: Double = js.native
  val name: java.lang.String = js.native
  val utterance: SpeechSynthesisUtterance = js.native
}

@JSGlobal("SpeechSynthesisEvent")
@js.native
object SpeechSynthesisEvent extends Instantiable0[SpeechSynthesisEvent]

