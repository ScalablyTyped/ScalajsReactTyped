package typingsJapgolly.reactImmutableProptypes

import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.Map
import typingsJapgolly.immutable.Immutable.OrderedMap
import typingsJapgolly.immutable.Immutable.OrderedSet
import typingsJapgolly.immutable.Immutable.Seq
import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.immutable.Immutable.Stack
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.ValidationMap
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-immutable-proptypes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val iterable: Requireable[js.Iterable[js.Any]] = js.native
  val list: Requireable[List[js.Any]] = js.native
  val map: Requireable[Map[js.Any, js.Any]] = js.native
  val orderedMap: Requireable[OrderedMap[js.Any, js.Any]] = js.native
  val orderedSet: Requireable[OrderedSet[js.Any]] = js.native
  val record: Requireable[Map[String, js.Any]] = js.native
  val seq: Requireable[Seq[js.Any, js.Any]] = js.native
  val set: Requireable[Set_[js.Any]] = js.native
  val stack: Requireable[Stack[js.Any]] = js.native
  def contains(`type`: ValidationMap[_]): Requireable[js.Iterable[_]] = js.native
  def iterableOf[V](`type`: Validator[V]): Requireable[js.Iterable[_]] = js.native
  def listOf[V](`type`: Validator[V]): Requireable[List[V]] = js.native
  def mapContains(`type`: ValidationMap[_]): Requireable[Map[_, _]] = js.native
  def mapOf[V, K](valueType: Validator[V]): Requireable[Map[K, V]] = js.native
  def mapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[Map[K, V]] = js.native
  def orderedMapOf[V, K](valueType: Validator[V]): Requireable[OrderedMap[K, V]] = js.native
  def orderedMapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[OrderedMap[K, V]] = js.native
  def orderedSetOf[V](`type`: Validator[V]): Requireable[OrderedSet[V]] = js.native
  def recordOf(`type`: ValidationMap[_]): Requireable[Map[String, _]] = js.native
  def setOf[V](`type`: Validator[V]): Requireable[Set_[V]] = js.native
  def shape(`type`: ValidationMap[_]): Requireable[js.Iterable[_]] = js.native
  def stackOf[V](`type`: Validator[V]): Requireable[Stack[V]] = js.native
}

