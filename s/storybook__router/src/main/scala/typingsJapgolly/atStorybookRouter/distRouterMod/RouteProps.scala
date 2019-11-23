package typingsJapgolly.atStorybookRouter.distRouterMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var hideOnly: Boolean
  var path: String
  var startsWith: Boolean
  def children(renderData: RenderData): Node
}

object RouteProps {
  @scala.inline
  def apply(children: RenderData => CallbackTo[Node], hideOnly: Boolean, path: String, startsWith: Boolean): RouteProps = {
    val __obj = js.Dynamic.literal(hideOnly = hideOnly.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookRouter.distRouterMod.RenderData) => children(t0).runNow()))
    __obj.asInstanceOf[RouteProps]
  }
}

