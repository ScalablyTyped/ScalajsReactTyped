package typingsJapgolly.apolloReactHooks

import typingsJapgolly.apolloReactHooks.typesMod.MutationHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.MutationTuple
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useMutation", JSImport.Namespace)
@js.native
object useMutationMod extends js.Object {
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
}

