package typingsJapgolly.mendixmodelsdk.modelEventManagerMod

import typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IVoidCallback
import typingsJapgolly.mendixmodelsdk.deltaManagerMod.IDeltaManager
import typingsJapgolly.mendixmodelsdk.deltasMod.DeltaProcessor
import typingsJapgolly.mendixmodelsdk.imodeleventMod.IDeltaEvent
import typingsJapgolly.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/model-events/ModelEventManager", "ModelEventManager")
@js.native
class ModelEventManager protected () extends IModelEventManager {
  def this(
    model: AbstractModel,
    deltaManager: IDeltaManager,
    deltaProcessor: DeltaProcessor,
    workingCopyId: String,
    currentEventId: Double
  ) = this()
  var currentEventId: js.Any = js.native
  var deltaProcessor: js.Any = js.native
  var eventEmitter: js.Any = js.native
  var eventQueue: js.Any = js.native
  var eventReceiver: ModelEventReceiver = js.native
  var loadUnitResults: js.Any = js.native
  var modelChanged: js.Any = js.native
  var onNewDelta: js.Any = js.native
  var pendingUnits: js.Any = js.native
  var processEventsQueue: js.Any = js.native
  var processLoadedUnits: js.Any = js.native
  /* CompleteClass */
  override def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  /* CompleteClass */
  override def loadUnitStarted(): Unit = js.native
  /* CompleteClass */
  override def onEventProcessed(callback: IVoidCallback): Unit = js.native
  /* CompleteClass */
  override def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit = js.native
  def scheduleEvent(deltaEvent: IDeltaEvent): Unit = js.native
  /* CompleteClass */
  override def start(): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

