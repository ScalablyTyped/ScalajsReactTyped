package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.eventsMod.EventOptions
import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Users", JSImport.Namespace)
@js.native
object usersMod extends js.Object {
  @js.native
  class Users () extends BaseService {
    def activities(): js.Promise[GetResponse] = js.native
    def activities(options: Sudo): js.Promise[GetResponse] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def block(userId: Double): js.Promise[js.Object] = js.native
    def block(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def current(): js.Promise[GetResponse] = js.native
    def current(options: Sudo): js.Promise[GetResponse] = js.native
    def edit(userId: Double): js.Promise[js.Object] = js.native
    def edit(userId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def events(userId: Double): js.Promise[GetResponse] = js.native
    def events(userId: Double, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
    def projects(userId: Double): js.Promise[GetResponse] = js.native
    def projects(userId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(userId: Double): js.Promise[js.Object] = js.native
    def remove(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def search(emailOrUsername: String): js.Promise[GetResponse] = js.native
    def search(emailOrUsername: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(userId: Double): js.Promise[GetResponse] = js.native
    def show(userId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def unblock(userId: Double): js.Promise[js.Object] = js.native
    def unblock(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

