package typingsJapgolly.airbnbPropTypes.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.propTypes.mod.ReactNodeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactComponentLike extends js.Object {
  var context: js.Any
  var props: js.Any
  var refs: js.Any
  var state: js.Any
  def forceUpdate(args: js.Any*): js.Any
  def render(): ReactNodeLike
  def setState(args: js.Any*): js.Any
}

object ReactComponentLike {
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: /* repeated */ js.Any => CallbackTo[js.Any],
    props: js.Any,
    refs: js.Any,
    render: CallbackTo[ReactNodeLike],
    setState: /* repeated */ js.Any => CallbackTo[js.Any],
    state: js.Any
  ): ReactComponentLike = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("forceUpdate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => forceUpdate(t0).runNow()))
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => setState(t0).runNow()))
    __obj.asInstanceOf[ReactComponentLike]
  }
}

