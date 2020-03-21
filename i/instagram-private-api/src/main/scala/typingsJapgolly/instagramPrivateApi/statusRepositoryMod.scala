package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/status.repository", JSImport.Namespace)
@js.native
object statusRepositoryMod extends js.Object {
  @js.native
  class StatusRepository () extends Repository {
    def getViewableStatuses(): js.Promise[_] = js.native
  }
  
}

