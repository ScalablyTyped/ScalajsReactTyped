package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceTemplates", JSImport.Namespace)
@js.native
object resourceTemplatesMod extends js.Object {
  @js.native
  class ResourceTemplates protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(resourceId: String): js.Promise[js.Object] = js.native
    def show(resourceId: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: Double): js.Promise[js.Object] = js.native
    def show(resourceId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

