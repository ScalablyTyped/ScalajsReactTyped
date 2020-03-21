package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmqueue extends js.Object {
  def mq_add(mq: String, key: String, `val`: String): Double
  def mq_fetch(mq: String): Double
  def mq_pv_free(mq: String): Double
  def mq_size(mq: String): Double
}

object Typeofmqueue {
  @scala.inline
  def apply(
    mq_add: (String, String, String) => CallbackTo[Double],
    mq_fetch: String => CallbackTo[Double],
    mq_pv_free: String => CallbackTo[Double],
    mq_size: String => CallbackTo[Double]
  ): Typeofmqueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mq_add")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => mq_add(t0, t1, t2).runNow()))
    __obj.updateDynamic("mq_fetch")(js.Any.fromFunction1((t0: java.lang.String) => mq_fetch(t0).runNow()))
    __obj.updateDynamic("mq_pv_free")(js.Any.fromFunction1((t0: java.lang.String) => mq_pv_free(t0).runNow()))
    __obj.updateDynamic("mq_size")(js.Any.fromFunction1((t0: java.lang.String) => mq_size(t0).runNow()))
    __obj.asInstanceOf[Typeofmqueue]
  }
}

