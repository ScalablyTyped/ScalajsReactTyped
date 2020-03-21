package typingsJapgolly.apolloServerTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
      typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
      typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.document | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operationName | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operation | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.queryHash
    ], 
    typingsJapgolly.apolloServerTypes.mod.ValueOrPromise[typingsJapgolly.apolloServerTypes.mod.GraphQLExecutionResult]
  ]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.Mutable with T
  type ValidationRule = js.Function1[
    /* context */ typingsJapgolly.graphql.mod.ValidationContext, 
    typingsJapgolly.graphql.visitorMod.ASTVisitor
  ]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WithRequired[T, K /* <: java.lang.String */] = T with (typingsJapgolly.std.Required[typingsJapgolly.std.Pick[T, K]])
}
