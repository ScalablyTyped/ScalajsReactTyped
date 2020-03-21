package typingsJapgolly.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallThisNextErrorComplete extends js.Object {
  def apply[T](next: js.Function1[/* x */ T, Unit]): js.Any = js.native
  def apply[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
  def apply[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): js.Any = js.native
  def apply[T](
    observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
  ): js.Any = js.native
}

