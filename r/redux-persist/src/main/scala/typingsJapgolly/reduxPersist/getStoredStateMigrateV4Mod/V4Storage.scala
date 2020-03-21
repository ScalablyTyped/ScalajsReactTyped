package typingsJapgolly.reduxPersist.getStoredStateMigrateV4Mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4Storage extends js.Object {
  var getAllKeys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.undefined
  var getItem: js.UndefOr[
    js.Function1[
      /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _], 
      _
    ]
  ] = js.undefined
  var keys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.undefined
}

object V4Storage {
  @scala.inline
  def apply(
    getAllKeys: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], js.Any] => CallbackTo[js.Any] = null,
    getItem: /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], js.Any] => CallbackTo[js.Any] = null,
    keys: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], js.Any] => CallbackTo[js.Any] = null
  ): V4Storage = {
    val __obj = js.Dynamic.literal()
    if (getAllKeys != null) __obj.updateDynamic("getAllKeys")(js.Any.fromFunction1((t0: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[java.lang.String], js.Any]) => getAllKeys(t0).runNow()))
    if (getItem != null) __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[java.lang.String | scala.Null], js.Any]) => getItem(t0).runNow()))
    if (keys != null) __obj.updateDynamic("keys")(js.Any.fromFunction1((t0: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[java.lang.String], js.Any]) => keys(t0).runNow()))
    __obj.asInstanceOf[V4Storage]
  }
}

