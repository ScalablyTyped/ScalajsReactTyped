package typingsJapgolly.seamlessImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias seamless-immutable.seamless-immutable.DeepPartial<T[P]> * / object}
    */ typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (typingsJapgolly.seamlessImmutable.mod.Immutable.MakeImmutable[T, O]) | (js.Promise[typingsJapgolly.seamlessImmutable.mod.Immutable.MakeImmutable[js.Any, O]])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = typingsJapgolly.seamlessImmutable.mod.ImmutableArray.Remaining[T] with typingsJapgolly.seamlessImmutable.mod.ImmutableArray.Additions[T] with typingsJapgolly.seamlessImmutable.mod.ImmutableArray.Overrides[T] with typingsJapgolly.seamlessImmutable.mod.ImmutableArray.ReadOnlyIndexer[T]
  type ImmutableDate = typingsJapgolly.seamlessImmutable.mod.ImmutableDate_
  type ImmutableObject[T] = typingsJapgolly.seamlessImmutable.mod.ImmutableObjectMixin[T] with typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
}
