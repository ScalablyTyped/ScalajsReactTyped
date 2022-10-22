package typingsJapgolly.reactQuery

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactQuery.typesCoreMutationMod.Mutation
import typingsJapgolly.reactQuery.typesCoreMutationMod.MutationState
import typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient
import typingsJapgolly.reactQuery.typesCoreSubscribableMod.Subscribable
import typingsJapgolly.reactQuery.typesCoreTypesMod.MutationOptions
import typingsJapgolly.reactQuery.typesCoreUtilsMod.MutationFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreMutationCacheMod {
  
  @JSImport("react-query/types/core/mutationCache", "MutationCache")
  @js.native
  open class MutationCache () extends Subscribable[MutationCacheListener] {
    def this(config: MutationCacheConfig) = this()
    
    def add(mutation: Mutation[Any, Any, Any, Any]): Unit = js.native
    
    def build[TData, TError, TVariables, TContext](client: QueryClient, options: MutationOptions[TData, TError, TVariables, TContext]): Mutation[TData, TError, TVariables, TContext] = js.native
    def build[TData, TError, TVariables, TContext](
      client: QueryClient,
      options: MutationOptions[TData, TError, TVariables, TContext],
      state: MutationState[TData, TError, TVariables, TContext]
    ): Mutation[TData, TError, TVariables, TContext] = js.native
    
    def clear(): Unit = js.native
    
    var config: MutationCacheConfig = js.native
    
    def find[TData, TError, TVariables, TContext](filters: MutationFilters): js.UndefOr[Mutation[TData, TError, TVariables, TContext]] = js.native
    
    def findAll(filters: MutationFilters): js.Array[Mutation[Any, Any, Unit, Any]] = js.native
    
    def getAll(): js.Array[Mutation[Any, Any, Unit, Any]] = js.native
    
    /* private */ var mutationId: Any = js.native
    
    /* private */ var mutations: Any = js.native
    
    def notify(mutation: Mutation[Any, Any, Any, Any]): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onOnline(): Unit = js.native
    
    def remove(mutation: Mutation[Any, Any, Any, Any]): Unit = js.native
    
    def resumePausedMutations(): js.Promise[Unit] = js.native
  }
  
  trait MutationCacheConfig extends StObject {
    
    var onError: js.UndefOr[
        js.Function4[
          /* error */ Any, 
          /* variables */ Any, 
          /* context */ Any, 
          /* mutation */ Mutation[Any, Any, Any, Any], 
          Unit
        ]
      ] = js.undefined
    
    var onMutate: js.UndefOr[
        js.Function2[/* variables */ Any, /* mutation */ Mutation[Any, Any, Any, Any], Unit]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function4[
          /* data */ Any, 
          /* variables */ Any, 
          /* context */ Any, 
          /* mutation */ Mutation[Any, Any, Any, Any], 
          Unit
        ]
      ] = js.undefined
  }
  object MutationCacheConfig {
    
    inline def apply(): MutationCacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutationCacheConfig]
    }
    
    extension [Self <: MutationCacheConfig](x: Self) {
      
      inline def setOnError(
        value: (/* error */ Any, /* variables */ Any, /* context */ Any, /* mutation */ Mutation[Any, Any, Any, Any]) => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4((t0: /* error */ Any, t1: /* variables */ Any, t2: /* context */ Any, t3: /* mutation */ Mutation[Any, Any, Any, Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnMutate(value: (/* variables */ Any, /* mutation */ Mutation[Any, Any, Any, Any]) => Callback): Self = StObject.set(x, "onMutate", js.Any.fromFunction2((t0: /* variables */ Any, t1: /* mutation */ Mutation[Any, Any, Any, Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnMutateUndefined: Self = StObject.set(x, "onMutate", js.undefined)
      
      inline def setOnSuccess(
        value: (/* data */ Any, /* variables */ Any, /* context */ Any, /* mutation */ Mutation[Any, Any, Any, Any]) => Callback
      ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction4((t0: /* data */ Any, t1: /* variables */ Any, t2: /* context */ Any, t3: /* mutation */ Mutation[Any, Any, Any, Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  type MutationCacheListener = js.Function1[/* mutation */ js.UndefOr[Mutation[Any, Any, Unit, Any]], Unit]
}
