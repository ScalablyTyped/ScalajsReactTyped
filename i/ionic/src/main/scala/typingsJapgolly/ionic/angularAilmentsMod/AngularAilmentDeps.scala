package typingsJapgolly.ionic.angularAilmentsMod

import typingsJapgolly.ionic.ailmentsBaseMod.AilmentDeps
import typingsJapgolly.ionic.angularMod.AngularProject
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.ISession
import typingsJapgolly.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularAilmentDeps extends AilmentDeps {
  @JSName("project")
  val project_AngularAilmentDeps: AngularProject
}

object AngularAilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: AngularProject,
    session: ISession,
    shell: IShell
  ): AngularAilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AngularAilmentDeps]
  }
}

