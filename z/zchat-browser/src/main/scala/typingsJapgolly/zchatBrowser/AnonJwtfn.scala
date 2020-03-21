package typingsJapgolly.zchatBrowser

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJwtfn extends js.Object {
  var jwt_fn: js.UndefOr[js.Function1[/* callback */ js.Function1[/* jwt */ String, Unit], Unit]] = js.undefined
}

object AnonJwtfn {
  @scala.inline
  def apply(jwt_fn: /* callback */ js.Function1[/* jwt */ String, Unit] => Callback = null): AnonJwtfn = {
    val __obj = js.Dynamic.literal()
    if (jwt_fn != null) __obj.updateDynamic("jwt_fn")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* jwt */ java.lang.String, scala.Unit]) => jwt_fn(t0).runNow()))
    __obj.asInstanceOf[AnonJwtfn]
  }
}

