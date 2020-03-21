package typingsJapgolly.reactRouterNavigationCore.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStackProps extends js.Object {
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  def render(props: CardsRendererProps): Node
}

object CardStackProps {
  @scala.inline
  def apply(render: CardsRendererProps => CallbackTo[Node], children: js.Array[Node] = null): CardStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRouterNavigationCore.mod.CardsRendererProps) => render(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardStackProps]
  }
}

