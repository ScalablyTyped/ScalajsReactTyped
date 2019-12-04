package typingsJapgolly.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/IntervalObservable", JSImport.Namespace)
@js.native
object observableIntervalObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class IntervalObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object IntervalObservable extends js.Object {
    def create(): js.Any = js.native
    def create(period: Double): js.Any = js.native
    def create(
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

