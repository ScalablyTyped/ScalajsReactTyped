package typingsJapgolly.subscriptionsTransportWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverMod {
  type ExecuteFunction = js.Function7[
    /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema, 
    /* document */ typingsJapgolly.graphql.astMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault] | (js.Promise[
      typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault]
    ]) | (typingsJapgolly.std.AsyncIterator[
      typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault], 
      js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ]
  type ExecutionIterator = typingsJapgolly.std.AsyncIterator[
    typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault], 
    js.Any, 
    js.UndefOr[scala.Nothing]
  ]
  type SubscribeFunction = js.Function8[
    /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema, 
    /* document */ typingsJapgolly.graphql.astMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    /* subscribeFieldResolver */ js.UndefOr[
      typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    (typingsJapgolly.std.AsyncIterator[
      typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault], 
      js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | (js.Promise[
      (typingsJapgolly.std.AsyncIterator[
        typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault], 
        js.Any, 
        js.UndefOr[scala.Nothing]
      ]) | typingsJapgolly.graphql.executeMod.ExecutionResult[typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault]
    ])
  ]
}
