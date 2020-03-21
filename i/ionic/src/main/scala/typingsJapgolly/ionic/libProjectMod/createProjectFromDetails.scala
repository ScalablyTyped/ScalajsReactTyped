package typingsJapgolly.ionic.libProjectMod

import typingsJapgolly.ionic.definitionsMod.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "createProjectFromDetails")
@js.native
object createProjectFromDetails extends js.Object {
  def apply(details: ProjectDetailsResult, deps: ProjectDeps): js.Promise[IProject] = js.native
}

