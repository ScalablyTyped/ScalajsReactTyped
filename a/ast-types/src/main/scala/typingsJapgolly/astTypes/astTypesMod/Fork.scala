package typingsJapgolly.astTypes.astTypesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fork extends js.Object {
  def use[T](plugin: Plugin[T]): T
}

object Fork {
  @scala.inline
  def apply(use: Plugin[js.Any] => CallbackTo[js.Any]): Fork = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("use")(js.Any.fromFunction1((t0: typingsJapgolly.astTypes.astTypesMod.Plugin[js.Any]) => use(t0).runNow()))
    __obj.asInstanceOf[Fork]
  }
}

