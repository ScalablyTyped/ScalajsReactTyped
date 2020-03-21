package typingsJapgolly.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Context[T] = T
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[
    /* context */ FunctionParams, 
    typingsJapgolly.apolloServerTypes.mod.ValueOrPromise[typingsJapgolly.apolloServerCore.typesMod.Context[ProducedContext]]
  ]
  type PluginDefinition = (typingsJapgolly.apolloServerPluginBase.mod.ApolloServerPlugin[typingsJapgolly.std.Record[java.lang.String, js.Any]]) | (js.Function0[
    typingsJapgolly.apolloServerPluginBase.mod.ApolloServerPlugin[typingsJapgolly.std.Record[java.lang.String, js.Any]]
  ])
  type SchemaChangeCallback = js.Function1[/* schema */ typingsJapgolly.graphql.mod.GraphQLSchema, scala.Unit]
  type Unsubscriber = js.Function0[scala.Unit]
}
