package typingsJapgolly.grommet.infiniteScrollMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.grommet.grommetStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var renderMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var scrollableAncestor: js.UndefOr[Node | window] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object InfiniteScrollProps {
  @scala.inline
  def apply(
    children: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    items: js.Array[_] = null,
    onMore: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    renderMarker: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    scrollableAncestor: Node | window = null,
    show: Int | Double = null,
    step: Int | Double = null
  ): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => children(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMore(t0).runNow()))
    if (renderMarker != null) __obj.updateDynamic("renderMarker")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => renderMarker(t0).runNow()))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteScrollProps]
  }
}

