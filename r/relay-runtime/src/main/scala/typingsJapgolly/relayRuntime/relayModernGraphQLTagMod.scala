package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderInlineDataFragment
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderPaginationFragment
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", JSImport.Namespace)
@js.native
object relayModernGraphQLTagMod extends js.Object {
  trait _GraphQLTaggedNode extends js.Object
  
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  def getNode(taggedNode: js.Any): js.Any = js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  def isFragment(node: GraphQLTaggedNode): Boolean = js.native
  def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = js.native
  def isRequest(node: GraphQLTaggedNode): Boolean = js.native
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
    - typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment | typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
}

