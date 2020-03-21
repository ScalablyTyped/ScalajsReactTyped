package typingsJapgolly.reactMedia.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var render: js.UndefOr[js.Function0[Node]] = js.undefined
  var targetWindow: js.UndefOr[Window_] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(render: js.UndefOr[CallbackTo[Node]] = js.undefined, targetWindow: Window_ = null): BaseProps = {
    val __obj = js.Dynamic.literal()
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

