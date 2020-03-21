package typingsJapgolly.typescriptServices.TypeScript.TextUtilities

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterSequence extends js.Object {
  var length: Double
  def charCodeAt(index: Double): Double
}

object ICharacterSequence {
  @scala.inline
  def apply(charCodeAt: Double => CallbackTo[Double], length: Double): ICharacterSequence = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("charCodeAt")(js.Any.fromFunction1((t0: scala.Double) => charCodeAt(t0).runNow()))
    __obj.asInstanceOf[ICharacterSequence]
  }
}

