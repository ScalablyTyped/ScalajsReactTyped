package typingsJapgolly.jsSchema

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  def like(obj: js.Any): ObjectConstructor
  def reference(obj: js.Any): ObjectConstructor
}

object ObjectConstructor {
  @scala.inline
  def apply(like: js.Any => CallbackTo[ObjectConstructor], reference: js.Any => CallbackTo[ObjectConstructor]): ObjectConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("like")(js.Any.fromFunction1((t0: js.Any) => like(t0).runNow()))
    __obj.updateDynamic("reference")(js.Any.fromFunction1((t0: js.Any) => reference(t0).runNow()))
    __obj.asInstanceOf[ObjectConstructor]
  }
}

