package typingsJapgolly.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.knockout.KnockoutSubscribableFunctions because Already inherited
- typingsJapgolly.knockout.KnockoutObservableFunctions because Already inherited
- typingsJapgolly.knockout.KnockoutSubscribable because Already inherited
- typingsJapgolly.knockout.KnockoutReadonlyObservable because Already inherited
- typingsJapgolly.knockout.KnockoutObservable because var conflicts: valueHasMutated, valueWillMutate. Inlined  */ @js.native
trait KnockoutComputed[T]
  extends KnockoutReadonlyComputed[T]
     with KnockoutComputedFunctions[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  /**
    * Manually disposes the computed observable, clearing all subscriptions to dependencies.
    * This function is useful if you want to stop a computed observable from being updated or want to clean up memory for a
    * computed observable that has dependencies on observables that won’t be cleaned.
    */
  def dispose(): Unit = js.native
}

