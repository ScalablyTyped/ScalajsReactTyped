package typingsJapgolly.spex

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCb extends js.Object {
  var cb: js.UndefOr[
    js.Function4[/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double, _]
  ] = js.undefined
}

object AnonCb {
  @scala.inline
  def apply(
    cb: (/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double) => CallbackTo[js.Any] = null
  ): AnonCb = {
    val __obj = js.Dynamic.literal()
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* success */ scala.Boolean, t2: /* result */ js.Any, t3: /* delay */ scala.Double) => cb(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonCb]
  }
}

