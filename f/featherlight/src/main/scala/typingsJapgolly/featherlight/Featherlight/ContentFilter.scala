package typingsJapgolly.featherlight.Featherlight

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.featherlight.JQuery
import typingsJapgolly.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentFilter extends js.Object {
  var process: js.UndefOr[js.Function1[/* data */ JQuery | String, JQuery | JQueryPromise[JQuery]]] = js.undefined
  var regex: js.UndefOr[js.RegExp] = js.undefined
  var test: js.UndefOr[js.Function1[/* data */ JQuery | String, Boolean]] = js.undefined
}

object ContentFilter {
  @scala.inline
  def apply(
    process: /* data */ JQuery | String => CallbackTo[JQuery | JQueryPromise[JQuery]] = null,
    regex: js.RegExp = null,
    test: /* data */ JQuery | String => CallbackTo[Boolean] = null
  ): ContentFilter = {
    val __obj = js.Dynamic.literal()
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.featherlight.JQuery | java.lang.String) => process(t0).runNow()))
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.featherlight.JQuery | java.lang.String) => test(t0).runNow()))
    __obj.asInstanceOf[ContentFilter]
  }
}

