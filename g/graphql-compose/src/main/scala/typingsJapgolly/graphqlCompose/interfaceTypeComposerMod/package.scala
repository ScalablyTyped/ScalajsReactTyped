package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceTypeComposerMod {
  type ComposeInterfaceType = (typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, js.Any]) | typingsJapgolly.graphql.mod.GraphQLInterfaceType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
  type InterfaceTypeComposeDefinition[TSource, TContext] = typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | (typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig[TSource, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    typingsJapgolly.graphqlCompose.definitionsMod.MaybePromise[js.UndefOr[scala.Boolean | scala.Null]]
  ]
  type InterfaceTypeResolversMap[TContext] = typingsJapgolly.std.Map[
    (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typingsJapgolly.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]), 
    typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeResolverCheckFn[js.Any, TContext]
  ]
}
