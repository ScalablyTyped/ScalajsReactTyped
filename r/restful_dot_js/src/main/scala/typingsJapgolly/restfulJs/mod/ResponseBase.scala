package typingsJapgolly.restfulJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBase extends js.Object {
  def config(): js.Any
  def headers(): Headers
  def status(): Double
}

object ResponseBase {
  @scala.inline
  def apply(config: CallbackTo[js.Any], headers: CallbackTo[Headers], status: CallbackTo[Double]): ResponseBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config.toJsFn)
    __obj.updateDynamic("headers")(headers.toJsFn)
    __obj.updateDynamic("status")(status.toJsFn)
    __obj.asInstanceOf[ResponseBase]
  }
}

