package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ApplicationSettings", JSImport.Namespace)
@js.native
object applicationSettingsMod extends js.Object {
  @js.native
  class ApplicationSettings () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: Sudo): js.Promise[GetResponse] = js.native
    def edit(): js.Promise[js.Object] = js.native
    def edit(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
}

