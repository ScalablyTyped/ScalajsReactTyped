package typingsJapgolly.reactSwipeableViewsUtils.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithVirtualize extends js.Object {
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  def slideRenderer(render: SlideRendererCallback): Node
}

object WithVirtualize {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback,
    slideRenderer: SlideRendererCallback => CallbackTo[Node]
  ): WithVirtualize = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    __obj.updateDynamic("slideRenderer")(js.Any.fromFunction1((t0: typingsJapgolly.reactSwipeableViewsUtils.mod.SlideRendererCallback) => slideRenderer(t0).runNow()))
    __obj.asInstanceOf[WithVirtualize]
  }
}

