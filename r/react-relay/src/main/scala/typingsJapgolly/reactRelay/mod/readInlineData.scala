package typingsJapgolly.reactRelay.mod

import typingsJapgolly.relayRuntime.mod.FragmentRef
import typingsJapgolly.relayRuntime.mod.RefType
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "readInlineData")
@js.native
object readInlineData extends js.Object {
  def apply[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def apply[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
}

