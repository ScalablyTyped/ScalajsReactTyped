package typingsJapgolly.ionic.commandsMod

import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionic.namespaceMod.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands", "IonicNamespace")
@js.native
class IonicNamespace protected () extends Namespace {
  def this(hasEnvProject: IonicEnvironmentDeps) = this()
  var _env: IonicEnvironment = js.native
  var _project: js.UndefOr[IProject] = js.native
  @JSName("env")
  def env_MIonicNamespace(): IonicEnvironment = js.native
  @JSName("env")
  def env_MIonicNamespace(env: IonicEnvironment): js.Any = js.native
  @JSName("project")
  def project_MIonicNamespace(): js.Any = js.native
  @JSName("project")
  def project_MIonicNamespace(p: IProject): js.Any = js.native
  @JSName("project")
  def project_Union(): js.UndefOr[IProject] = js.native
}

