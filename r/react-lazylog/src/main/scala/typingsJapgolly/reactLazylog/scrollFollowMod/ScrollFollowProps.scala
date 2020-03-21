package typingsJapgolly.reactLazylog.scrollFollowMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[Boolean] = js.undefined
  def render(props: ScrollFollowRenderProps): Node
}

object ScrollFollowProps {
  @scala.inline
  def apply(
    render: ScrollFollowRenderProps => CallbackTo[Node],
    startFollowing: js.UndefOr[Boolean] = js.undefined
  ): ScrollFollowProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactLazylog.scrollFollowMod.ScrollFollowRenderProps) => render(t0).runNow()))
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollFollowProps]
  }
}

