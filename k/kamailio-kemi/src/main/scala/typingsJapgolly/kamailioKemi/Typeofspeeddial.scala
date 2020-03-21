package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofspeeddial extends js.Object {
  def lookup(stable: String): Double
  def lookup_owner(stable: String, sowner: String): Double
}

object Typeofspeeddial {
  @scala.inline
  def apply(lookup: String => CallbackTo[Double], lookup_owner: (String, String) => CallbackTo[Double]): Typeofspeeddial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("lookup_owner")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => lookup_owner(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofspeeddial]
  }
}

