package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.templatesMod.ResourceLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GroupLabels", JSImport.Namespace)
@js.native
object groupLabelsMod extends js.Object {
  @js.native
  class GroupLabels () extends ResourceLabels {
    def this(options: BaseServiceOptions) = this()
  }
  
}

