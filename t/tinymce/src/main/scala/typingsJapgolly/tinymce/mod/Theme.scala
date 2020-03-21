package typingsJapgolly.tinymce.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  def renderUI(obj: js.Object): js.Object
}

object Theme {
  @scala.inline
  def apply(renderUI: js.Object => CallbackTo[js.Object]): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderUI")(js.Any.fromFunction1((t0: js.Object) => renderUI(t0).runNow()))
    __obj.asInstanceOf[Theme]
  }
}

