package typingsJapgolly.ionic.libTelemetryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.ISession
import typingsJapgolly.ionic.definitionsMod.InfoItem
import typingsJapgolly.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryDeps extends js.Object {
  val client: IClient
  val config: IConfig
  val ctx: IonicContext
  val project: js.UndefOr[IProject] = js.undefined
  val session: ISession
  def getInfo(): js.Promise[js.Array[InfoItem]]
}

object TelemetryDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    ctx: IonicContext,
    getInfo: CallbackTo[js.Promise[js.Array[InfoItem]]],
    session: ISession,
    project: IProject = null
  ): TelemetryDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.updateDynamic("getInfo")(getInfo.toJsFn)
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryDeps]
  }
}

