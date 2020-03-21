package typingsJapgolly.apolloUtilities

import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/util/errorHandling", JSImport.Namespace)
@js.native
object errorHandlingMod extends js.Object {
  def graphQLResultHasError(result: ExecutionResult[ExecutionResultDataDefault]): Double = js.native
  def tryFunctionOrLogError(f: js.Function): js.Any = js.native
}

