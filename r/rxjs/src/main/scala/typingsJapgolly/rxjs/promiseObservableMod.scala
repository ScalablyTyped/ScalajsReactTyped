package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/PromiseObservable", JSImport.Namespace)
@js.native
object promiseObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class PromiseObservable[T] ()
    extends typingsJapgolly.rxjsCompat.promiseObservableMod.PromiseObservable[T]
  
  /* static members */
  @js.native
  object PromiseObservable extends js.Object {
    def create[T](promise: js.Thenable[T]): js.Any = js.native
    def create[T](
      promise: js.Thenable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

