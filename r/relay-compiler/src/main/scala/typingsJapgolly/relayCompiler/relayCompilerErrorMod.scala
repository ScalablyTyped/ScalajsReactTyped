package typingsJapgolly.relayCompiler

import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.relayCompiler.iRMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/RelayCompilerError", JSImport.Namespace)
@js.native
object relayCompilerErrorMod extends js.Object {
  def createUserError(message: String): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location], nodes: js.Array[ASTNode]): UserError = js.native
  type UserError = GraphQLError
}

