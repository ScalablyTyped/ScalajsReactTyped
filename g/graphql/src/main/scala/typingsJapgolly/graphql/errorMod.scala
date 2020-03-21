package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.sourceMod.Source
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class GraphQLError protected ()
    extends typingsJapgolly.graphql.graphQLErrorMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  def formatError(error: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def locatedError(
    originalError: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
  def printError(error: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError): String = js.native
  def syntaxError(source: Source, position: Double, description: String): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
}

