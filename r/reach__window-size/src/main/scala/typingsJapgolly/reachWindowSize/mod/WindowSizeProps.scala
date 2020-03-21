package typingsJapgolly.reachWindowSize.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reachWindowSize.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  def children(size: AnonHeight): Node
}

object WindowSizeProps {
  @scala.inline
  def apply(children: AnonHeight => CallbackTo[Node]): WindowSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reachWindowSize.AnonHeight) => children(t0).runNow()))
    __obj.asInstanceOf[WindowSizeProps]
  }
}

