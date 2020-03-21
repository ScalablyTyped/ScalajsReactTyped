package typingsJapgolly.reactAriaLive

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  def children(contextProps: AnonAnnounceAssertive): Node
}

object AnonChildren {
  @scala.inline
  def apply(children: AnonAnnounceAssertive => CallbackTo[Node]): AnonChildren = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactAriaLive.AnonAnnounceAssertive) => children(t0).runNow()))
    __obj.asInstanceOf[AnonChildren]
  }
}

