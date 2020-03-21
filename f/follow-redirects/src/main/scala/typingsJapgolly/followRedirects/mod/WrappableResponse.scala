package typingsJapgolly.followRedirects.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.followRedirects.AnonLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappableResponse extends js.Object {
  var headers: AnonLocation
  var statusCode: js.UndefOr[Double] = js.undefined
  def destroy(): js.Any
}

object WrappableResponse {
  @scala.inline
  def apply(destroy: CallbackTo[js.Any], headers: AnonLocation, statusCode: Int | Double = null): WrappableResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappableResponse]
  }
}

