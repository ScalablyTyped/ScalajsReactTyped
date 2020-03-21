package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseItemsItem
import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseHashtag
import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseListItem
import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponsePlace
import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseUser
import typingsJapgolly.instagramPrivateApi.locationRepositorySearchResponseMod.LocationRepositorySearchResponseVenuesItem
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.instagramPrivateApi.tagRepositorySearchResponseMod.TagRepositorySearchResponseResultsItem
import typingsJapgolly.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/search.service", JSImport.Namespace)
@js.native
object searchServiceMod extends js.Object {
  @js.native
  class SearchService () extends Repository {
    def blended(query: String): js.Promise[js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]] = js.native
    def blendedItems(query: String): js.Promise[
        js.Array[
          FbsearchRepositoryTopsearchFlatResponsePlace | FbsearchRepositoryTopsearchFlatResponseHashtag | FbsearchRepositoryTopsearchFlatResponseUser
        ]
      ] = js.native
    def location(latitude: Double, longitude: Double): js.Promise[js.Array[LocationRepositorySearchResponseVenuesItem]] = js.native
    def location(latitude: Double, longitude: Double, query: String): js.Promise[js.Array[LocationRepositorySearchResponseVenuesItem]] = js.native
    def places(query: String): js.Promise[js.Array[FbsearchRepositoryPlacesResponseItemsItem]] = js.native
    def tags(query: String): js.Promise[js.Array[TagRepositorySearchResponseResultsItem]] = js.native
    def users(query: String): js.Promise[js.Array[UserRepositorySearchResponseUsersItem]] = js.native
  }
  
}

