package typingsJapgolly.reactRouterNavigationCore.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStackProps extends js.Object {
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  var forceSync: js.UndefOr[Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def render(props: TabsRendererProps): Node
}

object TabStackProps {
  @scala.inline
  def apply(
    render: TabsRendererProps => CallbackTo[Node],
    children: js.Array[Node] = null,
    forceSync: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null
  ): TabStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRouterNavigationCore.mod.TabsRendererProps) => render(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStackProps]
  }
}

