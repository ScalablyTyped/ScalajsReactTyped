package typingsJapgolly.reactToastNotifications.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastConsumerProps extends js.Object {
  def children(context: ToastConsumerContext): Node
}

object ToastConsumerProps {
  @scala.inline
  def apply(children: ToastConsumerContext => CallbackTo[Node]): ToastConsumerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactToastNotifications.mod.ToastConsumerContext) => children(t0).runNow()))
    __obj.asInstanceOf[ToastConsumerProps]
  }
}

