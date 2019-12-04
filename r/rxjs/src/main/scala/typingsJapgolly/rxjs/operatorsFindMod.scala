package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operators/find", JSImport.Namespace)
@js.native
object operatorsFindMod extends js.Object {
  def find[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]
  ): js.Any = js.native
  def find[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Any = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]
  ): js.Any = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean],
    thisArg: js.Any
  ): js.Any = js.native
}

