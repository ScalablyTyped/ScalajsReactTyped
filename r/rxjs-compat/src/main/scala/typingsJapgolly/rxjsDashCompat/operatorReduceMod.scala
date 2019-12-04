package typingsJapgolly.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/reduce", JSImport.Namespace)
@js.native
object operatorReduceMod extends js.Object {
  def reduce[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]
  ): js.Any = js.native
  def reduce[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T],
    seed: T
  ): js.Any = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]
  ): js.Any = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R],
    seed: R
  ): js.Any = js.native
}

