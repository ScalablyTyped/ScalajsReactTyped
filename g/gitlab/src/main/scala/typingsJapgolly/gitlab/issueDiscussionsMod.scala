package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssueDiscussions", JSImport.Namespace)
@js.native
object issueDiscussionsMod extends js.Object {
  @js.native
  class IssueDiscussions () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
}

