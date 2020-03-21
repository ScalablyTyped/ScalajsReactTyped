package typingsJapgolly.java.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends js.Object {
  var asyncSuffix: js.UndefOr[String] = js.undefined
  var promiseSuffix: js.UndefOr[String] = js.undefined
  var promisify: js.UndefOr[Promisify] = js.undefined
  var syncSuffix: String
}

object AsyncOptions {
  @scala.inline
  def apply(
    syncSuffix: String,
    asyncSuffix: String = null,
    promiseSuffix: String = null,
    promisify: (/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any]) => CallbackTo[js.Function] = null
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal(syncSuffix = syncSuffix.asInstanceOf[js.Any])
    if (asyncSuffix != null) __obj.updateDynamic("asyncSuffix")(asyncSuffix.asInstanceOf[js.Any])
    if (promiseSuffix != null) __obj.updateDynamic("promiseSuffix")(promiseSuffix.asInstanceOf[js.Any])
    if (promisify != null) __obj.updateDynamic("promisify")(js.Any.fromFunction2((t0: /* funct */ js.Function, t1: /* receiver */ js.UndefOr[js.Any]) => promisify(t0, t1).runNow()))
    __obj.asInstanceOf[AsyncOptions]
  }
}

