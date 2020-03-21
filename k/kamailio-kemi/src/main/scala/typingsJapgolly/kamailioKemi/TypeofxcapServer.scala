package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofxcapServer extends js.Object {
  def xcaps_del(uri: String, path: String): Double
  def xcaps_get(uri: String, path: String): Double
  def xcaps_put(uri: String, path: String, pbody: String): Double
}

object TypeofxcapServer {
  @scala.inline
  def apply(
    xcaps_del: (String, String) => CallbackTo[Double],
    xcaps_get: (String, String) => CallbackTo[Double],
    xcaps_put: (String, String, String) => CallbackTo[Double]
  ): TypeofxcapServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xcaps_del")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => xcaps_del(t0, t1).runNow()))
    __obj.updateDynamic("xcaps_get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => xcaps_get(t0, t1).runNow()))
    __obj.updateDynamic("xcaps_put")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => xcaps_put(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeofxcapServer]
  }
}

