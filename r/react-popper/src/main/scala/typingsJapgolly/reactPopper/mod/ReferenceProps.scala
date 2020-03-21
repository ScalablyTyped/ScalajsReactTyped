package typingsJapgolly.reactPopper.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProps extends js.Object {
  var innerRef: js.UndefOr[Ref] = js.undefined
  def children(props: ReferenceChildrenProps): Node
}

object ReferenceProps {
  @scala.inline
  def apply(children: ReferenceChildrenProps => CallbackTo[Node], innerRef: Ref = null): ReferenceProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopper.mod.ReferenceChildrenProps) => children(t0).runNow()))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceProps]
  }
}

