package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Keys", JSImport.Namespace)
@js.native
object keysMod extends js.Object {
  @js.native
  class Keys () extends BaseService {
    def show(keyId: String): js.Promise[GetResponse] = js.native
    def show(keyId: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

