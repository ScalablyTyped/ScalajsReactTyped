package typingsJapgolly.apolloReactHooks

import typingsJapgolly.apolloReactCommon.typesMod.QueryResult
import typingsJapgolly.apolloReactHooks.typesMod.QueryHookOptions
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useQuery", JSImport.Namespace)
@js.native
object useQueryMod extends js.Object {
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
}

