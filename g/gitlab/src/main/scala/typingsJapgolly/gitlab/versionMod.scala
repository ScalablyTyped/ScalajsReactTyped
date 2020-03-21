package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Version", JSImport.Namespace)
@js.native
object versionMod extends js.Object {
  @js.native
  class Version () extends BaseService {
    def show(): js.Promise[GetResponse] = js.native
    def show(options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

