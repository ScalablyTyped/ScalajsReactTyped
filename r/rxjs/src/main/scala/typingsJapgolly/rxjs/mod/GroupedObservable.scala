package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.groupByMod.RefCountSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typingsJapgolly.rxjs.groupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: typingsJapgolly.rxjs.subjectMod.Subject[T]) = this()
  def this(
    key: K,
    groupSubject: typingsJapgolly.rxjs.subjectMod.Subject[T],
    refCountSubscription: RefCountSubscription
  ) = this()
}

