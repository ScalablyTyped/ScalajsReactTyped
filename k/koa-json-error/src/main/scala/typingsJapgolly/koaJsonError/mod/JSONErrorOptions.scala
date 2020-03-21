package typingsJapgolly.koaJsonError.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONErrorOptions extends js.Object {
  /**
    * Runs inmediatly after `options.preFormat`. It receives two arguments: the original `err` and the output of     `options.preFormat`. It should `return` a newly formatted error.
    */
  var format: js.UndefOr[js.Function2[/* err */ js.Error, /* obj */ js.Any, _]] = js.undefined
  /**
    * Runs inmediatly after `options.format`. It receives two arguments: the original `err` and the output of   `options.format`.   It should `return` a newly formatted error.
    */
  var postFormat: js.UndefOr[js.Function2[/* err */ js.Error, /* obj */ js.Any, _]] = js.undefined
  /**
    * Perform some task before calling `options.format`. Must be a function with the original err as its only argument.
    */
  var preFormat: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.undefined
}

object JSONErrorOptions {
  @scala.inline
  def apply(
    format: (/* err */ js.Error, /* obj */ js.Any) => CallbackTo[js.Any] = null,
    postFormat: (/* err */ js.Error, /* obj */ js.Any) => CallbackTo[js.Any] = null,
    preFormat: /* err */ js.Error => CallbackTo[js.Any] = null
  ): JSONErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2((t0: /* err */ js.Error, t1: /* obj */ js.Any) => format(t0, t1).runNow()))
    if (postFormat != null) __obj.updateDynamic("postFormat")(js.Any.fromFunction2((t0: /* err */ js.Error, t1: /* obj */ js.Any) => postFormat(t0, t1).runNow()))
    if (preFormat != null) __obj.updateDynamic("preFormat")(js.Any.fromFunction1((t0: /* err */ js.Error) => preFormat(t0).runNow()))
    __obj.asInstanceOf[JSONErrorOptions]
  }
}

