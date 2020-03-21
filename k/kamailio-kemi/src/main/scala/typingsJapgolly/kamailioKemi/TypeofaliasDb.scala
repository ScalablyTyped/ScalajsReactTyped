package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofaliasDb extends js.Object {
  def lookup(stable: String): Double
  def lookup_ex(stable: String, sflags: String): Double
}

object TypeofaliasDb {
  @scala.inline
  def apply(lookup: String => CallbackTo[Double], lookup_ex: (String, String) => CallbackTo[Double]): TypeofaliasDb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("lookup_ex")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => lookup_ex(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofaliasDb]
  }
}

