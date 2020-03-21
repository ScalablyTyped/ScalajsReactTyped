package typingsJapgolly.googleapis.youtubeV3Mod.youtubeV3

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube Data API
  *
  * Supports core YouTube features, such as uploading videos, creating and
  * managing playlists, searching for content, and much more.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtube = google.youtube('v3');
  *
  * @namespace youtube
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Youtube
  */
@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Youtube")
@js.native
class Youtube protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activities: ResourceActivities = js.native
  var captions: ResourceCaptions = js.native
  var channelBanners: ResourceChannelbanners = js.native
  var channelSections: ResourceChannelsections = js.native
  var channels: ResourceChannels = js.native
  var commentThreads: ResourceCommentthreads = js.native
  var comments: ResourceComments = js.native
  var context: APIRequestContext = js.native
  var guideCategories: ResourceGuidecategories = js.native
  var i18nLanguages: ResourceI18nlanguages = js.native
  var i18nRegions: ResourceI18nregions = js.native
  var liveBroadcasts: ResourceLivebroadcasts = js.native
  var liveChatBans: ResourceLivechatbans = js.native
  var liveChatMessages: ResourceLivechatmessages = js.native
  var liveChatModerators: ResourceLivechatmoderators = js.native
  var liveStreams: ResourceLivestreams = js.native
  var playlistItems: ResourcePlaylistitems = js.native
  var playlists: ResourcePlaylists = js.native
  var search: ResourceSearch = js.native
  var sponsors: ResourceSponsors = js.native
  var subscriptions: ResourceSubscriptions = js.native
  var superChatEvents: ResourceSuperchatevents = js.native
  var thumbnails: ResourceThumbnails = js.native
  var videoAbuseReportReasons: ResourceVideoabusereportreasons = js.native
  var videoCategories: ResourceVideocategories = js.native
  var videos: ResourceVideos = js.native
  var watermarks: ResourceWatermarks = js.native
}

