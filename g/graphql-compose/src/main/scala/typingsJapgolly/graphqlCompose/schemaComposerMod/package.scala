package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemaComposerMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
    - typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
  */
  type AnyComposeType[TContext] = typingsJapgolly.graphqlCompose.schemaComposerMod._AnyComposeType[TContext] | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
    - typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typingsJapgolly.graphql.definitionMod.GraphQLNamedType
  */
  type AnyType[TContext] = typingsJapgolly.graphqlCompose.schemaComposerMod._AnyType[TContext] | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | typingsJapgolly.graphql.definitionMod.GraphQLNamedType
  type GraphQLToolsResolveMethods[TContext] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* source */ js.Any, 
        /* args */ js.Object, 
        /* context */ TContext, 
        /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
        js.Any
      ]
    ]
  ]
}
