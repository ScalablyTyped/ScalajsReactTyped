package typingsJapgolly.tsmonad.maybeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/maybe.MaybePatterns<T, U>> */
trait OptionalMaybePatterns[T, U] extends js.Object {
  var just: js.UndefOr[js.Function1[/* t */ T, U]] = js.undefined
  var nothing: js.UndefOr[js.Function0[U]] = js.undefined
}

object OptionalMaybePatterns {
  @scala.inline
  def apply[T, U](just: /* t */ T => CallbackTo[U] = null, nothing: js.UndefOr[CallbackTo[U]] = js.undefined): OptionalMaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal()
    if (just != null) __obj.updateDynamic("just")(js.Any.fromFunction1((t0: /* t */ T) => just(t0).runNow()))
    nothing.foreach(p => __obj.updateDynamic("nothing")(p.toJsFn))
    __obj.asInstanceOf[OptionalMaybePatterns[T, U]]
  }
}

