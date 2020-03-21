package typingsJapgolly.graphqlTools

import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  var ERROR_SYMBOL: js.Any = js.native
  def annotateWithChildrenErrors(`object`: js.Any, childrenErrors: js.Array[GraphQLFormattedError[Record[String, _]]]): js.Any = js.native
  def checkResultAndHandleErrors(result: ExecutionResult[ExecutionResultDataDefault], info: GraphQLResolveInfo): js.Any = js.native
  def checkResultAndHandleErrors(result: ExecutionResult[ExecutionResultDataDefault], info: GraphQLResolveInfo, responseKey: String): js.Any = js.native
  def getErrorsFromParent(`object`: js.Any, fieldName: String): AnonError | AnonErrors = js.native
}

