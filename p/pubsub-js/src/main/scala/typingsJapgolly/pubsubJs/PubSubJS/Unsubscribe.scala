package typingsJapgolly.pubsubJs.PubSubJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribe extends js.Object {
  def unsubscribe(tokenOrFunction: js.Any): js.Any
}

object Unsubscribe {
  @scala.inline
  def apply(unsubscribe: js.Any => CallbackTo[js.Any]): Unsubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: js.Any) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[Unsubscribe]
  }
}

