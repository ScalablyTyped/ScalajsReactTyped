package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.anon.Readonlykindmissingfieldl
import typingsJapgolly.relayRuntime.anon.Readonlykindmissingfieldt
import typingsJapgolly.relayRuntime.anon.Readonlykindrelayresolver
import typingsJapgolly.relayRuntime.libHandlersRelayDefaultHandlerProviderMod.HandlerProvider
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.Network
import typingsJapgolly.relayRuntime.libStoreRelayModernQueryExecutorMod.TaskScheduler
import typingsJapgolly.relayRuntime.libStoreRelayResponseNormalizerMod.GetDataID
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogFunction
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationTracker
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RequiredFieldLogger
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Store
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayModernEnvironmentMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernEnvironment", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RelayModernEnvironment {
    def this(config: EnvironmentConfig) = this()
  }
  
  trait EnvironmentConfig extends StObject {
    
    val UNSTABLE_defaultRenderPolicy: js.UndefOr[RenderPolicy | Null] = js.undefined
    
    val configName: js.UndefOr[String] = js.undefined
    
    val getDataID: js.UndefOr[GetDataID | Null] = js.undefined
    
    val handlerProvider: js.UndefOr[HandlerProvider | Null] = js.undefined
    
    val isServer: js.UndefOr[Boolean] = js.undefined
    
    val log: js.UndefOr[LogFunction | Null] = js.undefined
    
    val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.undefined
    
    val network: Network
    
    val operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
    
    val operationTracker: js.UndefOr[OperationTracker | Null] = js.undefined
    
    val options: js.UndefOr[Any] = js.undefined
    
    val requiredFieldLogger: js.UndefOr[RequiredFieldLogger | Null] = js.undefined
    
    val scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
    
    val shouldProcessClientComponents: js.UndefOr[Boolean | Null] = js.undefined
    
    val store: Store
    
    val treatMissingFieldsAsNull: js.UndefOr[Boolean] = js.undefined
  }
  object EnvironmentConfig {
    
    inline def apply(network: Network, store: Store): EnvironmentConfig = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentConfig]
    }
    
    extension [Self <: EnvironmentConfig](x: Self) {
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      inline def setGetDataID(value: (/* fieldValue */ StringDictionary[Any], /* typeName */ String) => Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      inline def setGetDataIDNull: Self = StObject.set(x, "getDataID", null)
      
      inline def setGetDataIDUndefined: Self = StObject.set(x, "getDataID", js.undefined)
      
      inline def setHandlerProvider(value: /* handle */ String => Any): Self = StObject.set(x, "handlerProvider", js.Any.fromFunction1(value))
      
      inline def setHandlerProviderNull: Self = StObject.set(x, "handlerProvider", null)
      
      inline def setHandlerProviderUndefined: Self = StObject.set(x, "handlerProvider", js.undefined)
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      inline def setLog(value: /* logEvent */ LogEvent => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* logEvent */ LogEvent) => value(t0).runNow()))
      
      inline def setLogNull: Self = StObject.set(x, "log", null)
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "missingFieldHandlers", value.asInstanceOf[js.Any])
      
      inline def setMissingFieldHandlersNull: Self = StObject.set(x, "missingFieldHandlers", null)
      
      inline def setMissingFieldHandlersUndefined: Self = StObject.set(x, "missingFieldHandlers", js.undefined)
      
      inline def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "missingFieldHandlers", js.Array(value*))
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      inline def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
      
      inline def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
      
      inline def setOperationTracker(value: OperationTracker): Self = StObject.set(x, "operationTracker", value.asInstanceOf[js.Any])
      
      inline def setOperationTrackerNull: Self = StObject.set(x, "operationTracker", null)
      
      inline def setOperationTrackerUndefined: Self = StObject.set(x, "operationTracker", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRequiredFieldLogger(
        value: /* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt | Readonlykindrelayresolver => Callback
      ): Self = StObject.set(x, "requiredFieldLogger", js.Any.fromFunction1((t0: /* arg */ Readonlykindmissingfieldl | Readonlykindmissingfieldt | Readonlykindrelayresolver) => value(t0).runNow()))
      
      inline def setRequiredFieldLoggerNull: Self = StObject.set(x, "requiredFieldLogger", null)
      
      inline def setRequiredFieldLoggerUndefined: Self = StObject.set(x, "requiredFieldLogger", js.undefined)
      
      inline def setScheduler(value: TaskScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setSchedulerNull: Self = StObject.set(x, "scheduler", null)
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      inline def setShouldProcessClientComponents(value: Boolean): Self = StObject.set(x, "shouldProcessClientComponents", value.asInstanceOf[js.Any])
      
      inline def setShouldProcessClientComponentsNull: Self = StObject.set(x, "shouldProcessClientComponents", null)
      
      inline def setShouldProcessClientComponentsUndefined: Self = StObject.set(x, "shouldProcessClientComponents", js.undefined)
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingFieldsAsNull(value: Boolean): Self = StObject.set(x, "treatMissingFieldsAsNull", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingFieldsAsNullUndefined: Self = StObject.set(x, "treatMissingFieldsAsNull", js.undefined)
      
      inline def setUNSTABLE_defaultRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_defaultRenderPolicy", value.asInstanceOf[js.Any])
      
      inline def setUNSTABLE_defaultRenderPolicyNull: Self = StObject.set(x, "UNSTABLE_defaultRenderPolicy", null)
      
      inline def setUNSTABLE_defaultRenderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_defaultRenderPolicy", js.undefined)
    }
  }
  
  @js.native
  trait RelayModernEnvironment
    extends StObject
       with Environment {
    
    var configName: js.UndefOr[String | Null] = js.native
    
    def replaceUpdate(update: OptimisticUpdateFunction, newUpdate: OptimisticUpdateFunction): Unit = js.native
    
    def revertUpdate(update: OptimisticUpdateFunction): Unit = js.native
  }
}
