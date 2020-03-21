package typingsJapgolly.createSubscription.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProps[S, T] extends js.Object {
  var source: S
  def children(value: T): Node
}

object SubscriptionProps {
  @scala.inline
  def apply[S, T](children: T => CallbackTo[Node], source: S): SubscriptionProps[S, T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    __obj.asInstanceOf[SubscriptionProps[S, T]]
  }
}

