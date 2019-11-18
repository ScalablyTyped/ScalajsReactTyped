package typingsJapgolly.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueDiffer[K, V] extends js.Object {
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  def diff(`object`: StringDictionary[V]): (KeyValueChanges[String, V]) | Null = js.native
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  def diff(`object`: Map[K, V]): (KeyValueChanges[K, V]) | Null = js.native
}

