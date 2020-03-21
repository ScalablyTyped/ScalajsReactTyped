package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GroupAccessRequests", JSImport.Namespace)
@js.native
object groupAccessRequestsMod extends js.Object {
  @js.native
  class GroupAccessRequests () extends ResourceAccessRequests {
    def this(options: BaseServiceOptions) = this()
  }
  
}

