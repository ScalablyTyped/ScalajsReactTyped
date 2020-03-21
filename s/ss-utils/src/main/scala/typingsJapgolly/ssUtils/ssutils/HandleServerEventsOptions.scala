package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleServerEventsOptions extends js.Object {
  var handlers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var heartbeatIntervalMs: js.UndefOr[Double] = js.undefined
  var heartbeatUrl: js.UndefOr[String] = js.undefined
  var receivers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var success: js.UndefOr[js.Function3[/* selector */ String, /* msg */ String, /* e */ js.Any, Unit]] = js.undefined
  var unRegisterUrl: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[String], 
      /* target */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* json */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.undefined
}

object HandleServerEventsOptions {
  @scala.inline
  def apply(
    handlers: StringDictionary[js.Function] = null,
    heartbeatIntervalMs: Int | Double = null,
    heartbeatUrl: String = null,
    receivers: StringDictionary[js.Any] = null,
    success: (/* selector */ String, /* msg */ String, /* e */ js.Any) => Callback = null,
    unRegisterUrl: String = null,
    validate: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => CallbackTo[Boolean] = null
  ): HandleServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (heartbeatIntervalMs != null) __obj.updateDynamic("heartbeatIntervalMs")(heartbeatIntervalMs.asInstanceOf[js.Any])
    if (heartbeatUrl != null) __obj.updateDynamic("heartbeatUrl")(heartbeatUrl.asInstanceOf[js.Any])
    if (receivers != null) __obj.updateDynamic("receivers")(receivers.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* selector */ java.lang.String, t1: /* msg */ java.lang.String, t2: /* e */ js.Any) => success(t0, t1, t2).runNow()))
    if (unRegisterUrl != null) __obj.updateDynamic("unRegisterUrl")(unRegisterUrl.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction4((t0: /* op */ js.UndefOr[java.lang.String], t1: /* target */ js.UndefOr[java.lang.String], t2: /* msg */ js.UndefOr[java.lang.String], t3: /* json */ js.UndefOr[java.lang.String]) => validate(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[HandleServerEventsOptions]
  }
}

