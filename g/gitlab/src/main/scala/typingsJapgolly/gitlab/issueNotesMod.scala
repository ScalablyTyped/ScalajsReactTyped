package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssueNotes", JSImport.Namespace)
@js.native
object issueNotesMod extends js.Object {
  @js.native
  class IssueNotes () extends ResourceNotes {
    def this(options: BaseServiceOptions) = this()
  }
  
}

