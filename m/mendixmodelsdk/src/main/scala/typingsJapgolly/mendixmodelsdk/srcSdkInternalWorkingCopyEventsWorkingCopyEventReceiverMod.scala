package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.eventsource.mod.^
import typingsJapgolly.mendixmodelsdk.anon.HandleError
import typingsJapgolly.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IBuildResultEvent
import typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IWorkingCopyDataEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalWorkingCopyEventsWorkingCopyEventReceiverMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/working-copy-events/WorkingCopyEventReceiver", "WorkingCopyEventReceiver")
  @js.native
  open class WorkingCopyEventReceiver protected () extends StObject {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
    
    /* private */ var buildResultEventEmitter: Any = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var errorHandler: Any = js.native
    
    var eventSource: ^ | Null = js.native
    
    def isRunning: Boolean = js.native
    
    def onBuildResultEvent(callback: js.Function1[/* buildResultEvent */ IBuildResultEvent, Unit]): Unit = js.native
    
    def onWorkingCopyDataEvent(callback: js.Function1[/* workingCopyDataEvent */ IWorkingCopyDataEvent, Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var workingCopyDataEventEmitter: Any = js.native
    
    /* private */ var workingCopyId: Any = js.native
  }
}
