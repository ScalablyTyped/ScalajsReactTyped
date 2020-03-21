package typingsJapgolly.nodeMysqlWrapper

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetch[T] extends js.Object {
  var fetch: js.UndefOr[js.Array[String]] = js.undefined
  var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ T, Boolean]] = js.undefined
  var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ T, Boolean]] = js.undefined
  var transform: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* userId */ String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ js.Any, 
      Boolean
    ]
  ] = js.undefined
}

object AnonFetch {
  @scala.inline
  def apply[T](
    fetch: js.Array[String] = null,
    insert: (/* userId */ String, /* doc */ T) => CallbackTo[Boolean] = null,
    remove: (/* userId */ String, /* doc */ T) => CallbackTo[Boolean] = null,
    transform: js.Function = null,
    update: (/* userId */ String, /* doc */ T, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => CallbackTo[Boolean] = null
  ): AnonFetch[T] = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: /* userId */ java.lang.String, t1: /* doc */ T) => insert(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* userId */ java.lang.String, t1: /* doc */ T) => remove(t0, t1).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4((t0: /* userId */ java.lang.String, t1: /* doc */ T, t2: /* fieldNames */ js.Array[java.lang.String], t3: /* modifier */ js.Any) => update(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonFetch[T]]
  }
}

