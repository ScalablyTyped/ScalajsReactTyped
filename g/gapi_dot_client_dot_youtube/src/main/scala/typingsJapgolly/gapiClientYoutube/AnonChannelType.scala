package typingsJapgolly.gapiClientYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelType extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The channelId parameter indicates that the API response should only contain resources created by the channel */
  var channelId: js.UndefOr[String] = js.undefined
  /** The channelType parameter lets you restrict a search to a particular type of channel. */
  var channelType: js.UndefOr[String] = js.undefined
  /**
    * The eventType parameter restricts a search to broadcast events. If you specify a value for this parameter, you must also set the type parameter's value
    * to video.
    */
  var eventType: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Note: This parameter is intended exclusively for YouTube content partners.
    *
    * The forContentOwner parameter restricts the search to only retrieve resources owned by the content owner specified by the onBehalfOfContentOwner
    * parameter. The user must be authenticated using a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var forContentOwner: js.UndefOr[Boolean] = js.undefined
  /**
    * The forDeveloper parameter restricts the search to only retrieve videos uploaded via the developer's application or website. The API server uses the
    * request's authorization credentials to identify the developer. Therefore, a developer can restrict results to videos uploaded through the developer's
    * own app or website but not to videos uploaded through other apps or sites.
    */
  var forDeveloper: js.UndefOr[Boolean] = js.undefined
  /**
    * The forMine parameter restricts the search to only retrieve videos owned by the authenticated user. If you set this parameter to true, then the type
    * parameter's value must also be set to video.
    */
  var forMine: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The location parameter, in conjunction with the locationRadius parameter, defines a circular geographic area and also restricts a search to videos that
    * specify, in their metadata, a geographic location that falls within that area. The parameter value is a string that specifies latitude/longitude
    * coordinates e.g. (37.42307,-122.08427).
    *
    *
    * - The location parameter value identifies the point at the center of the area.
    * - The locationRadius parameter specifies the maximum distance that the location associated with a video can be from that point for the video to still
    * be included in the search results.The API returns an error if your request specifies a value for the location parameter but does not also specify a
    * value for the locationRadius parameter.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The locationRadius parameter, in conjunction with the location parameter, defines a circular geographic area.
    *
    * The parameter value must be a floating point number followed by a measurement unit. Valid measurement units are m, km, ft, and mi. For example, valid
    * parameter values include 1500m, 5km, 10000ft, and 0.75mi. The API does not support locationRadius parameter values larger than 1000 kilometers.
    *
    * Note: See the definition of the location parameter for more information.
    */
  var locationRadius: js.UndefOr[String] = js.undefined
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * Note: This parameter is intended exclusively for YouTube content partners.
    *
    * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the
    * content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube
    * channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication
    * credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  /** The order parameter specifies the method that will be used to order resources in the API response. */
  var order: js.UndefOr[String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
    * properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter
    * value to snippet.
    */
  var part: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * The publishedAfter parameter indicates that the API response should only contain resources created after the specified time. The value is an RFC 3339
    * formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedAfter: js.UndefOr[String] = js.undefined
  /**
    * The publishedBefore parameter indicates that the API response should only contain resources created before the specified time. The value is an RFC 3339
    * formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedBefore: js.UndefOr[String] = js.undefined
  /**
    * The q parameter specifies the query term to search for.
    *
    * Your request can also use the Boolean NOT (-) and OR (|) operators to exclude videos or to find videos that are associated with one of several search
    * terms. For example, to search for videos matching either "boating" or "sailing", set the q parameter value to boating|sailing. Similarly, to search for
    * videos matching either "boating" or "sailing" but not "fishing", set the q parameter value to boating|sailing -fishing. Note that the pipe character
    * must be URL-escaped when it is sent in your API request. The URL-escaped value for the pipe character is %7C.
    */
  var q: js.UndefOr[String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * The regionCode parameter instructs the API to return search results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country
    * code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  /**
    * The relatedToVideoId parameter retrieves a list of videos that are related to the video that the parameter value identifies. The parameter value must
    * be set to a YouTube video ID and, if you are using this parameter, the type parameter must be set to video.
    */
  var relatedToVideoId: js.UndefOr[String] = js.undefined
  /**
    * The relevanceLanguage parameter instructs the API to return search results that are most relevant to the specified language. The parameter value is
    * typically an ISO 639-1 two-letter language code. However, you should use the values zh-Hans for simplified Chinese and zh-Hant for traditional Chinese.
    * Please note that results in other languages will still be returned if they are highly relevant to the search query term.
    */
  var relevanceLanguage: js.UndefOr[String] = js.undefined
  /** The safeSearch parameter indicates whether the search results should include restricted content as well as standard content. */
  var safeSearch: js.UndefOr[String] = js.undefined
  /**
    * The topicId parameter indicates that the API response should only contain resources associated with the specified topic. The value identifies a
    * Freebase topic ID.
    */
  var topicId: js.UndefOr[String] = js.undefined
  /** The type parameter restricts a search query to only retrieve a particular type of resource. The value is a comma-separated list of resource types. */
  var `type`: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /**
    * The videoCaption parameter indicates whether the API should filter video search results based on whether they have captions. If you specify a value for
    * this parameter, you must also set the type parameter's value to video.
    */
  var videoCaption: js.UndefOr[String] = js.undefined
  /**
    * The videoCategoryId parameter filters video search results based on their category. If you specify a value for this parameter, you must also set the
    * type parameter's value to video.
    */
  var videoCategoryId: js.UndefOr[String] = js.undefined
  /**
    * The videoDefinition parameter lets you restrict a search to only include either high definition (HD) or standard definition (SD) videos. HD videos are
    * available for playback in at least 720p, though higher resolutions, like 1080p, might also be available. If you specify a value for this parameter, you
    * must also set the type parameter's value to video.
    */
  var videoDefinition: js.UndefOr[String] = js.undefined
  /**
    * The videoDimension parameter lets you restrict a search to only retrieve 2D or 3D videos. If you specify a value for this parameter, you must also set
    * the type parameter's value to video.
    */
  var videoDimension: js.UndefOr[String] = js.undefined
  /**
    * The videoDuration parameter filters video search results based on their duration. If you specify a value for this parameter, you must also set the type
    * parameter's value to video.
    */
  var videoDuration: js.UndefOr[String] = js.undefined
  /**
    * The videoEmbeddable parameter lets you to restrict a search to only videos that can be embedded into a webpage. If you specify a value for this
    * parameter, you must also set the type parameter's value to video.
    */
  var videoEmbeddable: js.UndefOr[String] = js.undefined
  /**
    * The videoLicense parameter filters search results to only include videos with a particular license. YouTube lets video uploaders choose to attach
    * either the Creative Commons license or the standard YouTube license to each of their videos. If you specify a value for this parameter, you must also
    * set the type parameter's value to video.
    */
  var videoLicense: js.UndefOr[String] = js.undefined
  /**
    * The videoSyndicated parameter lets you to restrict a search to only videos that can be played outside youtube.com. If you specify a value for this
    * parameter, you must also set the type parameter's value to video.
    */
  var videoSyndicated: js.UndefOr[String] = js.undefined
  /**
    * The videoType parameter lets you restrict a search to a particular type of videos. If you specify a value for this parameter, you must also set the
    * type parameter's value to video.
    */
  var videoType: js.UndefOr[String] = js.undefined
}

object AnonChannelType {
  @scala.inline
  def apply(
    part: String,
    alt: String = null,
    channelId: String = null,
    channelType: String = null,
    eventType: String = null,
    fields: String = null,
    forContentOwner: js.UndefOr[Boolean] = js.undefined,
    forDeveloper: js.UndefOr[Boolean] = js.undefined,
    forMine: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    location: String = null,
    locationRadius: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    onBehalfOfContentOwner: String = null,
    order: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    publishedAfter: String = null,
    publishedBefore: String = null,
    q: String = null,
    quotaUser: String = null,
    regionCode: String = null,
    relatedToVideoId: String = null,
    relevanceLanguage: String = null,
    safeSearch: String = null,
    topicId: String = null,
    `type`: String = null,
    userIp: String = null,
    videoCaption: String = null,
    videoCategoryId: String = null,
    videoDefinition: String = null,
    videoDimension: String = null,
    videoDuration: String = null,
    videoEmbeddable: String = null,
    videoLicense: String = null,
    videoSyndicated: String = null,
    videoType: String = null
  ): AnonChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelType != null) __obj.updateDynamic("channelType")(channelType.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(forContentOwner)) __obj.updateDynamic("forContentOwner")(forContentOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(forDeveloper)) __obj.updateDynamic("forDeveloper")(forDeveloper.asInstanceOf[js.Any])
    if (!js.isUndefined(forMine)) __obj.updateDynamic("forMine")(forMine.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationRadius != null) __obj.updateDynamic("locationRadius")(locationRadius.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (publishedAfter != null) __obj.updateDynamic("publishedAfter")(publishedAfter.asInstanceOf[js.Any])
    if (publishedBefore != null) __obj.updateDynamic("publishedBefore")(publishedBefore.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (relatedToVideoId != null) __obj.updateDynamic("relatedToVideoId")(relatedToVideoId.asInstanceOf[js.Any])
    if (relevanceLanguage != null) __obj.updateDynamic("relevanceLanguage")(relevanceLanguage.asInstanceOf[js.Any])
    if (safeSearch != null) __obj.updateDynamic("safeSearch")(safeSearch.asInstanceOf[js.Any])
    if (topicId != null) __obj.updateDynamic("topicId")(topicId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (videoCaption != null) __obj.updateDynamic("videoCaption")(videoCaption.asInstanceOf[js.Any])
    if (videoCategoryId != null) __obj.updateDynamic("videoCategoryId")(videoCategoryId.asInstanceOf[js.Any])
    if (videoDefinition != null) __obj.updateDynamic("videoDefinition")(videoDefinition.asInstanceOf[js.Any])
    if (videoDimension != null) __obj.updateDynamic("videoDimension")(videoDimension.asInstanceOf[js.Any])
    if (videoDuration != null) __obj.updateDynamic("videoDuration")(videoDuration.asInstanceOf[js.Any])
    if (videoEmbeddable != null) __obj.updateDynamic("videoEmbeddable")(videoEmbeddable.asInstanceOf[js.Any])
    if (videoLicense != null) __obj.updateDynamic("videoLicense")(videoLicense.asInstanceOf[js.Any])
    if (videoSyndicated != null) __obj.updateDynamic("videoSyndicated")(videoSyndicated.asInstanceOf[js.Any])
    if (videoType != null) __obj.updateDynamic("videoType")(videoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelType]
  }
}

