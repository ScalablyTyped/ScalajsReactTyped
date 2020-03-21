package typingsJapgolly.ionic.ionicAngularAilmentsMod

import typingsJapgolly.ionic.ailmentsBaseMod.AilmentDeps
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.ISession
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.ionicAngularMod.IonicAngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularAilmentDeps extends AilmentDeps {
  @JSName("project")
  val project_IonicAngularAilmentDeps: IonicAngularProject
}

object IonicAngularAilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: IonicAngularProject,
    session: ISession,
    shell: IShell
  ): IonicAngularAilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonicAngularAilmentDeps]
  }
}

