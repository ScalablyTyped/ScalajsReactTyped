package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgResponse
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/zr.repository", JSImport.Namespace)
@js.native
object zrRepositoryMod extends js.Object {
  @js.native
  class ZrRepository () extends Repository {
    def tokenResult(): js.Promise[IgResponse[_]] = js.native
  }
  
}

