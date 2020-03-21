package typingsJapgolly.apolloReactHoc

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.apolloReactCommon.typesMod.OperationVariables
import typingsJapgolly.apolloReactHoc.apolloReactHocStrings.client
import typingsJapgolly.apolloReactHoc.typesMod.ChildProps
import typingsJapgolly.apolloReactHoc.typesMod.OperationOption
import typingsJapgolly.apolloReactHoc.typesMod.WithApolloClient
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/withApollo", JSImport.Namespace)
@js.native
object withApolloMod extends js.Object {
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]]): ComponentClassP[(Omit[TProps, client]) with js.Object] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClassP[(Omit[TProps, client]) with js.Object] = js.native
}

