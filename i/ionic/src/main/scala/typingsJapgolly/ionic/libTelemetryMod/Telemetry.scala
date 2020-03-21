package typingsJapgolly.ionic.libTelemetryMod

import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.ISession
import typingsJapgolly.ionic.definitionsMod.ITelemetry
import typingsJapgolly.ionic.definitionsMod.InfoItem
import typingsJapgolly.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/telemetry", "Telemetry")
@js.native
class Telemetry protected () extends ITelemetry {
  def this(hasConfigClientGetInfoCtxProjectSession: TelemetryDeps) = this()
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val project: js.UndefOr[IProject] = js.native
  val session: ISession = js.native
  /* protected */ def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  /* CompleteClass */
  override def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit] = js.native
}

