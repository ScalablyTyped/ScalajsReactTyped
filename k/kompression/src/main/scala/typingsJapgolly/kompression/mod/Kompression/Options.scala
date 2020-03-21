package typingsJapgolly.kompression.mod.Kompression

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filter: js.UndefOr[js.Function1[/* contentType */ String, Boolean]] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(filter: /* contentType */ String => CallbackTo[Boolean] = null, threshold: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* contentType */ java.lang.String) => filter(t0).runNow()))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

