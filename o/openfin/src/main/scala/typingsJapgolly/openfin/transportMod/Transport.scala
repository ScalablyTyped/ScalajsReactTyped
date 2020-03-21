package typingsJapgolly.openfin.transportMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.openfin.AnonReject
import typingsJapgolly.openfin.entityTypeMod.EntityTypeHelpers
import typingsJapgolly.openfin.environmentMod.Environment
import typingsJapgolly.openfin.eventAggregatorMod.EventAggregator
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.mainMod.Frame
import typingsJapgolly.openfin.mainMod.Window
import typingsJapgolly.openfin.openfinBooleans.`true`
import typingsJapgolly.openfin.openfinStrings.`request-external-authorization`
import typingsJapgolly.openfin.viewViewMod.View
import typingsJapgolly.openfin.wireMod.ConnectConfig
import typingsJapgolly.openfin.wireMod.ExistingConnectConfig
import typingsJapgolly.openfin.wireMod.InternalConnectConfig
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends EventEmitter {
  var READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any = js.native
  var environment: Environment = js.native
  var eventAggregator: EventAggregator = js.native
  var me: (View | Window | Frame | js.Object) with Identity with EntityTypeHelpers = js.native
  var messageHandlers: js.Array[MessageHandler] = js.native
  @JSName("sendRaw")
  var sendRaw_Original: js.Function1[/* data */ js.Any, js.Promise[_]] = js.native
  var topicRefMap: Map[String, Double] = js.native
  var uncorrelatedListener: js.Function = js.native
  var wireListeners: Map[Double, AnonReject] = js.native
  /* protected */ def addWireListener(id: Double, resolve: js.Function, reject: js.Function, uncorrelated: Boolean): Unit = js.native
  def connect(config: InternalConnectConfig): js.Promise[String] = js.native
  def connectByPort(config: ExistingConnectConfig): js.Promise[String] = js.native
  def connectSync(config: ConnectConfig): Unit = js.native
  def ferryAction(data: js.Any): js.Promise[Message[_]] = js.native
  def getPort(): String = js.native
  /* protected */ def handleMessage(data: Message[Payload]): Boolean = js.native
  /* protected */ def onmessage(data: Message[Payload]): Unit = js.native
  def registerMessageHandler(handler: MessageHandler): Unit = js.native
  def sendAction(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
  def sendAction(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
  def sendRaw(data: js.Any): js.Promise[_] = js.native
  def shutdown(): js.Promise[Unit] = js.native
}

