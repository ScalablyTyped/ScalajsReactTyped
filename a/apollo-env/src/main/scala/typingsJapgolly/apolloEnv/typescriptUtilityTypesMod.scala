package typingsJapgolly.apolloEnv

import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/typescript-utility-types", JSImport.Namespace)
@js.native
object typescriptUtilityTypesMod extends js.Object {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias apollo-env.apollo-env/lib/typescript-utility-types.DeepPartial<T[P]> * / object}
    */ typingsJapgolly.apolloEnv.apolloEnvStrings.DeepPartial with js.Any
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}

