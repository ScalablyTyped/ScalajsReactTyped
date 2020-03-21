package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonChannelType
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeSearchResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait search extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(`object`: AnonChannelType): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]
}

object search {
  @scala.inline
  def apply(
    list: AnonChannelType => CallbackTo[HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]]
  ): search = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonChannelType) => list(t0).runNow()))
    __obj.asInstanceOf[search]
  }
}

