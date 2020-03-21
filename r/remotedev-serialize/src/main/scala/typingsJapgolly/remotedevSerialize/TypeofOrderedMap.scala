package typingsJapgolly.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.immutable.Immutable.OrderedMap
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofOrderedMap extends js.Object {
  def apply(): OrderedMap[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): OrderedMap[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): OrderedMap[K, V] = js.native
  /**
    * True if the provided value is an OrderedMap.
    */
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
}

