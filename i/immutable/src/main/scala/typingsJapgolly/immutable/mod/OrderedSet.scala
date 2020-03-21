package typingsJapgolly.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedSet[T]
  extends typingsJapgolly.immutable.Immutable.Set_[T] {
  /**
    * Returns a new OrderedSet with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_T_OrderedSet[F /* <: T */](predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean]): typingsJapgolly.immutable.Immutable.OrderedSet[F] = js.native
  @JSName("filter")
  def filter_F_T_OrderedSet[F /* <: T */](
    predicate: js.Function3[/* value */ T, /* key */ T, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): typingsJapgolly.immutable.Immutable.OrderedSet[F] = js.native
  def zip(collections: (typingsJapgolly.immutable.Immutable.Collection[_, _])*): typingsJapgolly.immutable.Immutable.OrderedSet[_] = js.native
  /**
    * Returns an OrderedSet of the same type "zipped" with the provided
    * collections.
    *
    * Like `zipWith`, but using the default `zipper`: creating an `Array`.
    *
    * ```js
    * const a = OrderedSet([ 1, 2, 3 ])
    * const b = OrderedSet([ 4, 5, 6 ])
    * const c = a.zip(b)
    * // OrderedSet [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
    * ```
    */
  def zip[U](other: typingsJapgolly.immutable.Immutable.Collection[_, U]): typingsJapgolly.immutable.Immutable.OrderedSet[js.Tuple2[T, U]] = js.native
  def zip[U, V](
    other1: typingsJapgolly.immutable.Immutable.Collection[_, U],
    other2: typingsJapgolly.immutable.Immutable.Collection[_, V]
  ): typingsJapgolly.immutable.Immutable.OrderedSet[js.Tuple3[T, U, V]] = js.native
  def zipAll(collections: (typingsJapgolly.immutable.Immutable.Collection[_, _])*): typingsJapgolly.immutable.Immutable.OrderedSet[_] = js.native
  /**
    * Returns a OrderedSet of the same type "zipped" with the provided
    * collections.
    *
    * Unlike `zip`, `zipAll` continues zipping until the longest collection is
    * exhausted. Missing values from shorter collections are filled with `undefined`.
    *
    * ```js
    * const a = OrderedSet([ 1, 2 ]);
    * const b = OrderedSet([ 3, 4, 5 ]);
    * const c = a.zipAll(b); // OrderedSet [ [ 1, 3 ], [ 2, 4 ], [ undefined, 5 ] ]
    * ```
    *
    * Note: Since zipAll will return a collection as large as the largest
    * input, some results may contain undefined values. TypeScript cannot
    * account for these without cases (as of v2.5).
    */
  def zipAll[U](other: typingsJapgolly.immutable.Immutable.Collection[_, U]): typingsJapgolly.immutable.Immutable.OrderedSet[js.Tuple2[T, U]] = js.native
  def zipAll[U, V](
    other1: typingsJapgolly.immutable.Immutable.Collection[_, U],
    other2: typingsJapgolly.immutable.Immutable.Collection[_, V]
  ): typingsJapgolly.immutable.Immutable.OrderedSet[js.Tuple3[T, U, V]] = js.native
  def zipWith[Z](
    zipper: js.Function1[/* repeated */ js.Any, Z],
    collections: (typingsJapgolly.immutable.Immutable.Collection[_, _])*
  ): typingsJapgolly.immutable.Immutable.OrderedSet[Z] = js.native
  /**
    * Returns an OrderedSet of the same type "zipped" with the provided
    * collections by using a custom `zipper` function.
    *
    * @see Seq.Indexed.zipWith
    */
  def zipWith[U, Z](
    zipper: js.Function2[/* value */ T, /* otherValue */ U, Z],
    otherCollection: typingsJapgolly.immutable.Immutable.Collection[_, U]
  ): typingsJapgolly.immutable.Immutable.OrderedSet[Z] = js.native
  def zipWith[U, V, Z](
    zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
    otherCollection: typingsJapgolly.immutable.Immutable.Collection[_, U],
    thirdCollection: typingsJapgolly.immutable.Immutable.Collection[_, V]
  ): typingsJapgolly.immutable.Immutable.OrderedSet[Z] = js.native
}

@JSImport("immutable", "OrderedSet")
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

