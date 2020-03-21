package typingsJapgolly.vegaTypings

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  var recurse: js.UndefOr[Boolean] = js.undefined
  var signals: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(
    data: (/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    signals: (/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null
  ): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* object */ js.UndefOr[js.Any]) => data(t0, t1).runNow()))
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* operator */ js.UndefOr[js.Any]) => signals(t0, t1).runNow()))
    __obj.asInstanceOf[AnonData]
  }
}

