package typingsJapgolly.jqueryTruncateHtml

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def truncate(options: TruncateOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(truncate: TruncateOptions => CallbackTo[JQuery]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("truncate")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryTruncateHtml.TruncateOptions) => truncate(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

