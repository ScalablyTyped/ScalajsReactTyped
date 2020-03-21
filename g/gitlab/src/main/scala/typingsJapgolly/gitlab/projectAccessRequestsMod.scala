package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectAccessRequests", JSImport.Namespace)
@js.native
object projectAccessRequestsMod extends js.Object {
  @js.native
  class ProjectAccessRequests () extends ResourceAccessRequests {
    def this(options: BaseServiceOptions) = this()
  }
  
}

