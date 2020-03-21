package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Wikis", JSImport.Namespace)
@js.native
object wikisMod extends js.Object {
  @js.native
  class Wikis () extends BaseService {
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: String, slug: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, slug: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, slug: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, slug: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: String, slug: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, slug: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, slug: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, slug: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, slug: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, slug: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, slug: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, slug: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

