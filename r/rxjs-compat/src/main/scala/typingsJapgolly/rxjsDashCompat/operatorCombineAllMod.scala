package typingsJapgolly.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/combineAll", JSImport.Namespace)
@js.native
object operatorCombineAllMod extends js.Object {
  def combineAll[T](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ObservableInput<T>> */ js.Any
  ): js.Any = js.native
  def combineAll[R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any,
    project: js.Function1[/* repeated */ js.Any, R]
  ): js.Any = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
  ): js.Any = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](
    `this`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ObservableInput<T>> */ js.Any,
    project: js.Function1[/* repeated */ T, R]
  ): js.Any = js.native
}

