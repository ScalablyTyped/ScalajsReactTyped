package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Triggers", JSImport.Namespace)
@js.native
object triggersMod extends js.Object {
  @js.native
  class Triggers () extends BaseService {
    def add(projectId: String): js.Promise[js.Object] = js.native
    def add(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(projectId: Double): js.Promise[js.Object] = js.native
    def add(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(projectId: String, triggerId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, triggerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, triggerId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, triggerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def pipeline(projectId: String, ref: String, token: String): js.Promise[js.Object] = js.native
    def pipeline(projectId: String, ref: String, token: String, hasSudoOptions: BaseRequestOptions): js.Promise[js.Object] = js.native
    def pipeline(projectId: Double, ref: String, token: String): js.Promise[js.Object] = js.native
    def pipeline(projectId: Double, ref: String, token: String, hasSudoOptions: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: String, triggerId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, triggerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, triggerId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, triggerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, triggerId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, triggerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, triggerId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, triggerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

