package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/RangeObservable", JSImport.Namespace)
@js.native
object rangeObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class RangeObservable[T] ()
    extends typingsJapgolly.rxjsCompat.rangeObservableMod.RangeObservable[T]
  
  /* static members */
  @js.native
  object RangeObservable extends js.Object {
    def create(): js.Any = js.native
    def create(start: Double): js.Any = js.native
    def create(start: Double, count: Double): js.Any = js.native
    def create(
      start: Double,
      count: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

