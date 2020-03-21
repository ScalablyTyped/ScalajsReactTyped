package typingsJapgolly.valerie.Valerie_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatableModel[T] extends js.Object {
  // return original observableArray
  def end(): T
  def name(value: String): PropertyValidationState[T]
}

object ValidatableModel {
  @scala.inline
  def apply[T](end: CallbackTo[T], name: String => CallbackTo[PropertyValidationState[T]]): ValidatableModel[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("name")(js.Any.fromFunction1((t0: java.lang.String) => name(t0).runNow()))
    __obj.asInstanceOf[ValidatableModel[T]]
  }
}

