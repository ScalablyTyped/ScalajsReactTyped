package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/DeferObservable", JSImport.Namespace)
@js.native
object observableDeferObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class DeferObservable[T] ()
    extends typingsJapgolly.rxjsDashCompat.observableDeferObservableMod.DeferObservable[T]
  
  /* static members */
  @js.native
  object DeferObservable extends js.Object {
    def create[T](
      observableFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _) | Unit
        ]
    ): js.Any = js.native
  }
  
}

