package typingsJapgolly.vis

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTemplate extends js.Object {
  def template(item: js.Any): js.Any
}

object AnonTemplate {
  @scala.inline
  def apply(template: js.Any => CallbackTo[js.Any]): AnonTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("template")(js.Any.fromFunction1((t0: js.Any) => template(t0).runNow()))
    __obj.asInstanceOf[AnonTemplate]
  }
}

