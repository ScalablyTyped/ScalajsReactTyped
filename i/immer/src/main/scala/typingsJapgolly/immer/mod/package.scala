package typingsJapgolly.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayMethod = typingsJapgolly.std.Exclude[java.lang.String, scala.Double]
  type AtomicObject = js.Function | (typingsJapgolly.std.Map[js.Any, js.Any]) | (typingsJapgolly.std.WeakMap[js.Any, js.Any]) | typingsJapgolly.std.Set[js.Any] | typingsJapgolly.std.WeakSet[js.Any] | js.Promise[js.Any] | js.Date | js.RegExp | scala.Boolean | typingsJapgolly.std.Number | java.lang.String
  type Draft[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias immer.immer.Draft<T[P]> * / object}
    */ typingsJapgolly.immer.immerStrings.Draft with js.Any) | typingsJapgolly.immer.mod.DraftTuple[T] | typingsJapgolly.immer.mod.DraftArray[T]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in immer.immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.immer.Indices<T>] */ js.Any
  ]
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typingsJapgolly.immer.immerStrings.DraftTuple with T
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (typingsJapgolly.std.Exclude[T, typingsJapgolly.immer.mod.Nothing_])]
  type Indices[T] = typingsJapgolly.std.Exclude[java.lang.String, typingsJapgolly.immer.mod.ArrayMethod]
  type PatchListener = js.Function2[
    /* patches */ js.Array[typingsJapgolly.immer.mod.Patch], 
    /* inversePatches */ js.Array[typingsJapgolly.immer.mod.Patch], 
    scala.Unit
  ]
  /** The inferred return type of `produce` */
  type Produced[Base, Return] = (typingsJapgolly.immer.mod.FromNothing[(typingsJapgolly.std.Exclude[Return, scala.Unit]) | Return]) | Base
}
