package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.mod.FragmentRef
import typingsJapgolly.relayRuntime.mod.RefType
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/readInlineData", JSImport.Namespace)
@js.native
object readInlineDataMod extends js.Object {
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
  @JSName("readInlineData")
  def readInlineData_T_RefTypeWildcard_Union[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
}

