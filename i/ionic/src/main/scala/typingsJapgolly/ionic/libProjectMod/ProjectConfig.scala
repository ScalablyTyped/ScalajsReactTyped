package typingsJapgolly.ionic.libProjectMod

import typingsJapgolly.ionic.PartialReadonlyIProjectCo
import typingsJapgolly.ionic.definitionsMod.IProjectConfig
import typingsJapgolly.ionic.definitionsMod.ProjectType
import typingsJapgolly.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectConfig")
@js.native
class ProjectConfig protected () extends BaseConfig[IProjectConfig] {
  def this(p: String) = this()
  def this(p: String, hasTypeOptions: ProjectConfigOptions) = this()
  val `type`: js.UndefOr[ProjectType] = js.native
  def provideDefaults(c: PartialReadonlyIProjectCo): IProjectConfig = js.native
}

