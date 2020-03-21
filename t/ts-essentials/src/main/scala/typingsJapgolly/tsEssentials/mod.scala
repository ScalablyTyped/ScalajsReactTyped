package typingsJapgolly.tsEssentials

import typingsJapgolly.std.Array
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Pick
import typingsJapgolly.std.ReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-essentials", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait DeepReadonlyArray[T] extends ReadonlyArray[DeepReadonly[T]]
  
  @js.native
  trait DeepRequiredArray[T] extends Array[DeepRequired[T]]
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<U> * / object> : T[P] extends std.ReadonlyArray<infer U>? std.ReadonlyArray</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<U> * / object> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<T[P]> * / object}
    */ typingsJapgolly.tsEssentials.tsEssentialsStrings.DeepPartial with js.Any
  type DeepReadonly[T] = DeepReadonlyObject[T] | T | (DeepReadonlyArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: ts-essentials.ts-essentials.DeepReadonly<T[P]>}
    */ typingsJapgolly.tsEssentials.tsEssentialsStrings.DeepReadonlyObject with T
  type DeepRequired[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepRequired<ts-essentials.ts-essentials.NonNullable<T[K]>> * / object}
    */ typingsJapgolly.tsEssentials.tsEssentialsStrings.DeepRequired with js.Any) | (DeepRequiredArray[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]) | NonNullable[T]
  type Dictionary[T, K /* <: String | Double */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typingsJapgolly.tsEssentials.tsEssentialsStrings.Dictionary with js.Any
  type DictionaryValues[T] = js.Any
  type Merge[M, N] = (Omit[M, Extract[String, String]]) with N
  type NonNullable[T] = T with js.Object
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Opaque[K, T] = T with AnonTYPE[K]
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

