package typingsJapgolly.routeRecognizer.dslMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  var contextEntered: js.UndefOr[js.Function2[/* context */ String, /* route */ MatchDSL, Unit]] = js.undefined
  var willAddRoute: js.UndefOr[js.Function2[/* context */ js.UndefOr[String], /* route */ String, String]] = js.undefined
}

object Delegate {
  @scala.inline
  def apply(
    contextEntered: (/* context */ String, /* route */ MatchDSL) => Callback = null,
    willAddRoute: (/* context */ js.UndefOr[String], /* route */ String) => CallbackTo[String] = null
  ): Delegate = {
    val __obj = js.Dynamic.literal()
    if (contextEntered != null) __obj.updateDynamic("contextEntered")(js.Any.fromFunction2((t0: /* context */ java.lang.String, t1: /* route */ typingsJapgolly.routeRecognizer.dslMod.MatchDSL) => contextEntered(t0, t1).runNow()))
    if (willAddRoute != null) __obj.updateDynamic("willAddRoute")(js.Any.fromFunction2((t0: /* context */ js.UndefOr[java.lang.String], t1: /* route */ java.lang.String) => willAddRoute(t0, t1).runNow()))
    __obj.asInstanceOf[Delegate]
  }
}

