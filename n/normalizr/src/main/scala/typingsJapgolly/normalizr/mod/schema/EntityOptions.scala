package typingsJapgolly.normalizr.mod.schema

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityOptions[T] extends js.Object {
  var idAttribute: js.UndefOr[String | SchemaFunction] = js.undefined
  var mergeStrategy: js.UndefOr[MergeFunction] = js.undefined
  var processStrategy: js.UndefOr[StrategyFunction[T]] = js.undefined
}

object EntityOptions {
  @scala.inline
  def apply[T](
    idAttribute: String | SchemaFunction = null,
    mergeStrategy: (/* entityA */ js.Any, /* entityB */ js.Any) => CallbackTo[js.Any] = null,
    processStrategy: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => CallbackTo[T] = null
  ): EntityOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(js.Any.fromFunction2((t0: /* entityA */ js.Any, t1: /* entityB */ js.Any) => mergeStrategy(t0, t1).runNow()))
    if (processStrategy != null) __obj.updateDynamic("processStrategy")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* parent */ js.Any, t2: /* key */ java.lang.String) => processStrategy(t0, t1, t2).runNow()))
    __obj.asInstanceOf[EntityOptions[T]]
  }
}

