package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Deployments", JSImport.Namespace)
@js.native
object deploymentsMod extends js.Object {
  @js.native
  class Deployments () extends BaseService {
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(projectId: String, deploymentId: Double): js.Promise[js.Object] = js.native
    def show(projectId: String, deploymentId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: Double, deploymentId: Double): js.Promise[js.Object] = js.native
    def show(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

