package typingsJapgolly.reactRelay

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.ElementType
import typingsJapgolly.react.mod.ClassicElement
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPoint
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps
import typingsJapgolly.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsJapgolly.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
import typingsJapgolly.reactRelay.relayEnvironmentProviderMod.Props
import typingsJapgolly.reactRelay.useBlockingPaginationFragmentMod.Call
import typingsJapgolly.reactRelay.useBlockingPaginationFragmentMod.KeyReturnType
import typingsJapgolly.reactRelay.useBlockingPaginationFragmentMod.KeyType
import typingsJapgolly.reactRelay.useBlockingPaginationFragmentMod.ReturnType
import typingsJapgolly.reactRelay.useFragmentMod.ArrayKeyReturnType
import typingsJapgolly.reactRelay.useFragmentMod.ArrayKeyType
import typingsJapgolly.relayRuntime.mod.Observable
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: Component[
    (EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
    js.Object
  ] */](hasEntryPointReferenceProps: AnonEntryPointReference[TEntryPointComponent, TRuntimeProps]): ClassicElement[ElementType] = js.native
  def LazyLoadEntryPointContainer[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps](
    hasEntryPointEntryPointParamsPropsEnvironmentProvider: EntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ): Element = js.native
  def RelayEnvironmentProvider(props: Props): Element = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: AnonNetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Null,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def prepareEntryPoint[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: Component[
    (EntryPointProps[
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]) with js.Object, 
    js.Object
  ] */, // tslint:disable-next-line no-unnecessary-generics
  TEntryPoint /* <: EntryPoint[TEntryPointParams, TEntryPointComponent] */](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions],
    // tslint:disable-next-line no-unnecessary-generics
  entryPoint: TEntryPoint,
    entryPointParams: TEntryPointParams
  ): PreloadedEntryPoint[TEntryPointComponent] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useFragment[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode): js.Array[typingsJapgolly.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  def useFragment[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[typingsJapgolly.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType_Array[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[typingsJapgolly.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType[TKey /* <: typingsJapgolly.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): typingsJapgolly.reactRelay.useFragmentMod.Call[typingsJapgolly.reactRelay.useFragmentMod.KeyReturnType[TKey]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType[TKey /* <: typingsJapgolly.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsJapgolly.reactRelay.useFragmentMod.Call[typingsJapgolly.reactRelay.useFragmentMod.KeyReturnType[TKey]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType_Call[TKey /* <: typingsJapgolly.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsJapgolly.reactRelay.useFragmentMod.Call[typingsJapgolly.reactRelay.useFragmentMod.KeyReturnType[TKey]] = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: AnonFetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.Call[typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.Call[typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: AnonData */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsJapgolly.reactRelay.useRefetchableFragmentMod.ReturnType[TQuery, TKey] = js.native
  def useRelayEnvironment(): typingsJapgolly.relayRuntime.mod.Environment = js.native
}

