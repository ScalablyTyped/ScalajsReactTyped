package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransportWithFunctionOperations extends PivotTransport {
  @JSName("discover")
  var discover_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  @JSName("read")
  var read_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
}

object PivotTransportWithFunctionOperations {
  @scala.inline
  def apply(
    discover: /* options */ DataSourceTransportOptions => Callback = null,
    read: /* options */ DataSourceTransportOptions => Callback = null
  ): PivotTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    if (discover != null) __obj.updateDynamic("discover")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportOptions) => discover(t0).runNow()))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportOptions) => read(t0).runNow()))
    __obj.asInstanceOf[PivotTransportWithFunctionOperations]
  }
}

