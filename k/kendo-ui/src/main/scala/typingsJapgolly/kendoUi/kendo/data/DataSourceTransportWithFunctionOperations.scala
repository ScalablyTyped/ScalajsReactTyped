package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendoUiStrings.create
import typingsJapgolly.kendoUi.kendoUiStrings.destroy
import typingsJapgolly.kendoUi.kendoUiStrings.read
import typingsJapgolly.kendoUi.kendoUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportWithFunctionOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  @JSName("destroy")
  var destroy_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  @JSName("read")
  var read_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportReadOptions, Unit]] = js.undefined
  @JSName("update")
  var update_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
}

object DataSourceTransportWithFunctionOperations {
  @scala.inline
  def apply(
    create: /* options */ DataSourceTransportOptions => Callback = null,
    destroy: /* options */ DataSourceTransportOptions => Callback = null,
    parameterMap: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => CallbackTo[js.Any] = null,
    push: js.Function = null,
    read: /* options */ DataSourceTransportReadOptions => Callback = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    submit: js.Function = null,
    update: /* options */ DataSourceTransportOptions => Callback = null
  ): DataSourceTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportOptions) => create(t0).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportOptions) => destroy(t0).runNow()))
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportParameterMapData, t1: /* type */ typingsJapgolly.kendoUi.kendoUiStrings.create | typingsJapgolly.kendoUi.kendoUiStrings.destroy | typingsJapgolly.kendoUi.kendoUiStrings.read | typingsJapgolly.kendoUi.kendoUiStrings.update) => parameterMap(t0, t1).runNow()))
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportReadOptions) => read(t0).runNow()))
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportOptions) => update(t0).runNow()))
    __obj.asInstanceOf[DataSourceTransportWithFunctionOperations]
  }
}

