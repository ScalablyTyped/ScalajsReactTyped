package typingsJapgolly.hashtable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashtableOptions[TKey] extends js.Object {
  @JSName("equals")
  var equals_FIHashtableOptions: js.UndefOr[js.Function2[/* key1 */ TKey, /* key2 */ TKey, Boolean]] = js.undefined
  @JSName("hashCode")
  var hashCode_FIHashtableOptions: js.UndefOr[js.Function1[/* key */ TKey, _]] = js.undefined
  var replaceDuplicateKey: js.UndefOr[Boolean] = js.undefined
}

object IHashtableOptions {
  @scala.inline
  def apply[TKey](
    equals: (/* key1 */ TKey, /* key2 */ TKey) => CallbackTo[Boolean] = null,
    hashCode: /* key */ TKey => CallbackTo[js.Any] = null,
    replaceDuplicateKey: js.UndefOr[Boolean] = js.undefined
  ): IHashtableOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2((t0: /* key1 */ TKey, t1: /* key2 */ TKey) => equals(t0, t1).runNow()))
    if (hashCode != null) __obj.updateDynamic("hashCode")(js.Any.fromFunction1((t0: /* key */ TKey) => hashCode(t0).runNow()))
    if (!js.isUndefined(replaceDuplicateKey)) __obj.updateDynamic("replaceDuplicateKey")(replaceDuplicateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHashtableOptions[TKey]]
  }
}

