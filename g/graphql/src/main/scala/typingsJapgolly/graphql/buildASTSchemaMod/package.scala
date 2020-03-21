package typingsJapgolly.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildASTSchemaMod {
  type TypeDefinitionsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphql.astMod.TypeDefinitionNode]
  type TypeResolver = js.Function1[
    /* typeRef */ typingsJapgolly.graphql.astMod.NamedTypeNode, 
    typingsJapgolly.graphql.definitionMod.GraphQLNamedType
  ]
}
