package typingsJapgolly.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<T[P]> * / object}
    */ typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeepPartial with js.Any
  type MakeKeysNullable[T1, T2 /* <: java.lang.String */] = (typingsJapgolly.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MakeKeysNullable with T1
  type MakeKeysOptional[T1, T2 /* <: java.lang.String */] = (typingsJapgolly.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with (typingsJapgolly.std.Partial[typingsJapgolly.std.Pick[T1, T2]])
  type MakeKeysRequired[T1, T2 /* <: java.lang.String */] = (typingsJapgolly.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with (typingsJapgolly.std.Required[typingsJapgolly.std.Pick[T1, T2]])
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type OmitType[T /* <: typingsJapgolly.mangopay2NodejsSdk.AnonType */] = typingsJapgolly.mangopay2NodejsSdk.typesMod.Omit[T, typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
  type PickPartial[T, Par /* <: java.lang.String */] = typingsJapgolly.std.Pick[typingsJapgolly.std.Partial[T], Par]
  type PickPartialRequired[T, Par /* <: java.lang.String */, Req /* <: java.lang.String */] = (typingsJapgolly.std.Pick[typingsJapgolly.std.Partial[T], Par]) with (typingsJapgolly.std.Pick[typingsJapgolly.std.Required[T], Req])
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
