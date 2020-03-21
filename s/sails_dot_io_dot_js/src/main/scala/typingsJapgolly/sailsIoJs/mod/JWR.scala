package typingsJapgolly.sailsIoJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sailsIoJs.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWR extends js.Object {
  var body: js.Any
  var error: js.UndefOr[js.Error] = js.undefined
  var headers: Headers
  var statusCode: Double
  def pipe(): js.Error
  def toPOJO(): AnonBody
}

object JWR {
  @scala.inline
  def apply(
    body: js.Any,
    headers: Headers,
    pipe: CallbackTo[js.Error],
    statusCode: Double,
    toPOJO: CallbackTo[AnonBody],
    error: js.Error = null
  ): JWR = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("pipe")(pipe.toJsFn)
    __obj.updateDynamic("toPOJO")(toPOJO.toJsFn)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWR]
  }
}

