package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.graphqlRequestOptionsMod.GraphQLRequestOptions
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/ads.repository", JSImport.Namespace)
@js.native
object adsRepositoryMod extends js.Object {
  @js.native
  class AdsRepository () extends Repository {
    def graphQL[T /* <: AnonData */](options: GraphQLRequestOptions): js.Promise[T] = js.native
  }
  
}

