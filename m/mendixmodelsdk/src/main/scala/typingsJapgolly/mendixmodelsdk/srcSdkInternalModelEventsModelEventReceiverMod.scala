package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.eventsource.mod.^
import typingsJapgolly.mendixmodelsdk.anon.HandleError
import typingsJapgolly.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import typingsJapgolly.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IDeltaEvent
import typingsJapgolly.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IFileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalModelEventsModelEventReceiverMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/model-events/ModelEventReceiver", "ModelEventReceiver")
  @js.native
  open class ModelEventReceiver protected () extends StObject {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
    
    /* private */ var client: Any = js.native
    
    /* private */ var deltaEventEmitter: Any = js.native
    
    /* private */ var errorHandler: Any = js.native
    
    var eventSource: ^ | Null = js.native
    
    /* private */ var fileEventEmitter: Any = js.native
    
    def isRunning: Boolean = js.native
    
    def onDeltaEvent(callback: js.Function1[/* modelEvent */ IDeltaEvent, Unit]): Unit = js.native
    
    def onFileEvent(callback: js.Function1[/* modelEvent */ IFileEvent, Unit]): Unit = js.native
    
    def start(lastEventId: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var workingCopyId: Any = js.native
  }
}
