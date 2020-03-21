package typingsJapgolly.nuclearJs.mod.Immutable

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.immutable.Immutable.Collection.Indexed
import typingsJapgolly.immutable.Immutable.Collection.Keyed
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.Collection")
@js.native
object Collection extends js.Object {
  def apply[I /* <: typingsJapgolly.immutable.Immutable.Collection[_, _] */](collection: I): I = js.native
  def apply[T](collection: Iterable[T]): Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
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
  @js.native
  object Indexed extends js.Object {
    def apply[T](collection: js.Iterable[T]): typingsJapgolly.immutable.Immutable.Collection.Indexed[T] = js.native
  }
  
  @js.native
  object Keyed extends js.Object {
    def apply[V](obj: StringDictionary[V]): typingsJapgolly.immutable.Immutable.Collection.Keyed[String, V] = js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typingsJapgolly.immutable.Immutable.Collection.Keyed[K, V] = js.native
  }
  
  @js.native
  object Set extends js.Object {
    def apply[T](collection: js.Iterable[T]): typingsJapgolly.immutable.Immutable.Collection.Set[T] = js.native
  }
  
}

