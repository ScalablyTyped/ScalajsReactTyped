package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/CommitDiscussions", JSImport.Namespace)
@js.native
object commitDiscussionsMod extends js.Object {
  @js.native
  class CommitDiscussions () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
}

