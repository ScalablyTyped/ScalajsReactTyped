package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtil extends js.Object {
  def assert(condition: Boolean, message: String): Unit
}

object IUtil {
  @scala.inline
  def apply(assert: (Boolean, String) => Callback): IUtil = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assert")(js.Any.fromFunction2((t0: scala.Boolean, t1: java.lang.String) => assert(t0, t1).runNow()))
    __obj.asInstanceOf[IUtil]
  }
}

