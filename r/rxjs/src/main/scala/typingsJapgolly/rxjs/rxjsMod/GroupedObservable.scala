package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalOperatorsGroupByMod.RefCountSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typingsJapgolly.rxjs.internalOperatorsGroupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: typingsJapgolly.rxjs.internalSubjectMod.Subject[T]) = this()
  def this(
    key: K,
    groupSubject: typingsJapgolly.rxjs.internalSubjectMod.Subject[T],
    refCountSubscription: RefCountSubscription
  ) = this()
}

