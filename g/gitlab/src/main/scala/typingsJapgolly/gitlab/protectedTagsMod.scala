package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProtectedTags", JSImport.Namespace)
@js.native
object protectedTagsMod extends js.Object {
  @js.native
  class ProtectedTags () extends BaseService {
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def protect(projectId: String, tagName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def protect(projectId: Double, tagName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(projectId: String, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def unprotect(projectId: String, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

