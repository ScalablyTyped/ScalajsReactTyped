package typingsJapgolly.nuclearJs.mod.Immutable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.OrderedSet")
@js.native
object OrderedSet extends js.Object {
  def apply(): typingsJapgolly.immutable.Immutable.OrderedSet[_] = js.native
  def apply[T](collection: js.Iterable[T]): typingsJapgolly.immutable.Immutable.OrderedSet[T] = js.native
  def fromKeys(obj: StringDictionary[js.Any]): typingsJapgolly.immutable.Immutable.OrderedSet[String] = js.native
  /**
    * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
    * the keys from this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: typingsJapgolly.immutable.Immutable.Collection[T, _]): typingsJapgolly.immutable.Immutable.OrderedSet[T] = js.native
  /**
    * True if the provided value is an OrderedSet.
    */
  def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
  /**
    * Creates a new OrderedSet containing `values`.
    */
  def of[T](values: T*): typingsJapgolly.immutable.Immutable.OrderedSet[T] = js.native
}

