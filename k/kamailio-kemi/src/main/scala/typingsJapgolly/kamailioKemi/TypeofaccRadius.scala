package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofaccRadius extends js.Object {
  def request(comment: String): Double
}

object TypeofaccRadius {
  @scala.inline
  def apply(request: String => CallbackTo[Double]): TypeofaccRadius = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: java.lang.String) => request(t0).runNow()))
    __obj.asInstanceOf[TypeofaccRadius]
  }
}

