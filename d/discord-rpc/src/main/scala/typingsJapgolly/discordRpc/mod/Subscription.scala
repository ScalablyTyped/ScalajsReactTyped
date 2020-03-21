package typingsJapgolly.discordRpc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def unsubscribe(): js.Promise[Boolean]
}

object Subscription {
  @scala.inline
  def apply(unsubscribe: CallbackTo[js.Promise[Boolean]]): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
}

