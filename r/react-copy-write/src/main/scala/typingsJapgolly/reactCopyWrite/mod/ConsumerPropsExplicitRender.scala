package typingsJapgolly.reactCopyWrite.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsExplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var render: js.UndefOr[RenderFn[T]] = js.undefined
}

object ConsumerPropsExplicitRender {
  @scala.inline
  def apply[T](
    render: /* repeated */ ReturnType[SelectorFn[T]] => CallbackTo[Element | js.Array[Element] | Null] = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerPropsExplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.std.ReturnType[typingsJapgolly.reactCopyWrite.mod.SelectorFn[T]]) => render(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
  }
}

