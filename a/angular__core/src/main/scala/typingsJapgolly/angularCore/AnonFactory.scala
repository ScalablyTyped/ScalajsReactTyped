package typingsJapgolly.angularCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.any
import typingsJapgolly.angularCore.angularCoreStrings.root
import typingsJapgolly.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactory[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object AnonFactory {
  @scala.inline
  def apply[T](factory: CallbackTo[T], token: js.Any, providedIn: Type[_] | root | any = null): AnonFactory[T] = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(factory.toJsFn)
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactory[T]]
  }
}

