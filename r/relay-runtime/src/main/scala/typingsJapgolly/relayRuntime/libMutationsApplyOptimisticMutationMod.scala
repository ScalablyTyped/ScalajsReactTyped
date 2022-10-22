package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutationsApplyOptimisticMutationMod {
  
  @JSImport("relay-runtime/lib/mutations/applyOptimisticMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait OptimisticMutationConfig extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.undefined
    
    var mutation: GraphQLTaggedNode
    
    var optimisticResponse: js.UndefOr[js.Object] = js.undefined
    
    var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
    
    var variables: Variables
  }
  object OptimisticMutationConfig {
    
    inline def apply(mutation: GraphQLTaggedNode, variables: Variables): OptimisticMutationConfig = {
      val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticMutationConfig]
    }
    
    extension [Self <: OptimisticMutationConfig](x: Self) {
      
      inline def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsNull: Self = StObject.set(x, "configs", null)
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setMutation(value: GraphQLTaggedNode): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
      
      inline def setMutationCallbackTo(value: CallbackTo[ReaderFragment | ConcreteRequest]): Self = StObject.set(x, "mutation", value.toJsFn)
      
      inline def setOptimisticResponse(value: js.Object): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      inline def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      inline def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
      
      inline def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      inline def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
