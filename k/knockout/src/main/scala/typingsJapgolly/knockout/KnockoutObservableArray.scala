package typingsJapgolly.knockout

import typingsJapgolly.knockout.knockoutStrings.arrayChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  NOTE: In theory this should extend both KnockoutObservable<T[]> and KnockoutReadonlyObservableArray<T>,
  but can't since they both provide conflicting typings of .subscribe.
  So it extends KnockoutObservable<T[]> and duplicates the subscribe definitions, which should be kept in sync
*/
@js.native
trait KnockoutObservableArray[T]
  extends KnockoutObservable[js.Array[T]]
     with KnockoutObservableArrayFunctions[T] {
  @JSName("subscribe")
  def subscribe_arrayChange(
    callback: js.Function1[/* newValue */ js.Array[KnockoutArrayChange[T]], Unit],
    target: js.Any,
    event: arrayChange
  ): KnockoutSubscription = js.native
}

