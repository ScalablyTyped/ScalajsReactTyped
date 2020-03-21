package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DefinitionNode
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.mod.GraphQLDirective
import typingsJapgolly.graphql.mod.GraphQLInputObjectType
import typingsJapgolly.graphql.mod.GraphQLInterfaceType
import typingsJapgolly.graphql.mod.GraphQLObjectType
import typingsJapgolly.graphqlTools.graphqlToolsStrings.`object`
import typingsJapgolly.graphqlTools.graphqlToolsStrings.input
import typingsJapgolly.graphqlTools.graphqlToolsStrings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  type GetType = js.Function2[
    /* name */ String, 
    /* type */ `object` | interface | input, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputObjectType | GraphQLInterfaceType
  ]
}

