package typingsJapgolly.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMine extends js.Object {
  /**
    * This value indicates that the API should only return the specified channel's playlists.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube playlist ID(s) for the resource(s) that are being retrieved. In a playlist resource, the id property specifies the playlist's YouTube playlist ID.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Set this parameter's value to true to instruct the API to only return playlists owned by the authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pagetoken: String
  /**
    * The part parameter specifies a comma-separated list of one or more playlist resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and status. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlist resource, the snippet property contains properties like author, title, description, tags, and timeCreated. As such, if you set part=snippet, the API response will contain all of those properties.
    */
  var part: String
}

object AnonMine {
  @scala.inline
  def apply(
    pagetoken: String,
    part: String,
    channelId: String = null,
    id: String = null,
    maxResults: Int | Double = null,
    mine: js.UndefOr[Boolean] = js.undefined
  ): AnonMine = {
    val __obj = js.Dynamic.literal(pagetoken = pagetoken.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMine]
  }
}

