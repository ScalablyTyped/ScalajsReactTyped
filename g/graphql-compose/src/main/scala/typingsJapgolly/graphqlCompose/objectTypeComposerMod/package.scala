package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectTypeComposerMod {
  type ArgsMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ComposeArgumentConfig = typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject | typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeArgumentType | (js.Function0[
    typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject | typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
  ])
  type ComposeArgumentType = typingsJapgolly.graphql.definitionMod.GraphQLInputType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | (js.Array[
    typingsJapgolly.graphql.definitionMod.GraphQLInputType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any]
  ])
  type ComposeFieldConfig[TSource, TContext, TArgs] = (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext]) | (typingsJapgolly.graphqlCompose.definitionsMod.Thunk[
    (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext])
  ])
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfig}
    */ typingsJapgolly.graphqlCompose.graphqlComposeStrings.ComposeFieldConfigArgumentMap with js.Any
  type ComposeFieldConfigMap[TSource, TContext] = typingsJapgolly.graphqlCompose.definitionsMod.ObjMap[
    typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeFieldConfig[TSource, TContext, typingsJapgolly.graphqlCompose.objectTypeComposerMod.ArgsMap]
  ]
  type ComposeObjectType = (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, js.Any]) | (typingsJapgolly.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLOutputType
    - typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]
    - typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
    - typingsJapgolly.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]
    - typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]
    - typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext]
    - js.Array[
  typingsJapgolly.graphql.definitionMod.GraphQLOutputType | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] | typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | (typingsJapgolly.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext])]
  */
  type ComposeOutputType[TReturn, TContext] = (typingsJapgolly.graphqlCompose.objectTypeComposerMod._ComposeOutputType[TReturn, TContext]) | (typingsJapgolly.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (js.Array[
    typingsJapgolly.graphql.definitionMod.GraphQLOutputType | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] | typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | (typingsJapgolly.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typingsJapgolly.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext])
  ]) | typingsJapgolly.graphql.definitionMod.GraphQLOutputType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, java.lang.String]
  type ObjectTypeComposeDefinition[TSource, TContext] = typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig[TSource, TContext]) | (typingsJapgolly.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  type RelationArgsMapper[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[js.Any] | (typingsJapgolly.graphqlCompose.objectTypeComposerMod.RelationArgsMapperFn[TSource, TContext, TArgs]) | scala.Null | scala.Unit | java.lang.String | scala.Double | js.Array[js.Any]
  ]
  type RelationArgsMapperFn[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type RelationThunkMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.graphqlCompose.definitionsMod.Thunk[
      typingsJapgolly.graphqlCompose.objectTypeComposerMod.RelationOpts[
        TSource, 
        TContext, 
        typingsJapgolly.graphqlCompose.objectTypeComposerMod.ArgsMap, 
        typingsJapgolly.graphqlCompose.objectTypeComposerMod.ArgsMap
      ]
    ]
  ]
}
