package typingsJapgolly.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.anon.CLIENTMUTATIONID
import typingsJapgolly.relayRuntime.anon.ConnectionPathInFragmentData
import typingsJapgolly.relayRuntime.anon.FetchPolicy
import typingsJapgolly.relayRuntime.anon.FragmentRefPathInResponse
import typingsJapgolly.relayRuntime.anon.GcReleaseBufferSize
import typingsJapgolly.relayRuntime.anon.PendingOperations
import typingsJapgolly.relayRuntime.anon.Size
import typingsJapgolly.relayRuntime.anon.Stop
import typingsJapgolly.relayRuntime.anon.TypeofRelayResolverFragme
import typingsJapgolly.relayRuntime.libMutationsApplyOptimisticMutationMod.OptimisticMutationConfig
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationConfig
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.ObservableFromValue
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.Source
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreReadInlineDataMod.KeyType
import typingsJapgolly.relayRuntime.libStoreReadInlineDataMod.KeyTypeData
import typingsJapgolly.relayRuntime.libStoreRelayModernEnvironmentMod.EnvironmentConfig
import typingsJapgolly.relayRuntime.libStoreRelayModernEnvironmentMod.default
import typingsJapgolly.relayRuntime.libStoreRelayModernRecordMod.RelayModernRecord
import typingsJapgolly.relayRuntime.libStoreRelayRecordSourceMod.RelayRecordSource
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.FragmentMap
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.FragmentSpecResolver
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.HandleFieldPayload
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Handler
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MissingRequiredFields
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Props
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReaderSelector
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordMap
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RelayContext
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RelayResolverErrors
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typingsJapgolly.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typingsJapgolly.relayRuntime.libUtilCreatePayloadFor3DFieldMod.Local3DPayload
import typingsJapgolly.relayRuntime.libUtilGetPaginationVariablesMod.Direction
import typingsJapgolly.relayRuntime.libUtilGetRequestIdentifierMod.RequestIdentifier
import typingsJapgolly.relayRuntime.libUtilJsresourcereferenceMod.JSResourceReference
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationField
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationHandle
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderField
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderPaginationFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderPaginationMetadata
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRefetchableFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ProvidedVariablesType
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsJapgolly.relayRuntime.libUtilRelayFeatureFlagsMod.FeatureFlags
import typingsJapgolly.relayRuntime.libUtilRelayProfilerMod.ProfileHandler
import typingsJapgolly.relayRuntime.libUtilRelayReplaySubjectMod.RelayReplaySubject
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
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

object mod {
  
