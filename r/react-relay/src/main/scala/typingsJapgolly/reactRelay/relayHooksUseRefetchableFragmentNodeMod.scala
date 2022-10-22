package typingsJapgolly.reactRelay

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typingsJapgolly.std.Partial
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseRefetchableFragmentNodeMod {
  
  @JSImport("react-relay/relay-hooks/useRefetchableFragmentNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefetchableFragmentNode[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */](fragmentNode: ReaderFragment, parentFragmentRef: Any, componentDisplayName: String): // tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragmentNode")(fragmentNode.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactRelay.anon.Environment
    - typingsJapgolly.reactRelay.anon.FetchPolicy
  */
  trait Action extends StObject
  object Action {
    
    inline def Environment(
      environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
      fragmentIdentifier: String
    ): typingsJapgolly.reactRelay.anon.Environment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reset")
      __obj.asInstanceOf[typingsJapgolly.reactRelay.anon.Environment]
    }
    
    inline def FetchPolicy(refetchVariables: Variables): typingsJapgolly.reactRelay.anon.FetchPolicy = {
      val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("refetch")
      __obj.asInstanceOf[typingsJapgolly.reactRelay.anon.FetchPolicy]
    }
  }
  
  trait DebugIDandTypename extends StObject {
    
    var id: String
    
    var typename: String
  }
  object DebugIDandTypename {
    
    inline def apply(id: String, typename: String): DebugIDandTypename = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typename = typename.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugIDandTypename]
    }
    
    extension [Self <: DebugIDandTypename](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTypename(value: String): Self = StObject.set(x, "typename", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalOptions
    extends StObject
       with Options {
    
    var __environment: js.UndefOr[Environment] = js.undefined
  }
  object InternalOptions {
    
    inline def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    extension [Self <: InternalOptions](x: Self) {
      
      inline def set__environment(value: Environment): Self = StObject.set(x, "__environment", value.asInstanceOf[js.Any])
      
      inline def set__environmentUndefined: Self = StObject.set(x, "__environment", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setOnComplete(value: /* arg */ js.Error | Null => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: /* arg */ js.Error | Null) => value(t0).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
      
      inline def setUNSTABLE_renderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_renderPolicy", js.undefined)
    }
  }
  
  type RefetchExact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[Any | Null], RefetchFnExact[TQuery, TOptions]]
  
  type RefetchExactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchExact[TQuery, TOptions]]
  
  type RefetchFn[TQuery /* <: OperationType */, TOptions] = RefetchFnExact[TQuery, TOptions]
  
  type RefetchFnBase[TVars, TOptions] = js.Function2[/* vars */ TVars, /* options */ js.UndefOr[TOptions], Disposable]
  
  type RefetchFnDynamic[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */, TOptions] = (RefetchInexactDynamicResponse[TQuery, TOptions]) & (RefetchExactDynamicResponse[TQuery, TOptions])
  
  type RefetchFnExact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[VariablesOf[TQuery], TOptions]
  
  type RefetchFnInexact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[Partial[VariablesOf[TQuery]], TOptions]
  
  type RefetchInexact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[Any], RefetchFnInexact[TQuery, TOptions]]
  
  type RefetchInexactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchInexact[TQuery, TOptions]]
  
  trait RefetchState extends StObject {
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
    
    var mirroredEnvironment: Environment
    
    var mirroredFragmentIdentifier: String
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
    
    var refetchEnvironment: js.UndefOr[Environment | Null] = js.undefined
    
    var refetchGeneration: Double
    
    var refetchVariables: js.UndefOr[Variables | Null] = js.undefined
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  }
  object RefetchState {
    
    inline def apply(mirroredEnvironment: Environment, mirroredFragmentIdentifier: String, refetchGeneration: Double): RefetchState = {
      val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any], refetchGeneration = refetchGeneration.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefetchState]
    }
    
    extension [Self <: RefetchState](x: Self) {
      
      inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setMirroredEnvironment(value: Environment): Self = StObject.set(x, "mirroredEnvironment", value.asInstanceOf[js.Any])
      
      inline def setMirroredFragmentIdentifier(value: String): Self = StObject.set(x, "mirroredFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setOnComplete(value: /* arg */ js.Error | Null => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: /* arg */ js.Error | Null) => value(t0).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setRefetchEnvironment(value: Environment): Self = StObject.set(x, "refetchEnvironment", value.asInstanceOf[js.Any])
      
      inline def setRefetchEnvironmentNull: Self = StObject.set(x, "refetchEnvironment", null)
      
      inline def setRefetchEnvironmentUndefined: Self = StObject.set(x, "refetchEnvironment", js.undefined)
      
      inline def setRefetchGeneration(value: Double): Self = StObject.set(x, "refetchGeneration", value.asInstanceOf[js.Any])
      
      inline def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
      
      inline def setRefetchVariablesNull: Self = StObject.set(x, "refetchVariables", null)
      
      inline def setRefetchVariablesUndefined: Self = StObject.set(x, "refetchVariables", js.undefined)
      
      inline def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      inline def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
    }
  }
  
  trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */, TOptions] extends StObject {
    
    def disableStoreUpdates(): Unit
    
    def enableStoreUpdates(): Unit
    
    var fragmentData: Any
    
    var fragmentRef: Any
    
    var refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  }
  object ReturnTypeNode {
    
    inline def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */, TOptions](
      disableStoreUpdates: Callback,
      enableStoreUpdates: Callback,
      fragmentData: Any,
      fragmentRef: Any,
      refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
    ): ReturnTypeNode[TQuery, TKey, TOptions] = {
      val __obj = js.Dynamic.literal(disableStoreUpdates = disableStoreUpdates.toJsFn, enableStoreUpdates = enableStoreUpdates.toJsFn, fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
    }
    
    extension [Self <: ReturnTypeNode[?, ?, ?], TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */, TOptions](x: Self & (ReturnTypeNode[TQuery, TKey, TOptions])) {
      
      inline def setDisableStoreUpdates(value: Callback): Self = StObject.set(x, "disableStoreUpdates", value.toJsFn)
      
      inline def setEnableStoreUpdates(value: Callback): Self = StObject.set(x, "enableStoreUpdates", value.toJsFn)
      
      inline def setFragmentData(value: Any): Self = StObject.set(x, "fragmentData", value.asInstanceOf[js.Any])
      
      inline def setFragmentRef(value: Any): Self = StObject.set(x, "fragmentRef", value.asInstanceOf[js.Any])
      
      inline def setRefetch(value: RefetchFnDynamic[TQuery, TKey, TOptions]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
