package typingsJapgolly.urlTemplate.mod.UrlTemplate

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  def expand(parameters: js.Any): String
}

object Template {
  @scala.inline
  def apply(expand: js.Any => CallbackTo[String]): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: js.Any) => expand(t0).runNow()))
    __obj.asInstanceOf[Template]
  }
}

