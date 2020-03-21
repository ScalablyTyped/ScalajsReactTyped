package typingsJapgolly.reactMedia.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  query  :react-media.react-media.MediaQueryValue,   defaultMatches ? :boolean,   children ? :(matches : boolean): react.react.ReactNode | react.react.ReactNode, onChange ? (matches : boolean): void} */
trait SingleQueryProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, Node]) | Node] = js.undefined
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var query: MediaQueryValue
  var render: js.UndefOr[js.Function0[Node]] = js.undefined
  var targetWindow: js.UndefOr[Window_] = js.undefined
}

object SingleQueryProps {
  @scala.inline
  def apply(
    query: MediaQueryValue,
    children: (js.Function1[/* matches */ Boolean, Node]) | Node = null,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Callback = null,
    render: js.UndefOr[CallbackTo[Node]] = js.undefined,
    targetWindow: Window_ = null
  ): SingleQueryProps = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* matches */ scala.Boolean) => onChange(t0).runNow()))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleQueryProps]
  }
}

