package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/BroadcastMessages", JSImport.Namespace)
@js.native
object broadcastMessagesMod extends js.Object {
  @js.native
  class BroadcastMessages () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(broadcastMessageId: Double): js.Promise[js.Object] = js.native
    def edit(broadcastMessageId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(broadcastMessageId: Double): js.Promise[js.Object] = js.native
    def show(broadcastMessageId: Double): js.Promise[GetResponse] = js.native
    def show(broadcastMessageId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

