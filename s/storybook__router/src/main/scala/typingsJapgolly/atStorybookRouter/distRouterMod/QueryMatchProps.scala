package typingsJapgolly.atStorybookRouter.distRouterMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatchProps extends js.Object {
  var path: String
  var startsWith: Boolean
  def children(matchingData: MatchingData): Node
}

object QueryMatchProps {
  @scala.inline
  def apply(children: MatchingData => CallbackTo[Node], path: String, startsWith: Boolean): QueryMatchProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookRouter.distRouterMod.MatchingData) => children(t0).runNow()))
    __obj.asInstanceOf[QueryMatchProps]
  }
}

