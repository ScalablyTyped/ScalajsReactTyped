package typingsJapgolly.angularCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.root
import typingsJapgolly.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactoryProvidedIn[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | Null] = js.undefined
  def factory(): T
}

object AnonFactoryProvidedIn {
  @scala.inline
  def apply[T](factory: CallbackTo[T], providedIn: Type[_] | root = null): AnonFactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("factory")(factory.toJsFn)
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactoryProvidedIn[T]]
  }
}

