package typingsJapgolly.lowdb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterOptions[SchemaT] extends js.Object {
  var defaultValue: js.UndefOr[SchemaT] = js.undefined
  var deserialize: js.UndefOr[js.Function1[/* serializedData */ String, SchemaT]] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* data */ SchemaT, String]] = js.undefined
}

object AdapterOptions {
  @scala.inline
  def apply[SchemaT](
    defaultValue: SchemaT = null,
    deserialize: /* serializedData */ String => CallbackTo[SchemaT] = null,
    serialize: /* data */ SchemaT => CallbackTo[String] = null
  ): AdapterOptions[SchemaT] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: /* serializedData */ java.lang.String) => deserialize(t0).runNow()))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: /* data */ SchemaT) => serialize(t0).runNow()))
    __obj.asInstanceOf[AdapterOptions[SchemaT]]
  }
}

