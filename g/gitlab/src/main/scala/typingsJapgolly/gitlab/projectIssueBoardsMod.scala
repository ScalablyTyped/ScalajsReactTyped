package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectIssueBoards", JSImport.Namespace)
@js.native
object projectIssueBoardsMod extends js.Object {
  @js.native
  class ProjectIssueBoards () extends ResourceIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
  
}

