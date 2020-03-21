package typingsJapgolly.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
    - typingsJapgolly.graphql.definitionMod.GraphQLUnionType
  */
  type GraphQLCompositeType = typingsJapgolly.graphql.definitionMod._GraphQLCompositeType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphql.definitionMod.GraphQLEnumValueConfig]
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphql.definitionMod.GraphQLArgumentConfig]
  type GraphQLFieldConfigMap[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.graphql.definitionMod.GraphQLFieldConfig[TSource, TContext, TArgs]
  ]
  type GraphQLFieldMap[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphql.definitionMod.GraphQLField[TSource, TContext, TArgs]]
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphql.definitionMod.GraphQLInputFieldConfig]
  type GraphQLInputFieldMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.graphql.definitionMod.GraphQLInputField]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLScalarType
    - typingsJapgolly.graphql.definitionMod.GraphQLEnumType
    - typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType
    - typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
    - typingsJapgolly.graphql.definitionMod.GraphQLNonNull[
  typingsJapgolly.graphql.definitionMod.GraphQLScalarType | typingsJapgolly.graphql.definitionMod.GraphQLEnumType | typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]]
  */
  type GraphQLInputType = typingsJapgolly.graphql.definitionMod._GraphQLInputType | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any] | (typingsJapgolly.graphql.definitionMod.GraphQLNonNull[
    typingsJapgolly.graphql.definitionMod.GraphQLScalarType | typingsJapgolly.graphql.definitionMod.GraphQLEnumType | typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
  ])
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue[scala.Boolean]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLScalarType
    - typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
    - typingsJapgolly.graphql.definitionMod.GraphQLUnionType
    - typingsJapgolly.graphql.definitionMod.GraphQLEnumType
    - typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType
  */
  type GraphQLNamedType = typingsJapgolly.graphql.definitionMod._GraphQLNamedType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLScalarType
    - typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
    - typingsJapgolly.graphql.definitionMod.GraphQLUnionType
    - typingsJapgolly.graphql.definitionMod.GraphQLEnumType
    - typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType
    - typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
  */
  type GraphQLNullableType = typingsJapgolly.graphql.definitionMod._GraphQLNullableType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLScalarType
    - typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
    - typingsJapgolly.graphql.definitionMod.GraphQLUnionType
    - typingsJapgolly.graphql.definitionMod.GraphQLEnumType
    - typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
    - typingsJapgolly.graphql.definitionMod.GraphQLNonNull[
  typingsJapgolly.graphql.definitionMod.GraphQLScalarType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType | typingsJapgolly.graphql.definitionMod.GraphQLUnionType | typingsJapgolly.graphql.definitionMod.GraphQLEnumType | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]]
  */
  type GraphQLOutputType = typingsJapgolly.graphql.definitionMod._GraphQLOutputType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any] | (typingsJapgolly.graphql.definitionMod.GraphQLNonNull[
    typingsJapgolly.graphql.definitionMod.GraphQLScalarType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType | typingsJapgolly.graphql.definitionMod.GraphQLUnionType | typingsJapgolly.graphql.definitionMod.GraphQLEnumType | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
  ])
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ typingsJapgolly.graphql.astMod.ValueNode, 
    /* variables */ typingsJapgolly.graphql.maybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    typingsJapgolly.graphql.maybeMod.Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, typingsJapgolly.graphql.maybeMod.Maybe[TExternal]]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, typingsJapgolly.graphql.maybeMod.Maybe[TInternal]]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.definitionMod.GraphQLScalarType
    - typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
    - typingsJapgolly.graphql.definitionMod.GraphQLUnionType
    - typingsJapgolly.graphql.definitionMod.GraphQLEnumType
    - typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType
    - typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any]
    - typingsJapgolly.graphql.definitionMod.GraphQLNonNull[js.Any]
  */
  type GraphQLType = typingsJapgolly.graphql.definitionMod._GraphQLType | (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any] | typingsJapgolly.graphql.definitionMod.GraphQLNonNull[js.Any]
  type GraphQLTypeResolver[TSource, TContext, TArgs] = js.Function4[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    /* abstractType */ typingsJapgolly.graphql.definitionMod.GraphQLAbstractType, 
    typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue[
      typingsJapgolly.graphql.maybeMod.Maybe[
        (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[TSource, TContext, TArgs]) | java.lang.String
      ]
    ]
  ]
  type GraphQLWrappingType = typingsJapgolly.graphql.definitionMod.GraphQLList[js.Any] | typingsJapgolly.graphql.definitionMod.GraphQLNonNull[js.Any]
  type Thunk[T] = js.Function0[T] | T
}
