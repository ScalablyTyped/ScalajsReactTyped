package typingsJapgolly.reactCopyWrite.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsImplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var children: js.UndefOr[RenderFn[T]] = js.undefined
}

object ConsumerPropsImplicitRender {
  @scala.inline
  def apply[T](
    children: /* repeated */ ReturnType[SelectorFn[T]] => CallbackTo[Element | js.Array[Element] | Null] = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerPropsImplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.std.ReturnType[typingsJapgolly.reactCopyWrite.mod.SelectorFn[T]]) => children(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
  }
}

