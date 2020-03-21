package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unionTypeComposerMod {
  type ComposeUnionType = (typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, js.Any]) | typingsJapgolly.graphql.mod.GraphQLUnionType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
  type UnionTypeComposeDefinition[TSource, TContext] = typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | (typingsJapgolly.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    typingsJapgolly.graphqlCompose.definitionsMod.MaybePromise[scala.Boolean | scala.Null | scala.Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = typingsJapgolly.std.Map[
    typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeObjectType, 
    typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
