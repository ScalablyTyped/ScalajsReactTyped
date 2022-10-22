package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderArgumentDefinition
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderPaginationFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRefetchableFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderSelection
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueryRelayModernGraphQLTagMod {
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderFragment]
  
  inline def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("getInlineDataFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderInlineDataFragment]
  
  inline def getNode(taggedNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderPaginationFragment | Null]
  
  inline def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefetchableFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderRefetchableFragment | Null]
  
  inline def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ConcreteRequest]
  
  inline def graphql(strings: Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  inline def isFragment(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInlineDataFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRequest(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
    - typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment | typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
  
  trait _GraphQLTaggedNode extends StObject
  object _GraphQLTaggedNode {
    
    inline def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
    }
    
    inline def ReaderFragment(
      argumentDefinitions: js.Array[ReaderArgumentDefinition],
      kind: String,
      name: String,
      selections: js.Array[ReaderSelection],
      `type`: String
    ): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment = {
      val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment]
    }
  }
}
