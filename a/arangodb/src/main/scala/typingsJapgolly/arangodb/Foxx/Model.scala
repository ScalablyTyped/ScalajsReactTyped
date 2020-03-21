package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var fromClient: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var schema: Schema
}

object Model {
  @scala.inline
  def apply(
    schema: Schema,
    forClient: /* value */ js.Any => CallbackTo[js.Any] = null,
    fromClient: /* value */ js.Any => CallbackTo[js.Any] = null
  ): Model = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (forClient != null) __obj.updateDynamic("forClient")(js.Any.fromFunction1((t0: /* value */ js.Any) => forClient(t0).runNow()))
    if (fromClient != null) __obj.updateDynamic("fromClient")(js.Any.fromFunction1((t0: /* value */ js.Any) => fromClient(t0).runNow()))
    __obj.asInstanceOf[Model]
  }
}