  @JSImport("relay-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ConnectionHandler {
    
    @JSImport("relay-runtime", "ConnectionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConnectionEdge")(store.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    inline def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object], edge: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConnectionEdge")(store.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], edge.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    
    inline def createEdge(
      store: RecordSourceProxy,
      record: RecordProxy[js.Object],
      node: RecordProxy[js.Object],
      edgeType: String
    ): RecordProxy[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEdge")(store.asInstanceOf[js.Any], record.asInstanceOf[js.Any], node.asInstanceOf[js.Any], edgeType.asInstanceOf[js.Any])).asInstanceOf[RecordProxy[js.Object]]
    
    inline def deleteNode(record: RecordProxy[js.Object], nodeID: DataID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteNode")(record.asInstanceOf[js.Any], nodeID.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getConnection(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnection")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    inline def getConnection(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnection")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    
    inline def getConnectionID(recordID: DataID, key: String): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionID")(recordID.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[DataID]
    inline def getConnectionID(recordID: DataID, key: String, filters: Variables): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionID")(recordID.asInstanceOf[js.Any], key.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[DataID]
    
    inline def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeAfter")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeAfter")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeBefore")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeBefore")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def update(store: RecordSourceProxy, payload: HandleFieldPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(store.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object ConnectionInterface {
    
    @JSImport("relay-runtime", "ConnectionInterface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): CLIENTMUTATIONID = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[CLIENTMUTATIONID]
  }
  
  @JSImport("relay-runtime", "DEFAULT_HANDLE_KEY")
  @js.native
  val DEFAULT_HANDLE_KEY: /* "" */ String = js.native
  
  inline def DefaultHandlerProvider(handle: String): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultHandlerProvider")(handle.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("relay-runtime", "Environment")
  @js.native
  open class Environment protected () extends default {
    def this(config: EnvironmentConfig) = this()
  }
  
  @JSImport("relay-runtime", "FRAGMENTS_KEY")
  @js.native
  val FRAGMENTS_KEY: String = js.native
  
  @JSImport("relay-runtime", "FRAGMENT_OWNER_KEY")
  @js.native
  val FRAGMENT_OWNER_KEY: String = js.native
  
  @JSImport("relay-runtime", "ID_KEY")
  @js.native
  val ID_KEY: String = js.native
  
  object MutationHandlers {
    
    @JSImport("relay-runtime", "MutationHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime", "MutationHandlers.AppendEdgeHandler")
    @js.native
    def AppendEdgeHandler: Handler = js.native
    inline def AppendEdgeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AppendEdgeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "MutationHandlers.AppendNodeHandler")
    @js.native
    def AppendNodeHandler: Handler = js.native
    inline def AppendNodeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AppendNodeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "MutationHandlers.DeleteEdgeHandler")
    @js.native
    def DeleteEdgeHandler: Handler = js.native
    inline def DeleteEdgeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteEdgeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "MutationHandlers.DeleteRecordHandler")
    @js.native
    def DeleteRecordHandler: Handler = js.native
    inline def DeleteRecordHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteRecordHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "MutationHandlers.PrependEdgeHandler")
    @js.native
    def PrependEdgeHandler: Handler = js.native
    inline def PrependEdgeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrependEdgeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "MutationHandlers.PrependNodeHandler")
    @js.native
    def PrependNodeHandler: Handler = js.native
    inline def PrependNodeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrependNodeHandler")(x.asInstanceOf[js.Any])
  }
  
  object Network {
    
    @JSImport("relay-runtime", "Network")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(fetchFn: FetchFunction): typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.Network = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fetchFn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.Network]
    inline def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.Network = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fetchFn.asInstanceOf[js.Any], subscribeFn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.Network]
  }
  
  @JSImport("relay-runtime", "Observable")
  @js.native
  open class Observable[T] protected () extends RelayObservable[T] {
    // Use RelayObservable.create(source);
    /* private */ def this(source: scala.Nothing) = this()
  }
  /* static members */
  object Observable {
    
    @JSImport("relay-runtime", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[V](source: Source[V]): RelayObservable[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[RelayObservable[V]]
    
    /**
      * Accepts various kinds of data sources, and always returns a RelayObservable
      * useful for accepting the result of a user-provided FetchFunction.
      */
    inline def from[V](obj: ObservableFromValue[V]): RelayObservable[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[RelayObservable[V]]
    
    /**
      * When an emitted error event is not handled by an Observer, it is reported
      * to the host environment (what the ESObservable spec refers to as
      * "HostReportErrors()").
      *
      * The default implementation in development rethrows thrown errors, and
      * logs emitted error events to the console, while in production does nothing
      * (swallowing unhandled errors).
      *
      * Called during application initialization, this method allows
      * application-specific handling of unhandled errors. Allowing, for example,
      * integration with error logging or developer tools.
      *
      * A second parameter `isUncaughtThrownError` is true when the unhandled error
      * was thrown within an Observer handler, and false when the unhandled error
      * was an unhandled emitted event.
      *
      *  - Uncaught thrown errors typically represent avoidable errors thrown from
      *    application code, which should be handled with a try/catch block, and
      *    usually have useful stack traces.
      *
      *  - Unhandled emitted event errors typically represent unavoidable events in
      *    application flow such as network failure, and may not have useful
      *    stack traces.
      */
    inline def onUnhandledError(callback: js.Function2[/* error */ js.Error, /* isUncaughtThrownError */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUnhandledError")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("relay-runtime", "PreloadableQueryRegistry")
  @js.native
  open class PreloadableQueryRegistry ()
    extends typingsJapgolly.relayRuntime.libUtilPreloadableQueryRegistryMod.default
  
  @JSImport("relay-runtime", "QueryResponseCache")
  @js.native
  open class QueryResponseCache protected ()
    extends typingsJapgolly.relayRuntime.libNetworkRelayQueryResponseCacheMod.default {
    def this(config: Size) = this()
  }
  
  @JSImport("relay-runtime", "REFS_KEY")
  @js.native
  val REFS_KEY: String = js.native
  
  @JSImport("relay-runtime", "REF_KEY")
  @js.native
  val REF_KEY: String = js.native
  
  @JSImport("relay-runtime", "ROOT_ID")
  @js.native
  val ROOT_ID: String = js.native
  
  @JSImport("relay-runtime", "ROOT_TYPE")
  @js.native
  val ROOT_TYPE: String = js.native
  
  @JSImport("relay-runtime", "Record")
  @js.native
  open class Record () extends RelayModernRecord
  
  @JSImport("relay-runtime", "RecordSource")
  @js.native
  open class RecordSource () extends RelayRecordSource {
    def this(records: RecordMap) = this()
  }
  /* static members */
  object RecordSource {
    
    @JSImport("relay-runtime", "RecordSource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MutableRecordSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MutableRecordSource]
    inline def create(records: RecordMap): MutableRecordSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(records.asInstanceOf[js.Any]).asInstanceOf[MutableRecordSource]
  }
  
  object RelayConcreteNode {
    
    @JSImport("relay-runtime", "RelayConcreteNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime", "RelayConcreteNode.ACTOR_CHANGE")
    @js.native
    def ACTOR_CHANGE: ActorChange = js.native
    inline def ACTOR_CHANGE_=(x: ActorChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTOR_CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.ALIASED_FRAGMENT_SPREAD")
    @js.native
    def ALIASED_FRAGMENT_SPREAD: AliasedFragmentSpread = js.native
    inline def ALIASED_FRAGMENT_SPREAD_=(x: AliasedFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIASED_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.ALIASED_INLINE_FRAGMENT_SPREAD")
    @js.native
    def ALIASED_INLINE_FRAGMENT_SPREAD: AliasedInlineFragmentSpread = js.native
    inline def ALIASED_INLINE_FRAGMENT_SPREAD_=(x: AliasedInlineFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIASED_INLINE_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CLIENT_COMPONENT")
    @js.native
    def CLIENT_COMPONENT: ClientComponent = js.native
    inline def CLIENT_COMPONENT_=(x: ClientComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_COMPONENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CLIENT_EDGE_TO_CLIENT_OBJECT")
    @js.native
    def CLIENT_EDGE_TO_CLIENT_OBJECT: ClientEdgeToClientObject = js.native
    inline def CLIENT_EDGE_TO_CLIENT_OBJECT_=(x: ClientEdgeToClientObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EDGE_TO_CLIENT_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CLIENT_EDGE_TO_SERVER_OBJECT")
    @js.native
    def CLIENT_EDGE_TO_SERVER_OBJECT: ClientEdgeToServerObject = js.native
    inline def CLIENT_EDGE_TO_SERVER_OBJECT_=(x: ClientEdgeToServerObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EDGE_TO_SERVER_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CLIENT_EXTENSION")
    @js.native
    def CLIENT_EXTENSION: ClientExtension = js.native
    inline def CLIENT_EXTENSION_=(x: ClientExtension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CONDITION")
    @js.native
    def CONDITION: Condition = js.native
    inline def CONDITION_=(x: Condition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CONNECTION")
    @js.native
    def CONNECTION: Connection = js.native
    inline def CONNECTION_=(x: Connection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.DEFER")
    @js.native
    def DEFER: Defer = js.native
    inline def DEFER_=(x: Defer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.FLIGHT_FIELD")
    @js.native
    def FLIGHT_FIELD: FlightField = js.native
    inline def FLIGHT_FIELD_=(x: FlightField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLIGHT_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.FRAGMENT")
    @js.native
    def FRAGMENT: Fragment = js.native
    inline def FRAGMENT_=(x: Fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.FRAGMENT_SPREAD")
    @js.native
    def FRAGMENT_SPREAD: FragmentSpread = js.native
    inline def FRAGMENT_SPREAD_=(x: FragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.INLINE_DATA_FRAGMENT")
    @js.native
    def INLINE_DATA_FRAGMENT: InlineDataFragment = js.native
    inline def INLINE_DATA_FRAGMENT_=(x: InlineDataFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.INLINE_DATA_FRAGMENT_SPREAD")
    @js.native
    def INLINE_DATA_FRAGMENT_SPREAD: InlineDataFragmentSpread = js.native
    inline def INLINE_DATA_FRAGMENT_SPREAD_=(x: InlineDataFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.INLINE_FRAGMENT")
    @js.native
    def INLINE_FRAGMENT: InlineFragment = js.native
    inline def INLINE_FRAGMENT_=(x: InlineFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LINKED_FIELD")
    @js.native
    def LINKED_FIELD: LinkedField = js.native
    inline def LINKED_FIELD_=(x: LinkedField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LINKED_HANDLE")
    @js.native
    def LINKED_HANDLE: LinkedHandle = js.native
    inline def LINKED_HANDLE_=(x: LinkedHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LIST_VALUE")
    @js.native
    def LIST_VALUE: ListValue = js.native
    inline def LIST_VALUE_=(x: ListValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LITERAL")
    @js.native
    def LITERAL: Literal = js.native
    inline def LITERAL_=(x: Literal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITERAL")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LOCAL_ARGUMENT")
    @js.native
    def LOCAL_ARGUMENT: LocalArgument = js.native
    inline def LOCAL_ARGUMENT_=(x: LocalArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.MODULE_IMPORT")
    @js.native
    def MODULE_IMPORT: ModuleImport = js.native
    inline def MODULE_IMPORT_=(x: ModuleImport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODULE_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.OBJECT_VALUE")
    @js.native
    def OBJECT_VALUE: ObjectValue = js.native
    inline def OBJECT_VALUE_=(x: ObjectValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.OPERATION")
    @js.native
    def OPERATION: Operation = js.native
    inline def OPERATION_=(x: Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.RELAY_LIVE_RESOLVER")
    @js.native
    def RELAY_LIVE_RESOLVER: RelayLiveResolver = js.native
    inline def RELAY_LIVE_RESOLVER_=(x: RelayLiveResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELAY_LIVE_RESOLVER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.RELAY_RESOLVER")
    @js.native
    def RELAY_RESOLVER: RelayResolver = js.native
    inline def RELAY_RESOLVER_=(x: RelayResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELAY_RESOLVER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.REQUEST")
    @js.native
    def REQUEST: Request = js.native
    inline def REQUEST_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.REQUIRED_FIELD")
    @js.native
    def REQUIRED_FIELD: RequiredField = js.native
    inline def REQUIRED_FIELD_=(x: RequiredField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.ROOT_ARGUMENT")
    @js.native
    def ROOT_ARGUMENT: RootArgument = js.native
    inline def ROOT_ARGUMENT_=(x: RootArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.SCALAR_FIELD")
    @js.native
    def SCALAR_FIELD: ScalarField = js.native
    inline def SCALAR_FIELD_=(x: ScalarField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.SCALAR_HANDLE")
    @js.native
    def SCALAR_HANDLE: ScalarHandle = js.native
    inline def SCALAR_HANDLE_=(x: ScalarHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.SPLIT_OPERATION")
    @js.native
    def SPLIT_OPERATION: SplitOperation = js.native
    inline def SPLIT_OPERATION_=(x: SplitOperation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPLIT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.STREAM")
    @js.native
    def STREAM: Stream = js.native
    inline def STREAM_=(x: Stream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.TYPE_DISCRIMINATOR")
    @js.native
    def TYPE_DISCRIMINATOR: TypeDiscriminator = js.native
    inline def TYPE_DISCRIMINATOR_=(x: TypeDiscriminator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_DISCRIMINATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.UPDATABLE_QUERY")
    @js.native
    def UPDATABLE_QUERY: UpdatableQuery = js.native
    inline def UPDATABLE_QUERY_=(x: UpdatableQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATABLE_QUERY")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.VARIABLE")
    @js.native
    def VARIABLE: Variable = js.native
    inline def VARIABLE_=(x: Variable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VARIABLE")(x.asInstanceOf[js.Any])
  }
  
  object RelayError {
    
    @JSImport("relay-runtime", "RelayError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(name: String, messageFormat: String, messageParams: (String | Double | Boolean)*): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((scala.List(name.asInstanceOf[js.Any], messageFormat.asInstanceOf[js.Any])).`++`(messageParams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Error]
    
    inline def createWarning(name: String, messageFormat: String, messageParams: (String | Double | Boolean)*): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarning")((scala.List(name.asInstanceOf[js.Any], messageFormat.asInstanceOf[js.Any])).`++`(messageParams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Error]
  }
  
  @JSImport("relay-runtime", "RelayFeatureFlags")
  @js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  
  object RelayProfiler {
    
    @JSImport("relay-runtime", "RelayProfiler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Attaches a handler to all methods instrumented with the supplied name.
      *
      *   function createRenderer() {
      *     return RelayProfiler.instrument('render', function() {...});
      *   }
      *   const renderA = createRenderer();
      *   const renderB = createRenderer();
      *
      *   // Only profiles `renderA`.
      *   renderA.attachHandler(...);
      *
      *   // Profiles both `renderA` and `renderB`.
      *   RelayProfiler.attachAggregateHandler('render', ...);
      *
      */
    inline def attachAggregateHandler(name: String, handler: typingsJapgolly.relayRuntime.libUtilRelayProfilerMod.Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachAggregateHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Attaches a handler to profiles with the supplied name. You can also
      * attach to the special name '*' which is a catch all.
      */
    inline def attachProfileHandler(name: String, handler: ProfileHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProfileHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Detaches a handler attached via `attachAggregateHandler`.
      */
    inline def detachAggregateHandler(name: String, handler: typingsJapgolly.relayRuntime.libUtilRelayProfilerMod.Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachAggregateHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Detaches a handler attached via `attachProfileHandler`.
      */
    inline def detachProfileHandler(name: String, handler: ProfileHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachProfileHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wraps the supplied function with one that provides the `attachHandler` and
      * `detachHandler` methods. Example usage:
      *
      *   const printRelayQuery =
      *     RelayProfiler.instrument('printRelayQuery', printRelayQuery);
      *
      *   printRelayQuery.attachHandler(...);
      *
      * NOTE: The instrumentation assumes that no handlers are attached or detached
      * in the course of executing another handler.
      */
    inline def instrument[T /* <: js.Function0[Unit] */](name: String, originalFunction: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(name.asInstanceOf[js.Any], originalFunction.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Instruments methods on a class or object. This re-assigns the method in
      * order to preserve function names in stack traces (which are detected by
      * modern debuggers via heuristics). Example usage:
      *
      *   const RelayStore = { primeCache: function() {...} };
      *   RelayProfiler.instrumentMethods(RelayStore, {
      *     primeCache: 'RelayStore.primeCache'
      *   });
      *
      *   RelayStore.primeCache.attachHandler(...);
      *
      * As a result, the methods will be replaced by wrappers that provide the
      * `attachHandler` and `detachHandler` methods.
      */
    inline def instrumentMethods(`object`: js.Function0[Unit | js.Object], names: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instrumentMethods")(`object`.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Instruments profiling for arbitrarily asynchronous code by a name.
      *
      *   const timerProfiler = RelayProfiler.profile('timeout');
      *   setTimeout(function() {
      *     timerProfiler.stop();
      *   }, 1000);
      *
      *   RelayProfiler.attachProfileHandler('timeout', ...);
      *
      * Arbitrary state can also be passed into `profile` as a second argument. The
      * attached profile handlers will receive this as the second argument.
      */
    inline def profile(name: String): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(name.asInstanceOf[js.Any]).asInstanceOf[Stop]
    inline def profile(name: String, state: Any): Stop = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(name.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Stop]
  }
  
  @JSImport("relay-runtime", "ReplaySubject")
  @js.native
  open class ReplaySubject[T] () extends RelayReplaySubject[T]
  
  @JSImport("relay-runtime", "Store")
  @js.native
  open class Store protected ()
    extends typingsJapgolly.relayRuntime.libStoreRelayModernStoreMod.default {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
  }
  
  @JSImport("relay-runtime", "TYPENAME_KEY")
  @js.native
  val TYPENAME_KEY: String = js.native
  
  @JSImport("relay-runtime", "VIEWER_ID")
  @js.native
  val VIEWER_ID: DataID = js.native
  
  @JSImport("relay-runtime", "VIEWER_TYPE")
  @js.native
  val VIEWER_TYPE: /* "Viewer" */ String = js.native
  
  @JSImport("relay-runtime", "__internal")
  @js.native
  val _Internal: Internal = js.native
  
  inline def applyOptimisticMutation(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    config: OptimisticMutationConfig
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def areEqualSelectors(thisSelector: SingularReaderSelector, thatSelector: SingularReaderSelector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqualSelectors")(thisSelector.asInstanceOf[js.Any], thatSelector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def commitLocalUpdate(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    updater: StoreUpdater
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def commitMutation[TOperation /* <: MutationParameters */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentSpecResolver")(context.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[FragmentSpecResolver]
  inline def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentSpecResolver")(context.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], props.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FragmentSpecResolver]
  
  inline def createNormalizationSelector(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createNormalizationSelector")(node.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[NormalizationSelector]
  
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Null, dataID: DataID): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Unit, dataID: DataID): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig, dataID: DataID): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  
  inline def createPayloadFor3DField[DocumentName /* <: String */, Response /* <: js.Object */](
    name: DocumentName,
    operation: JSResourceReference[NormalizationSplitOperation],
    component: JSResourceReference[Any],
    response: Response
  ): Local3DPayload[DocumentName, Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPayloadFor3DField")(name.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], component.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Local3DPayload[DocumentName, Response]]
  
  inline def createReaderSelector(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createReaderSelector")(fragment.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[SingularReaderSelector]
  inline def createReaderSelector(
    fragment: ReaderFragment,
    dataID: DataID,
    variables: Variables,
    request: RequestDescriptor,
    isWithinUnmatchedTypeRefinement: Boolean
  ): SingularReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("createReaderSelector")(fragment.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], request.asInstanceOf[js.Any], isWithinUnmatchedTypeRefinement.asInstanceOf[js.Any])).asInstanceOf[SingularReaderSelector]
  
  inline def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createRequestDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RequestDescriptor]
  inline def createRequestDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): RequestDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createRequestDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[RequestDescriptor]
  
  inline def deepFreeze[T /* <: js.Object */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepFreeze")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def fetchQueryDEPRECATED_variables[T /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery_DEPRECATED")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  inline def fetchQueryDEPRECATED_variables[T /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery_DEPRECATED")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  
  inline def fetchQuery_variables[T /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  inline def fetchQuery_variables[T /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: FetchPolicy
  ): RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  
  inline def generateClientID(id: DataID, storageKey: String): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("generateClientID")(id.asInstanceOf[js.Any], storageKey.asInstanceOf[js.Any])).asInstanceOf[DataID]
  inline def generateClientID(id: DataID, storageKey: String, index: Double): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("generateClientID")(id.asInstanceOf[js.Any], storageKey.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[DataID]
  
  inline def generateUniqueClientID(): DataID = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUniqueClientID")().asInstanceOf[DataID]
  
  inline def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Array[Any]): DataID | js.Array[DataID] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataIDsFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[DataID | js.Array[DataID]]
  inline def getDataIDsFromFragment(fragment: ReaderFragment, item: Any): DataID | js.Array[DataID] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataIDsFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[DataID | js.Array[DataID]]
  
  inline def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[Any]): StringDictionary[DataID | js.Array[DataID]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataIDsFromObject")(fragments.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[DataID | js.Array[DataID]]]
  
  inline def getDefaultMissingFieldHandlers(): js.Array[MissingFieldHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMissingFieldHandlers")().asInstanceOf[js.Array[MissingFieldHandler]]
  
  inline def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderFragment]
  
  inline def getFragmentIdentifier(fragmentNode: ReaderFragment, fragmentRef: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentIdentifier")(fragmentNode.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("getInlineDataFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderInlineDataFragment]
  
  inline def getModuleComponentKey(documentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleComponentKey")(documentName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getModuleOperationKey(documentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleOperationKey")(documentName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNode(taggedNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderPaginationFragment | Null]
  
  inline def getPaginationMetadata(fragmentNode: ReaderFragment, componentDisplayName: String): ConnectionPathInFragmentData = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationMetadata")(fragmentNode.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[ConnectionPathInFragmentData]
  
  inline def getPaginationVariables(
    direction: Direction,
    count: Double,
    cursor: String,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationVariables")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def getPaginationVariables(
    direction: Direction,
    count: Double,
    cursor: Null,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationVariables")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def getPaginationVariables(
    direction: Direction,
    count: Double,
    cursor: Unit,
    baseVariables: Variables,
    extraVariables: Variables,
    paginationMetadata: ReaderPaginationMetadata
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationVariables")(direction.asInstanceOf[js.Any], count.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], baseVariables.asInstanceOf[js.Any], extraVariables.asInstanceOf[js.Any], paginationMetadata.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def getPendingOperationsForFragment(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    fragmentNode: ReaderFragment,
    fragmentOwner: RequestDescriptor
  ): PendingOperations | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPendingOperationsForFragment")(environment.asInstanceOf[js.Any], fragmentNode.asInstanceOf[js.Any], fragmentOwner.asInstanceOf[js.Any])).asInstanceOf[PendingOperations | Null]
  
  inline def getPluralSelector(fragment: ReaderFragment, items: js.Array[Any]): PluralReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getPluralSelector")(fragment.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[PluralReaderSelector]
  
  inline def getRefetchMetadata(fragmentNode: ReaderFragment, componentDisplayName: String): FragmentRefPathInResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("getRefetchMetadata")(fragmentNode.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[FragmentRefPathInResponse]
  
  inline def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefetchableFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderRefetchableFragment | Null]
  
  inline def getRelayHandleKey(handleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelayHandleKey")(handleName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getRelayHandleKey(handleName: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelayHandleKey")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRelayHandleKey(handleName: String, key: String, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelayHandleKey")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRelayHandleKey(handleName: String, key: Null, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelayHandleKey")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRelayHandleKey(handleName: String, key: Unit, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelayHandleKey")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ConcreteRequest]
  
  inline def getRequestIdentifier(parameters: RequestParameters, variables: Variables): RequestIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestIdentifier")(parameters.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RequestIdentifier]
  
  inline def getSelector(fragment: ReaderFragment, item: js.Array[Any]): ReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ReaderSelector]
  inline def getSelector(fragment: ReaderFragment, item: Any): ReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ReaderSelector]
  
  inline def getSelectorsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[Any]): StringDictionary[ReaderSelector] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectorsFromObject")(fragments.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ReaderSelector]]
  
  inline def getSingularSelector(fragment: ReaderFragment, item: Any): SingularReaderSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingularSelector")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[SingularReaderSelector]
  
  inline def getStorageKey(field: NormalizationField, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorageKey")(field.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStorageKey(field: NormalizationHandle, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorageKey")(field.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStorageKey(field: ReaderField, variables: Variables): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorageKey")(field.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getValueAtPath(data: Any, path: js.Array[String | Double]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueAtPath")(data.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getVariablesFromFragment(fragment: ReaderFragment, item: js.Array[Any]): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Variables]
  inline def getVariablesFromFragment(fragment: ReaderFragment, item: Any): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def getVariablesFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[Any]): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromObject")(fragments.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def getVariablesFromPluralFragment(fragment: ReaderFragment, items: js.Array[Any]): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromPluralFragment")(fragment.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def getVariablesFromSingularFragment(fragment: ReaderFragment, item: Any): Variables = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariablesFromSingularFragment")(fragment.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Variables]
  
  inline def graphql(strings: Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  inline def handlePotentialSnapshotErrors(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    missingRequiredFields: Null,
    relayResolverErrors: RelayResolverErrors
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handlePotentialSnapshotErrors")(environment.asInstanceOf[js.Any], missingRequiredFields.asInstanceOf[js.Any], relayResolverErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def handlePotentialSnapshotErrors(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    missingRequiredFields: Unit,
    relayResolverErrors: RelayResolverErrors
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handlePotentialSnapshotErrors")(environment.asInstanceOf[js.Any], missingRequiredFields.asInstanceOf[js.Any], relayResolverErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def handlePotentialSnapshotErrors(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    missingRequiredFields: MissingRequiredFields,
    relayResolverErrors: RelayResolverErrors
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handlePotentialSnapshotErrors")(environment.asInstanceOf[js.Any], missingRequiredFields.asInstanceOf[js.Any], relayResolverErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isClientID(id: DataID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClientID")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFragment(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInlineDataFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(p: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  inline def isRelayModernEnvironment(environment: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelayModernEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRequest(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScalarAndEqual(valueA: Any, valueB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScalarAndEqual")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  
  inline def readInlineData_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  inline def recycleNodesInto[T](prevData: T, nextData: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("recycleNodesInto")(prevData.asInstanceOf[js.Any], nextData.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def requestSubscription[TSubscription /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def stableCopy[T /* <: Any */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("stableCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Fragment extends relay-runtime.relay-runtime._RefType<infer U> ? relay-runtime.relay-runtime._FragmentRefs<U> : never
    }}}
    */
  @js.native
  trait FragmentRef[Fragment] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ ref in Refs ]: true}
    }}}
    */
  @js.native
  trait FragmentRefs[Refs /* <: String */] extends StObject
  
  trait Internal extends StObject {
    
    var ResolverFragments: TypeofRelayResolverFragme
    
    def fetchQuery(
      environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
      operation: OperationDescriptor
    ): RelayObservable[GraphQLResponse]
    
    def fetchQueryDeduped(
      environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
      request: RequestDescriptor,
      fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
    ): RelayObservable[GraphQLResponse]
    @JSName("fetchQueryDeduped")
    var fetchQueryDeduped_Original: js.Function3[
        /* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, 
        /* request */ RequestDescriptor, 
        /* fetchFn */ js.Function0[RelayObservable[GraphQLResponse]], 
        RelayObservable[GraphQLResponse]
      ]
    
    @JSName("fetchQuery")
    var fetchQuery_Original: js.Function2[
        /* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, 
        /* operation */ OperationDescriptor, 
        RelayObservable[GraphQLResponse]
      ]
    
    def getObservableForActiveRequest(
      environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
      request: RequestDescriptor
    ): RelayObservable[Unit] | Null
    @JSName("getObservableForActiveRequest")
    var getObservableForActiveRequest_Original: js.Function2[
        /* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, 
        /* request */ RequestDescriptor, 
        RelayObservable[Unit] | Null
      ]
    
    def getPromiseForActiveRequest(
      environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
      request: RequestDescriptor
    ): js.Promise[Unit] | Null
    @JSName("getPromiseForActiveRequest")
    var getPromiseForActiveRequest_Original: js.Function2[
        /* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, 
        /* request */ RequestDescriptor, 
        js.Promise[Unit] | Null
      ]
    
    def withProvidedVariables(userSuppliedVariables: Variables): Variables
    def withProvidedVariables(userSuppliedVariables: Variables, providedVariables: ProvidedVariablesType): Variables
    @JSName("withProvidedVariables")
    var withProvidedVariables_Original: js.Function2[
        /* userSuppliedVariables */ Variables, 
        /* providedVariables */ js.UndefOr[ProvidedVariablesType | Null], 
        Variables
      ]
  }
  object Internal {
    
    inline def apply(
      ResolverFragments: TypeofRelayResolverFragme,
      fetchQuery: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* operation */ OperationDescriptor) => RelayObservable[GraphQLResponse],
      fetchQueryDeduped: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* request */ RequestDescriptor, /* fetchFn */ js.Function0[RelayObservable[GraphQLResponse]]) => RelayObservable[GraphQLResponse],
      getObservableForActiveRequest: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* request */ RequestDescriptor) => RelayObservable[Unit] | Null,
      getPromiseForActiveRequest: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* request */ RequestDescriptor) => js.Promise[Unit] | Null,
      withProvidedVariables: (/* userSuppliedVariables */ Variables, /* providedVariables */ js.UndefOr[ProvidedVariablesType | Null]) => Variables
    ): Internal = {
      val __obj = js.Dynamic.literal(ResolverFragments = ResolverFragments.asInstanceOf[js.Any], fetchQuery = js.Any.fromFunction2(fetchQuery), fetchQueryDeduped = js.Any.fromFunction3(fetchQueryDeduped), getObservableForActiveRequest = js.Any.fromFunction2(getObservableForActiveRequest), getPromiseForActiveRequest = js.Any.fromFunction2(getPromiseForActiveRequest), withProvidedVariables = js.Any.fromFunction2(withProvidedVariables))
      __obj.asInstanceOf[Internal]
    }
    
    extension [Self <: Internal](x: Self) {
      
      inline def setFetchQuery(
        value: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* operation */ OperationDescriptor) => RelayObservable[GraphQLResponse]
      ): Self = StObject.set(x, "fetchQuery", js.Any.fromFunction2(value))
      
      inline def setFetchQueryDeduped(
        value: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* request */ RequestDescriptor, /* fetchFn */ js.Function0[RelayObservable[GraphQLResponse]]) => RelayObservable[GraphQLResponse]
      ): Self = StObject.set(x, "fetchQueryDeduped", js.Any.fromFunction3(value))
      
      inline def setGetObservableForActiveRequest(
        value: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* request */ RequestDescriptor) => RelayObservable[Unit] | Null
      ): Self = StObject.set(x, "getObservableForActiveRequest", js.Any.fromFunction2(value))
      
      inline def setGetPromiseForActiveRequest(
        value: (/* environment */ typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment, /* request */ RequestDescriptor) => js.Promise[Unit] | Null
      ): Self = StObject.set(x, "getPromiseForActiveRequest", js.Any.fromFunction2(value))
      
      inline def setResolverFragments(value: TypeofRelayResolverFragme): Self = StObject.set(x, "ResolverFragments", value.asInstanceOf[js.Any])
      
      inline def setWithProvidedVariables(
        value: (/* userSuppliedVariables */ Variables, /* providedVariables */ js.UndefOr[ProvidedVariablesType | Null]) => Variables
      ): Self = StObject.set(x, "withProvidedVariables", js.Any.fromFunction2(value))
    }
  }
  
  trait RefType[Ref /* <: String */] extends StObject {
    
    @JSName(" $fragmentType")
    var Space$fragmentType: Ref
  }
  object RefType {
    
    inline def apply[Ref /* <: String */](Space$fragmentType: Ref): RefType[Ref] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $fragmentType")(Space$fragmentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefType[Ref]]
    }
    
    extension [Self <: RefType[?], Ref /* <: String */](x: Self & RefType[Ref]) {
      
      inline def setSpace$fragmentType(value: Ref): Self = StObject.set(x, " $fragmentType", value.asInstanceOf[js.Any])
    }
  }
  
  trait _FragmentRefs[Refs /* <: String */] extends StObject {
    
    @JSName(" $fragmentSpreads")
    var Space$fragmentSpreads: FragmentRefs[Refs]
  }
  object _FragmentRefs {
    
    inline def apply[Refs /* <: String */](Space$fragmentSpreads: FragmentRefs[Refs]): _FragmentRefs[Refs] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $fragmentSpreads")(Space$fragmentSpreads.asInstanceOf[js.Any])
      __obj.asInstanceOf[_FragmentRefs[Refs]]
    }
    
    extension [Self <: _FragmentRefs[?], Refs /* <: String */](x: Self & _FragmentRefs[Refs]) {
      
      inline def setSpace$fragmentSpreads(value: FragmentRefs[Refs]): Self = StObject.set(x, " $fragmentSpreads", value.asInstanceOf[js.Any])
    }
  }
}
