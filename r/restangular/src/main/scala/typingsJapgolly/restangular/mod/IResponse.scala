package typingsJapgolly.restangular.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.restangular.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var config: AnonMethod
  var data: js.Any
  var status: Double
  def headers(name: String): String
}

object IResponse {
  @scala.inline
  def apply(config: AnonMethod, data: js.Any, headers: String => CallbackTo[String], status: Double): IResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(js.Any.fromFunction1((t0: java.lang.String) => headers(t0).runNow()))
    __obj.asInstanceOf[IResponse]
  }
}

