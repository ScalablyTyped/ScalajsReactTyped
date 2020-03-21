package typingsJapgolly.nuclearJs.mod.Immutable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.Set")
@js.native
object Set_ extends js.Object {
  def apply(): typingsJapgolly.immutable.Immutable.Set_[_] = js.native
  def apply[T](collection: js.Iterable[T]): typingsJapgolly.immutable.Immutable.Set_[T] = js.native
  def fromKeys(obj: StringDictionary[js.Any]): typingsJapgolly.immutable.Immutable.Set_[String] = js.native
  /**
    * `Set.fromKeys()` creates a new immutable Set containing the keys from
    * this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: typingsJapgolly.immutable.Immutable.Collection[T, _]): typingsJapgolly.immutable.Immutable.Set_[T] = js.native
  /**
    * `Set.intersect()` creates a new immutable Set that is the intersection of
    * a collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const intersected = Set.intersect([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "c"" ]
    * ```
    */
  def intersect[T](sets: js.Iterable[js.Iterable[T]]): typingsJapgolly.immutable.Immutable.Set_[T] = js.native
  /**
    * True if the provided value is a Set
    */
  def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
  /**
    * Creates a new Set containing `values`.
    */
  def of[T](values: T*): typingsJapgolly.immutable.Immutable.Set_[T] = js.native
  /**
    * `Set.union()` creates a new immutable Set that is the union of a
    * collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const unioned = Set.union([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "b", "c", "t"" ]
    * ```
    */
  def union[T](sets: js.Iterable[js.Iterable[T]]): typingsJapgolly.immutable.Immutable.Set_[T] = js.native
}

