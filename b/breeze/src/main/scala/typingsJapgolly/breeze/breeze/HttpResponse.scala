package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var config: js.Any
  var data: js.Array[Entity]
  var error: js.UndefOr[js.Any] = js.undefined
  var saveContext: js.UndefOr[js.Any] = js.undefined
  var status: Double
  def getHeaders(headerName: String): String
}

object HttpResponse {
  @scala.inline
  def apply(
    config: js.Any,
    data: js.Array[Entity],
    getHeaders: String => CallbackTo[String],
    status: Double,
    error: js.Any = null,
    saveContext: js.Any = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeaders")(js.Any.fromFunction1((t0: java.lang.String) => getHeaders(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (saveContext != null) __obj.updateDynamic("saveContext")(saveContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

