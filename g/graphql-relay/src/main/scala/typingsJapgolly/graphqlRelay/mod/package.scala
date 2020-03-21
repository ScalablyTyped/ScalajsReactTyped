package typingsJapgolly.graphqlRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConnectionConfigNodeType = typingsJapgolly.graphqlRelay.mod.ConnectionConfigNodeTypeNullable | typingsJapgolly.graphql.definitionMod.GraphQLNonNull[typingsJapgolly.graphqlRelay.mod.ConnectionConfigNodeTypeNullable]
  type ConnectionConfigNodeTypeNullable = typingsJapgolly.graphql.mod.GraphQLScalarType | (typingsJapgolly.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphql.mod.GraphQLInterfaceType | typingsJapgolly.graphql.mod.GraphQLUnionType | typingsJapgolly.graphql.mod.GraphQLEnumType
  type ConnectionCursor = java.lang.String
  type mutationFn = js.Function3[
    /* object */ js.Any, 
    /* ctx */ js.Any, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    js.Promise[js.Any] | js.Any
  ]
  type typeResolverFn = js.Function1[
    /* any */ js.Any, 
    (typingsJapgolly.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Promise[
      typingsJapgolly.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ])
  ]
}
