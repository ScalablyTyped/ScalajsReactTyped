package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Branches", JSImport.Namespace)
@js.native
object branchesMod extends js.Object {
  @js.native
  class Branches () extends BaseService {
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: searchstringPaginatedRequ): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: searchstringPaginatedRequ): js.Promise[GetResponse] = js.native
    def create(projectId: String, branchName: String, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: String, branchName: String, ref: String, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, branchName: String, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, branchName: String, ref: String, options: Sudo): js.Promise[js.Object] = js.native
    def protect(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: String, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def protect(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: Double, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def unprotect(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: String, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

