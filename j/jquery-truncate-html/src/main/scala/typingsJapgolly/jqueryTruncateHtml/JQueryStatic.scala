package typingsJapgolly.jqueryTruncateHtml

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def truncate(html: String, options: TruncateOptions): String
}

object JQueryStatic {
  @scala.inline
  def apply(truncate: (String, TruncateOptions) => CallbackTo[String]): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("truncate")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jqueryTruncateHtml.TruncateOptions) => truncate(t0, t1).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
}

