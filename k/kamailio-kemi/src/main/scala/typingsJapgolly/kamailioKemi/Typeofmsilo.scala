package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmsilo extends js.Object {
  def mdump(): Double
  def mdump_uri(owner_s: String): Double
  def mstore(): Double
  def mstore_uri(owner_s: String): Double
}

object Typeofmsilo {
  @scala.inline
  def apply(
    mdump: CallbackTo[Double],
    mdump_uri: String => CallbackTo[Double],
    mstore: CallbackTo[Double],
    mstore_uri: String => CallbackTo[Double]
  ): Typeofmsilo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mdump")(mdump.toJsFn)
    __obj.updateDynamic("mdump_uri")(js.Any.fromFunction1((t0: java.lang.String) => mdump_uri(t0).runNow()))
    __obj.updateDynamic("mstore")(mstore.toJsFn)
    __obj.updateDynamic("mstore_uri")(js.Any.fromFunction1((t0: java.lang.String) => mstore_uri(t0).runNow()))
    __obj.asInstanceOf[Typeofmsilo]
  }
}

