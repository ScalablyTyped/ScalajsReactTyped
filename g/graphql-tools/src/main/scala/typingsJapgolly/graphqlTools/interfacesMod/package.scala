package typingsJapgolly.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ typingsJapgolly.graphqlTools.interfacesMod.NextResolverFn, 
    /* source */ TSource, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type IConnector[TContext] = typingsJapgolly.graphqlTools.interfacesMod.IConnectorCls[TContext] | typingsJapgolly.graphqlTools.interfacesMod.IConnectorFn[TContext]
  type IConnectorFn[TContext] = js.Function1[/* context */ js.UndefOr[TContext], js.Any]
  type IConnectors[TContext] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphqlTools.interfacesMod.IConnector[TContext]]
  type IDirectiveResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.graphqlTools.interfacesMod.DirectiveResolverFn[TSource, TContext]
  ]
  type IEnumResolver = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ typingsJapgolly.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphqlTools.GraphQLResolveInfomergeIn, 
    js.Any
  ]
  type IMockFn = typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  type IMockTypeFn = js.Function3[
    /* type */ typingsJapgolly.graphql.definitionMod.GraphQLType, 
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type IMocks = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphqlTools.interfacesMod.IMockFn]
  type IResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    js.Function0[js.Any] | (typingsJapgolly.graphqlTools.interfacesMod.IResolverObject[TSource, TContext, js.Any]) | (typingsJapgolly.graphqlTools.interfacesMod.IResolverOptions[TSource, TContext, js.Any]) | typingsJapgolly.graphql.mod.GraphQLScalarType | typingsJapgolly.graphqlTools.interfacesMod.IEnumResolver
  ]
  type IResolversParameter = (js.Array[
    (typingsJapgolly.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
      /* mergeInfo */ typingsJapgolly.graphqlTools.interfacesMod.MergeInfo, 
      typingsJapgolly.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
    ])
  ]) | (typingsJapgolly.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
    /* mergeInfo */ typingsJapgolly.graphqlTools.interfacesMod.MergeInfo, 
    typingsJapgolly.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
  ])
  type ITypeDefinitions = typingsJapgolly.graphqlTools.interfacesMod.ITypedef | js.Array[typingsJapgolly.graphqlTools.interfacesMod.ITypedef]
  type ITypedef = (js.Function0[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef */ js.Object
    ]
  ]) | java.lang.String | typingsJapgolly.graphql.astMod.DocumentNode | typingsJapgolly.graphql.astMod.ASTNode
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type ResolveType[T /* <: typingsJapgolly.graphql.definitionMod.GraphQLType */] = js.Function1[/* type */ T, T]
  type UnitOrList[Type] = Type | js.Array[Type]
  type VisitType = js.Function2[
    /* name */ java.lang.String, 
    /* candidates */ js.Array[typingsJapgolly.graphqlTools.interfacesMod.MergeTypeCandidate], 
    typingsJapgolly.graphqlTools.interfacesMod.VisitTypeResult
  ]
  type VisitTypeResult = typingsJapgolly.graphql.definitionMod.GraphQLNamedType | typingsJapgolly.graphqlTools.interfacesMod.TypeWithResolvers | scala.Null
}
