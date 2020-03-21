package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmsrp extends js.Object {
  def cmap_lookup(): Double
  def cmap_save(): Double
  def is_reply(): Double
  def is_request(): Double
  def relay(): Double
  def relay_flags(rtflags: Double): Double
  def reply(rcode: String, rtext: String, rhdrs: String): Double
  def reply_flags(rtflags: Double): Double
  def set_dst(rtaddr: String, rfsock: String): Double
}

object Typeofmsrp {
  @scala.inline
  def apply(
    cmap_lookup: CallbackTo[Double],
    cmap_save: CallbackTo[Double],
    is_reply: CallbackTo[Double],
    is_request: CallbackTo[Double],
    relay: CallbackTo[Double],
    relay_flags: Double => CallbackTo[Double],
    reply: (String, String, String) => CallbackTo[Double],
    reply_flags: Double => CallbackTo[Double],
    set_dst: (String, String) => CallbackTo[Double]
  ): Typeofmsrp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmap_lookup")(cmap_lookup.toJsFn)
    __obj.updateDynamic("cmap_save")(cmap_save.toJsFn)
    __obj.updateDynamic("is_reply")(is_reply.toJsFn)
    __obj.updateDynamic("is_request")(is_request.toJsFn)
    __obj.updateDynamic("relay")(relay.toJsFn)
    __obj.updateDynamic("relay_flags")(js.Any.fromFunction1((t0: scala.Double) => relay_flags(t0).runNow()))
    __obj.updateDynamic("reply")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => reply(t0, t1, t2).runNow()))
    __obj.updateDynamic("reply_flags")(js.Any.fromFunction1((t0: scala.Double) => reply_flags(t0).runNow()))
    __obj.updateDynamic("set_dst")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set_dst(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofmsrp]
  }
}

