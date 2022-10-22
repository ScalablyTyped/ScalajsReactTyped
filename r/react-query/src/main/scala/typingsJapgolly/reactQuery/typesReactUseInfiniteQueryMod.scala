package typingsJapgolly.reactQuery

import typingsJapgolly.reactQuery.reactQueryStrings.queryFn
import typingsJapgolly.reactQuery.reactQueryStrings.queryKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryFunction
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import typingsJapgolly.reactQuery.typesReactTypesMod.UseInfiniteQueryOptions
import typingsJapgolly.reactQuery.typesReactTypesMod.UseInfiniteQueryResult
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactUseInfiniteQueryMod {
  
  @JSImport("react-query/types/react/useInfiniteQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
