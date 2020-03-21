package typingsJapgolly.select2.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in select2.select2.Sub<keyof jquery.JQueryAjaxSettings, 'url'> ]: jquery.JQueryAjaxSettings[P]} */ trait AjaxOptions[Result, RemoteResult] extends js.Object {
  var data: js.UndefOr[js.Function1[/* params */ QueryOptions, PlainObject[_]]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var processResults: js.UndefOr[
    js.Function2[/* data */ RemoteResult, /* params */ QueryOptions, ProcessedResult[Result]]
  ] = js.undefined
  var transport: js.UndefOr[
    js.Function3[
      /* settings */ JQueryAjaxSettings, 
      /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], 
      /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]], 
      Unit
    ]
  ] = js.undefined
  var url: js.UndefOr[String | (js.Function1[/* params */ QueryOptions, String])] = js.undefined
}

object AjaxOptions {
  @scala.inline
  def apply[Result, RemoteResult](
    data: /* params */ QueryOptions => CallbackTo[PlainObject[js.Any]] = null,
    delay: Int | Double = null,
    processResults: (/* data */ RemoteResult, /* params */ QueryOptions) => CallbackTo[ProcessedResult[Result]] = null,
    transport: (/* settings */ JQueryAjaxSettings, /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]]) => Callback = null,
    url: String | (js.Function1[/* params */ QueryOptions, String]) = null
  ): AjaxOptions[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.select2.mod.QueryOptions) => data(t0).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (processResults != null) __obj.updateDynamic("processResults")(js.Any.fromFunction2((t0: /* data */ RemoteResult, t1: /* params */ typingsJapgolly.select2.mod.QueryOptions) => processResults(t0, t1).runNow()))
    if (transport != null) __obj.updateDynamic("transport")(js.Any.fromFunction3((t0: /* settings */ typingsJapgolly.jquery.JQueryAjaxSettings, t1: /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], t2: /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]]) => transport(t0, t1, t2).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxOptions[Result, RemoteResult]]
  }
}

