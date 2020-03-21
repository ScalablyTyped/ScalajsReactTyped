package typingsJapgolly.reactCopyWrite.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]
  - typingsJapgolly.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]
*/
trait ConsumerProps[T] extends js.Object

object ConsumerProps {
  @scala.inline
  def ConsumerPropsExplicitRender[T](
    render: /* repeated */ ReturnType[SelectorFn[T]] => CallbackTo[Element | js.Array[Element] | Null] = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.std.ReturnType[typingsJapgolly.reactCopyWrite.mod.SelectorFn[T]]) => render(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  @scala.inline
  def ConsumerPropsImplicitRender[T](
    children: /* repeated */ ReturnType[SelectorFn[T]] => CallbackTo[Element | js.Array[Element] | Null] = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.std.ReturnType[typingsJapgolly.reactCopyWrite.mod.SelectorFn[T]]) => children(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

