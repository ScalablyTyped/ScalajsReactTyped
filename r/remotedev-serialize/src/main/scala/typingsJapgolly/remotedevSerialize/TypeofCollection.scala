package typingsJapgolly.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.immutable.Immutable.Collection
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCollection extends js.Object {
  val Indexed: TypeofIndexed = js.native
  val Keyed: TypeofKeyed = js.native
  val Set: TypeofSet = js.native
  def apply[I /* <: Collection[_, _] */](collection: I): I = js.native
  def apply[T](collection: Iterable[T]): typingsJapgolly.immutable.Immutable.Collection.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): typingsJapgolly.immutable.Immutable.Collection.Keyed[String, V] = js.native
  /**
    * @deprecated use `const { isAssociative } = require('immutable')`
    */
  def isAssociative(maybeAssociative: js.Any): Boolean = js.native
  /**
    * @deprecated use `const { isIndexed } = require('immutable')`
    */
  def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
  /**
    * @deprecated use `const { isKeyed } = require('immutable')`
    */
  def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
  /**
    * @deprecated use `const { isOrdered } = require('immutable')`
    */
  def isOrdered(maybeOrdered: js.Any): Boolean = js.native
}

