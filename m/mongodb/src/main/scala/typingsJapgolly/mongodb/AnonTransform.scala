package typingsJapgolly.mongodb

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform[T] extends js.Object {
  var transform: js.UndefOr[js.Function1[/* document */ T, _]] = js.undefined
}

object AnonTransform {
  @scala.inline
  def apply[T](transform: /* document */ T => CallbackTo[js.Any] = null): AnonTransform[T] = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* document */ T) => transform(t0).runNow()))
    __obj.asInstanceOf[AnonTransform[T]]
  }
}

