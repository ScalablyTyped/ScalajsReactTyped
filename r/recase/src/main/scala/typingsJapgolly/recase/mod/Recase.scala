package typingsJapgolly.recase.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recase extends js.Object {
  def camelCopy(orig: js.Any): js.Any
  def snakeCopy(orig: js.Any): js.Any
}

object Recase {
  @scala.inline
  def apply(camelCopy: js.Any => CallbackTo[js.Any], snakeCopy: js.Any => CallbackTo[js.Any]): Recase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camelCopy")(js.Any.fromFunction1((t0: js.Any) => camelCopy(t0).runNow()))
    __obj.updateDynamic("snakeCopy")(js.Any.fromFunction1((t0: js.Any) => snakeCopy(t0).runNow()))
    __obj.asInstanceOf[Recase]
  }
}

