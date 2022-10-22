package typingsJapgolly.reactRelay

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.reactRelay.anon.CacheConfig
import typingsJapgolly.reactRelay.anon.ComponentRef
import typingsJapgolly.reactRelay.anon.Count
import typingsJapgolly.reactRelay.anon.Error
import typingsJapgolly.reactRelay.anon.PartialPageInfo
import typingsJapgolly.reactRelay.anon.Relay
import typingsJapgolly.reactRelay.anon.RelayRelayPaginationProp
import typingsJapgolly.reactRelay.anon.RelayRelayRefetchProp
import typingsJapgolly.reactRelay.reactRelayStrings.backward
import typingsJapgolly.reactRelay.reactRelayStrings.forward
import typingsJapgolly.reactRelay.reactRelayStrings.relay
import typingsJapgolly.reactRelay.reactRelayTypesMod.MappedFragmentProps
import typingsJapgolly.relayRuntime.libMutationsApplyOptimisticMutationMod.OptimisticMutationConfig
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationConfig
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreReadInlineDataMod.KeyType
import typingsJapgolly.relayRuntime.libStoreReadInlineDataMod.KeyTypeData
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.HandleFieldPayload
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RelayContext
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typingsJapgolly.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyMod {
  
  @JSImport("react-relay/legacy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ConnectionHandler {
    
    @JSImport("react-relay/legacy", "ConnectionHandler")
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
  
  @JSImport("react-relay/legacy", "LocalQueryRenderer")
  @js.native
  open class LocalQueryRenderer[TOperation /* <: OperationType */] ()
    extends Component[QueryRendererProps[TOperation], js.Object, Any]
  
  @JSImport("react-relay/legacy", "QueryRenderer")
  @js.native
  open class QueryRenderer[TOperation /* <: OperationType */] ()
    extends Component[CacheConfig & QueryRendererProps[TOperation], js.Object, Any]
  
  @JSImport("react-relay/legacy", "ReactRelayContext")
  @js.native
  val ReactRelayContext: Context[RelayContext | Null] = js.native
  
  inline def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def commitMutation[TOperation /* <: MutationParameters */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def createFragmentContainer(
    Component: ComponentClassP[ComponentProps[Any] & Relay & js.Object],
    fragmentSpec: Record[String, GraphQLTaggedNode]
  ): Container[PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & Relay & js.Object]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any])).asInstanceOf[Container[PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & Relay & js.Object]]]]
  inline def createFragmentContainer(
    Component: FunctionComponent[ComponentProps[Any] & Relay],
    fragmentSpec: Record[String, GraphQLTaggedNode]
  ): Container[PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & Relay]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any])).asInstanceOf[Container[PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & Relay]]]]
  
  inline def createPaginationContainer(
    Component: ComponentClassP[ComponentProps[Any] & RelayRelayPaginationProp & js.Object],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[
      PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & RelayRelayPaginationProp & js.Object]]
    ]
  ): Container[
    PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & RelayRelayPaginationProp & js.Object]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPaginationContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any], connectionConfig.asInstanceOf[js.Any])).asInstanceOf[Container[
    PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & RelayRelayPaginationProp & js.Object]]
  ]]
  inline def createPaginationContainer(
    Component: FunctionComponent[ComponentProps[Any] & RelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[
      PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & RelayRelayPaginationProp]]
    ]
  ): Container[
    PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & RelayRelayPaginationProp]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPaginationContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any], connectionConfig.asInstanceOf[js.Any])).asInstanceOf[Container[
    PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & RelayRelayPaginationProp]]
  ]]
  
  inline def createRefetchContainer(
    Component: ComponentClassP[ComponentProps[Any] & RelayRelayRefetchProp & js.Object],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[
    PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & RelayRelayRefetchProp & js.Object]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefetchContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any], refetchQuery.asInstanceOf[js.Any])).asInstanceOf[Container[
    PropsWithoutRelay[ComponentClassP[ComponentProps[Any] & RelayRelayRefetchProp & js.Object]]
  ]]
  inline def createRefetchContainer(
    Component: FunctionComponent[ComponentProps[Any] & RelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[
    PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & RelayRelayRefetchProp]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefetchContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any], refetchQuery.asInstanceOf[js.Any])).asInstanceOf[Container[
    PropsWithoutRelay[FunctionComponent[ComponentProps[Any] & RelayRelayRefetchProp]]
  ]]
  
  inline def fetchQueryDEPRECATED_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery_DEPRECATED")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  inline def fetchQueryDEPRECATED_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery_DEPRECATED")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  
  inline def graphql(strings: Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  
  inline def readInlineData_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  inline def requestSubscription[TSubscription /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait ConnectionConfig[Props] extends StObject {
    
    var direction: js.UndefOr[backward | forward] = js.undefined
    
    var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.undefined
    
    var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.undefined
    
    def getVariables(props: Props, paginationInfo: Count, fragmentVariables: Variables): Variables
    
    var query: GraphQLTaggedNode
  }
  object ConnectionConfig {
    
    inline def apply[Props](getVariables: (Props, Count, Variables) => Variables, query: GraphQLTaggedNode): ConnectionConfig[Props] = {
      val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionConfig[Props]]
    }
    
    extension [Self <: ConnectionConfig[?], Props](x: Self & ConnectionConfig[Props]) {
      
      inline def setDirection(value: backward | forward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetConnectionFromProps(value: /* props */ Props => js.UndefOr[ConnectionData | Null]): Self = StObject.set(x, "getConnectionFromProps", js.Any.fromFunction1(value))
      
      inline def setGetConnectionFromPropsUndefined: Self = StObject.set(x, "getConnectionFromProps", js.undefined)
      
      inline def setGetFragmentVariables(value: (/* prevVars */ Variables, /* totalCount */ Double) => Variables): Self = StObject.set(x, "getFragmentVariables", js.Any.fromFunction2(value))
      
      inline def setGetFragmentVariablesUndefined: Self = StObject.set(x, "getFragmentVariables", js.undefined)
      
      inline def setGetVariables(value: (Props, Count, Variables) => Variables): Self = StObject.set(x, "getVariables", js.Any.fromFunction3(value))
      
      inline def setQuery(value: GraphQLTaggedNode): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryCallbackTo(value: CallbackTo[ReaderFragment | ConcreteRequest]): Self = StObject.set(x, "query", value.toJsFn)
    }
  }
  
  trait ConnectionData extends StObject {
    
    var edges: js.UndefOr[js.Array[Any] | Null] = js.undefined
    
    var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.undefined
  }
  object ConnectionData {
    
    inline def apply(): ConnectionData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionData]
    }
    
    extension [Self <: ConnectionData](x: Self) {
      
      inline def setEdges(value: js.Array[Any]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesNull: Self = StObject.set(x, "edges", null)
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setEdgesVarargs(value: Any*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setPageInfo(value: PartialPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
      
      inline def setPageInfoNull: Self = StObject.set(x, "pageInfo", null)
      
      inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    }
  }
  
  type Container[Props] = ComponentType[ContainerProps[Props] & ComponentRef]
  
  type ContainerProps[Props] = MappedFragmentProps[Pick[Props, Exclude[/* keyof Props */ String, relay]]]
  
  type PropsWithoutRelay[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.reactRelay.reactRelayStrings.a, typingsJapgolly.reactRelay.reactRelayStrings.abbr, typingsJapgolly.reactRelay.reactRelayStrings.address */ Any */] = LibraryManagedAttributes[C, Omit[ComponentProps[C], relay]]
  
  trait QueryRendererProps[TOperation /* <: OperationType */] extends StObject {
    
    var environment: Environment
    
    var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
    
    def render(renderProps: Error[TOperation]): Node
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  }
  object QueryRendererProps {
    
    inline def apply[TOperation /* <: OperationType */](
      environment: Environment,
      render: Error[TOperation] => Node,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): QueryRendererProps[TOperation] = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryRendererProps[TOperation]]
    }
    
    extension [Self <: QueryRendererProps[?], TOperation /* <: OperationType */](x: Self & QueryRendererProps[TOperation]) {
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: GraphQLTaggedNode): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryCallbackTo(value: CallbackTo[ReaderFragment | ConcreteRequest]): Self = StObject.set(x, "query", value.toJsFn)
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRender(value: Error[TOperation] => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactRelayLocalQueryRenderer[TOperation /* <: OperationType */] = japgolly.scalajs.react.facade.React.Component[QueryRendererProps[TOperation] & js.Object, js.Object]
  
  type ReactRelayQueryRenderer[TOperation /* <: OperationType */] = japgolly.scalajs.react.facade.React.Component[CacheConfig & QueryRendererProps[TOperation] & js.Object, js.Object]
  
  type RelayFragmentContainer[TComponent /* <: ElementType */] = ComponentType[ContainerProps[ComponentPropsWithoutRef[TComponent]]]
  
  type RelayPaginationContainer[TComponent /* <: ElementType */] = ComponentType[ContainerProps[ComponentPropsWithoutRef[TComponent]]]
  
  type RelayProps[Props] = ContainerProps[Props]
  
  type RelayRefetchContainer[TComponent /* <: ElementType */] = ComponentType[ContainerProps[ComponentPropsWithoutRef[TComponent]]]
}
