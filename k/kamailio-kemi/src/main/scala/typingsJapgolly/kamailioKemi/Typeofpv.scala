package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpv extends js.Object {
  // Return the value of pseudo-variable `pvname`.
  // The returned value can be string or integer
  def get(pvname: String): String | Double | Null
  // Same as get(), but returns empty string on null
  def gete(pvname: String): String | Double
  // Same as get(), but returns `vn` on null
  def getvn(pvname: String, vn: Double): String | Double
  // Return the value of pseudo-variable pvname if it is different than $null or
  // the parameter vs if the variable is having the $null value.
  def getvs(pvname: String, vn: Double): String | Double
  // Return the value of pseudo-variable pvname if it is different than $null or the string <<null>> if the
  // variable is having the $null value. This should be used instead of KSR.pv.get(...) in the scripting
  // languages that throw and error when attempting to print a NULL (or NIL) value.
  def getw(pvname: String): String | Double
  // Return true if pseudo-variable pvname is $null.
  def is_null(pvname: String): Boolean
  // Set the value of pseudo-variable pvname to integer value provided by parameter val.
  def seti(pvname: String, `val`: Double): Unit
  // Set the value of pseudo-variable pvname to string value provided by parameter val.
  def sets(pvname: String, `val`: String): Unit
  // Set the value of pseudo-variable pvname to $null.
  def unset(pvname: String): Unit
}

object Typeofpv {
  @scala.inline
  def apply(
    get: String => CallbackTo[String | Double | Null],
    gete: String => CallbackTo[String | Double],
    getvn: (String, Double) => CallbackTo[String | Double],
    getvs: (String, Double) => CallbackTo[String | Double],
    getw: String => CallbackTo[String | Double],
    is_null: String => CallbackTo[Boolean],
    seti: (String, Double) => Callback,
    sets: (String, String) => Callback,
    unset: String => Callback
  ): Typeofpv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("gete")(js.Any.fromFunction1((t0: java.lang.String) => gete(t0).runNow()))
    __obj.updateDynamic("getvn")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getvn(t0, t1).runNow()))
    __obj.updateDynamic("getvs")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getvs(t0, t1).runNow()))
    __obj.updateDynamic("getw")(js.Any.fromFunction1((t0: java.lang.String) => getw(t0).runNow()))
    __obj.updateDynamic("is_null")(js.Any.fromFunction1((t0: java.lang.String) => is_null(t0).runNow()))
    __obj.updateDynamic("seti")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => seti(t0, t1).runNow()))
    __obj.updateDynamic("sets")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sets(t0, t1).runNow()))
    __obj.updateDynamic("unset")(js.Any.fromFunction1((t0: java.lang.String) => unset(t0).runNow()))
    __obj.asInstanceOf[Typeofpv]
  }
}

