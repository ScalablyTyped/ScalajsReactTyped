package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrabbitmq extends js.Object {
  def publish(exchange: String, routingkey: String, contenttype: String, messagebody: String): Double
  def publish_consume(exchange: String, routingkey: String, contenttype: String, messagebody: String, dpv: String): Double
}

object Typeofrabbitmq {
  @scala.inline
  def apply(
    publish: (String, String, String, String) => CallbackTo[Double],
    publish_consume: (String, String, String, String, String) => CallbackTo[Double]
  ): Typeofrabbitmq = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("publish")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => publish(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("publish_consume")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => publish_consume(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[Typeofrabbitmq]
  }
}

