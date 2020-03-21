package typingsJapgolly.apigeeAccess.mod.ApigeeAccess

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureVault extends js.Object {
  def get(key: String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit
  def getKeys(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit
}

object SecureVault {
  @scala.inline
  def apply(
    get: (String, js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]) => Callback,
    getKeys: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit] => Callback
  ): SecureVault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]) => get(t0, t1).runNow()))
    __obj.updateDynamic("getKeys")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]) => getKeys(t0).runNow()))
    __obj.asInstanceOf[SecureVault]
  }
}

