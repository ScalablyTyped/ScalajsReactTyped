package typingsJapgolly.reactRelay

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactRelay.anon.EntryPointReference
import typingsJapgolly.reactRelay.anon.FetchKey
import typingsJapgolly.reactRelay.anon.FnCall
import typingsJapgolly.reactRelay.anon.UNSTABLErenderPolicy
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.IEnvironmentProvider
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.LoadQueryOptions
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadableConcreteRequest
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadedQuery
import typingsJapgolly.reactRelay.relayHooksHelpersMod.ArrayKeyType
import typingsJapgolly.reactRelay.relayHooksHelpersMod.ArrayKeyTypeData
import typingsJapgolly.reactRelay.relayHooksHelpersMod.GetEntryPointComponentFromEntryPoint
import typingsJapgolly.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import typingsJapgolly.reactRelay.relayHooksProfilerContextMod.ProfilerContextType
import typingsJapgolly.reactRelay.relayHooksRelayEnvironmentProviderDotreactMod.Props
import typingsJapgolly.reactRelay.relayHooksUseEntryPointLoaderMod.UseEntryPointLoaderHookType
import typingsJapgolly.reactRelay.relayHooksUseMutationMod.UseMutationConfig
import typingsJapgolly.reactRelay.relayHooksUsePaginationFragmentMod.usePaginationFragmentHookType
import typingsJapgolly.reactRelay.relayHooksUseQueryLoaderMod.useQueryLoaderHookType
import typingsJapgolly.reactRelay.relayHooksUseRefetchableFragmentMod.useRefetchableFragmentHookType
import typingsJapgolly.relayRuntime.anon.FetchPolicy
import typingsJapgolly.relayRuntime.libMutationsApplyOptimisticMutationMod.OptimisticMutationConfig
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationConfig
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreReadInlineDataMod.KeyType
import typingsJapgolly.relayRuntime.libStoreReadInlineDataMod.KeyTypeData
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.HandleFieldPayload
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typingsJapgolly.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-relay/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ConnectionHandler {
    
    @JSImport("react-relay/hooks", "ConnectionHandler")
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
  
  inline def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("EntryPointContainer")(hasEntryPointReferenceProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-relay/hooks", "ProfilerContext")
  @js.native
  val ProfilerContext: Context[ProfilerContextType] = js.native
  
  inline def RelayEnvironmentProvider(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayEnvironmentProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def commitMutation[TOperation /* <: MutationParameters */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  inline def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: FetchPolicy
  ): RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  
  inline def graphql(strings: Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  inline def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEntryPoint")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], entryPointParams.asInstanceOf[js.Any])).asInstanceOf[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]]]
  
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](environment: Environment, preloadableRequest: GraphQLTaggedNode, variables: VariablesOf[TQuery]): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  
  inline def readInlineData_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  inline def requestSubscription[TSubscription /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def useClientQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useClientQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def useClientQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: UNSTABLErenderPolicy): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useClientQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  inline def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEntryPointLoader")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[UseEntryPointLoaderHookType[TEntryPoint]]
  
  inline def useFragment[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(ArrayKeyTypeData[TKey, Any]) | Null]
  inline def useFragment[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(ArrayKeyTypeData[TKey, Any]) | Null]
  
  inline def useFragment_TKey_ArrayKeyTypeData[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ArrayKeyTypeData[TKey, Any]]
  
  inline def useFragment_TKey_KeyTypeData[TKey /* <: typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]]
  
  inline def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  inline def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  inline def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any], commitMutationFn.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  
  inline def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  inline def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  
  inline def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreloadedQuery")(gqlQuery.asInstanceOf[js.Any], preloadedQuery.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]],
    options: UNSTABLErenderPolicy
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreloadedQuery")(gqlQuery.asInstanceOf[js.Any], preloadedQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    initialQueryReference: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): useQueryLoaderHookType[TQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any], initialQueryReference.asInstanceOf[js.Any])).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](
    preloadableRequest: GraphQLTaggedNode,
    initialQueryReference: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): useQueryLoaderHookType[TQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any], initialQueryReference.asInstanceOf[js.Any])).asInstanceOf[useQueryLoaderHookType[TQuery]]
  
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  
  inline def useRelayEnvironment(): typingsJapgolly.relayRuntime.mod.Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("useRelayEnvironment")().asInstanceOf[typingsJapgolly.relayRuntime.mod.Environment]
  
  inline def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribeToInvalidationState")(dataIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any], requestSubscriptionFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
