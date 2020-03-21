package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseRootObject
import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseRootObject
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.blended
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.hashtags
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.places
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.users
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/fbsearch.repository", JSImport.Namespace)
@js.native
object fbsearchRepositoryMod extends js.Object {
  @js.native
  class FbsearchRepository () extends Repository {
    def places(query: String): js.Promise[FbsearchRepositoryPlacesResponseRootObject] = js.native
    def recentSearches(): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_blended(`type`: blended): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_hashtags(`type`: hashtags): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_places(`type`: places): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_users(`type`: users): js.Promise[_] = js.native
    def topsearchFlat(query: String): js.Promise[FbsearchRepositoryTopsearchFlatResponseRootObject] = js.native
  }
  
}

