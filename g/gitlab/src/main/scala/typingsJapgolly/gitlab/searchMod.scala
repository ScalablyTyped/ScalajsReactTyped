package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  @js.native
  class Search () extends BaseService {
    def all(scope: String, search: String, hasProjectIdGroupIdOptions: projectIdstringnumbergrou): js.Promise[GetResponse] = js.native
  }
  
}

