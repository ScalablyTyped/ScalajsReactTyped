package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthXkeys extends js.Object {
  def auth_xkeys_add(shdr: String, skey: String, salg: String, sdata: String): Double
  def auth_xkeys_check(shdr: String, skey: String, salg: String, sdata: String): Double
}

object TypeofauthXkeys {
  @scala.inline
  def apply(
    auth_xkeys_add: (String, String, String, String) => CallbackTo[Double],
    auth_xkeys_check: (String, String, String, String) => CallbackTo[Double]
  ): TypeofauthXkeys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth_xkeys_add")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => auth_xkeys_add(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("auth_xkeys_check")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => auth_xkeys_check(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[TypeofauthXkeys]
  }
}

