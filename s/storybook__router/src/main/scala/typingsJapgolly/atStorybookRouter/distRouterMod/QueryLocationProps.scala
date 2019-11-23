package typingsJapgolly.atStorybookRouter.distRouterMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLocationProps extends js.Object {
  def children(renderData: RenderData): Node
}

object QueryLocationProps {
  @scala.inline
  def apply(children: RenderData => CallbackTo[Node]): QueryLocationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookRouter.distRouterMod.RenderData) => children(t0).runNow()))
    __obj.asInstanceOf[QueryLocationProps]
  }
}

