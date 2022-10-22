package typingsJapgolly.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.anon.Get
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod._GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationRootNode
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSelection
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderArgumentDefinition
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderSelection
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ActorChange
import typingsJapgolly.relayRuntime.relayRuntimeStrings.AliasedFragmentSpread
import typingsJapgolly.relayRuntime.relayRuntimeStrings.AliasedInlineFragmentSpread
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ClientComponent
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ClientEdgeToClientObject
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ClientEdgeToServerObject
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ClientExtension
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Condition
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Connection
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Defer
import typingsJapgolly.relayRuntime.relayRuntimeStrings.FlightField
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Fragment
import typingsJapgolly.relayRuntime.relayRuntimeStrings.FragmentSpread
import typingsJapgolly.relayRuntime.relayRuntimeStrings.InlineDataFragment
import typingsJapgolly.relayRuntime.relayRuntimeStrings.InlineDataFragmentSpread
import typingsJapgolly.relayRuntime.relayRuntimeStrings.InlineFragment
import typingsJapgolly.relayRuntime.relayRuntimeStrings.LinkedField
import typingsJapgolly.relayRuntime.relayRuntimeStrings.LinkedHandle
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ListValue
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Literal
import typingsJapgolly.relayRuntime.relayRuntimeStrings.LocalArgument
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ModuleImport
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ObjectValue
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Operation
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RelayLiveResolver
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RelayResolver
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Request
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RequiredField
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RootArgument
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ScalarField
import typingsJapgolly.relayRuntime.relayRuntimeStrings.ScalarHandle
import typingsJapgolly.relayRuntime.relayRuntimeStrings.SplitOperation
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Stream
import typingsJapgolly.relayRuntime.relayRuntimeStrings.TypeDiscriminator
import typingsJapgolly.relayRuntime.relayRuntimeStrings.UpdatableQuery
import typingsJapgolly.relayRuntime.relayRuntimeStrings.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilRelayConcreteNodeMod {
  
  object RelayConcreteNode {
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ACTOR_CHANGE")
    @js.native
    def ACTOR_CHANGE: ActorChange = js.native
    inline def ACTOR_CHANGE_=(x: ActorChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTOR_CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ALIASED_FRAGMENT_SPREAD")
    @js.native
    def ALIASED_FRAGMENT_SPREAD: AliasedFragmentSpread = js.native
    inline def ALIASED_FRAGMENT_SPREAD_=(x: AliasedFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIASED_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ALIASED_INLINE_FRAGMENT_SPREAD")
    @js.native
    def ALIASED_INLINE_FRAGMENT_SPREAD: AliasedInlineFragmentSpread = js.native
    inline def ALIASED_INLINE_FRAGMENT_SPREAD_=(x: AliasedInlineFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIASED_INLINE_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_COMPONENT")
    @js.native
    def CLIENT_COMPONENT: ClientComponent = js.native
    inline def CLIENT_COMPONENT_=(x: ClientComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_COMPONENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EDGE_TO_CLIENT_OBJECT")
    @js.native
    def CLIENT_EDGE_TO_CLIENT_OBJECT: ClientEdgeToClientObject = js.native
    inline def CLIENT_EDGE_TO_CLIENT_OBJECT_=(x: ClientEdgeToClientObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EDGE_TO_CLIENT_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EDGE_TO_SERVER_OBJECT")
    @js.native
    def CLIENT_EDGE_TO_SERVER_OBJECT: ClientEdgeToServerObject = js.native
    inline def CLIENT_EDGE_TO_SERVER_OBJECT_=(x: ClientEdgeToServerObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EDGE_TO_SERVER_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EXTENSION")
    @js.native
    def CLIENT_EXTENSION: ClientExtension = js.native
    inline def CLIENT_EXTENSION_=(x: ClientExtension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CONDITION")
    @js.native
    def CONDITION: Condition = js.native
    inline def CONDITION_=(x: Condition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CONNECTION")
    @js.native
    def CONNECTION: Connection = js.native
    inline def CONNECTION_=(x: Connection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.DEFER")
    @js.native
    def DEFER: Defer = js.native
    inline def DEFER_=(x: Defer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FLIGHT_FIELD")
    @js.native
    def FLIGHT_FIELD: FlightField = js.native
    inline def FLIGHT_FIELD_=(x: FlightField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLIGHT_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FRAGMENT")
    @js.native
    def FRAGMENT: Fragment = js.native
    inline def FRAGMENT_=(x: Fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FRAGMENT_SPREAD")
    @js.native
    def FRAGMENT_SPREAD: FragmentSpread = js.native
    inline def FRAGMENT_SPREAD_=(x: FragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_DATA_FRAGMENT")
    @js.native
    def INLINE_DATA_FRAGMENT: InlineDataFragment = js.native
    inline def INLINE_DATA_FRAGMENT_=(x: InlineDataFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_DATA_FRAGMENT_SPREAD")
    @js.native
    def INLINE_DATA_FRAGMENT_SPREAD: InlineDataFragmentSpread = js.native
    inline def INLINE_DATA_FRAGMENT_SPREAD_=(x: InlineDataFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_FRAGMENT")
    @js.native
    def INLINE_FRAGMENT: InlineFragment = js.native
    inline def INLINE_FRAGMENT_=(x: InlineFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LINKED_FIELD")
    @js.native
    def LINKED_FIELD: LinkedField = js.native
    inline def LINKED_FIELD_=(x: LinkedField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LINKED_HANDLE")
    @js.native
    def LINKED_HANDLE: LinkedHandle = js.native
    inline def LINKED_HANDLE_=(x: LinkedHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LIST_VALUE")
    @js.native
    def LIST_VALUE: ListValue = js.native
    inline def LIST_VALUE_=(x: ListValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LITERAL")
    @js.native
    def LITERAL: Literal = js.native
    inline def LITERAL_=(x: Literal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITERAL")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LOCAL_ARGUMENT")
    @js.native
    def LOCAL_ARGUMENT: LocalArgument = js.native
    inline def LOCAL_ARGUMENT_=(x: LocalArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.MODULE_IMPORT")
    @js.native
    def MODULE_IMPORT: ModuleImport = js.native
    inline def MODULE_IMPORT_=(x: ModuleImport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODULE_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.OBJECT_VALUE")
    @js.native
    def OBJECT_VALUE: ObjectValue = js.native
    inline def OBJECT_VALUE_=(x: ObjectValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.OPERATION")
    @js.native
    def OPERATION: Operation = js.native
    inline def OPERATION_=(x: Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.RELAY_LIVE_RESOLVER")
    @js.native
    def RELAY_LIVE_RESOLVER: RelayLiveResolver = js.native
    inline def RELAY_LIVE_RESOLVER_=(x: RelayLiveResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELAY_LIVE_RESOLVER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.RELAY_RESOLVER")
    @js.native
    def RELAY_RESOLVER: RelayResolver = js.native
    inline def RELAY_RESOLVER_=(x: RelayResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELAY_RESOLVER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.REQUEST")
    @js.native
    def REQUEST: Request = js.native
    inline def REQUEST_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.REQUIRED_FIELD")
    @js.native
    def REQUIRED_FIELD: RequiredField = js.native
    inline def REQUIRED_FIELD_=(x: RequiredField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ROOT_ARGUMENT")
    @js.native
    def ROOT_ARGUMENT: RootArgument = js.native
    inline def ROOT_ARGUMENT_=(x: RootArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SCALAR_FIELD")
    @js.native
    def SCALAR_FIELD: ScalarField = js.native
    inline def SCALAR_FIELD_=(x: ScalarField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SCALAR_HANDLE")
    @js.native
    def SCALAR_HANDLE: ScalarHandle = js.native
    inline def SCALAR_HANDLE_=(x: ScalarHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SPLIT_OPERATION")
    @js.native
    def SPLIT_OPERATION: SplitOperation = js.native
    inline def SPLIT_OPERATION_=(x: SplitOperation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPLIT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.STREAM")
    @js.native
    def STREAM: Stream = js.native
    inline def STREAM_=(x: Stream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.TYPE_DISCRIMINATOR")
    @js.native
    def TYPE_DISCRIMINATOR: TypeDiscriminator = js.native
    inline def TYPE_DISCRIMINATOR_=(x: TypeDiscriminator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_DISCRIMINATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.UPDATABLE_QUERY")
    @js.native
    def UPDATABLE_QUERY: UpdatableQuery = js.native
    inline def UPDATABLE_QUERY_=(x: UpdatableQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATABLE_QUERY")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.VARIABLE")
    @js.native
    def VARIABLE: Variable = js.native
    inline def VARIABLE_=(x: Variable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VARIABLE")(x.asInstanceOf[js.Any])
  }
  
  trait ConcreteRequest
    extends StObject
       with GeneratedNode
       with NormalizationRootNode
       with _GraphQLTaggedNode {
    
    // 'Request';
    val fragment: ReaderFragment
    
    val kind: String
    
    val operation: NormalizationOperation
    
    val params: RequestParameters
  }
  object ConcreteRequest {
    
    inline def apply(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteRequest]
    }
    
    extension [Self <: ConcreteRequest](x: Self) {
      
      inline def setFragment(value: ReaderFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: NormalizationOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConcreteUpdatableQuery
    extends StObject
       with GeneratedNode {
    
    // 'UpdatableQuery';
    val fragment: ReaderFragment
    
    val kind: String
  }
  object ConcreteUpdatableQuery {
    
    inline def apply(fragment: ReaderFragment, kind: String): ConcreteUpdatableQuery = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteUpdatableQuery]
    }
    
    extension [Self <: ConcreteUpdatableQuery](x: Self) {
      
      inline def setFragment(value: ReaderFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
    - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
    - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
    - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
    - typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteUpdatableQuery
  */
  trait GeneratedNode extends StObject
  object GeneratedNode {
    
    inline def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
    }
    
    inline def ConcreteUpdatableQuery(fragment: ReaderFragment, kind: String): typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteUpdatableQuery = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteUpdatableQuery]
    }
    
    inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation]
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
    
    inline def ReaderInlineDataFragment(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment]
    }
  }
  
  type ProvidedVariablesType = StringDictionary[Get]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.anon.Id
    - typingsJapgolly.relayRuntime.anon.CacheID
  */
  trait RequestParameters extends StObject
  object RequestParameters {
    
    inline def CacheID(cacheID: String, id: Null, metadata: StringDictionary[Any], name: String, operationKind: String): typingsJapgolly.relayRuntime.anon.CacheID = {
      val __obj = js.Dynamic.literal(cacheID = cacheID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = null)
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.CacheID]
    }
    
    inline def Id(id: String, metadata: StringDictionary[Any], name: String, operationKind: String, text: Null): typingsJapgolly.relayRuntime.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Id]
    }
  }
}
