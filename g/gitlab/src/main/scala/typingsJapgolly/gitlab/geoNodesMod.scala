package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GeoNodes", JSImport.Namespace)
@js.native
object geoNodesMod extends js.Object {
  @js.native
  class GeoNodes () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(geonodeId: Double): js.Promise[js.Object] = js.native
    def create(geonodeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(geonodeId: Double): js.Promise[js.Object] = js.native
    def edit(geonodeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def failures(): js.Promise[js.Object] = js.native
    def failures(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def repair(geonodeId: Double): js.Promise[js.Object] = js.native
    def repair(geonodeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(geonodeId: Double): js.Promise[GetResponse] = js.native
    def show(geonodeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def status(geonodeId: Double): js.Promise[GetResponse] = js.native
    def status(geonodeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def statuses(): js.Promise[GetResponse] = js.native
    def statuses(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

