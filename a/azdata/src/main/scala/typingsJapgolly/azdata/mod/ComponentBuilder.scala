package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentBuilder[T /* <: Component */] extends js.Object {
  def component(): T
  def withProperties[U](properties: U): ComponentBuilder[T]
  def withValidation(validation: js.Function1[/* component */ T, Boolean]): ComponentBuilder[T]
}

object ComponentBuilder {
  @scala.inline
  def apply[T /* <: Component */](
    component: CallbackTo[T],
    withProperties: js.Any => CallbackTo[ComponentBuilder[T]],
    withValidation: js.Function1[/* component */ T, Boolean] => CallbackTo[ComponentBuilder[T]]
  ): ComponentBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component.toJsFn)
    __obj.updateDynamic("withProperties")(js.Any.fromFunction1((t0: js.Any) => withProperties(t0).runNow()))
    __obj.updateDynamic("withValidation")(js.Any.fromFunction1((t0: js.Function1[/* component */ T, scala.Boolean]) => withValidation(t0).runNow()))
    __obj.asInstanceOf[ComponentBuilder[T]]
  }
}

