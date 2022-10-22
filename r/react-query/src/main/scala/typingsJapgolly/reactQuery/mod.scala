package typingsJapgolly.reactQuery

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactQuery.anon.OmitMutationFiltersmutati
import typingsJapgolly.reactQuery.reactQueryStrings.mutationFn
import typingsJapgolly.reactQuery.reactQueryStrings.mutationKey
import typingsJapgolly.reactQuery.reactQueryStrings.queryFn
import typingsJapgolly.reactQuery.reactQueryStrings.queryKey
import typingsJapgolly.reactQuery.typesCoreFocusManagerMod.FocusManager_
import typingsJapgolly.reactQuery.typesCoreHydrationMod.DehydrateOptions
import typingsJapgolly.reactQuery.typesCoreHydrationMod.DehydratedState
import typingsJapgolly.reactQuery.typesCoreHydrationMod.HydrateOptions
import typingsJapgolly.reactQuery.typesCoreLoggerMod.Logger
import typingsJapgolly.reactQuery.typesCoreMutationCacheMod.MutationCacheConfig
import typingsJapgolly.reactQuery.typesCoreMutationMod.MutationConfig
import typingsJapgolly.reactQuery.typesCoreNotifyManagerMod.NotifyManager_
import typingsJapgolly.reactQuery.typesCoreOnlineManagerMod.OnlineManager_
import typingsJapgolly.reactQuery.typesCoreQueryCacheMod.QueryCacheConfig
import typingsJapgolly.reactQuery.typesCoreQueryMod.QueryConfig
import typingsJapgolly.reactQuery.typesCoreTypesMod.CancelOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.InfiniteQueryObserverOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.MutationFunction
import typingsJapgolly.reactQuery.typesCoreTypesMod.MutationKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.MutationObserverOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryClientConfig
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryFunction
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryObserverOptions
import typingsJapgolly.reactQuery.typesCoreUtilsMod.MutationFilters
import typingsJapgolly.reactQuery.typesCoreUtilsMod.QueryFilters
import typingsJapgolly.reactQuery.typesReactHydrateMod.HydrateProps
import typingsJapgolly.reactQuery.typesReactQueryClientProviderMod.QueryClientProviderProps
import typingsJapgolly.reactQuery.typesReactQueryErrorResetBoundaryMod.QueryErrorResetBoundaryProps
import typingsJapgolly.reactQuery.typesReactQueryErrorResetBoundaryMod.QueryErrorResetBoundaryValue
import typingsJapgolly.reactQuery.typesReactTypesMod.UseInfiniteQueryOptions
import typingsJapgolly.reactQuery.typesReactTypesMod.UseInfiniteQueryResult
import typingsJapgolly.reactQuery.typesReactTypesMod.UseMutationOptions
import typingsJapgolly.reactQuery.typesReactTypesMod.UseMutationResult
import typingsJapgolly.reactQuery.typesReactTypesMod.UseQueryOptions
import typingsJapgolly.reactQuery.typesReactTypesMod.UseQueryResult
import typingsJapgolly.reactQuery.typesReactUseQueriesMod.QueriesResults
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-query", "CancelledError")
  @js.native
  open class CancelledError ()
    extends typingsJapgolly.reactQuery.typesCoreMod.CancelledError {
    def this(options: CancelOptions) = this()
  }
  
  inline def Hydrate_(hasChildrenOptionsState: HydrateProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Hydrate")(hasChildrenOptionsState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-query", "InfiniteQueryObserver")
  @js.native
  open class InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] protected ()
    extends typingsJapgolly.reactQuery.typesCoreMod.InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] {
    def this(
      client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient,
      options: InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, QueryKey]
    ) = this()
  }
  
  @JSImport("react-query", "Mutation")
  @js.native
  open class Mutation[TData, TError, TVariables, TContext] protected ()
    extends typingsJapgolly.reactQuery.typesCoreMod.Mutation[TData, TError, TVariables, TContext] {
    def this(config: MutationConfig[TData, TError, TVariables, TContext]) = this()
  }
  
  @JSImport("react-query", "MutationCache")
  @js.native
  open class MutationCache ()
    extends typingsJapgolly.reactQuery.typesCoreMod.MutationCache {
    def this(config: MutationCacheConfig) = this()
  }
  
  @JSImport("react-query", "MutationObserver")
  @js.native
  open class MutationObserver[TData, TError, TVariables, TContext] protected ()
    extends typingsJapgolly.reactQuery.typesCoreMod.MutationObserver[TData, TError, TVariables, TContext] {
    def this(
      client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient,
      options: MutationObserverOptions[TData, TError, TVariables, TContext]
    ) = this()
  }
  
  @JSImport("react-query", "QueriesObserver")
  @js.native
  open class QueriesObserver protected ()
    extends typingsJapgolly.reactQuery.typesCoreMod.QueriesObserver {
    def this(client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient) = this()
    def this(
      client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient,
      queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]]
    ) = this()
  }
  
  @JSImport("react-query", "Query")
  @js.native
  open class Query[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] protected ()
    extends typingsJapgolly.reactQuery.typesCoreMod.Query[TQueryFnData, TError, TData, TQueryKey] {
    def this(config: QueryConfig[TQueryFnData, TError, TData, TQueryKey]) = this()
  }
  
  @JSImport("react-query", "QueryCache")
  @js.native
  open class QueryCache ()
    extends typingsJapgolly.reactQuery.typesCoreMod.QueryCache {
    def this(config: QueryCacheConfig) = this()
  }
  
  @JSImport("react-query", "QueryClient")
  @js.native
  open class QueryClient ()
    extends typingsJapgolly.reactQuery.typesCoreMod.QueryClient {
    def this(config: QueryClientConfig) = this()
  }
  
  inline def QueryClientProvider(hasClientContextSharingChildren: QueryClientProviderProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryClientProvider")(hasClientContextSharingChildren.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def QueryErrorResetBoundary(hasChildren: QueryErrorResetBoundaryProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryErrorResetBoundary")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  @JSImport("react-query", "QueryObserver")
  @js.native
  open class QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] protected ()
    extends typingsJapgolly.reactQuery.typesCoreMod.QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey] {
    def this(
      client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient,
      options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
    ) = this()
  }
  
  inline def dehydrate(client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient): DehydratedState = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any]).asInstanceOf[DehydratedState]
  inline def dehydrate(client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient, options: DehydrateOptions): DehydratedState = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DehydratedState]
  
  @JSImport("react-query", "focusManager")
  @js.native
  val focusManager: FocusManager_ = js.native
  
  inline def hashQueryKey(queryKey: QueryKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKey")(queryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hydrate(client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient, dehydratedState: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(
    client: typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient,
    dehydratedState: Any,
    options: HydrateOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isCancelledError(value: Any): /* is react-query.react-query/types/core/retryer.CancelledError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelledError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-query.react-query/types/core/retryer.CancelledError */ Boolean]
  
  inline def isError(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  @JSImport("react-query", "notifyManager")
  @js.native
  val notifyManager: NotifyManager_ = js.native
  
  @JSImport("react-query", "onlineManager")
  @js.native
  val onlineManager: OnlineManager_ = js.native
  
  inline def setLogger(newLogger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(newLogger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useHydrate(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrate(state: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: String): UseInfiniteQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](
    queryKey: String,
    queryFn: QueryFunction[TQueryFnData, String],
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, String], 
      queryKey | queryFn
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): UseInfiniteQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, js.Array[Any]], 
      queryKey | queryFn
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, TQueryKey]): UseInfiniteQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(options.asInstanceOf[js.Any]).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  
  inline def useInfiniteQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: String,
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, String], 
      queryKey
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, js.Array[Any]], 
      queryKey
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  
  inline def useIsFetching(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")().asInstanceOf[Double]
  inline def useIsFetching(filters: QueryFilters): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(filters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsFetching(queryKey: Unit, filters: QueryFilters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useIsFetching(queryKey: QueryKey): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsFetching(queryKey: QueryKey, filters: QueryFilters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useIsMutating(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")().asInstanceOf[Double]
  inline def useIsMutating(filters: MutationFilters): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(filters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: Unit, filters: OmitMutationFiltersmutati): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: MutationKey): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: MutationKey, filters: OmitMutationFiltersmutati): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useMutation[TData, TError, TVariables, TContext](mutationFn: MutationFunction[TData, TVariables]): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationFn.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](mutationKey: MutationKey): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    mutationFn: Unit,
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey | mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](mutationKey: MutationKey, mutationFn: MutationFunction[TData, TVariables]): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    mutationFn: MutationFunction[TData, TVariables],
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey | mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](options: UseMutationOptions[TData, TError, TVariables, TContext]): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(options.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useMutation_mutationFn[TData, TError, TVariables, TContext](
    mutationFn: MutationFunction[TData, TVariables],
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useMutation_mutationKey[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useQueries[T /* <: js.Array[Any] */](
    queries: /* import warning: importer.ImportType#apply c repeated non-array type: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>], [...[], 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>], [...[], 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Any
    ]
  ): QueriesResults[T, js.Array[Any], js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueries")(queries.asInstanceOf[js.Any]).asInstanceOf[QueriesResults[T, js.Array[Any], js.Array[Any]]]
  
  inline def useQuery[TQueryFnData, TError, TData](queryKey: String): UseQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](
    queryKey: String,
    queryFn: QueryFunction[TQueryFnData, String],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, String], queryKey | queryFn]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): UseQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, js.Array[Any]], queryKey | queryFn]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: UseQueryOptions[TQueryFnData, TError, TData, TQueryKey]): UseQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(options.asInstanceOf[js.Any]).asInstanceOf[UseQueryResult[TData, TError]]
  
  inline def useQueryClient(): typingsJapgolly.reactQuery.typesCoreMod.QueryClient = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryClient")().asInstanceOf[typingsJapgolly.reactQuery.typesCoreMod.QueryClient]
  
  inline def useQueryErrorResetBoundary(): QueryErrorResetBoundaryValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryErrorResetBoundary")().asInstanceOf[QueryErrorResetBoundaryValue]
  
  inline def useQuery_queryKey[TQueryFnData, TError, TData](queryKey: String, options: Omit[UseQueryOptions[TQueryFnData, TError, TData, String], queryKey]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, js.Array[Any]], queryKey]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
}
