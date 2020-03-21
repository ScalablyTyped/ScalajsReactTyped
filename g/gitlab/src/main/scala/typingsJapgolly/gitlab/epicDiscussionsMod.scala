package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/EpicDiscussions", JSImport.Namespace)
@js.native
object epicDiscussionsMod extends js.Object {
  @js.native
  class EpicDiscussions () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
}

