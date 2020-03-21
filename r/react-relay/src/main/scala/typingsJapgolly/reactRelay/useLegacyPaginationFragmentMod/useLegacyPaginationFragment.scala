package typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod

import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useLegacyPaginationFragment", "useLegacyPaginationFragment")
@js.native
object useLegacyPaginationFragment extends js.Object {
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey, Call[KeyReturnType[TKey]]] = js.native
}

