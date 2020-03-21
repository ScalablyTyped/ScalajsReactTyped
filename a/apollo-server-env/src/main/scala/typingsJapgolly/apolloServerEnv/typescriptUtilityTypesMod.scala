package typingsJapgolly.apolloServerEnv

import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/typescript-utility-types", JSImport.Namespace)
@js.native
object typescriptUtilityTypesMod extends js.Object {
  type ValueOrPromise[T] = T | js.Promise[T]
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}

