package typingsJapgolly.reactIsDeprecated.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deprecatable[T] extends js.Object {
  def isDeprecated(message: String): Validator[T]
}

object Deprecatable {
  @scala.inline
  def apply[T](isDeprecated: String => CallbackTo[Validator[T]]): Deprecatable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDeprecated")(js.Any.fromFunction1((t0: java.lang.String) => isDeprecated(t0).runNow()))
    __obj.asInstanceOf[Deprecatable[T]]
  }
}

