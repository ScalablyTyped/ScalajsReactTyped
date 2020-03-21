package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofuriDb extends js.Object {
  def check_from(): Double
  def check_to(): Double
  def check_uri(suri: String): Double
  def check_uri_realm(suri: String, susername: String, srealm: String): Double
  def does_uri_exist(): Double
}

object TypeofuriDb {
  @scala.inline
  def apply(
    check_from: CallbackTo[Double],
    check_to: CallbackTo[Double],
    check_uri: String => CallbackTo[Double],
    check_uri_realm: (String, String, String) => CallbackTo[Double],
    does_uri_exist: CallbackTo[Double]
  ): TypeofuriDb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check_from")(check_from.toJsFn)
    __obj.updateDynamic("check_to")(check_to.toJsFn)
    __obj.updateDynamic("check_uri")(js.Any.fromFunction1((t0: java.lang.String) => check_uri(t0).runNow()))
    __obj.updateDynamic("check_uri_realm")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => check_uri_realm(t0, t1, t2).runNow()))
    __obj.updateDynamic("does_uri_exist")(does_uri_exist.toJsFn)
    __obj.asInstanceOf[TypeofuriDb]
  }
}

