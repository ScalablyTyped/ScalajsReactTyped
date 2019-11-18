package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProfiler extends js.Object {
  def attachAggregateHandler(name: String, handler: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]): Unit
  def attachProfileHandler(
    name: String,
    handler: js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]
  ): Unit
}

object RelayProfiler {
  @scala.inline
  def apply(
    attachAggregateHandler: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Callback,
    attachProfileHandler: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]) => Callback
  ): RelayProfiler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachAggregateHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* name */ java.lang.String, /* callback */ js.Function0[scala.Unit], scala.Unit]) => attachAggregateHandler(t0, t1).runNow()))
    __obj.updateDynamic("attachProfileHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* name */ java.lang.String, 
  /* state */ js.UndefOr[js.Any], 
  js.Function0[scala.Unit]]) => attachProfileHandler(t0, t1).runNow()))
    __obj.asInstanceOf[RelayProfiler]
  }
}

