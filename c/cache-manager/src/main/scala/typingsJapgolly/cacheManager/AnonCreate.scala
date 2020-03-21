package typingsJapgolly.cacheManager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cacheManager.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  def create(args: js.Any*): Store
}

object AnonCreate {
  @scala.inline
  def apply(create: /* repeated */ js.Any => CallbackTo[Store]): AnonCreate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => create(t0).runNow()))
    __obj.asInstanceOf[AnonCreate]
  }
}

