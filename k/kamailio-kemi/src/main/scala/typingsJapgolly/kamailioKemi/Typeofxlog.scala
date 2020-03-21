package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxlog extends js.Object {
  def xalert(lmsg: String): Double
  def xcrit(lmsg: String): Double
  def xdbg(lmsg: String): Double
  def xerr(lmsg: String): Double
  def xinfo(lmsg: String): Double
  def xlog(slevel: String, lmsg: String): Double
  def xnotice(lmsg: String): Double
  def xwarn(lmsg: String): Double
}

object Typeofxlog {
  @scala.inline
  def apply(
    xalert: String => CallbackTo[Double],
    xcrit: String => CallbackTo[Double],
    xdbg: String => CallbackTo[Double],
    xerr: String => CallbackTo[Double],
    xinfo: String => CallbackTo[Double],
    xlog: (String, String) => CallbackTo[Double],
    xnotice: String => CallbackTo[Double],
    xwarn: String => CallbackTo[Double]
  ): Typeofxlog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xalert")(js.Any.fromFunction1((t0: java.lang.String) => xalert(t0).runNow()))
    __obj.updateDynamic("xcrit")(js.Any.fromFunction1((t0: java.lang.String) => xcrit(t0).runNow()))
    __obj.updateDynamic("xdbg")(js.Any.fromFunction1((t0: java.lang.String) => xdbg(t0).runNow()))
    __obj.updateDynamic("xerr")(js.Any.fromFunction1((t0: java.lang.String) => xerr(t0).runNow()))
    __obj.updateDynamic("xinfo")(js.Any.fromFunction1((t0: java.lang.String) => xinfo(t0).runNow()))
    __obj.updateDynamic("xlog")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => xlog(t0, t1).runNow()))
    __obj.updateDynamic("xnotice")(js.Any.fromFunction1((t0: java.lang.String) => xnotice(t0).runNow()))
    __obj.updateDynamic("xwarn")(js.Any.fromFunction1((t0: java.lang.String) => xwarn(t0).runNow()))
    __obj.asInstanceOf[Typeofxlog]
  }
}

