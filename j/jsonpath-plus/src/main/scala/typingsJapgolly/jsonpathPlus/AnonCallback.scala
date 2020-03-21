package typingsJapgolly.jsonpathPlus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonpathPlus.mod.JSONPathCallback
import typingsJapgolly.jsonpathPlus.mod.JSONPathOtherTypeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: js.UndefOr[JSONPathCallback] = js.undefined
  var json: Null | Boolean | Double | String | js.Object | js.Array[_]
  var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.undefined
  var path: String | js.Array[_]
}

object AnonCallback {
  @scala.inline
  def apply(
    path: String | js.Array[_],
    callback: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => CallbackTo[js.Any] = null,
    json: Boolean | Double | String | js.Object | js.Array[_] = null,
    otherTypeCallback: /* repeated */ js.Any => Callback = null
  ): AnonCallback = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3((t0: /* payload */ js.Any, t1: /* payloadType */ js.Any, t2: /* fullPayload */ js.Any) => callback(t0, t1, t2).runNow()))
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (otherTypeCallback != null) __obj.updateDynamic("otherTypeCallback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => otherTypeCallback(t0).runNow()))
    __obj.asInstanceOf[AnonCallback]
  }
}

