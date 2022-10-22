package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.ReactFlightServerTree
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.Sink
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationTracker
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticResponseConfig
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.PublishQueue
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReactFlightClientResponse
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.ReactFlightPayloadDeserializer
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Store
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayModernQueryExecutorMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernQueryExecutor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def execute(config: ExecuteConfig): Executor = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(config.asInstanceOf[js.Any]).asInstanceOf[Executor]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.active
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.inactive
  */
  trait ActiveState extends StObject
  object ActiveState {
    
    inline def active: typingsJapgolly.relayRuntime.relayRuntimeStrings.active = "active".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.active]
    
    inline def inactive: typingsJapgolly.relayRuntime.relayRuntimeStrings.inactive = "inactive".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.inactive]
  }
  
  trait ExecuteConfig extends StObject {
    
    def getDataID(fieldValue: StringDictionary[Any], typeName: String): Any
    
    val isClientPayload: js.UndefOr[Boolean] = js.undefined
    
    val operation: OperationDescriptor
    
    val operationExecutions: Map[String, ActiveState]
    
    val operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
    
    val operationTracker: js.UndefOr[OperationTracker | Null] = js.undefined
    
    val optimisticConfig: js.UndefOr[OptimisticResponseConfig[Any] | Null] = js.undefined
    
    val publishQueue: PublishQueue
    
    val reactFlightPayloadDeserializer: js.UndefOr[ReactFlightPayloadDeserializer | Null] = js.undefined
    
    val scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
    
    val sink: Sink[GraphQLResponse]
    
    val source: RelayObservable[GraphQLResponse]
    
    val store: Store
    
    val treatMissingFieldsAsNull: Boolean
    
    val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  }
  object ExecuteConfig {
    
    inline def apply(
      getDataID: (StringDictionary[Any], String) => Any,
      operation: OperationDescriptor,
      operationExecutions: Map[String, ActiveState],
      publishQueue: PublishQueue,
      sink: Sink[GraphQLResponse],
      source: RelayObservable[GraphQLResponse],
      store: Store,
      treatMissingFieldsAsNull: Boolean
    ): ExecuteConfig = {
      val __obj = js.Dynamic.literal(getDataID = js.Any.fromFunction2(getDataID), operation = operation.asInstanceOf[js.Any], operationExecutions = operationExecutions.asInstanceOf[js.Any], publishQueue = publishQueue.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], treatMissingFieldsAsNull = treatMissingFieldsAsNull.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteConfig]
    }
    
    extension [Self <: ExecuteConfig](x: Self) {
      
      inline def setGetDataID(value: (StringDictionary[Any], String) => Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      inline def setIsClientPayload(value: Boolean): Self = StObject.set(x, "isClientPayload", value.asInstanceOf[js.Any])
      
      inline def setIsClientPayloadUndefined: Self = StObject.set(x, "isClientPayload", js.undefined)
      
      inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationExecutions(value: Map[String, ActiveState]): Self = StObject.set(x, "operationExecutions", value.asInstanceOf[js.Any])
      
      inline def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      inline def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
      
      inline def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
      
      inline def setOperationTracker(value: OperationTracker): Self = StObject.set(x, "operationTracker", value.asInstanceOf[js.Any])
      
      inline def setOperationTrackerNull: Self = StObject.set(x, "operationTracker", null)
      
      inline def setOperationTrackerUndefined: Self = StObject.set(x, "operationTracker", js.undefined)
      
      inline def setOptimisticConfig(value: OptimisticResponseConfig[Any]): Self = StObject.set(x, "optimisticConfig", value.asInstanceOf[js.Any])
      
      inline def setOptimisticConfigNull: Self = StObject.set(x, "optimisticConfig", null)
      
      inline def setOptimisticConfigUndefined: Self = StObject.set(x, "optimisticConfig", js.undefined)
      
      inline def setPublishQueue(value: PublishQueue): Self = StObject.set(x, "publishQueue", value.asInstanceOf[js.Any])
      
      inline def setReactFlightPayloadDeserializer(value: /* tree */ ReactFlightServerTree => ReactFlightClientResponse): Self = StObject.set(x, "reactFlightPayloadDeserializer", js.Any.fromFunction1(value))
      
      inline def setReactFlightPayloadDeserializerNull: Self = StObject.set(x, "reactFlightPayloadDeserializer", null)
      
      inline def setReactFlightPayloadDeserializerUndefined: Self = StObject.set(x, "reactFlightPayloadDeserializer", js.undefined)
      
      inline def setScheduler(value: TaskScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setSchedulerNull: Self = StObject.set(x, "scheduler", null)
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      inline def setSink(value: Sink[GraphQLResponse]): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
      
      inline def setSource(value: RelayObservable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingFieldsAsNull(value: Boolean): Self = StObject.set(x, "treatMissingFieldsAsNull", value.asInstanceOf[js.Any])
      
      inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
      
      inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
      
      inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
    }
  }
  
  trait Executor extends StObject {
    
    def cancel(): Unit
  }
  object Executor {
    
    inline def apply(cancel: Callback): Executor = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
      __obj.asInstanceOf[Executor]
    }
    
    extension [Self <: Executor](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    }
  }
  
  trait TaskScheduler extends StObject {
    
    def cancel(id: String): Unit
    
    def schedule(fn: js.Function0[Unit]): String
  }
  object TaskScheduler {
    
    inline def apply(cancel: String => Callback, schedule: js.Function0[Unit] => String): TaskScheduler = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1((t0: String) => cancel(t0).runNow()), schedule = js.Any.fromFunction1(schedule))
      __obj.asInstanceOf[TaskScheduler]
    }
    
    extension [Self <: TaskScheduler](x: Self) {
      
      inline def setCancel(value: String => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSchedule(value: js.Function0[Unit] => String): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
}
