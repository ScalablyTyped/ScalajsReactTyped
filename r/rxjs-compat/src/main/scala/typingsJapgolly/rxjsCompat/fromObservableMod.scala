package typingsJapgolly.rxjsCompat

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/FromObservable", JSImport.Namespace)
@js.native
object fromObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class FromObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object FromObservable extends js.Object {
    def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any = js.native
    def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create[T, R](ish: ArrayLike[T]): js.Any = js.native
    def create[T, R](
      ish: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

