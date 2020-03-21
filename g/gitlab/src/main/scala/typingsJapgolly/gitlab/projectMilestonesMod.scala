package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceMilestones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectMilestones", JSImport.Namespace)
@js.native
object projectMilestonesMod extends js.Object {
  @js.native
  class ProjectMilestones () extends ResourceMilestones {
    def this(options: BaseServiceOptions) = this()
  }
  
}

