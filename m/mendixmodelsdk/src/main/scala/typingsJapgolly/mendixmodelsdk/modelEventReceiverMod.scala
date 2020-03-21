package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.eventsource.mod.^
import typingsJapgolly.mendixmodelsdk.imodeleventMod.IDeltaEvent
import typingsJapgolly.mendixmodelsdk.imodeleventMod.IFileEvent
import typingsJapgolly.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/model-events/ModelEventReceiver", JSImport.Namespace)
@js.native
object modelEventReceiverMod extends js.Object {
  @js.native
  class ModelEventReceiver protected () extends js.Object {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: AnonHandleError) = this()
    var client: js.Any = js.native
    var deltaEventEmitter: js.Any = js.native
    var errorHandler: js.Any = js.native
    var eventSource: ^  | Null = js.native
    var fileEventEmitter: js.Any = js.native
    var workingCopyId: js.Any = js.native
    def isRunning(): Boolean = js.native
    def onDeltaEvent(callback: js.Function1[/* modelEvent */ IDeltaEvent, Unit]): Unit = js.native
    def onFileEvent(callback: js.Function1[/* modelEvent */ IFileEvent, Unit]): Unit = js.native
    def start(lastEventId: Double): Unit = js.native
    def stop(): Unit = js.native
  }
  
}

