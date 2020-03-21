package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchProps[TParams] extends js.Object {
  var children: MatchRenderFn[TParams]
  var path: String
}

object MatchProps {
  @scala.inline
  def apply[TParams](children: /* props */ MatchRenderProps[TParams] => CallbackTo[Node], path: String): MatchProps[TParams] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reachRouter.mod.MatchRenderProps[TParams]) => children(t0).runNow()))
    __obj.asInstanceOf[MatchProps[TParams]]
  }
}

