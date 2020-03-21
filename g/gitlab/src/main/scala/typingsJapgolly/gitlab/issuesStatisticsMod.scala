package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssuesStatistics", JSImport.Namespace)
@js.native
object issuesStatisticsMod extends js.Object {
  @js.native
  class IssuesStatistics () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: (AnonProjectId | AnonGroupId | js.Object) with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

