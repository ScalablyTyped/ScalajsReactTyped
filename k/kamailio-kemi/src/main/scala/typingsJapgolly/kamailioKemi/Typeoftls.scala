package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftls extends js.Object {
  def is_peer_verified(): Double
}

object Typeoftls {
  @scala.inline
  def apply(is_peer_verified: CallbackTo[Double]): Typeoftls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_peer_verified")(is_peer_verified.toJsFn)
    __obj.asInstanceOf[Typeoftls]
  }
}

