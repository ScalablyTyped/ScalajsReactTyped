package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getOperationAST")
@js.native
object getOperationAST extends js.Object {
  def apply(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
}

