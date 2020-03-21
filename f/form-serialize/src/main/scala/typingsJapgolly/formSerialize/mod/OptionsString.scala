package typingsJapgolly.formSerialize.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formSerialize.formSerializeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsString extends Options[String] {
  @JSName("hash")
  var hash_OptionsString: `false`
}

object OptionsString {
  @scala.inline
  def apply(
    hash: `false`,
    disabled: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    serializer: (String, /* key */ String, /* value */ String) => CallbackTo[String] = null
  ): OptionsString = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction3((t0: java.lang.String, t1: /* key */ java.lang.String, t2: /* value */ java.lang.String) => serializer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OptionsString]
  }
}

