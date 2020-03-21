package typingsJapgolly.reactFinalFormListeners.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternallyChangedProps extends js.Object {
  var name: String
  def children(externallyChanged: Boolean): Node
}

object ExternallyChangedProps {
  @scala.inline
  def apply(children: Boolean => CallbackTo[Node], name: String): ExternallyChangedProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: scala.Boolean) => children(t0).runNow()))
    __obj.asInstanceOf[ExternallyChangedProps]
  }
}

