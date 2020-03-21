package typingsJapgolly.formol.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalProps[V] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var readOnly: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.undefined
  var show: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.undefined
  var value: js.UndefOr[js.Function1[/* v */ V, _]] = js.undefined
}

object ConditionalProps {
  @scala.inline
  def apply[V](
    context: js.Any = null,
    readOnly: (js.Function1[/* val */ V, Boolean]) | Boolean = null,
    show: (js.Function1[/* val */ V, Boolean]) | Boolean = null,
    value: /* v */ V => CallbackTo[js.Any] = null
  ): ConditionalProps[V] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1((t0: /* v */ V) => value(t0).runNow()))
    __obj.asInstanceOf[ConditionalProps[V]]
  }
}

