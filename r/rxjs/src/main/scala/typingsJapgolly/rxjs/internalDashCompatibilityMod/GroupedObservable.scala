package typingsJapgolly.rxjs.internalDashCompatibilityMod

import typingsJapgolly.rxjs.internalOperatorsGroupByMod.RefCountSubscription
import typingsJapgolly.rxjs.internalSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typingsJapgolly.rxjs.internalOperatorsGroupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: Subject[T]) = this()
  def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
}

