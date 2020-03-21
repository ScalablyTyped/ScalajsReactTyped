package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/SystemHooks", JSImport.Namespace)
@js.native
object systemHooksMod extends js.Object {
  @js.native
  class SystemHooks () extends BaseService {
    def add(url: String): js.Promise[js.Object] = js.native
    def add(url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(hookId: Double, url: String): js.Promise[js.Object] = js.native
    def edit(hookId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(hookId: Double): js.Promise[js.Object] = js.native
    def remove(hookId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

