package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendoUiStrings.create
import typingsJapgolly.kendoUi.kendoUiStrings.destroy
import typingsJapgolly.kendoUi.kendoUiStrings.read
import typingsJapgolly.kendoUi.kendoUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransport extends js.Object {
  var create: js.UndefOr[
    String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var destroy: js.UndefOr[
    String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var parameterMap: js.UndefOr[
    js.Function2[
      /* data */ DataSourceTransportParameterMapData, 
      /* type */ create | destroy | read | update, 
      _
    ]
  ] = js.undefined
  var push: js.UndefOr[js.Function] = js.undefined
  var read: js.UndefOr[
    String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var submit: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[
    String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
}

object DataSourceTransport {
  @scala.inline
  def apply(
    create: String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    destroy: String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    parameterMap: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => CallbackTo[js.Any] = null,
    push: js.Function = null,
    read: String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    submit: js.Function = null,
    update: String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null
  ): DataSourceTransport = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.kendoUi.kendo.data.DataSourceTransportParameterMapData, t1: /* type */ typingsJapgolly.kendoUi.kendoUiStrings.create | typingsJapgolly.kendoUi.kendoUiStrings.destroy | typingsJapgolly.kendoUi.kendoUiStrings.read | typingsJapgolly.kendoUi.kendoUiStrings.update) => parameterMap(t0, t1).runNow()))
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransport]
  }
}

