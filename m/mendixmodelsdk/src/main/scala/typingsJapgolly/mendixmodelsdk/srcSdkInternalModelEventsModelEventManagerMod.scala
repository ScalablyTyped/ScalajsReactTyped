package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.Callback
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltaManagerMod.IDeltaManager
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasMod.DeltaProcessor
import typingsJapgolly.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IModelEvent
import typingsJapgolly.mendixmodelsdk.srcSdkInternalModelEventsModelEventReceiverMod.ModelEventReceiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalModelEventsModelEventManagerMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/model-events/ModelEventManager", "ModelEventManager")
  @js.native
  open class ModelEventManager protected ()
    extends StObject
       with IModelEventManager {
    def this(
      model: AbstractModel,
      deltaManager: IDeltaManager,
      deltaProcessor: DeltaProcessor,
      workingCopyId: String,
      currentEventId: Double
    ) = this()
    
    /* private */ var currentEventId: Any = js.native
    
    /* private */ var deltaProcessor: Any = js.native
    
    /* private */ var eventEmitter: Any = js.native
    
    /* private */ var eventQueue: Any = js.native
    
    var eventReceiver: ModelEventReceiver = js.native
    
    /* CompleteClass */
    override def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    /* private */ var loadUnitResults: Any = js.native
    
    /* CompleteClass */
    override def loadUnitStarted(): Unit = js.native
    
    /* private */ var modelChanged: Any = js.native
    
    /* CompleteClass */
    override def onEventProcessed(callback: IVoidCallback): Unit = js.native
    
    /* CompleteClass */
    override def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit = js.native
    
    /* private */ var onNewDelta: Any = js.native
    
    /* private */ var pendingUnits: Any = js.native
    
    /* private */ var processEventsQueue: Any = js.native
    
    /* private */ var processLoadedUnits: Any = js.native
    
    def scheduleEvent(modelEvent: IModelEvent): Unit = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait ILoadUnitResult extends StObject {
    
    def callback(): Unit
    @JSName("callback")
    var callback_Original: IVoidCallback
    
    var eventId: Double
  }
  object ILoadUnitResult {
    
    inline def apply(callback: Callback, eventId: Double): ILoadUnitResult = {
      val __obj = js.Dynamic.literal(callback = callback.toJsFn, eventId = eventId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadUnitResult]
    }
    
    extension [Self <: ILoadUnitResult](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IModelEventManager extends StObject {
    
    def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit
    
    def loadUnitStarted(): Unit
    
    def onEventProcessed(callback: IVoidCallback): Unit
    
    def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object IModelEventManager {
    
    inline def apply(
      loadUnitCompleted: (Double, IVoidCallback, IErrorCallback) => Callback,
      loadUnitStarted: Callback,
      onEventProcessed: IVoidCallback => Callback,
      onFileChangesReceived: js.Function1[/* files */ js.Array[String], Unit] => Callback,
      start: Callback,
      stop: Callback
    ): IModelEventManager = {
      val __obj = js.Dynamic.literal(loadUnitCompleted = js.Any.fromFunction3((t0: Double, t1: IVoidCallback, t2: IErrorCallback) => (loadUnitCompleted(t0, t1, t2)).runNow()), loadUnitStarted = loadUnitStarted.toJsFn, onEventProcessed = js.Any.fromFunction1((t0: IVoidCallback) => onEventProcessed(t0).runNow()), onFileChangesReceived = js.Any.fromFunction1((t0: js.Function1[/* files */ js.Array[String], Unit]) => onFileChangesReceived(t0).runNow()), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[IModelEventManager]
    }
    
    extension [Self <: IModelEventManager](x: Self) {
      
      inline def setLoadUnitCompleted(value: (Double, IVoidCallback, IErrorCallback) => Callback): Self = StObject.set(x, "loadUnitCompleted", js.Any.fromFunction3((t0: Double, t1: IVoidCallback, t2: IErrorCallback) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadUnitStarted(value: Callback): Self = StObject.set(x, "loadUnitStarted", value.toJsFn)
      
      inline def setOnEventProcessed(value: IVoidCallback => Callback): Self = StObject.set(x, "onEventProcessed", js.Any.fromFunction1((t0: IVoidCallback) => value(t0).runNow()))
      
      inline def setOnFileChangesReceived(value: js.Function1[/* files */ js.Array[String], Unit] => Callback): Self = StObject.set(x, "onFileChangesReceived", js.Any.fromFunction1((t0: js.Function1[/* files */ js.Array[String], Unit]) => value(t0).runNow()))
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
