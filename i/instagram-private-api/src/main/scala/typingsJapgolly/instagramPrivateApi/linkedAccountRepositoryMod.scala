package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/linked-account.repository", JSImport.Namespace)
@js.native
object linkedAccountRepositoryMod extends js.Object {
  @js.native
  class LinkedAccountRepository () extends Repository {
    def getLinkageStatus(): js.Promise[_] = js.native
  }
  
}

