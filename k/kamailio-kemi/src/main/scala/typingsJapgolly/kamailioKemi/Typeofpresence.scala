package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpresence extends js.Object {
  def handle_publish(): Double
  def handle_publish_uri(sender_uri: String): Double
  def handle_subscribe(): Double
  def handle_subscribe_uri(wuri: String): Double
  def pres_auth_status(watcher_uri: String, presentity_uri: String): Double
  def pres_has_subscribers(pres_uri: String, wevent: String): Double
  def pres_refresh_watchers(pres: String, event: String, `type`: Double): Double
  def pres_refresh_watchers_file(pres: String, event: String, `type`: Double, file_uri: String, filename: String): Double
  def pres_update_watchers(pres_uri: String, event: String): Double
}

object Typeofpresence {
  @scala.inline
  def apply(
    handle_publish: CallbackTo[Double],
    handle_publish_uri: String => CallbackTo[Double],
    handle_subscribe: CallbackTo[Double],
    handle_subscribe_uri: String => CallbackTo[Double],
    pres_auth_status: (String, String) => CallbackTo[Double],
    pres_has_subscribers: (String, String) => CallbackTo[Double],
    pres_refresh_watchers: (String, String, Double) => CallbackTo[Double],
    pres_refresh_watchers_file: (String, String, Double, String, String) => CallbackTo[Double],
    pres_update_watchers: (String, String) => CallbackTo[Double]
  ): Typeofpresence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle_publish")(handle_publish.toJsFn)
    __obj.updateDynamic("handle_publish_uri")(js.Any.fromFunction1((t0: java.lang.String) => handle_publish_uri(t0).runNow()))
    __obj.updateDynamic("handle_subscribe")(handle_subscribe.toJsFn)
    __obj.updateDynamic("handle_subscribe_uri")(js.Any.fromFunction1((t0: java.lang.String) => handle_subscribe_uri(t0).runNow()))
    __obj.updateDynamic("pres_auth_status")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pres_auth_status(t0, t1).runNow()))
    __obj.updateDynamic("pres_has_subscribers")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pres_has_subscribers(t0, t1).runNow()))
    __obj.updateDynamic("pres_refresh_watchers")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => pres_refresh_watchers(t0, t1, t2).runNow()))
    __obj.updateDynamic("pres_refresh_watchers_file")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: java.lang.String, t4: java.lang.String) => pres_refresh_watchers_file(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("pres_update_watchers")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pres_update_watchers(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofpresence]
  }
}

