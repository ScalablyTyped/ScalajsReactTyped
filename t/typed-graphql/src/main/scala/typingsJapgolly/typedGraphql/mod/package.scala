package typingsJapgolly.typedGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.GraphQLEnumValueConfig]
  // error/*.js
  type GraphQLError = js.Error
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.GraphQLArgumentConfig]
  type GraphQLFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.GraphQLFieldConfig]
  type GraphQLFieldConfigMapThunk = js.Function0[typingsJapgolly.typedGraphql.mod.GraphQLFieldConfigMap]
  type GraphQLFieldDefinitionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.GraphQLFieldDefinition]
  type GraphQLFieldResolveFn = js.Function4[
    /* source */ js.Any, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ js.Any, 
    /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInterfacesThunk = js.Function0[js.Array[typingsJapgolly.typedGraphql.mod.GraphQLInterfaceType]]
  type GraphQLIsTypeOfFn = js.Function3[
    /* source */ js.Any, 
    /* context */ js.Any, 
    /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo, 
    scala.Boolean
  ]
  type GraphQLTypeResolveFn = js.Function3[
    /* value */ js.Any, 
    /* context */ js.Any, 
    /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo, 
    typingsJapgolly.typedGraphql.mod.GraphQLObjectType
  ]
  type InputObjectConfigFieldMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.InputObjectFieldConfig]
  type InputObjectConfigFieldMapThunk = js.Function0[typingsJapgolly.typedGraphql.mod.InputObjectConfigFieldMap]
  type InputObjectFieldMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.InputObjectField]
  type Lexer = js.Function1[
    /* resetPosition */ js.UndefOr[scala.Double], 
    typingsJapgolly.typedGraphql.mod.Token
  ]
  type TokenKind = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type TypeKind = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TypeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.typedGraphql.mod.GraphQLType]
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ typingsJapgolly.typedGraphql.mod.ValidationContext, js.Any]
}
