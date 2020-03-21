package typingsJapgolly.loadjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.loadjs.loadjsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined loadjs.loadjs.LoadOptions & {  returnPromise  :true} */
trait LoadOptionsreturnPromiset extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.undefined
   // Arguments provided are different in case of returnPromise: true / false
  var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
  var numRetries: js.UndefOr[Double] = js.undefined
  var returnPromise: `true`
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object LoadOptionsreturnPromiset {
  @scala.inline
  def apply(
    returnPromise: `true`,
    async: js.UndefOr[Boolean] = js.undefined,
    before: (/* path */ String, /* scriptEl */ HTMLElement) => Callback = null,
    error: /* depsNotFound */ js.Array[String] => Callback = null,
    numRetries: Int | Double = null,
    success: js.UndefOr[Callback] = js.undefined
  ): LoadOptionsreturnPromiset = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* scriptEl */ org.scalajs.dom.raw.HTMLElement) => before(t0, t1).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* depsNotFound */ js.Array[java.lang.String]) => error(t0).runNow()))
    if (numRetries != null) __obj.updateDynamic("numRetries")(numRetries.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[LoadOptionsreturnPromiset]
  }
}

