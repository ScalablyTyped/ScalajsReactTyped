package typingsJapgolly.skatejs.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropOptions[T] extends js.Object {
  var attribute: js.UndefOr[PropOptionsAttribute] = js.undefined
  var coerce: js.UndefOr[js.Function1[/* value */ js.Any, Maybe[T]]] = js.undefined
  var default: js.UndefOr[T] = js.undefined
  var deserialize: js.UndefOr[js.Function1[/* value */ String | Null, Maybe[T]]] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* value */ Maybe[T], String | Null]] = js.undefined
}

object PropOptions {
  @scala.inline
  def apply[T](
    attribute: PropOptionsAttribute = null,
    coerce: /* value */ js.Any => CallbackTo[Maybe[T]] = null,
    default: T = null,
    deserialize: /* value */ String | Null => CallbackTo[Maybe[T]] = null,
    serialize: /* value */ Maybe[T] => CallbackTo[String | Null] = null
  ): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: /* value */ js.Any) => coerce(t0).runNow()))
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: /* value */ java.lang.String | scala.Null) => deserialize(t0).runNow()))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.skatejs.typesMod.Maybe[T]) => serialize(t0).runNow()))
    __obj.asInstanceOf[PropOptions[T]]
  }
}

