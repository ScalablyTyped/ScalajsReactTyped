package typingsJapgolly.apolloReactHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildDataProps[TProps, TData, TGraphQLVariables] = TProps with (typingsJapgolly.apolloReactHoc.typesMod.DataProps[TData, TGraphQLVariables])
  type ChildMutateProps[TProps, TData, TGraphQLVariables] = TProps with (typingsJapgolly.apolloReactHoc.typesMod.MutateProps[TData, TGraphQLVariables])
  type ChildProps[TProps, TData, TGraphQLVariables] = TProps with (typingsJapgolly.std.Partial[typingsJapgolly.apolloReactHoc.typesMod.DataProps[TData, TGraphQLVariables]]) with (typingsJapgolly.std.Partial[typingsJapgolly.apolloReactHoc.typesMod.MutateProps[TData, TGraphQLVariables]])
  type DataValue[TData, TGraphQLVariables] = (typingsJapgolly.apolloReactHoc.typesMod.QueryControls[TData, TGraphQLVariables]) with typingsJapgolly.std.Partial[TData]
  type WithApolloClient[P] = P with typingsJapgolly.apolloReactHoc.AnonClient
}
