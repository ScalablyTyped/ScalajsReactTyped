package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxContentType extends js.Object {
  var headers: JSONRecord
  def body(url: String, config: js.Any, params: js.Any): js.Any
}

object AjaxContentType {
  @scala.inline
  def apply(body: (String, js.Any, js.Any) => CallbackTo[js.Any], headers: JSONRecord): AjaxContentType = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.updateDynamic("body")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Any) => body(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AjaxContentType]
  }
}

