package typingsJapgolly.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/filter", JSImport.Namespace)
@js.native
object operatorsFilterMod extends js.Object {
  def filter[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]
  ): js.Any = js.native
  def filter[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Any = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]
  ): js.Any = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean],
    thisArg: js.Any
  ): js.Any = js.native
}

