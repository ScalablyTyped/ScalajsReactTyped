package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reprompt extends js.Object {
  var outputSpeech: OutputSpeech
}

object Reprompt {
  @scala.inline
  def apply(outputSpeech: OutputSpeech): Reprompt = {
    val __obj = js.Dynamic.literal(outputSpeech = outputSpeech.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Reprompt]
  }
}

