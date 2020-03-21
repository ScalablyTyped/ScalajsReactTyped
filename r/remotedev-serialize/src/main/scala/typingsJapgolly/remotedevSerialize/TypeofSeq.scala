package typingsJapgolly.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.immutable.Immutable.Seq
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSeq extends js.Object {
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  val Indexed: TypeofIndexedOf = js.native
  val Keyed: TypeofKeyed0 = js.native
  val Set: TypeofSetOf = js.native
  def apply(): Seq[_, _] = js.native
  def apply[T](collection: typingsJapgolly.immutable.Immutable.Collection.Indexed[T]): typingsJapgolly.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[T](collection: typingsJapgolly.immutable.Immutable.Collection.Set[T]): typingsJapgolly.immutable.Immutable.Seq.Set[T] = js.native
  def apply[T](collection: Iterable[T]): typingsJapgolly.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): typingsJapgolly.immutable.Immutable.Seq.Keyed[String, V] = js.native
  def apply[S /* <: Seq[_, _] */](seq: S): S = js.native
  def apply[K, V](collection: typingsJapgolly.immutable.Immutable.Collection.Keyed[K, V]): typingsJapgolly.immutable.Immutable.Seq.Keyed[K, V] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
}

