package typingsJapgolly.jsonpathPlus.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonpathPlus.jsonpathPlusBooleans.`false`
import typingsJapgolly.jsonpathPlus.jsonpathPlusStrings.all
import typingsJapgolly.jsonpathPlus.jsonpathPlusStrings.parent
import typingsJapgolly.jsonpathPlus.jsonpathPlusStrings.parentProperty
import typingsJapgolly.jsonpathPlus.jsonpathPlusStrings.path
import typingsJapgolly.jsonpathPlus.jsonpathPlusStrings.pointer
import typingsJapgolly.jsonpathPlus.jsonpathPlusStrings.value
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPathOptionsAutoStart extends JSONPathOptions {
  @JSName("autostart")
  var autostart_JSONPathOptionsAutoStart: `false`
}

object JSONPathOptionsAutoStart {
  @scala.inline
  def apply(
    autostart: `false`,
    path: String | js.Array[_],
    callback: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => CallbackTo[js.Any] = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    json: Boolean | Double | String | js.Object | js.Array[_] = null,
    otherTypeCallback: /* repeated */ js.Any => Callback = null,
    parent: js.Any = null,
    parentProperty: js.Any = null,
    preventEval: js.UndefOr[Boolean] = js.undefined,
    resultType: value | path | pointer | parent | parentProperty | all = null,
    sandbox: Map[String, _] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): JSONPathOptionsAutoStart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3((t0: /* payload */ js.Any, t1: /* payloadType */ js.Any, t2: /* fullPayload */ js.Any) => callback(t0, t1, t2).runNow()))
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (otherTypeCallback != null) __obj.updateDynamic("otherTypeCallback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => otherTypeCallback(t0).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (parentProperty != null) __obj.updateDynamic("parentProperty")(parentProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(preventEval)) __obj.updateDynamic("preventEval")(preventEval.asInstanceOf[js.Any])
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPathOptionsAutoStart]
  }
}

