package typingsJapgolly.greasemonkey

import japgolly.scalajs.react.Callback
import typingsJapgolly.greasemonkey.GM.ProgressResponse
import typingsJapgolly.greasemonkey.GM.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnabort[TContext] extends js.Object {
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.undefined
}

object AnonOnabort {
  @scala.inline
  def apply[TContext](
    onabort: /* response */ Response[TContext] => Callback = null,
    onerror: /* response */ Response[TContext] => Callback = null,
    onload: /* response */ Response[TContext] => Callback = null,
    onprogress: /* response */ ProgressResponse[TContext] => Callback = null
  ): AnonOnabort[TContext] = {
    val __obj = js.Dynamic.literal()
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onabort(t0).runNow()))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onerror(t0).runNow()))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onload(t0).runNow()))
    if (onprogress != null) __obj.updateDynamic("onprogress")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.ProgressResponse[TContext]) => onprogress(t0).runNow()))
    __obj.asInstanceOf[AnonOnabort[TContext]]
  }
}

