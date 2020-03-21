package typingsJapgolly.formSerialize.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Result] extends js.Object {
  /** If true serialize disabled fields. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** If true serialize empty fields */
  var empty: js.UndefOr[Boolean] = js.undefined
  /** Configure the output type. If true, the output will be a js object. */
  var hash: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
    * value) and should return new result hash and url encoded str serializers are provided with this module
    */
  var serializer: js.UndefOr[js.Function3[/* result */ Result, /* key */ String, /* value */ String, Result]] = js.undefined
}

object Options {
  @scala.inline
  def apply[Result](
    disabled: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    hash: js.UndefOr[Boolean] = js.undefined,
    serializer: (/* result */ Result, /* key */ String, /* value */ String) => CallbackTo[Result] = null
  ): Options[Result] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction3((t0: /* result */ Result, t1: /* key */ java.lang.String, t2: /* value */ java.lang.String) => serializer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options[Result]]
  }
}

