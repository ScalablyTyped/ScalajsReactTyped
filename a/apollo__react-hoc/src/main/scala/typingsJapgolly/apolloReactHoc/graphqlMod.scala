package typingsJapgolly.apolloReactHoc

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.apolloReactHoc.typesMod.OperationOption
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/graphql", JSImport.Namespace)
@js.native
object graphqlMod extends js.Object {
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
}

