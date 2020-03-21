package typingsJapgolly.octokitEndpoint

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpand extends js.Object {
  def expand(context: js.Object): String
}

object AnonExpand {
  @scala.inline
  def apply(expand: js.Object => CallbackTo[String]): AnonExpand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: js.Object) => expand(t0).runNow()))
    __obj.asInstanceOf[AnonExpand]
  }
}

