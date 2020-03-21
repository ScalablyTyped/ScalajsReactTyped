package typingsJapgolly.apollographqlApolloTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolveObjectMod {
  type GraphQLObjectResolver[TSource, TContext] = js.Function4[
    /* source */ TSource, 
    /* fields */ typingsJapgolly.std.Record[java.lang.String, js.Array[typingsJapgolly.graphql.astMod.FieldNode]], 
    /* context */ TContext, 
    /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
}
