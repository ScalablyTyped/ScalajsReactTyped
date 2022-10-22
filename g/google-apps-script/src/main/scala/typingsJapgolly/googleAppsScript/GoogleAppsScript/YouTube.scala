package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.ActivitiesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.CaptionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.ChannelBannersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.ChannelSectionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.ChannelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.CommentThreadsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.CommentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.GuideCategoriesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.I18nLanguagesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.I18nRegionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveBroadcastsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveChatBansCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveChatMessagesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveChatModeratorsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveStreamsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.PlaylistItemsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.PlaylistsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.SearchCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.SponsorsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.SubscriptionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.SuperChatEventsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.ThumbnailsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.VideoAbuseReportReasonsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.VideoCategoriesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.VideosCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection.WatermarksCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.AccessPolicy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Activity
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsBulletin
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsChannelItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsComment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsFavorite
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsLike
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsPlaylistItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsPromotedItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsRecommendation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsSocial
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsSubscription
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsUpload
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivitySnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Caption
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CaptionListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CaptionSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CdnSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Channel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelAuditDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelBannerResource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelBrandingSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelContentDetailsRelatedPlaylists
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelContentOwnerDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelConversionPing
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelConversionPings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelLocalization
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelProfileDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionLocalization
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionTargeting
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelStatistics
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelTopicDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Comment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThread
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThreadListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThreadReplies
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThreadSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ContentRating
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.GeoPoint
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.GuideCategoryListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.I18nLanguageListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.I18nRegionListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ImageSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.IngestionInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoBranding
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoPosition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoPromotion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoTiming
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LanguageTag
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcast
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastStatistics
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBan
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBanSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatFanFundingEventDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessage
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageAuthorDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageDeletedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageRetractedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatModerator
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatModeratorListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatModeratorSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollClosedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollEditedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollOpenedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollVotedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatSuperChatDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatSuperStickerDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatTextMessageDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatUserBannedMessageDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStream
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamConfigurationIssue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamHealthStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LocalizedProperty
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LocalizedString
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.MonitorStreamInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Playlist
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistLocalization
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistPlayer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PromotedItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PromotedItemId
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.PropertyValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ResourceId
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SearchListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SponsorListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Subscription
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionSubscriberSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SuperChatEventListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.SuperStickerMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Thumbnail
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ThumbnailDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.ThumbnailSetResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.Video
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoAbuseReport
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoAbuseReportReasonListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoAgeGating
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoCategoryListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoContentDetailsRegionRestriction
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoFileDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoFileDetailsAudioStream
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoFileDetailsVideoStream
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoGetRatingResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoLiveStreamingDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoLocalization
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoMonetizationDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoPlayer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoProcessingDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoProcessingDetailsProcessingProgress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoProjectDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoRecordingDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoSnippet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoStatistics
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoSuggestions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoSuggestionsTagSuggestion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoTopicDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.WatchSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTube extends StObject {
  
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
  
  var Captions: js.UndefOr[CaptionsCollection] = js.undefined
  
  var ChannelBanners: js.UndefOr[ChannelBannersCollection] = js.undefined
  
  var ChannelSections: js.UndefOr[ChannelSectionsCollection] = js.undefined
  
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  
  var CommentThreads: js.UndefOr[CommentThreadsCollection] = js.undefined
  
  var Comments: js.UndefOr[CommentsCollection] = js.undefined
  
  var GuideCategories: js.UndefOr[GuideCategoriesCollection] = js.undefined
  
  var I18nLanguages: js.UndefOr[I18nLanguagesCollection] = js.undefined
  
  var I18nRegions: js.UndefOr[I18nRegionsCollection] = js.undefined
  
  var LiveBroadcasts: js.UndefOr[LiveBroadcastsCollection] = js.undefined
  
  var LiveChatBans: js.UndefOr[LiveChatBansCollection] = js.undefined
  
  var LiveChatMessages: js.UndefOr[LiveChatMessagesCollection] = js.undefined
  
  var LiveChatModerators: js.UndefOr[LiveChatModeratorsCollection] = js.undefined
  
  var LiveStreams: js.UndefOr[LiveStreamsCollection] = js.undefined
  
  var PlaylistItems: js.UndefOr[PlaylistItemsCollection] = js.undefined
  
  var Playlists: js.UndefOr[PlaylistsCollection] = js.undefined
  
  var Search: js.UndefOr[SearchCollection] = js.undefined
  
  var Sponsors: js.UndefOr[SponsorsCollection] = js.undefined
  
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.undefined
  
  var SuperChatEvents: js.UndefOr[SuperChatEventsCollection] = js.undefined
  
  var Thumbnails: js.UndefOr[ThumbnailsCollection] = js.undefined
  
  var VideoAbuseReportReasons: js.UndefOr[VideoAbuseReportReasonsCollection] = js.undefined
  
  var VideoCategories: js.UndefOr[VideoCategoriesCollection] = js.undefined
  
  var Videos: js.UndefOr[VideosCollection] = js.undefined
  
  var Watermarks: js.UndefOr[WatermarksCollection] = js.undefined
  
  // Create a new instance of AccessPolicy
  def newAccessPolicy(): AccessPolicy
  
  // Create a new instance of Activity
  def newActivity(): Activity
  
  // Create a new instance of ActivityContentDetails
  def newActivityContentDetails(): ActivityContentDetails
  
  // Create a new instance of ActivityContentDetailsBulletin
  def newActivityContentDetailsBulletin(): ActivityContentDetailsBulletin
  
  // Create a new instance of ActivityContentDetailsChannelItem
  def newActivityContentDetailsChannelItem(): ActivityContentDetailsChannelItem
  
  // Create a new instance of ActivityContentDetailsComment
  def newActivityContentDetailsComment(): ActivityContentDetailsComment
  
  // Create a new instance of ActivityContentDetailsFavorite
  def newActivityContentDetailsFavorite(): ActivityContentDetailsFavorite
  
  // Create a new instance of ActivityContentDetailsLike
  def newActivityContentDetailsLike(): ActivityContentDetailsLike
  
  // Create a new instance of ActivityContentDetailsPlaylistItem
  def newActivityContentDetailsPlaylistItem(): ActivityContentDetailsPlaylistItem
  
  // Create a new instance of ActivityContentDetailsPromotedItem
  def newActivityContentDetailsPromotedItem(): ActivityContentDetailsPromotedItem
  
  // Create a new instance of ActivityContentDetailsRecommendation
  def newActivityContentDetailsRecommendation(): ActivityContentDetailsRecommendation
  
  // Create a new instance of ActivityContentDetailsSocial
  def newActivityContentDetailsSocial(): ActivityContentDetailsSocial
  
  // Create a new instance of ActivityContentDetailsSubscription
  def newActivityContentDetailsSubscription(): ActivityContentDetailsSubscription
  
  // Create a new instance of ActivityContentDetailsUpload
  def newActivityContentDetailsUpload(): ActivityContentDetailsUpload
  
  // Create a new instance of ActivitySnippet
  def newActivitySnippet(): ActivitySnippet
  
  // Create a new instance of Caption
  def newCaption(): Caption
  
  // Create a new instance of CaptionSnippet
  def newCaptionSnippet(): CaptionSnippet
  
  // Create a new instance of CdnSettings
  def newCdnSettings(): CdnSettings
  
  // Create a new instance of Channel
  def newChannel(): Channel
  
  // Create a new instance of ChannelAuditDetails
  def newChannelAuditDetails(): ChannelAuditDetails
  
  // Create a new instance of ChannelBannerResource
  def newChannelBannerResource(): ChannelBannerResource
  
  // Create a new instance of ChannelBrandingSettings
  def newChannelBrandingSettings(): ChannelBrandingSettings
  
  // Create a new instance of ChannelContentDetails
  def newChannelContentDetails(): ChannelContentDetails
  
  // Create a new instance of ChannelContentDetailsRelatedPlaylists
  def newChannelContentDetailsRelatedPlaylists(): ChannelContentDetailsRelatedPlaylists
  
  // Create a new instance of ChannelContentOwnerDetails
  def newChannelContentOwnerDetails(): ChannelContentOwnerDetails
  
  // Create a new instance of ChannelConversionPing
  def newChannelConversionPing(): ChannelConversionPing
  
  // Create a new instance of ChannelConversionPings
  def newChannelConversionPings(): ChannelConversionPings
  
  // Create a new instance of ChannelLocalization
  def newChannelLocalization(): ChannelLocalization
  
  // Create a new instance of ChannelProfileDetails
  def newChannelProfileDetails(): ChannelProfileDetails
  
  // Create a new instance of ChannelSection
  def newChannelSection(): ChannelSection
  
  // Create a new instance of ChannelSectionContentDetails
  def newChannelSectionContentDetails(): ChannelSectionContentDetails
  
  // Create a new instance of ChannelSectionLocalization
  def newChannelSectionLocalization(): ChannelSectionLocalization
  
  // Create a new instance of ChannelSectionSnippet
  def newChannelSectionSnippet(): ChannelSectionSnippet
  
  // Create a new instance of ChannelSectionTargeting
  def newChannelSectionTargeting(): ChannelSectionTargeting
  
  // Create a new instance of ChannelSettings
  def newChannelSettings(): ChannelSettings
  
  // Create a new instance of ChannelSnippet
  def newChannelSnippet(): ChannelSnippet
  
  // Create a new instance of ChannelStatistics
  def newChannelStatistics(): ChannelStatistics
  
  // Create a new instance of ChannelStatus
  def newChannelStatus(): ChannelStatus
  
  // Create a new instance of ChannelTopicDetails
  def newChannelTopicDetails(): ChannelTopicDetails
  
  // Create a new instance of Comment
  def newComment(): Comment
  
  // Create a new instance of CommentSnippet
  def newCommentSnippet(): CommentSnippet
  
  // Create a new instance of CommentThread
  def newCommentThread(): CommentThread
  
  // Create a new instance of CommentThreadReplies
  def newCommentThreadReplies(): CommentThreadReplies
  
  // Create a new instance of CommentThreadSnippet
  def newCommentThreadSnippet(): CommentThreadSnippet
  
  // Create a new instance of ContentRating
  def newContentRating(): ContentRating
  
  // Create a new instance of GeoPoint
  def newGeoPoint(): GeoPoint
  
  // Create a new instance of ImageSettings
  def newImageSettings(): ImageSettings
  
  // Create a new instance of IngestionInfo
  def newIngestionInfo(): IngestionInfo
  
  // Create a new instance of InvideoBranding
  def newInvideoBranding(): InvideoBranding
  
  // Create a new instance of InvideoPosition
  def newInvideoPosition(): InvideoPosition
  
  // Create a new instance of InvideoPromotion
  def newInvideoPromotion(): InvideoPromotion
  
  // Create a new instance of InvideoTiming
  def newInvideoTiming(): InvideoTiming
  
  // Create a new instance of LanguageTag
  def newLanguageTag(): LanguageTag
  
  // Create a new instance of LiveBroadcast
  def newLiveBroadcast(): LiveBroadcast
  
  // Create a new instance of LiveBroadcastContentDetails
  def newLiveBroadcastContentDetails(): LiveBroadcastContentDetails
  
  // Create a new instance of LiveBroadcastSnippet
  def newLiveBroadcastSnippet(): LiveBroadcastSnippet
  
  // Create a new instance of LiveBroadcastStatistics
  def newLiveBroadcastStatistics(): LiveBroadcastStatistics
  
  // Create a new instance of LiveBroadcastStatus
  def newLiveBroadcastStatus(): LiveBroadcastStatus
  
  // Create a new instance of LiveChatBan
  def newLiveChatBan(): LiveChatBan
  
  // Create a new instance of LiveChatBanSnippet
  def newLiveChatBanSnippet(): LiveChatBanSnippet
  
  // Create a new instance of LiveChatFanFundingEventDetails
  def newLiveChatFanFundingEventDetails(): LiveChatFanFundingEventDetails
  
  // Create a new instance of LiveChatMessage
  def newLiveChatMessage(): LiveChatMessage
  
  // Create a new instance of LiveChatMessageAuthorDetails
  def newLiveChatMessageAuthorDetails(): LiveChatMessageAuthorDetails
  
  // Create a new instance of LiveChatMessageDeletedDetails
  def newLiveChatMessageDeletedDetails(): LiveChatMessageDeletedDetails
  
  // Create a new instance of LiveChatMessageRetractedDetails
  def newLiveChatMessageRetractedDetails(): LiveChatMessageRetractedDetails
  
  // Create a new instance of LiveChatMessageSnippet
  def newLiveChatMessageSnippet(): LiveChatMessageSnippet
  
  // Create a new instance of LiveChatModerator
  def newLiveChatModerator(): LiveChatModerator
  
  // Create a new instance of LiveChatModeratorSnippet
  def newLiveChatModeratorSnippet(): LiveChatModeratorSnippet
  
  // Create a new instance of LiveChatPollClosedDetails
  def newLiveChatPollClosedDetails(): LiveChatPollClosedDetails
  
  // Create a new instance of LiveChatPollEditedDetails
  def newLiveChatPollEditedDetails(): LiveChatPollEditedDetails
  
  // Create a new instance of LiveChatPollItem
  def newLiveChatPollItem(): LiveChatPollItem
  
  // Create a new instance of LiveChatPollOpenedDetails
  def newLiveChatPollOpenedDetails(): LiveChatPollOpenedDetails
  
  // Create a new instance of LiveChatPollVotedDetails
  def newLiveChatPollVotedDetails(): LiveChatPollVotedDetails
  
  // Create a new instance of LiveChatSuperChatDetails
  def newLiveChatSuperChatDetails(): LiveChatSuperChatDetails
  
  // Create a new instance of LiveChatSuperStickerDetails
  def newLiveChatSuperStickerDetails(): LiveChatSuperStickerDetails
  
  // Create a new instance of LiveChatTextMessageDetails
  def newLiveChatTextMessageDetails(): LiveChatTextMessageDetails
  
  // Create a new instance of LiveChatUserBannedMessageDetails
  def newLiveChatUserBannedMessageDetails(): LiveChatUserBannedMessageDetails
  
  // Create a new instance of LiveStream
  def newLiveStream(): LiveStream
  
  // Create a new instance of LiveStreamConfigurationIssue
  def newLiveStreamConfigurationIssue(): LiveStreamConfigurationIssue
  
  // Create a new instance of LiveStreamContentDetails
  def newLiveStreamContentDetails(): LiveStreamContentDetails
  
  // Create a new instance of LiveStreamHealthStatus
  def newLiveStreamHealthStatus(): LiveStreamHealthStatus
  
  // Create a new instance of LiveStreamSnippet
  def newLiveStreamSnippet(): LiveStreamSnippet
  
  // Create a new instance of LiveStreamStatus
  def newLiveStreamStatus(): LiveStreamStatus
  
  // Create a new instance of LocalizedProperty
  def newLocalizedProperty(): LocalizedProperty
  
  // Create a new instance of LocalizedString
  def newLocalizedString(): LocalizedString
  
  // Create a new instance of MonitorStreamInfo
  def newMonitorStreamInfo(): MonitorStreamInfo
  
  // Create a new instance of Playlist
  def newPlaylist(): Playlist
  
  // Create a new instance of PlaylistContentDetails
  def newPlaylistContentDetails(): PlaylistContentDetails
  
  // Create a new instance of PlaylistItem
  def newPlaylistItem(): PlaylistItem
  
  // Create a new instance of PlaylistItemContentDetails
  def newPlaylistItemContentDetails(): PlaylistItemContentDetails
  
  // Create a new instance of PlaylistItemSnippet
  def newPlaylistItemSnippet(): PlaylistItemSnippet
  
  // Create a new instance of PlaylistItemStatus
  def newPlaylistItemStatus(): PlaylistItemStatus
  
  // Create a new instance of PlaylistLocalization
  def newPlaylistLocalization(): PlaylistLocalization
  
  // Create a new instance of PlaylistPlayer
  def newPlaylistPlayer(): PlaylistPlayer
  
  // Create a new instance of PlaylistSnippet
  def newPlaylistSnippet(): PlaylistSnippet
  
  // Create a new instance of PlaylistStatus
  def newPlaylistStatus(): PlaylistStatus
  
  // Create a new instance of PromotedItem
  def newPromotedItem(): PromotedItem
  
  // Create a new instance of PromotedItemId
  def newPromotedItemId(): PromotedItemId
  
  // Create a new instance of PropertyValue
  def newPropertyValue(): PropertyValue
  
  // Create a new instance of ResourceId
  def newResourceId(): ResourceId
  
  // Create a new instance of Subscription
  def newSubscription(): Subscription
  
  // Create a new instance of SubscriptionContentDetails
  def newSubscriptionContentDetails(): SubscriptionContentDetails
  
  // Create a new instance of SubscriptionSnippet
  def newSubscriptionSnippet(): SubscriptionSnippet
  
  // Create a new instance of SubscriptionSubscriberSnippet
  def newSubscriptionSubscriberSnippet(): SubscriptionSubscriberSnippet
  
  // Create a new instance of SuperStickerMetadata
  def newSuperStickerMetadata(): SuperStickerMetadata
  
  // Create a new instance of Thumbnail
  def newThumbnail(): Thumbnail
  
  // Create a new instance of ThumbnailDetails
  def newThumbnailDetails(): ThumbnailDetails
  
  // Create a new instance of Video
  def newVideo(): Video
  
  // Create a new instance of VideoAbuseReport
  def newVideoAbuseReport(): VideoAbuseReport
  
  // Create a new instance of VideoAgeGating
  def newVideoAgeGating(): VideoAgeGating
  
  // Create a new instance of VideoContentDetails
  def newVideoContentDetails(): VideoContentDetails
  
  // Create a new instance of VideoContentDetailsRegionRestriction
  def newVideoContentDetailsRegionRestriction(): VideoContentDetailsRegionRestriction
  
  // Create a new instance of VideoFileDetails
  def newVideoFileDetails(): VideoFileDetails
  
  // Create a new instance of VideoFileDetailsAudioStream
  def newVideoFileDetailsAudioStream(): VideoFileDetailsAudioStream
  
  // Create a new instance of VideoFileDetailsVideoStream
  def newVideoFileDetailsVideoStream(): VideoFileDetailsVideoStream
  
  // Create a new instance of VideoLiveStreamingDetails
  def newVideoLiveStreamingDetails(): VideoLiveStreamingDetails
  
  // Create a new instance of VideoLocalization
  def newVideoLocalization(): VideoLocalization
  
  // Create a new instance of VideoMonetizationDetails
  def newVideoMonetizationDetails(): VideoMonetizationDetails
  
  // Create a new instance of VideoPlayer
  def newVideoPlayer(): VideoPlayer
  
  // Create a new instance of VideoProcessingDetails
  def newVideoProcessingDetails(): VideoProcessingDetails
  
  // Create a new instance of VideoProcessingDetailsProcessingProgress
  def newVideoProcessingDetailsProcessingProgress(): VideoProcessingDetailsProcessingProgress
  
  // Create a new instance of VideoProjectDetails
  def newVideoProjectDetails(): VideoProjectDetails
  
  // Create a new instance of VideoRecordingDetails
  def newVideoRecordingDetails(): VideoRecordingDetails
  
  // Create a new instance of VideoSnippet
  def newVideoSnippet(): VideoSnippet
  
  // Create a new instance of VideoStatistics
  def newVideoStatistics(): VideoStatistics
  
  // Create a new instance of VideoStatus
  def newVideoStatus(): VideoStatus
  
  // Create a new instance of VideoSuggestions
  def newVideoSuggestions(): VideoSuggestions
  
  // Create a new instance of VideoSuggestionsTagSuggestion
  def newVideoSuggestionsTagSuggestion(): VideoSuggestionsTagSuggestion
  
  // Create a new instance of VideoTopicDetails
  def newVideoTopicDetails(): VideoTopicDetails
  
  // Create a new instance of WatchSettings
  def newWatchSettings(): WatchSettings
}
object YouTube {
  
  inline def apply(
    newAccessPolicy: CallbackTo[AccessPolicy],
    newActivity: CallbackTo[Activity],
    newActivityContentDetails: CallbackTo[ActivityContentDetails],
    newActivityContentDetailsBulletin: CallbackTo[ActivityContentDetailsBulletin],
    newActivityContentDetailsChannelItem: CallbackTo[ActivityContentDetailsChannelItem],
    newActivityContentDetailsComment: CallbackTo[ActivityContentDetailsComment],
    newActivityContentDetailsFavorite: CallbackTo[ActivityContentDetailsFavorite],
    newActivityContentDetailsLike: CallbackTo[ActivityContentDetailsLike],
    newActivityContentDetailsPlaylistItem: CallbackTo[ActivityContentDetailsPlaylistItem],
    newActivityContentDetailsPromotedItem: CallbackTo[ActivityContentDetailsPromotedItem],
    newActivityContentDetailsRecommendation: CallbackTo[ActivityContentDetailsRecommendation],
    newActivityContentDetailsSocial: CallbackTo[ActivityContentDetailsSocial],
    newActivityContentDetailsSubscription: CallbackTo[ActivityContentDetailsSubscription],
    newActivityContentDetailsUpload: CallbackTo[ActivityContentDetailsUpload],
    newActivitySnippet: CallbackTo[ActivitySnippet],
    newCaption: CallbackTo[Caption],
    newCaptionSnippet: CallbackTo[CaptionSnippet],
    newCdnSettings: CallbackTo[CdnSettings],
    newChannel: CallbackTo[Channel],
    newChannelAuditDetails: CallbackTo[ChannelAuditDetails],
    newChannelBannerResource: CallbackTo[ChannelBannerResource],
    newChannelBrandingSettings: CallbackTo[ChannelBrandingSettings],
    newChannelContentDetails: CallbackTo[ChannelContentDetails],
    newChannelContentDetailsRelatedPlaylists: CallbackTo[ChannelContentDetailsRelatedPlaylists],
    newChannelContentOwnerDetails: CallbackTo[ChannelContentOwnerDetails],
    newChannelConversionPing: CallbackTo[ChannelConversionPing],
    newChannelConversionPings: CallbackTo[ChannelConversionPings],
    newChannelLocalization: CallbackTo[ChannelLocalization],
    newChannelProfileDetails: CallbackTo[ChannelProfileDetails],
    newChannelSection: CallbackTo[ChannelSection],
    newChannelSectionContentDetails: CallbackTo[ChannelSectionContentDetails],
    newChannelSectionLocalization: CallbackTo[ChannelSectionLocalization],
    newChannelSectionSnippet: CallbackTo[ChannelSectionSnippet],
    newChannelSectionTargeting: CallbackTo[ChannelSectionTargeting],
    newChannelSettings: CallbackTo[ChannelSettings],
    newChannelSnippet: CallbackTo[ChannelSnippet],
    newChannelStatistics: CallbackTo[ChannelStatistics],
    newChannelStatus: CallbackTo[ChannelStatus],
    newChannelTopicDetails: CallbackTo[ChannelTopicDetails],
    newComment: CallbackTo[Comment],
    newCommentSnippet: CallbackTo[CommentSnippet],
    newCommentThread: CallbackTo[CommentThread],
    newCommentThreadReplies: CallbackTo[CommentThreadReplies],
    newCommentThreadSnippet: CallbackTo[CommentThreadSnippet],
    newContentRating: CallbackTo[ContentRating],
    newGeoPoint: CallbackTo[GeoPoint],
    newImageSettings: CallbackTo[ImageSettings],
    newIngestionInfo: CallbackTo[IngestionInfo],
    newInvideoBranding: CallbackTo[InvideoBranding],
    newInvideoPosition: CallbackTo[InvideoPosition],
    newInvideoPromotion: CallbackTo[InvideoPromotion],
    newInvideoTiming: CallbackTo[InvideoTiming],
    newLanguageTag: CallbackTo[LanguageTag],
    newLiveBroadcast: CallbackTo[LiveBroadcast],
    newLiveBroadcastContentDetails: CallbackTo[LiveBroadcastContentDetails],
    newLiveBroadcastSnippet: CallbackTo[LiveBroadcastSnippet],
    newLiveBroadcastStatistics: CallbackTo[LiveBroadcastStatistics],
    newLiveBroadcastStatus: CallbackTo[LiveBroadcastStatus],
    newLiveChatBan: CallbackTo[LiveChatBan],
    newLiveChatBanSnippet: CallbackTo[LiveChatBanSnippet],
    newLiveChatFanFundingEventDetails: CallbackTo[LiveChatFanFundingEventDetails],
    newLiveChatMessage: CallbackTo[LiveChatMessage],
    newLiveChatMessageAuthorDetails: CallbackTo[LiveChatMessageAuthorDetails],
    newLiveChatMessageDeletedDetails: CallbackTo[LiveChatMessageDeletedDetails],
    newLiveChatMessageRetractedDetails: CallbackTo[LiveChatMessageRetractedDetails],
    newLiveChatMessageSnippet: CallbackTo[LiveChatMessageSnippet],
    newLiveChatModerator: CallbackTo[LiveChatModerator],
    newLiveChatModeratorSnippet: CallbackTo[LiveChatModeratorSnippet],
    newLiveChatPollClosedDetails: CallbackTo[LiveChatPollClosedDetails],
    newLiveChatPollEditedDetails: CallbackTo[LiveChatPollEditedDetails],
    newLiveChatPollItem: CallbackTo[LiveChatPollItem],
    newLiveChatPollOpenedDetails: CallbackTo[LiveChatPollOpenedDetails],
    newLiveChatPollVotedDetails: CallbackTo[LiveChatPollVotedDetails],
    newLiveChatSuperChatDetails: CallbackTo[LiveChatSuperChatDetails],
    newLiveChatSuperStickerDetails: CallbackTo[LiveChatSuperStickerDetails],
    newLiveChatTextMessageDetails: CallbackTo[LiveChatTextMessageDetails],
    newLiveChatUserBannedMessageDetails: CallbackTo[LiveChatUserBannedMessageDetails],
    newLiveStream: CallbackTo[LiveStream],
    newLiveStreamConfigurationIssue: CallbackTo[LiveStreamConfigurationIssue],
    newLiveStreamContentDetails: CallbackTo[LiveStreamContentDetails],
    newLiveStreamHealthStatus: CallbackTo[LiveStreamHealthStatus],
    newLiveStreamSnippet: CallbackTo[LiveStreamSnippet],
    newLiveStreamStatus: CallbackTo[LiveStreamStatus],
    newLocalizedProperty: CallbackTo[LocalizedProperty],
    newLocalizedString: CallbackTo[LocalizedString],
    newMonitorStreamInfo: CallbackTo[MonitorStreamInfo],
    newPlaylist: CallbackTo[Playlist],
    newPlaylistContentDetails: CallbackTo[PlaylistContentDetails],
    newPlaylistItem: CallbackTo[PlaylistItem],
    newPlaylistItemContentDetails: CallbackTo[PlaylistItemContentDetails],
    newPlaylistItemSnippet: CallbackTo[PlaylistItemSnippet],
    newPlaylistItemStatus: CallbackTo[PlaylistItemStatus],
    newPlaylistLocalization: CallbackTo[PlaylistLocalization],
    newPlaylistPlayer: CallbackTo[PlaylistPlayer],
    newPlaylistSnippet: CallbackTo[PlaylistSnippet],
    newPlaylistStatus: CallbackTo[PlaylistStatus],
    newPromotedItem: CallbackTo[PromotedItem],
    newPromotedItemId: CallbackTo[PromotedItemId],
    newPropertyValue: CallbackTo[PropertyValue],
    newResourceId: CallbackTo[ResourceId],
    newSubscription: CallbackTo[Subscription],
    newSubscriptionContentDetails: CallbackTo[SubscriptionContentDetails],
    newSubscriptionSnippet: CallbackTo[SubscriptionSnippet],
    newSubscriptionSubscriberSnippet: CallbackTo[SubscriptionSubscriberSnippet],
    newSuperStickerMetadata: CallbackTo[SuperStickerMetadata],
    newThumbnail: CallbackTo[Thumbnail],
    newThumbnailDetails: CallbackTo[ThumbnailDetails],
    newVideo: CallbackTo[Video],
    newVideoAbuseReport: CallbackTo[VideoAbuseReport],
    newVideoAgeGating: CallbackTo[VideoAgeGating],
    newVideoContentDetails: CallbackTo[VideoContentDetails],
    newVideoContentDetailsRegionRestriction: CallbackTo[VideoContentDetailsRegionRestriction],
    newVideoFileDetails: CallbackTo[VideoFileDetails],
    newVideoFileDetailsAudioStream: CallbackTo[VideoFileDetailsAudioStream],
    newVideoFileDetailsVideoStream: CallbackTo[VideoFileDetailsVideoStream],
    newVideoLiveStreamingDetails: CallbackTo[VideoLiveStreamingDetails],
    newVideoLocalization: CallbackTo[VideoLocalization],
    newVideoMonetizationDetails: CallbackTo[VideoMonetizationDetails],
    newVideoPlayer: CallbackTo[VideoPlayer],
    newVideoProcessingDetails: CallbackTo[VideoProcessingDetails],
    newVideoProcessingDetailsProcessingProgress: CallbackTo[VideoProcessingDetailsProcessingProgress],
    newVideoProjectDetails: CallbackTo[VideoProjectDetails],
    newVideoRecordingDetails: CallbackTo[VideoRecordingDetails],
    newVideoSnippet: CallbackTo[VideoSnippet],
    newVideoStatistics: CallbackTo[VideoStatistics],
    newVideoStatus: CallbackTo[VideoStatus],
    newVideoSuggestions: CallbackTo[VideoSuggestions],
    newVideoSuggestionsTagSuggestion: CallbackTo[VideoSuggestionsTagSuggestion],
    newVideoTopicDetails: CallbackTo[VideoTopicDetails],
    newWatchSettings: CallbackTo[WatchSettings]
  ): YouTube = {
    val __obj = js.Dynamic.literal(newAccessPolicy = newAccessPolicy.toJsFn, newActivity = newActivity.toJsFn, newActivityContentDetails = newActivityContentDetails.toJsFn, newActivityContentDetailsBulletin = newActivityContentDetailsBulletin.toJsFn, newActivityContentDetailsChannelItem = newActivityContentDetailsChannelItem.toJsFn, newActivityContentDetailsComment = newActivityContentDetailsComment.toJsFn, newActivityContentDetailsFavorite = newActivityContentDetailsFavorite.toJsFn, newActivityContentDetailsLike = newActivityContentDetailsLike.toJsFn, newActivityContentDetailsPlaylistItem = newActivityContentDetailsPlaylistItem.toJsFn, newActivityContentDetailsPromotedItem = newActivityContentDetailsPromotedItem.toJsFn, newActivityContentDetailsRecommendation = newActivityContentDetailsRecommendation.toJsFn, newActivityContentDetailsSocial = newActivityContentDetailsSocial.toJsFn, newActivityContentDetailsSubscription = newActivityContentDetailsSubscription.toJsFn, newActivityContentDetailsUpload = newActivityContentDetailsUpload.toJsFn, newActivitySnippet = newActivitySnippet.toJsFn, newCaption = newCaption.toJsFn, newCaptionSnippet = newCaptionSnippet.toJsFn, newCdnSettings = newCdnSettings.toJsFn, newChannel = newChannel.toJsFn, newChannelAuditDetails = newChannelAuditDetails.toJsFn, newChannelBannerResource = newChannelBannerResource.toJsFn, newChannelBrandingSettings = newChannelBrandingSettings.toJsFn, newChannelContentDetails = newChannelContentDetails.toJsFn, newChannelContentDetailsRelatedPlaylists = newChannelContentDetailsRelatedPlaylists.toJsFn, newChannelContentOwnerDetails = newChannelContentOwnerDetails.toJsFn, newChannelConversionPing = newChannelConversionPing.toJsFn, newChannelConversionPings = newChannelConversionPings.toJsFn, newChannelLocalization = newChannelLocalization.toJsFn, newChannelProfileDetails = newChannelProfileDetails.toJsFn, newChannelSection = newChannelSection.toJsFn, newChannelSectionContentDetails = newChannelSectionContentDetails.toJsFn, newChannelSectionLocalization = newChannelSectionLocalization.toJsFn, newChannelSectionSnippet = newChannelSectionSnippet.toJsFn, newChannelSectionTargeting = newChannelSectionTargeting.toJsFn, newChannelSettings = newChannelSettings.toJsFn, newChannelSnippet = newChannelSnippet.toJsFn, newChannelStatistics = newChannelStatistics.toJsFn, newChannelStatus = newChannelStatus.toJsFn, newChannelTopicDetails = newChannelTopicDetails.toJsFn, newComment = newComment.toJsFn, newCommentSnippet = newCommentSnippet.toJsFn, newCommentThread = newCommentThread.toJsFn, newCommentThreadReplies = newCommentThreadReplies.toJsFn, newCommentThreadSnippet = newCommentThreadSnippet.toJsFn, newContentRating = newContentRating.toJsFn, newGeoPoint = newGeoPoint.toJsFn, newImageSettings = newImageSettings.toJsFn, newIngestionInfo = newIngestionInfo.toJsFn, newInvideoBranding = newInvideoBranding.toJsFn, newInvideoPosition = newInvideoPosition.toJsFn, newInvideoPromotion = newInvideoPromotion.toJsFn, newInvideoTiming = newInvideoTiming.toJsFn, newLanguageTag = newLanguageTag.toJsFn, newLiveBroadcast = newLiveBroadcast.toJsFn, newLiveBroadcastContentDetails = newLiveBroadcastContentDetails.toJsFn, newLiveBroadcastSnippet = newLiveBroadcastSnippet.toJsFn, newLiveBroadcastStatistics = newLiveBroadcastStatistics.toJsFn, newLiveBroadcastStatus = newLiveBroadcastStatus.toJsFn, newLiveChatBan = newLiveChatBan.toJsFn, newLiveChatBanSnippet = newLiveChatBanSnippet.toJsFn, newLiveChatFanFundingEventDetails = newLiveChatFanFundingEventDetails.toJsFn, newLiveChatMessage = newLiveChatMessage.toJsFn, newLiveChatMessageAuthorDetails = newLiveChatMessageAuthorDetails.toJsFn, newLiveChatMessageDeletedDetails = newLiveChatMessageDeletedDetails.toJsFn, newLiveChatMessageRetractedDetails = newLiveChatMessageRetractedDetails.toJsFn, newLiveChatMessageSnippet = newLiveChatMessageSnippet.toJsFn, newLiveChatModerator = newLiveChatModerator.toJsFn, newLiveChatModeratorSnippet = newLiveChatModeratorSnippet.toJsFn, newLiveChatPollClosedDetails = newLiveChatPollClosedDetails.toJsFn, newLiveChatPollEditedDetails = newLiveChatPollEditedDetails.toJsFn, newLiveChatPollItem = newLiveChatPollItem.toJsFn, newLiveChatPollOpenedDetails = newLiveChatPollOpenedDetails.toJsFn, newLiveChatPollVotedDetails = newLiveChatPollVotedDetails.toJsFn, newLiveChatSuperChatDetails = newLiveChatSuperChatDetails.toJsFn, newLiveChatSuperStickerDetails = newLiveChatSuperStickerDetails.toJsFn, newLiveChatTextMessageDetails = newLiveChatTextMessageDetails.toJsFn, newLiveChatUserBannedMessageDetails = newLiveChatUserBannedMessageDetails.toJsFn, newLiveStream = newLiveStream.toJsFn, newLiveStreamConfigurationIssue = newLiveStreamConfigurationIssue.toJsFn, newLiveStreamContentDetails = newLiveStreamContentDetails.toJsFn, newLiveStreamHealthStatus = newLiveStreamHealthStatus.toJsFn, newLiveStreamSnippet = newLiveStreamSnippet.toJsFn, newLiveStreamStatus = newLiveStreamStatus.toJsFn, newLocalizedProperty = newLocalizedProperty.toJsFn, newLocalizedString = newLocalizedString.toJsFn, newMonitorStreamInfo = newMonitorStreamInfo.toJsFn, newPlaylist = newPlaylist.toJsFn, newPlaylistContentDetails = newPlaylistContentDetails.toJsFn, newPlaylistItem = newPlaylistItem.toJsFn, newPlaylistItemContentDetails = newPlaylistItemContentDetails.toJsFn, newPlaylistItemSnippet = newPlaylistItemSnippet.toJsFn, newPlaylistItemStatus = newPlaylistItemStatus.toJsFn, newPlaylistLocalization = newPlaylistLocalization.toJsFn, newPlaylistPlayer = newPlaylistPlayer.toJsFn, newPlaylistSnippet = newPlaylistSnippet.toJsFn, newPlaylistStatus = newPlaylistStatus.toJsFn, newPromotedItem = newPromotedItem.toJsFn, newPromotedItemId = newPromotedItemId.toJsFn, newPropertyValue = newPropertyValue.toJsFn, newResourceId = newResourceId.toJsFn, newSubscription = newSubscription.toJsFn, newSubscriptionContentDetails = newSubscriptionContentDetails.toJsFn, newSubscriptionSnippet = newSubscriptionSnippet.toJsFn, newSubscriptionSubscriberSnippet = newSubscriptionSubscriberSnippet.toJsFn, newSuperStickerMetadata = newSuperStickerMetadata.toJsFn, newThumbnail = newThumbnail.toJsFn, newThumbnailDetails = newThumbnailDetails.toJsFn, newVideo = newVideo.toJsFn, newVideoAbuseReport = newVideoAbuseReport.toJsFn, newVideoAgeGating = newVideoAgeGating.toJsFn, newVideoContentDetails = newVideoContentDetails.toJsFn, newVideoContentDetailsRegionRestriction = newVideoContentDetailsRegionRestriction.toJsFn, newVideoFileDetails = newVideoFileDetails.toJsFn, newVideoFileDetailsAudioStream = newVideoFileDetailsAudioStream.toJsFn, newVideoFileDetailsVideoStream = newVideoFileDetailsVideoStream.toJsFn, newVideoLiveStreamingDetails = newVideoLiveStreamingDetails.toJsFn, newVideoLocalization = newVideoLocalization.toJsFn, newVideoMonetizationDetails = newVideoMonetizationDetails.toJsFn, newVideoPlayer = newVideoPlayer.toJsFn, newVideoProcessingDetails = newVideoProcessingDetails.toJsFn, newVideoProcessingDetailsProcessingProgress = newVideoProcessingDetailsProcessingProgress.toJsFn, newVideoProjectDetails = newVideoProjectDetails.toJsFn, newVideoRecordingDetails = newVideoRecordingDetails.toJsFn, newVideoSnippet = newVideoSnippet.toJsFn, newVideoStatistics = newVideoStatistics.toJsFn, newVideoStatus = newVideoStatus.toJsFn, newVideoSuggestions = newVideoSuggestions.toJsFn, newVideoSuggestionsTagSuggestion = newVideoSuggestionsTagSuggestion.toJsFn, newVideoTopicDetails = newVideoTopicDetails.toJsFn, newWatchSettings = newWatchSettings.toJsFn)
    __obj.asInstanceOf[YouTube]
  }
  
  object Collection {
    
    @js.native
    trait ActivitiesCollection extends StObject {
      
      // Posts a bulletin for a specific channel. (The user submitting the request must be authorized to act on the channel's behalf.)
      // Note: Even though an activity resource can contain information about actions like a user rating a video or marking a video as a favorite, you need to use other API methods to generate those activity resources. For example, you would use the API's videos.rate() method to rate a video and the playlistItems.insert() method to mark a video as a favorite.
      def insert(resource: Activity, part: String): Activity = js.native
      
      // Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel, events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
      def list(part: String): ActivityListResponse = js.native
      // Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel, events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
      def list(part: String, optionalArgs: js.Object): ActivityListResponse = js.native
    }
    
    @js.native
    trait CaptionsCollection extends StObject {
      
      // Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its original language unless the request specifies a value for the tlang parameter.
      def download(id: String): Unit = js.native
      // Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its original language unless the request specifies a value for the tlang parameter.
      def download(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Uploads a caption track.
      def insert(resource: Caption, part: String): Caption = js.native
      // Uploads a caption track.
      def insert(resource: Caption, part: String, mediaData: Any): Caption = js.native
      // Uploads a caption track.
      def insert(resource: Caption, part: String, mediaData: Any, optionalArgs: js.Object): Caption = js.native
      
      // Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that the captions.download method provides the ability to retrieve a caption track.
      def list(part: String, videoId: String): CaptionListResponse = js.native
      // Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that the captions.download method provides the ability to retrieve a caption track.
      def list(part: String, videoId: String, optionalArgs: js.Object): CaptionListResponse = js.native
      
      // Deletes a specified caption track.
      def remove(id: String): Unit = js.native
      // Deletes a specified caption track.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
      def update(resource: Caption, part: String): Caption = js.native
      // Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
      def update(resource: Caption, part: String, mediaData: Any): Caption = js.native
      // Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
      def update(resource: Caption, part: String, mediaData: Any, optionalArgs: js.Object): Caption = js.native
    }
    
    @js.native
    trait ChannelBannersCollection extends StObject {
      
      // Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
      // - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
      // - Extract the url property's value from the response that the API returns for step 1.
      // - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
      def insert(resource: ChannelBannerResource): ChannelBannerResource = js.native
      // Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
      // - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
      // - Extract the url property's value from the response that the API returns for step 1.
      // - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
      def insert(resource: ChannelBannerResource, mediaData: Any): ChannelBannerResource = js.native
      // Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
      // - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
      // - Extract the url property's value from the response that the API returns for step 1.
      // - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
      def insert(resource: ChannelBannerResource, mediaData: Any, optionalArgs: js.Object): ChannelBannerResource = js.native
    }
    
    @js.native
    trait ChannelSectionsCollection extends StObject {
      
      // Adds a channelSection for the authenticated user's channel.
      def insert(resource: ChannelSection, part: String): ChannelSection = js.native
      // Adds a channelSection for the authenticated user's channel.
      def insert(resource: ChannelSection, part: String, optionalArgs: js.Object): ChannelSection = js.native
      
      // Returns channelSection resources that match the API request criteria.
      def list(part: String): ChannelSectionListResponse = js.native
      // Returns channelSection resources that match the API request criteria.
      def list(part: String, optionalArgs: js.Object): ChannelSectionListResponse = js.native
      
      // Deletes a channelSection.
      def remove(id: String): Unit = js.native
      // Deletes a channelSection.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Update a channelSection.
      def update(resource: ChannelSection, part: String): ChannelSection = js.native
      // Update a channelSection.
      def update(resource: ChannelSection, part: String, optionalArgs: js.Object): ChannelSection = js.native
    }
    
    @js.native
    trait ChannelsCollection extends StObject {
      
      // Returns a collection of zero or more channel resources that match the request criteria.
      def list(part: String): ChannelListResponse = js.native
      // Returns a collection of zero or more channel resources that match the request criteria.
      def list(part: String, optionalArgs: js.Object): ChannelListResponse = js.native
      
      // Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion objects and their child properties.
      def update(resource: Channel, part: String): Channel = js.native
      // Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion objects and their child properties.
      def update(resource: Channel, part: String, optionalArgs: js.Object): Channel = js.native
    }
    
    @js.native
    trait CommentThreadsCollection extends StObject {
      
      // Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead.
      def insert(resource: CommentThread, part: String): CommentThread = js.native
      
      // Returns a list of comment threads that match the API request parameters.
      def list(part: String): CommentThreadListResponse = js.native
      // Returns a list of comment threads that match the API request parameters.
      def list(part: String, optionalArgs: js.Object): CommentThreadListResponse = js.native
      
      // Modifies the top-level comment in a comment thread.
      def update(resource: CommentThread, part: String): CommentThread = js.native
    }
    
    @js.native
    trait CommentsCollection extends StObject {
      
      // Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method.
      def insert(resource: Comment, part: String): Comment = js.native
      
      // Returns a list of comments that match the API request parameters.
      def list(part: String): CommentListResponse = js.native
      // Returns a list of comments that match the API request parameters.
      def list(part: String, optionalArgs: js.Object): CommentListResponse = js.native
      
      // Expresses the caller's opinion that one or more comments should be flagged as spam.
      def markAsSpam(id: String): Unit = js.native
      
      // Deletes a comment.
      def remove(id: String): Unit = js.native
      
      // Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
      def setModerationStatus(id: String, moderationStatus: String): Unit = js.native
      // Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
      def setModerationStatus(id: String, moderationStatus: String, optionalArgs: js.Object): Unit = js.native
      
      // Modifies a comment.
      def update(resource: Comment, part: String): Comment = js.native
    }
    
    @js.native
    trait GuideCategoriesCollection extends StObject {
      
      // Returns a list of categories that can be associated with YouTube channels.
      def list(part: String): GuideCategoryListResponse = js.native
      // Returns a list of categories that can be associated with YouTube channels.
      def list(part: String, optionalArgs: js.Object): GuideCategoryListResponse = js.native
    }
    
    @js.native
    trait I18nLanguagesCollection extends StObject {
      
      // Returns a list of application languages that the YouTube website supports.
      def list(part: String): I18nLanguageListResponse = js.native
      // Returns a list of application languages that the YouTube website supports.
      def list(part: String, optionalArgs: js.Object): I18nLanguageListResponse = js.native
    }
    
    @js.native
    trait I18nRegionsCollection extends StObject {
      
      // Returns a list of content regions that the YouTube website supports.
      def list(part: String): I18nRegionListResponse = js.native
      // Returns a list of content regions that the YouTube website supports.
      def list(part: String, optionalArgs: js.Object): I18nRegionListResponse = js.native
    }
    
    @js.native
    trait LiveBroadcastsCollection extends StObject {
      
      // Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
      def bind(id: String, part: String): LiveBroadcast = js.native
      // Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
      def bind(id: String, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
      
      // Controls the settings for a slate that can be displayed in the broadcast stream.
      def control(id: String, part: String): LiveBroadcast = js.native
      // Controls the settings for a slate that can be displayed in the broadcast stream.
      def control(id: String, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
      
      // Creates a broadcast.
      def insert(resource: LiveBroadcast, part: String): LiveBroadcast = js.native
      // Creates a broadcast.
      def insert(resource: LiveBroadcast, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
      
      // Returns a list of YouTube broadcasts that match the API request parameters.
      def list(part: String): LiveBroadcastListResponse = js.native
      // Returns a list of YouTube broadcasts that match the API request parameters.
      def list(part: String, optionalArgs: js.Object): LiveBroadcastListResponse = js.native
      
      // Deletes a broadcast.
      def remove(id: String): Unit = js.native
      // Deletes a broadcast.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
      def transition(broadcastStatus: String, id: String, part: String): LiveBroadcast = js.native
      // Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
      def transition(broadcastStatus: String, id: String, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
      
      // Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
      def update(resource: LiveBroadcast, part: String): LiveBroadcast = js.native
      // Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
      def update(resource: LiveBroadcast, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
    }
    
    trait LiveChatBansCollection extends StObject {
      
      // Adds a new ban to the chat.
      def insert(resource: LiveChatBan, part: String): LiveChatBan
      
      // Removes a chat ban.
      def remove(id: String): Unit
    }
    object LiveChatBansCollection {
      
      inline def apply(insert: (LiveChatBan, String) => LiveChatBan, remove: String => Callback): LiveChatBansCollection = {
        val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
        __obj.asInstanceOf[LiveChatBansCollection]
      }
      
      extension [Self <: LiveChatBansCollection](x: Self) {
        
        inline def setInsert(value: (LiveChatBan, String) => LiveChatBan): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
        
        inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
    
    @js.native
    trait LiveChatMessagesCollection extends StObject {
      
      // Adds a message to a live chat.
      def insert(resource: LiveChatMessage, part: String): LiveChatMessage = js.native
      
      // Lists live chat messages for a specific chat.
      def list(liveChatId: String, part: String): LiveChatMessageListResponse = js.native
      // Lists live chat messages for a specific chat.
      def list(liveChatId: String, part: String, optionalArgs: js.Object): LiveChatMessageListResponse = js.native
      
      // Deletes a chat message.
      def remove(id: String): Unit = js.native
    }
    
    @js.native
    trait LiveChatModeratorsCollection extends StObject {
      
      // Adds a new moderator for the chat.
      def insert(resource: LiveChatModerator, part: String): LiveChatModerator = js.native
      
      // Lists moderators for a live chat.
      def list(liveChatId: String, part: String): LiveChatModeratorListResponse = js.native
      // Lists moderators for a live chat.
      def list(liveChatId: String, part: String, optionalArgs: js.Object): LiveChatModeratorListResponse = js.native
      
      // Removes a chat moderator.
      def remove(id: String): Unit = js.native
    }
    
    @js.native
    trait LiveStreamsCollection extends StObject {
      
      // Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
      def insert(resource: LiveStream, part: String): LiveStream = js.native
      // Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
      def insert(resource: LiveStream, part: String, optionalArgs: js.Object): LiveStream = js.native
      
      // Returns a list of video streams that match the API request parameters.
      def list(part: String): LiveStreamListResponse = js.native
      // Returns a list of video streams that match the API request parameters.
      def list(part: String, optionalArgs: js.Object): LiveStreamListResponse = js.native
      
      // Deletes a video stream.
      def remove(id: String): Unit = js.native
      // Deletes a video stream.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
      def update(resource: LiveStream, part: String): LiveStream = js.native
      // Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
      def update(resource: LiveStream, part: String, optionalArgs: js.Object): LiveStream = js.native
    }
    
    @js.native
    trait PlaylistItemsCollection extends StObject {
      
      // Adds a resource to a playlist.
      def insert(resource: PlaylistItem, part: String): PlaylistItem = js.native
      // Adds a resource to a playlist.
      def insert(resource: PlaylistItem, part: String, optionalArgs: js.Object): PlaylistItem = js.native
      
      // Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
      def list(part: String): PlaylistItemListResponse = js.native
      // Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
      def list(part: String, optionalArgs: js.Object): PlaylistItemListResponse = js.native
      
      // Deletes a playlist item.
      def remove(id: String): Unit = js.native
      // Deletes a playlist item.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Modifies a playlist item. For example, you could update the item's position in the playlist.
      def update(resource: PlaylistItem, part: String): PlaylistItem = js.native
      // Modifies a playlist item. For example, you could update the item's position in the playlist.
      def update(resource: PlaylistItem, part: String, optionalArgs: js.Object): PlaylistItem = js.native
    }
    
    @js.native
    trait PlaylistsCollection extends StObject {
      
      // Creates a playlist.
      def insert(resource: Playlist, part: String): Playlist = js.native
      // Creates a playlist.
      def insert(resource: Playlist, part: String, optionalArgs: js.Object): Playlist = js.native
      
      // Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
      def list(part: String): PlaylistListResponse = js.native
      // Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
      def list(part: String, optionalArgs: js.Object): PlaylistListResponse = js.native
      
      // Deletes a playlist.
      def remove(id: String): Unit = js.native
      // Deletes a playlist.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
      def update(resource: Playlist, part: String): Playlist = js.native
      // Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
      def update(resource: Playlist, part: String, optionalArgs: js.Object): Playlist = js.native
    }
    
    @js.native
    trait SearchCollection extends StObject {
      
      // Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
      def list(part: String): SearchListResponse = js.native
      // Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
      def list(part: String, optionalArgs: js.Object): SearchListResponse = js.native
    }
    
    @js.native
    trait SponsorsCollection extends StObject {
      
      // Lists sponsors for a channel.
      def list(part: String): SponsorListResponse = js.native
      // Lists sponsors for a channel.
      def list(part: String, optionalArgs: js.Object): SponsorListResponse = js.native
    }
    
    @js.native
    trait SubscriptionsCollection extends StObject {
      
      // Adds a subscription for the authenticated user's channel.
      def insert(resource: Subscription, part: String): Subscription = js.native
      
      // Returns subscription resources that match the API request criteria.
      def list(part: String): SubscriptionListResponse = js.native
      // Returns subscription resources that match the API request criteria.
      def list(part: String, optionalArgs: js.Object): SubscriptionListResponse = js.native
      
      // Deletes a subscription.
      def remove(id: String): Unit = js.native
    }
    
    @js.native
    trait SuperChatEventsCollection extends StObject {
      
      // Lists Super Chat events for a channel.
      def list(part: String): SuperChatEventListResponse = js.native
      // Lists Super Chat events for a channel.
      def list(part: String, optionalArgs: js.Object): SuperChatEventListResponse = js.native
    }
    
    @js.native
    trait ThumbnailsCollection extends StObject {
      
      // Uploads a custom video thumbnail to YouTube and sets it for a video.
      def set(videoId: String): ThumbnailSetResponse = js.native
      // Uploads a custom video thumbnail to YouTube and sets it for a video.
      def set(videoId: String, mediaData: Any): ThumbnailSetResponse = js.native
      // Uploads a custom video thumbnail to YouTube and sets it for a video.
      def set(videoId: String, mediaData: Any, optionalArgs: js.Object): ThumbnailSetResponse = js.native
    }
    
    @js.native
    trait VideoAbuseReportReasonsCollection extends StObject {
      
      // Returns a list of abuse reasons that can be used for reporting abusive videos.
      def list(part: String): VideoAbuseReportReasonListResponse = js.native
      // Returns a list of abuse reasons that can be used for reporting abusive videos.
      def list(part: String, optionalArgs: js.Object): VideoAbuseReportReasonListResponse = js.native
    }
    
    @js.native
    trait VideoCategoriesCollection extends StObject {
      
      // Returns a list of categories that can be associated with YouTube videos.
      def list(part: String): VideoCategoryListResponse = js.native
      // Returns a list of categories that can be associated with YouTube videos.
      def list(part: String, optionalArgs: js.Object): VideoCategoryListResponse = js.native
    }
    
    @js.native
    trait VideosCollection extends StObject {
      
      // Retrieves the ratings that the authorized user gave to a list of specified videos.
      def getRating(id: String): VideoGetRatingResponse = js.native
      // Retrieves the ratings that the authorized user gave to a list of specified videos.
      def getRating(id: String, optionalArgs: js.Object): VideoGetRatingResponse = js.native
      
      // Uploads a video to YouTube and optionally sets the video's metadata.
      def insert(resource: Video, part: String): Video = js.native
      // Uploads a video to YouTube and optionally sets the video's metadata.
      def insert(resource: Video, part: String, mediaData: Any): Video = js.native
      // Uploads a video to YouTube and optionally sets the video's metadata.
      def insert(resource: Video, part: String, mediaData: Any, optionalArgs: js.Object): Video = js.native
      
      // Returns a list of videos that match the API request parameters.
      def list(part: String): VideoListResponse = js.native
      // Returns a list of videos that match the API request parameters.
      def list(part: String, optionalArgs: js.Object): VideoListResponse = js.native
      
      // Add a like or dislike rating to a video or remove a rating from a video.
      def rate(id: String, rating: String): Unit = js.native
      
      // Deletes a YouTube video.
      def remove(id: String): Unit = js.native
      // Deletes a YouTube video.
      def remove(id: String, optionalArgs: js.Object): Unit = js.native
      
      // Report abuse for a video.
      def reportAbuse(resource: VideoAbuseReport): Unit = js.native
      // Report abuse for a video.
      def reportAbuse(resource: VideoAbuseReport, optionalArgs: js.Object): Unit = js.native
      
      // Updates a video's metadata.
      def update(resource: Video, part: String): Video = js.native
      // Updates a video's metadata.
      def update(resource: Video, part: String, optionalArgs: js.Object): Video = js.native
    }
    
    @js.native
    trait WatermarksCollection extends StObject {
      
      // Uploads a watermark image to YouTube and sets it for a channel.
      def set(resource: InvideoBranding, channelId: String): Unit = js.native
      // Uploads a watermark image to YouTube and sets it for a channel.
      def set(resource: InvideoBranding, channelId: String, mediaData: Any): Unit = js.native
      // Uploads a watermark image to YouTube and sets it for a channel.
      def set(resource: InvideoBranding, channelId: String, mediaData: Any, optionalArgs: js.Object): Unit = js.native
      
      // Deletes a channel's watermark image.
      def unset(channelId: String): Unit = js.native
      // Deletes a channel's watermark image.
      def unset(channelId: String, optionalArgs: js.Object): Unit = js.native
    }
  }
  
  object Schema {
    
    trait AccessPolicy extends StObject {
      
      var allowed: js.UndefOr[Boolean] = js.undefined
      
      var exception: js.UndefOr[js.Array[String]] = js.undefined
    }
    object AccessPolicy {
      
      inline def apply(): AccessPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AccessPolicy]
      }
      
      extension [Self <: AccessPolicy](x: Self) {
        
        inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
        
        inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
        
        inline def setException(value: js.Array[String]): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
        
        inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
        
        inline def setExceptionVarargs(value: String*): Self = StObject.set(x, "exception", js.Array(value*))
      }
    }
    
    trait Activity extends StObject {
      
      var contentDetails: js.UndefOr[ActivityContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[ActivitySnippet] = js.undefined
    }
    object Activity {
      
      inline def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      extension [Self <: Activity](x: Self) {
        
        inline def setContentDetails(value: ActivityContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: ActivitySnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait ActivityContentDetails extends StObject {
      
      var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.undefined
      
      var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.undefined
      
      var comment: js.UndefOr[ActivityContentDetailsComment] = js.undefined
      
      var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.undefined
      
      var like: js.UndefOr[ActivityContentDetailsLike] = js.undefined
      
      var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.undefined
      
      var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.undefined
      
      var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.undefined
      
      var social: js.UndefOr[ActivityContentDetailsSocial] = js.undefined
      
      var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.undefined
      
      var upload: js.UndefOr[ActivityContentDetailsUpload] = js.undefined
    }
    object ActivityContentDetails {
      
      inline def apply(): ActivityContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetails]
      }
      
      extension [Self <: ActivityContentDetails](x: Self) {
        
        inline def setBulletin(value: ActivityContentDetailsBulletin): Self = StObject.set(x, "bulletin", value.asInstanceOf[js.Any])
        
        inline def setBulletinUndefined: Self = StObject.set(x, "bulletin", js.undefined)
        
        inline def setChannelItem(value: ActivityContentDetailsChannelItem): Self = StObject.set(x, "channelItem", value.asInstanceOf[js.Any])
        
        inline def setChannelItemUndefined: Self = StObject.set(x, "channelItem", js.undefined)
        
        inline def setComment(value: ActivityContentDetailsComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
        
        inline def setFavorite(value: ActivityContentDetailsFavorite): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
        
        inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
        
        inline def setLike(value: ActivityContentDetailsLike): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
        
        inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
        
        inline def setPlaylistItem(value: ActivityContentDetailsPlaylistItem): Self = StObject.set(x, "playlistItem", value.asInstanceOf[js.Any])
        
        inline def setPlaylistItemUndefined: Self = StObject.set(x, "playlistItem", js.undefined)
        
        inline def setPromotedItem(value: ActivityContentDetailsPromotedItem): Self = StObject.set(x, "promotedItem", value.asInstanceOf[js.Any])
        
        inline def setPromotedItemUndefined: Self = StObject.set(x, "promotedItem", js.undefined)
        
        inline def setRecommendation(value: ActivityContentDetailsRecommendation): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
        
        inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
        
        inline def setSocial(value: ActivityContentDetailsSocial): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
        
        inline def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
        
        inline def setSubscription(value: ActivityContentDetailsSubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
        
        inline def setUpload(value: ActivityContentDetailsUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
        
        inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      }
    }
    
    trait ActivityContentDetailsBulletin extends StObject {
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsBulletin {
      
      inline def apply(): ActivityContentDetailsBulletin = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsBulletin]
      }
      
      extension [Self <: ActivityContentDetailsBulletin](x: Self) {
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsChannelItem extends StObject {
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsChannelItem {
      
      inline def apply(): ActivityContentDetailsChannelItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsChannelItem]
      }
      
      extension [Self <: ActivityContentDetailsChannelItem](x: Self) {
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsComment extends StObject {
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsComment {
      
      inline def apply(): ActivityContentDetailsComment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsComment]
      }
      
      extension [Self <: ActivityContentDetailsComment](x: Self) {
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsFavorite extends StObject {
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsFavorite {
      
      inline def apply(): ActivityContentDetailsFavorite = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsFavorite]
      }
      
      extension [Self <: ActivityContentDetailsFavorite](x: Self) {
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsLike extends StObject {
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsLike {
      
      inline def apply(): ActivityContentDetailsLike = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsLike]
      }
      
      extension [Self <: ActivityContentDetailsLike](x: Self) {
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsPlaylistItem extends StObject {
      
      var playlistId: js.UndefOr[String] = js.undefined
      
      var playlistItemId: js.UndefOr[String] = js.undefined
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsPlaylistItem {
      
      inline def apply(): ActivityContentDetailsPlaylistItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsPlaylistItem]
      }
      
      extension [Self <: ActivityContentDetailsPlaylistItem](x: Self) {
        
        inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
        
        inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
        
        inline def setPlaylistItemId(value: String): Self = StObject.set(x, "playlistItemId", value.asInstanceOf[js.Any])
        
        inline def setPlaylistItemIdUndefined: Self = StObject.set(x, "playlistItemId", js.undefined)
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsPromotedItem extends StObject {
      
      var adTag: js.UndefOr[String] = js.undefined
      
      var clickTrackingUrl: js.UndefOr[String] = js.undefined
      
      var creativeViewUrl: js.UndefOr[String] = js.undefined
      
      var ctaType: js.UndefOr[String] = js.undefined
      
      var customCtaButtonText: js.UndefOr[String] = js.undefined
      
      var descriptionText: js.UndefOr[String] = js.undefined
      
      var destinationUrl: js.UndefOr[String] = js.undefined
      
      var forecastingUrl: js.UndefOr[js.Array[String]] = js.undefined
      
      var impressionUrl: js.UndefOr[js.Array[String]] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object ActivityContentDetailsPromotedItem {
      
      inline def apply(): ActivityContentDetailsPromotedItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsPromotedItem]
      }
      
      extension [Self <: ActivityContentDetailsPromotedItem](x: Self) {
        
        inline def setAdTag(value: String): Self = StObject.set(x, "adTag", value.asInstanceOf[js.Any])
        
        inline def setAdTagUndefined: Self = StObject.set(x, "adTag", js.undefined)
        
        inline def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
        
        inline def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
        
        inline def setCreativeViewUrl(value: String): Self = StObject.set(x, "creativeViewUrl", value.asInstanceOf[js.Any])
        
        inline def setCreativeViewUrlUndefined: Self = StObject.set(x, "creativeViewUrl", js.undefined)
        
        inline def setCtaType(value: String): Self = StObject.set(x, "ctaType", value.asInstanceOf[js.Any])
        
        inline def setCtaTypeUndefined: Self = StObject.set(x, "ctaType", js.undefined)
        
        inline def setCustomCtaButtonText(value: String): Self = StObject.set(x, "customCtaButtonText", value.asInstanceOf[js.Any])
        
        inline def setCustomCtaButtonTextUndefined: Self = StObject.set(x, "customCtaButtonText", js.undefined)
        
        inline def setDescriptionText(value: String): Self = StObject.set(x, "descriptionText", value.asInstanceOf[js.Any])
        
        inline def setDescriptionTextUndefined: Self = StObject.set(x, "descriptionText", js.undefined)
        
        inline def setDestinationUrl(value: String): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
        
        inline def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
        
        inline def setForecastingUrl(value: js.Array[String]): Self = StObject.set(x, "forecastingUrl", value.asInstanceOf[js.Any])
        
        inline def setForecastingUrlUndefined: Self = StObject.set(x, "forecastingUrl", js.undefined)
        
        inline def setForecastingUrlVarargs(value: String*): Self = StObject.set(x, "forecastingUrl", js.Array(value*))
        
        inline def setImpressionUrl(value: js.Array[String]): Self = StObject.set(x, "impressionUrl", value.asInstanceOf[js.Any])
        
        inline def setImpressionUrlUndefined: Self = StObject.set(x, "impressionUrl", js.undefined)
        
        inline def setImpressionUrlVarargs(value: String*): Self = StObject.set(x, "impressionUrl", js.Array(value*))
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsRecommendation extends StObject {
      
      var reason: js.UndefOr[String] = js.undefined
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
      
      var seedResourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsRecommendation {
      
      inline def apply(): ActivityContentDetailsRecommendation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsRecommendation]
      }
      
      extension [Self <: ActivityContentDetailsRecommendation](x: Self) {
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setSeedResourceId(value: ResourceId): Self = StObject.set(x, "seedResourceId", value.asInstanceOf[js.Any])
        
        inline def setSeedResourceIdUndefined: Self = StObject.set(x, "seedResourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsSocial extends StObject {
      
      var author: js.UndefOr[String] = js.undefined
      
      var imageUrl: js.UndefOr[String] = js.undefined
      
      var referenceUrl: js.UndefOr[String] = js.undefined
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ActivityContentDetailsSocial {
      
      inline def apply(): ActivityContentDetailsSocial = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsSocial]
      }
      
      extension [Self <: ActivityContentDetailsSocial](x: Self) {
        
        inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        inline def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
        
        inline def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ActivityContentDetailsSubscription extends StObject {
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
    }
    object ActivityContentDetailsSubscription {
      
      inline def apply(): ActivityContentDetailsSubscription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsSubscription]
      }
      
      extension [Self <: ActivityContentDetailsSubscription](x: Self) {
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      }
    }
    
    trait ActivityContentDetailsUpload extends StObject {
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object ActivityContentDetailsUpload {
      
      inline def apply(): ActivityContentDetailsUpload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityContentDetailsUpload]
      }
      
      extension [Self <: ActivityContentDetailsUpload](x: Self) {
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait ActivityListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Activity]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object ActivityListResponse {
      
      inline def apply(): ActivityListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityListResponse]
      }
      
      extension [Self <: ActivityListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Activity]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Activity*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait ActivitySnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelTitle: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var groupId: js.UndefOr[String] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ActivitySnippet {
      
      inline def apply(): ActivitySnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivitySnippet]
      }
      
      extension [Self <: ActivitySnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
        
        inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
        
        inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Caption extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[CaptionSnippet] = js.undefined
    }
    object Caption {
      
      inline def apply(): Caption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Caption]
      }
      
      extension [Self <: Caption](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: CaptionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait CaptionListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Caption]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object CaptionListResponse {
      
      inline def apply(): CaptionListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CaptionListResponse]
      }
      
      extension [Self <: CaptionListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Caption]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Caption*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait CaptionSnippet extends StObject {
      
      var audioTrackType: js.UndefOr[String] = js.undefined
      
      var failureReason: js.UndefOr[String] = js.undefined
      
      var isAutoSynced: js.UndefOr[Boolean] = js.undefined
      
      var isCC: js.UndefOr[Boolean] = js.undefined
      
      var isDraft: js.UndefOr[Boolean] = js.undefined
      
      var isEasyReader: js.UndefOr[Boolean] = js.undefined
      
      var isLarge: js.UndefOr[Boolean] = js.undefined
      
      var language: js.UndefOr[String] = js.undefined
      
      var lastUpdated: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var trackKind: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object CaptionSnippet {
      
      inline def apply(): CaptionSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CaptionSnippet]
      }
      
      extension [Self <: CaptionSnippet](x: Self) {
        
        inline def setAudioTrackType(value: String): Self = StObject.set(x, "audioTrackType", value.asInstanceOf[js.Any])
        
        inline def setAudioTrackTypeUndefined: Self = StObject.set(x, "audioTrackType", js.undefined)
        
        inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
        
        inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
        
        inline def setIsAutoSynced(value: Boolean): Self = StObject.set(x, "isAutoSynced", value.asInstanceOf[js.Any])
        
        inline def setIsAutoSyncedUndefined: Self = StObject.set(x, "isAutoSynced", js.undefined)
        
        inline def setIsCC(value: Boolean): Self = StObject.set(x, "isCC", value.asInstanceOf[js.Any])
        
        inline def setIsCCUndefined: Self = StObject.set(x, "isCC", js.undefined)
        
        inline def setIsDraft(value: Boolean): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
        
        inline def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
        
        inline def setIsEasyReader(value: Boolean): Self = StObject.set(x, "isEasyReader", value.asInstanceOf[js.Any])
        
        inline def setIsEasyReaderUndefined: Self = StObject.set(x, "isEasyReader", js.undefined)
        
        inline def setIsLarge(value: Boolean): Self = StObject.set(x, "isLarge", value.asInstanceOf[js.Any])
        
        inline def setIsLargeUndefined: Self = StObject.set(x, "isLarge", js.undefined)
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
        
        inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setTrackKind(value: String): Self = StObject.set(x, "trackKind", value.asInstanceOf[js.Any])
        
        inline def setTrackKindUndefined: Self = StObject.set(x, "trackKind", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait CdnSettings extends StObject {
      
      var format: js.UndefOr[String] = js.undefined
      
      var frameRate: js.UndefOr[String] = js.undefined
      
      var ingestionInfo: js.UndefOr[IngestionInfo] = js.undefined
      
      var ingestionType: js.UndefOr[String] = js.undefined
      
      var resolution: js.UndefOr[String] = js.undefined
    }
    object CdnSettings {
      
      inline def apply(): CdnSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CdnSettings]
      }
      
      extension [Self <: CdnSettings](x: Self) {
        
        inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setFrameRate(value: String): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
        
        inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
        
        inline def setIngestionInfo(value: IngestionInfo): Self = StObject.set(x, "ingestionInfo", value.asInstanceOf[js.Any])
        
        inline def setIngestionInfoUndefined: Self = StObject.set(x, "ingestionInfo", js.undefined)
        
        inline def setIngestionType(value: String): Self = StObject.set(x, "ingestionType", value.asInstanceOf[js.Any])
        
        inline def setIngestionTypeUndefined: Self = StObject.set(x, "ingestionType", js.undefined)
        
        inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
        
        inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      }
    }
    
    trait Channel extends StObject {
      
      var auditDetails: js.UndefOr[ChannelAuditDetails] = js.undefined
      
      var brandingSettings: js.UndefOr[ChannelBrandingSettings] = js.undefined
      
      var contentDetails: js.UndefOr[ChannelContentDetails] = js.undefined
      
      var contentOwnerDetails: js.UndefOr[ChannelContentOwnerDetails] = js.undefined
      
      var conversionPings: js.UndefOr[ChannelConversionPings] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var invideoPromotion: js.UndefOr[InvideoPromotion] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var localizations: js.UndefOr[js.Object] = js.undefined
      
      var snippet: js.UndefOr[ChannelSnippet] = js.undefined
      
      var statistics: js.UndefOr[ChannelStatistics] = js.undefined
      
      var status: js.UndefOr[ChannelStatus] = js.undefined
      
      var topicDetails: js.UndefOr[ChannelTopicDetails] = js.undefined
    }
    object Channel {
      
      inline def apply(): Channel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Channel]
      }
      
      extension [Self <: Channel](x: Self) {
        
        inline def setAuditDetails(value: ChannelAuditDetails): Self = StObject.set(x, "auditDetails", value.asInstanceOf[js.Any])
        
        inline def setAuditDetailsUndefined: Self = StObject.set(x, "auditDetails", js.undefined)
        
        inline def setBrandingSettings(value: ChannelBrandingSettings): Self = StObject.set(x, "brandingSettings", value.asInstanceOf[js.Any])
        
        inline def setBrandingSettingsUndefined: Self = StObject.set(x, "brandingSettings", js.undefined)
        
        inline def setContentDetails(value: ChannelContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setContentOwnerDetails(value: ChannelContentOwnerDetails): Self = StObject.set(x, "contentOwnerDetails", value.asInstanceOf[js.Any])
        
        inline def setContentOwnerDetailsUndefined: Self = StObject.set(x, "contentOwnerDetails", js.undefined)
        
        inline def setConversionPings(value: ChannelConversionPings): Self = StObject.set(x, "conversionPings", value.asInstanceOf[js.Any])
        
        inline def setConversionPingsUndefined: Self = StObject.set(x, "conversionPings", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInvideoPromotion(value: InvideoPromotion): Self = StObject.set(x, "invideoPromotion", value.asInstanceOf[js.Any])
        
        inline def setInvideoPromotionUndefined: Self = StObject.set(x, "invideoPromotion", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocalizations(value: js.Object): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
        
        inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
        
        inline def setSnippet(value: ChannelSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setStatistics(value: ChannelStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
        
        inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
        
        inline def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setTopicDetails(value: ChannelTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
        
        inline def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
      }
    }
    
    trait ChannelAuditDetails extends StObject {
      
      var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.undefined
      
      var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.undefined
      
      var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.undefined
    }
    object ChannelAuditDetails {
      
      inline def apply(): ChannelAuditDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelAuditDetails]
      }
      
      extension [Self <: ChannelAuditDetails](x: Self) {
        
        inline def setCommunityGuidelinesGoodStanding(value: Boolean): Self = StObject.set(x, "communityGuidelinesGoodStanding", value.asInstanceOf[js.Any])
        
        inline def setCommunityGuidelinesGoodStandingUndefined: Self = StObject.set(x, "communityGuidelinesGoodStanding", js.undefined)
        
        inline def setContentIdClaimsGoodStanding(value: Boolean): Self = StObject.set(x, "contentIdClaimsGoodStanding", value.asInstanceOf[js.Any])
        
        inline def setContentIdClaimsGoodStandingUndefined: Self = StObject.set(x, "contentIdClaimsGoodStanding", js.undefined)
        
        inline def setCopyrightStrikesGoodStanding(value: Boolean): Self = StObject.set(x, "copyrightStrikesGoodStanding", value.asInstanceOf[js.Any])
        
        inline def setCopyrightStrikesGoodStandingUndefined: Self = StObject.set(x, "copyrightStrikesGoodStanding", js.undefined)
      }
    }
    
    trait ChannelBannerResource extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object ChannelBannerResource {
      
      inline def apply(): ChannelBannerResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelBannerResource]
      }
      
      extension [Self <: ChannelBannerResource](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait ChannelBrandingSettings extends StObject {
      
      var channel: js.UndefOr[ChannelSettings] = js.undefined
      
      var hints: js.UndefOr[js.Array[PropertyValue]] = js.undefined
      
      var image: js.UndefOr[ImageSettings] = js.undefined
      
      var watch: js.UndefOr[WatchSettings] = js.undefined
    }
    object ChannelBrandingSettings {
      
      inline def apply(): ChannelBrandingSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelBrandingSettings]
      }
      
      extension [Self <: ChannelBrandingSettings](x: Self) {
        
        inline def setChannel(value: ChannelSettings): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
        
        inline def setHints(value: js.Array[PropertyValue]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
        
        inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
        
        inline def setHintsVarargs(value: PropertyValue*): Self = StObject.set(x, "hints", js.Array(value*))
        
        inline def setImage(value: ImageSettings): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setWatch(value: WatchSettings): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
        
        inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      }
    }
    
    trait ChannelContentDetails extends StObject {
      
      var relatedPlaylists: js.UndefOr[ChannelContentDetailsRelatedPlaylists] = js.undefined
    }
    object ChannelContentDetails {
      
      inline def apply(): ChannelContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelContentDetails]
      }
      
      extension [Self <: ChannelContentDetails](x: Self) {
        
        inline def setRelatedPlaylists(value: ChannelContentDetailsRelatedPlaylists): Self = StObject.set(x, "relatedPlaylists", value.asInstanceOf[js.Any])
        
        inline def setRelatedPlaylistsUndefined: Self = StObject.set(x, "relatedPlaylists", js.undefined)
      }
    }
    
    trait ChannelContentDetailsRelatedPlaylists extends StObject {
      
      var favorites: js.UndefOr[String] = js.undefined
      
      var likes: js.UndefOr[String] = js.undefined
      
      var uploads: js.UndefOr[String] = js.undefined
      
      var watchHistory: js.UndefOr[String] = js.undefined
      
      var watchLater: js.UndefOr[String] = js.undefined
    }
    object ChannelContentDetailsRelatedPlaylists {
      
      inline def apply(): ChannelContentDetailsRelatedPlaylists = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelContentDetailsRelatedPlaylists]
      }
      
      extension [Self <: ChannelContentDetailsRelatedPlaylists](x: Self) {
        
        inline def setFavorites(value: String): Self = StObject.set(x, "favorites", value.asInstanceOf[js.Any])
        
        inline def setFavoritesUndefined: Self = StObject.set(x, "favorites", js.undefined)
        
        inline def setLikes(value: String): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
        
        inline def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
        
        inline def setUploads(value: String): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
        
        inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
        
        inline def setWatchHistory(value: String): Self = StObject.set(x, "watchHistory", value.asInstanceOf[js.Any])
        
        inline def setWatchHistoryUndefined: Self = StObject.set(x, "watchHistory", js.undefined)
        
        inline def setWatchLater(value: String): Self = StObject.set(x, "watchLater", value.asInstanceOf[js.Any])
        
        inline def setWatchLaterUndefined: Self = StObject.set(x, "watchLater", js.undefined)
      }
    }
    
    trait ChannelContentOwnerDetails extends StObject {
      
      var contentOwner: js.UndefOr[String] = js.undefined
      
      var timeLinked: js.UndefOr[String] = js.undefined
    }
    object ChannelContentOwnerDetails {
      
      inline def apply(): ChannelContentOwnerDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelContentOwnerDetails]
      }
      
      extension [Self <: ChannelContentOwnerDetails](x: Self) {
        
        inline def setContentOwner(value: String): Self = StObject.set(x, "contentOwner", value.asInstanceOf[js.Any])
        
        inline def setContentOwnerUndefined: Self = StObject.set(x, "contentOwner", js.undefined)
        
        inline def setTimeLinked(value: String): Self = StObject.set(x, "timeLinked", value.asInstanceOf[js.Any])
        
        inline def setTimeLinkedUndefined: Self = StObject.set(x, "timeLinked", js.undefined)
      }
    }
    
    trait ChannelConversionPing extends StObject {
      
      var context: js.UndefOr[String] = js.undefined
      
      var conversionUrl: js.UndefOr[String] = js.undefined
    }
    object ChannelConversionPing {
      
      inline def apply(): ChannelConversionPing = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelConversionPing]
      }
      
      extension [Self <: ChannelConversionPing](x: Self) {
        
        inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setConversionUrl(value: String): Self = StObject.set(x, "conversionUrl", value.asInstanceOf[js.Any])
        
        inline def setConversionUrlUndefined: Self = StObject.set(x, "conversionUrl", js.undefined)
      }
    }
    
    trait ChannelConversionPings extends StObject {
      
      var pings: js.UndefOr[js.Array[ChannelConversionPing]] = js.undefined
    }
    object ChannelConversionPings {
      
      inline def apply(): ChannelConversionPings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelConversionPings]
      }
      
      extension [Self <: ChannelConversionPings](x: Self) {
        
        inline def setPings(value: js.Array[ChannelConversionPing]): Self = StObject.set(x, "pings", value.asInstanceOf[js.Any])
        
        inline def setPingsUndefined: Self = StObject.set(x, "pings", js.undefined)
        
        inline def setPingsVarargs(value: ChannelConversionPing*): Self = StObject.set(x, "pings", js.Array(value*))
      }
    }
    
    trait ChannelListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Channel]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object ChannelListResponse {
      
      inline def apply(): ChannelListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelListResponse]
      }
      
      extension [Self <: ChannelListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Channel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Channel*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait ChannelLocalization extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object ChannelLocalization {
      
      inline def apply(): ChannelLocalization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelLocalization]
      }
      
      extension [Self <: ChannelLocalization](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait ChannelProfileDetails extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelUrl: js.UndefOr[String] = js.undefined
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var profileImageUrl: js.UndefOr[String] = js.undefined
    }
    object ChannelProfileDetails {
      
      inline def apply(): ChannelProfileDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelProfileDetails]
      }
      
      extension [Self <: ChannelProfileDetails](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
        
        inline def setChannelUrlUndefined: Self = StObject.set(x, "channelUrl", js.undefined)
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
        
        inline def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
      }
    }
    
    trait ChannelSection extends StObject {
      
      var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var localizations: js.UndefOr[js.Object] = js.undefined
      
      var snippet: js.UndefOr[ChannelSectionSnippet] = js.undefined
      
      var targeting: js.UndefOr[ChannelSectionTargeting] = js.undefined
    }
    object ChannelSection {
      
      inline def apply(): ChannelSection = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSection]
      }
      
      extension [Self <: ChannelSection](x: Self) {
        
        inline def setContentDetails(value: ChannelSectionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocalizations(value: js.Object): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
        
        inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
        
        inline def setSnippet(value: ChannelSectionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setTargeting(value: ChannelSectionTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
        
        inline def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
      }
    }
    
    trait ChannelSectionContentDetails extends StObject {
      
      var channels: js.UndefOr[js.Array[String]] = js.undefined
      
      var playlists: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ChannelSectionContentDetails {
      
      inline def apply(): ChannelSectionContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSectionContentDetails]
      }
      
      extension [Self <: ChannelSectionContentDetails](x: Self) {
        
        inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
        
        inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
        
        inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
        
        inline def setPlaylists(value: js.Array[String]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
        
        inline def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
        
        inline def setPlaylistsVarargs(value: String*): Self = StObject.set(x, "playlists", js.Array(value*))
      }
    }
    
    trait ChannelSectionListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[ChannelSection]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object ChannelSectionListResponse {
      
      inline def apply(): ChannelSectionListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSectionListResponse]
      }
      
      extension [Self <: ChannelSectionListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[ChannelSection]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: ChannelSection*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait ChannelSectionLocalization extends StObject {
      
      var title: js.UndefOr[String] = js.undefined
    }
    object ChannelSectionLocalization {
      
      inline def apply(): ChannelSectionLocalization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSectionLocalization]
      }
      
      extension [Self <: ChannelSectionLocalization](x: Self) {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait ChannelSectionSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var defaultLanguage: js.UndefOr[String] = js.undefined
      
      var localized: js.UndefOr[ChannelSectionLocalization] = js.undefined
      
      var position: js.UndefOr[Double] = js.undefined
      
      var style: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ChannelSectionSnippet {
      
      inline def apply(): ChannelSectionSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSectionSnippet]
      }
      
      extension [Self <: ChannelSectionSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
        
        inline def setLocalized(value: ChannelSectionLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
        
        inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
        
        inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ChannelSectionTargeting extends StObject {
      
      var countries: js.UndefOr[js.Array[String]] = js.undefined
      
      var languages: js.UndefOr[js.Array[String]] = js.undefined
      
      var regions: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ChannelSectionTargeting {
      
      inline def apply(): ChannelSectionTargeting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSectionTargeting]
      }
      
      extension [Self <: ChannelSectionTargeting](x: Self) {
        
        inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
        
        inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
        
        inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
        
        inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
        
        inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
        
        inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
        
        inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
        
        inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
      }
    }
    
    trait ChannelSettings extends StObject {
      
      var country: js.UndefOr[String] = js.undefined
      
      var defaultLanguage: js.UndefOr[String] = js.undefined
      
      var defaultTab: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var featuredChannelsTitle: js.UndefOr[String] = js.undefined
      
      var featuredChannelsUrls: js.UndefOr[js.Array[String]] = js.undefined
      
      var keywords: js.UndefOr[String] = js.undefined
      
      var moderateComments: js.UndefOr[Boolean] = js.undefined
      
      var profileColor: js.UndefOr[String] = js.undefined
      
      var showBrowseView: js.UndefOr[Boolean] = js.undefined
      
      var showRelatedChannels: js.UndefOr[Boolean] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var trackingAnalyticsAccountId: js.UndefOr[String] = js.undefined
      
      var unsubscribedTrailer: js.UndefOr[String] = js.undefined
    }
    object ChannelSettings {
      
      inline def apply(): ChannelSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSettings]
      }
      
      extension [Self <: ChannelSettings](x: Self) {
        
        inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
        
        inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
        
        inline def setDefaultTab(value: String): Self = StObject.set(x, "defaultTab", value.asInstanceOf[js.Any])
        
        inline def setDefaultTabUndefined: Self = StObject.set(x, "defaultTab", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setFeaturedChannelsTitle(value: String): Self = StObject.set(x, "featuredChannelsTitle", value.asInstanceOf[js.Any])
        
        inline def setFeaturedChannelsTitleUndefined: Self = StObject.set(x, "featuredChannelsTitle", js.undefined)
        
        inline def setFeaturedChannelsUrls(value: js.Array[String]): Self = StObject.set(x, "featuredChannelsUrls", value.asInstanceOf[js.Any])
        
        inline def setFeaturedChannelsUrlsUndefined: Self = StObject.set(x, "featuredChannelsUrls", js.undefined)
        
        inline def setFeaturedChannelsUrlsVarargs(value: String*): Self = StObject.set(x, "featuredChannelsUrls", js.Array(value*))
        
        inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
        
        inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
        
        inline def setModerateComments(value: Boolean): Self = StObject.set(x, "moderateComments", value.asInstanceOf[js.Any])
        
        inline def setModerateCommentsUndefined: Self = StObject.set(x, "moderateComments", js.undefined)
        
        inline def setProfileColor(value: String): Self = StObject.set(x, "profileColor", value.asInstanceOf[js.Any])
        
        inline def setProfileColorUndefined: Self = StObject.set(x, "profileColor", js.undefined)
        
        inline def setShowBrowseView(value: Boolean): Self = StObject.set(x, "showBrowseView", value.asInstanceOf[js.Any])
        
        inline def setShowBrowseViewUndefined: Self = StObject.set(x, "showBrowseView", js.undefined)
        
        inline def setShowRelatedChannels(value: Boolean): Self = StObject.set(x, "showRelatedChannels", value.asInstanceOf[js.Any])
        
        inline def setShowRelatedChannelsUndefined: Self = StObject.set(x, "showRelatedChannels", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTrackingAnalyticsAccountId(value: String): Self = StObject.set(x, "trackingAnalyticsAccountId", value.asInstanceOf[js.Any])
        
        inline def setTrackingAnalyticsAccountIdUndefined: Self = StObject.set(x, "trackingAnalyticsAccountId", js.undefined)
        
        inline def setUnsubscribedTrailer(value: String): Self = StObject.set(x, "unsubscribedTrailer", value.asInstanceOf[js.Any])
        
        inline def setUnsubscribedTrailerUndefined: Self = StObject.set(x, "unsubscribedTrailer", js.undefined)
      }
    }
    
    trait ChannelSnippet extends StObject {
      
      var country: js.UndefOr[String] = js.undefined
      
      var customUrl: js.UndefOr[String] = js.undefined
      
      var defaultLanguage: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var localized: js.UndefOr[ChannelLocalization] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object ChannelSnippet {
      
      inline def apply(): ChannelSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelSnippet]
      }
      
      extension [Self <: ChannelSnippet](x: Self) {
        
        inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
        
        inline def setCustomUrl(value: String): Self = StObject.set(x, "customUrl", value.asInstanceOf[js.Any])
        
        inline def setCustomUrlUndefined: Self = StObject.set(x, "customUrl", js.undefined)
        
        inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setLocalized(value: ChannelLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
        
        inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait ChannelStatistics extends StObject {
      
      var commentCount: js.UndefOr[String] = js.undefined
      
      var hiddenSubscriberCount: js.UndefOr[Boolean] = js.undefined
      
      var subscriberCount: js.UndefOr[String] = js.undefined
      
      var videoCount: js.UndefOr[String] = js.undefined
      
      var viewCount: js.UndefOr[String] = js.undefined
    }
    object ChannelStatistics {
      
      inline def apply(): ChannelStatistics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelStatistics]
      }
      
      extension [Self <: ChannelStatistics](x: Self) {
        
        inline def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
        
        inline def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
        
        inline def setHiddenSubscriberCount(value: Boolean): Self = StObject.set(x, "hiddenSubscriberCount", value.asInstanceOf[js.Any])
        
        inline def setHiddenSubscriberCountUndefined: Self = StObject.set(x, "hiddenSubscriberCount", js.undefined)
        
        inline def setSubscriberCount(value: String): Self = StObject.set(x, "subscriberCount", value.asInstanceOf[js.Any])
        
        inline def setSubscriberCountUndefined: Self = StObject.set(x, "subscriberCount", js.undefined)
        
        inline def setVideoCount(value: String): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
        
        inline def setVideoCountUndefined: Self = StObject.set(x, "videoCount", js.undefined)
        
        inline def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
        
        inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
      }
    }
    
    trait ChannelStatus extends StObject {
      
      var isLinked: js.UndefOr[Boolean] = js.undefined
      
      var longUploadsStatus: js.UndefOr[String] = js.undefined
      
      var privacyStatus: js.UndefOr[String] = js.undefined
    }
    object ChannelStatus {
      
      inline def apply(): ChannelStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelStatus]
      }
      
      extension [Self <: ChannelStatus](x: Self) {
        
        inline def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
        
        inline def setIsLinkedUndefined: Self = StObject.set(x, "isLinked", js.undefined)
        
        inline def setLongUploadsStatus(value: String): Self = StObject.set(x, "longUploadsStatus", value.asInstanceOf[js.Any])
        
        inline def setLongUploadsStatusUndefined: Self = StObject.set(x, "longUploadsStatus", js.undefined)
        
        inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
        
        inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
      }
    }
    
    trait ChannelTopicDetails extends StObject {
      
      var topicCategories: js.UndefOr[js.Array[String]] = js.undefined
      
      var topicIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ChannelTopicDetails {
      
      inline def apply(): ChannelTopicDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChannelTopicDetails]
      }
      
      extension [Self <: ChannelTopicDetails](x: Self) {
        
        inline def setTopicCategories(value: js.Array[String]): Self = StObject.set(x, "topicCategories", value.asInstanceOf[js.Any])
        
        inline def setTopicCategoriesUndefined: Self = StObject.set(x, "topicCategories", js.undefined)
        
        inline def setTopicCategoriesVarargs(value: String*): Self = StObject.set(x, "topicCategories", js.Array(value*))
        
        inline def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
        
        inline def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
        
        inline def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value*))
      }
    }
    
    trait Comment extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[CommentSnippet] = js.undefined
    }
    object Comment {
      
      inline def apply(): Comment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Comment]
      }
      
      extension [Self <: Comment](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: CommentSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait CommentListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Comment]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object CommentListResponse {
      
      inline def apply(): CommentListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentListResponse]
      }
      
      extension [Self <: CommentListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Comment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Comment*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait CommentSnippet extends StObject {
      
      var authorChannelId: js.UndefOr[js.Object] = js.undefined
      
      var authorChannelUrl: js.UndefOr[String] = js.undefined
      
      var authorDisplayName: js.UndefOr[String] = js.undefined
      
      var authorProfileImageUrl: js.UndefOr[String] = js.undefined
      
      var canRate: js.UndefOr[Boolean] = js.undefined
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var likeCount: js.UndefOr[Double] = js.undefined
      
      var moderationStatus: js.UndefOr[String] = js.undefined
      
      var parentId: js.UndefOr[String] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var textDisplay: js.UndefOr[String] = js.undefined
      
      var textOriginal: js.UndefOr[String] = js.undefined
      
      var updatedAt: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
      
      var viewerRating: js.UndefOr[String] = js.undefined
    }
    object CommentSnippet {
      
      inline def apply(): CommentSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentSnippet]
      }
      
      extension [Self <: CommentSnippet](x: Self) {
        
        inline def setAuthorChannelId(value: js.Object): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
        
        inline def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
        
        inline def setAuthorChannelUrl(value: String): Self = StObject.set(x, "authorChannelUrl", value.asInstanceOf[js.Any])
        
        inline def setAuthorChannelUrlUndefined: Self = StObject.set(x, "authorChannelUrl", js.undefined)
        
        inline def setAuthorDisplayName(value: String): Self = StObject.set(x, "authorDisplayName", value.asInstanceOf[js.Any])
        
        inline def setAuthorDisplayNameUndefined: Self = StObject.set(x, "authorDisplayName", js.undefined)
        
        inline def setAuthorProfileImageUrl(value: String): Self = StObject.set(x, "authorProfileImageUrl", value.asInstanceOf[js.Any])
        
        inline def setAuthorProfileImageUrlUndefined: Self = StObject.set(x, "authorProfileImageUrl", js.undefined)
        
        inline def setCanRate(value: Boolean): Self = StObject.set(x, "canRate", value.asInstanceOf[js.Any])
        
        inline def setCanRateUndefined: Self = StObject.set(x, "canRate", js.undefined)
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setLikeCount(value: Double): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
        
        inline def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
        
        inline def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
        
        inline def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
        
        inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
        
        inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setTextDisplay(value: String): Self = StObject.set(x, "textDisplay", value.asInstanceOf[js.Any])
        
        inline def setTextDisplayUndefined: Self = StObject.set(x, "textDisplay", js.undefined)
        
        inline def setTextOriginal(value: String): Self = StObject.set(x, "textOriginal", value.asInstanceOf[js.Any])
        
        inline def setTextOriginalUndefined: Self = StObject.set(x, "textOriginal", js.undefined)
        
        inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
        
        inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
        
        inline def setViewerRating(value: String): Self = StObject.set(x, "viewerRating", value.asInstanceOf[js.Any])
        
        inline def setViewerRatingUndefined: Self = StObject.set(x, "viewerRating", js.undefined)
      }
    }
    
    trait CommentThread extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var replies: js.UndefOr[CommentThreadReplies] = js.undefined
      
      var snippet: js.UndefOr[CommentThreadSnippet] = js.undefined
    }
    object CommentThread {
      
      inline def apply(): CommentThread = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentThread]
      }
      
      extension [Self <: CommentThread](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setReplies(value: CommentThreadReplies): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
        
        inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
        
        inline def setSnippet(value: CommentThreadSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait CommentThreadListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[CommentThread]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object CommentThreadListResponse {
      
      inline def apply(): CommentThreadListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentThreadListResponse]
      }
      
      extension [Self <: CommentThreadListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[CommentThread]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: CommentThread*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait CommentThreadReplies extends StObject {
      
      var comments: js.UndefOr[js.Array[Comment]] = js.undefined
    }
    object CommentThreadReplies {
      
      inline def apply(): CommentThreadReplies = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentThreadReplies]
      }
      
      extension [Self <: CommentThreadReplies](x: Self) {
        
        inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
        
        inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
        
        inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
      }
    }
    
    trait CommentThreadSnippet extends StObject {
      
      var canReply: js.UndefOr[Boolean] = js.undefined
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var isPublic: js.UndefOr[Boolean] = js.undefined
      
      var topLevelComment: js.UndefOr[Comment] = js.undefined
      
      var totalReplyCount: js.UndefOr[Double] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object CommentThreadSnippet {
      
      inline def apply(): CommentThreadSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentThreadSnippet]
      }
      
      extension [Self <: CommentThreadSnippet](x: Self) {
        
        inline def setCanReply(value: Boolean): Self = StObject.set(x, "canReply", value.asInstanceOf[js.Any])
        
        inline def setCanReplyUndefined: Self = StObject.set(x, "canReply", js.undefined)
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
        
        inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
        
        inline def setTopLevelComment(value: Comment): Self = StObject.set(x, "topLevelComment", value.asInstanceOf[js.Any])
        
        inline def setTopLevelCommentUndefined: Self = StObject.set(x, "topLevelComment", js.undefined)
        
        inline def setTotalReplyCount(value: Double): Self = StObject.set(x, "totalReplyCount", value.asInstanceOf[js.Any])
        
        inline def setTotalReplyCountUndefined: Self = StObject.set(x, "totalReplyCount", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait ContentRating extends StObject {
      
      var acbRating: js.UndefOr[String] = js.undefined
      
      var agcomRating: js.UndefOr[String] = js.undefined
      
      var anatelRating: js.UndefOr[String] = js.undefined
      
      var bbfcRating: js.UndefOr[String] = js.undefined
      
      var bfvcRating: js.UndefOr[String] = js.undefined
      
      var bmukkRating: js.UndefOr[String] = js.undefined
      
      var catvRating: js.UndefOr[String] = js.undefined
      
      var catvfrRating: js.UndefOr[String] = js.undefined
      
      var cbfcRating: js.UndefOr[String] = js.undefined
      
      var cccRating: js.UndefOr[String] = js.undefined
      
      var cceRating: js.UndefOr[String] = js.undefined
      
      var chfilmRating: js.UndefOr[String] = js.undefined
      
      var chvrsRating: js.UndefOr[String] = js.undefined
      
      var cicfRating: js.UndefOr[String] = js.undefined
      
      var cnaRating: js.UndefOr[String] = js.undefined
      
      var cncRating: js.UndefOr[String] = js.undefined
      
      var csaRating: js.UndefOr[String] = js.undefined
      
      var cscfRating: js.UndefOr[String] = js.undefined
      
      var czfilmRating: js.UndefOr[String] = js.undefined
      
      var djctqRating: js.UndefOr[String] = js.undefined
      
      var djctqRatingReasons: js.UndefOr[js.Array[String]] = js.undefined
      
      var ecbmctRating: js.UndefOr[String] = js.undefined
      
      var eefilmRating: js.UndefOr[String] = js.undefined
      
      var egfilmRating: js.UndefOr[String] = js.undefined
      
      var eirinRating: js.UndefOr[String] = js.undefined
      
      var fcbmRating: js.UndefOr[String] = js.undefined
      
      var fcoRating: js.UndefOr[String] = js.undefined
      
      var fmocRating: js.UndefOr[String] = js.undefined
      
      var fpbRating: js.UndefOr[String] = js.undefined
      
      var fpbRatingReasons: js.UndefOr[js.Array[String]] = js.undefined
      
      var fskRating: js.UndefOr[String] = js.undefined
      
      var grfilmRating: js.UndefOr[String] = js.undefined
      
      var icaaRating: js.UndefOr[String] = js.undefined
      
      var ifcoRating: js.UndefOr[String] = js.undefined
      
      var ilfilmRating: js.UndefOr[String] = js.undefined
      
      var incaaRating: js.UndefOr[String] = js.undefined
      
      var kfcbRating: js.UndefOr[String] = js.undefined
      
      var kijkwijzerRating: js.UndefOr[String] = js.undefined
      
      var kmrbRating: js.UndefOr[String] = js.undefined
      
      var lsfRating: js.UndefOr[String] = js.undefined
      
      var mccaaRating: js.UndefOr[String] = js.undefined
      
      var mccypRating: js.UndefOr[String] = js.undefined
      
      var mcstRating: js.UndefOr[String] = js.undefined
      
      var mdaRating: js.UndefOr[String] = js.undefined
      
      var medietilsynetRating: js.UndefOr[String] = js.undefined
      
      var mekuRating: js.UndefOr[String] = js.undefined
      
      var menaMpaaRating: js.UndefOr[String] = js.undefined
      
      var mibacRating: js.UndefOr[String] = js.undefined
      
      var mocRating: js.UndefOr[String] = js.undefined
      
      var moctwRating: js.UndefOr[String] = js.undefined
      
      var mpaaRating: js.UndefOr[String] = js.undefined
      
      var mpaatRating: js.UndefOr[String] = js.undefined
      
      var mtrcbRating: js.UndefOr[String] = js.undefined
      
      var nbcRating: js.UndefOr[String] = js.undefined
      
      var nbcplRating: js.UndefOr[String] = js.undefined
      
      var nfrcRating: js.UndefOr[String] = js.undefined
      
      var nfvcbRating: js.UndefOr[String] = js.undefined
      
      var nkclvRating: js.UndefOr[String] = js.undefined
      
      var oflcRating: js.UndefOr[String] = js.undefined
      
      var pefilmRating: js.UndefOr[String] = js.undefined
      
      var rcnofRating: js.UndefOr[String] = js.undefined
      
      var resorteviolenciaRating: js.UndefOr[String] = js.undefined
      
      var rtcRating: js.UndefOr[String] = js.undefined
      
      var rteRating: js.UndefOr[String] = js.undefined
      
      var russiaRating: js.UndefOr[String] = js.undefined
      
      var skfilmRating: js.UndefOr[String] = js.undefined
      
      var smaisRating: js.UndefOr[String] = js.undefined
      
      var smsaRating: js.UndefOr[String] = js.undefined
      
      var tvpgRating: js.UndefOr[String] = js.undefined
      
      var ytRating: js.UndefOr[String] = js.undefined
    }
    object ContentRating {
      
      inline def apply(): ContentRating = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContentRating]
      }
      
      extension [Self <: ContentRating](x: Self) {
        
        inline def setAcbRating(value: String): Self = StObject.set(x, "acbRating", value.asInstanceOf[js.Any])
        
        inline def setAcbRatingUndefined: Self = StObject.set(x, "acbRating", js.undefined)
        
        inline def setAgcomRating(value: String): Self = StObject.set(x, "agcomRating", value.asInstanceOf[js.Any])
        
        inline def setAgcomRatingUndefined: Self = StObject.set(x, "agcomRating", js.undefined)
        
        inline def setAnatelRating(value: String): Self = StObject.set(x, "anatelRating", value.asInstanceOf[js.Any])
        
        inline def setAnatelRatingUndefined: Self = StObject.set(x, "anatelRating", js.undefined)
        
        inline def setBbfcRating(value: String): Self = StObject.set(x, "bbfcRating", value.asInstanceOf[js.Any])
        
        inline def setBbfcRatingUndefined: Self = StObject.set(x, "bbfcRating", js.undefined)
        
        inline def setBfvcRating(value: String): Self = StObject.set(x, "bfvcRating", value.asInstanceOf[js.Any])
        
        inline def setBfvcRatingUndefined: Self = StObject.set(x, "bfvcRating", js.undefined)
        
        inline def setBmukkRating(value: String): Self = StObject.set(x, "bmukkRating", value.asInstanceOf[js.Any])
        
        inline def setBmukkRatingUndefined: Self = StObject.set(x, "bmukkRating", js.undefined)
        
        inline def setCatvRating(value: String): Self = StObject.set(x, "catvRating", value.asInstanceOf[js.Any])
        
        inline def setCatvRatingUndefined: Self = StObject.set(x, "catvRating", js.undefined)
        
        inline def setCatvfrRating(value: String): Self = StObject.set(x, "catvfrRating", value.asInstanceOf[js.Any])
        
        inline def setCatvfrRatingUndefined: Self = StObject.set(x, "catvfrRating", js.undefined)
        
        inline def setCbfcRating(value: String): Self = StObject.set(x, "cbfcRating", value.asInstanceOf[js.Any])
        
        inline def setCbfcRatingUndefined: Self = StObject.set(x, "cbfcRating", js.undefined)
        
        inline def setCccRating(value: String): Self = StObject.set(x, "cccRating", value.asInstanceOf[js.Any])
        
        inline def setCccRatingUndefined: Self = StObject.set(x, "cccRating", js.undefined)
        
        inline def setCceRating(value: String): Self = StObject.set(x, "cceRating", value.asInstanceOf[js.Any])
        
        inline def setCceRatingUndefined: Self = StObject.set(x, "cceRating", js.undefined)
        
        inline def setChfilmRating(value: String): Self = StObject.set(x, "chfilmRating", value.asInstanceOf[js.Any])
        
        inline def setChfilmRatingUndefined: Self = StObject.set(x, "chfilmRating", js.undefined)
        
        inline def setChvrsRating(value: String): Self = StObject.set(x, "chvrsRating", value.asInstanceOf[js.Any])
        
        inline def setChvrsRatingUndefined: Self = StObject.set(x, "chvrsRating", js.undefined)
        
        inline def setCicfRating(value: String): Self = StObject.set(x, "cicfRating", value.asInstanceOf[js.Any])
        
        inline def setCicfRatingUndefined: Self = StObject.set(x, "cicfRating", js.undefined)
        
        inline def setCnaRating(value: String): Self = StObject.set(x, "cnaRating", value.asInstanceOf[js.Any])
        
        inline def setCnaRatingUndefined: Self = StObject.set(x, "cnaRating", js.undefined)
        
        inline def setCncRating(value: String): Self = StObject.set(x, "cncRating", value.asInstanceOf[js.Any])
        
        inline def setCncRatingUndefined: Self = StObject.set(x, "cncRating", js.undefined)
        
        inline def setCsaRating(value: String): Self = StObject.set(x, "csaRating", value.asInstanceOf[js.Any])
        
        inline def setCsaRatingUndefined: Self = StObject.set(x, "csaRating", js.undefined)
        
        inline def setCscfRating(value: String): Self = StObject.set(x, "cscfRating", value.asInstanceOf[js.Any])
        
        inline def setCscfRatingUndefined: Self = StObject.set(x, "cscfRating", js.undefined)
        
        inline def setCzfilmRating(value: String): Self = StObject.set(x, "czfilmRating", value.asInstanceOf[js.Any])
        
        inline def setCzfilmRatingUndefined: Self = StObject.set(x, "czfilmRating", js.undefined)
        
        inline def setDjctqRating(value: String): Self = StObject.set(x, "djctqRating", value.asInstanceOf[js.Any])
        
        inline def setDjctqRatingReasons(value: js.Array[String]): Self = StObject.set(x, "djctqRatingReasons", value.asInstanceOf[js.Any])
        
        inline def setDjctqRatingReasonsUndefined: Self = StObject.set(x, "djctqRatingReasons", js.undefined)
        
        inline def setDjctqRatingReasonsVarargs(value: String*): Self = StObject.set(x, "djctqRatingReasons", js.Array(value*))
        
        inline def setDjctqRatingUndefined: Self = StObject.set(x, "djctqRating", js.undefined)
        
        inline def setEcbmctRating(value: String): Self = StObject.set(x, "ecbmctRating", value.asInstanceOf[js.Any])
        
        inline def setEcbmctRatingUndefined: Self = StObject.set(x, "ecbmctRating", js.undefined)
        
        inline def setEefilmRating(value: String): Self = StObject.set(x, "eefilmRating", value.asInstanceOf[js.Any])
        
        inline def setEefilmRatingUndefined: Self = StObject.set(x, "eefilmRating", js.undefined)
        
        inline def setEgfilmRating(value: String): Self = StObject.set(x, "egfilmRating", value.asInstanceOf[js.Any])
        
        inline def setEgfilmRatingUndefined: Self = StObject.set(x, "egfilmRating", js.undefined)
        
        inline def setEirinRating(value: String): Self = StObject.set(x, "eirinRating", value.asInstanceOf[js.Any])
        
        inline def setEirinRatingUndefined: Self = StObject.set(x, "eirinRating", js.undefined)
        
        inline def setFcbmRating(value: String): Self = StObject.set(x, "fcbmRating", value.asInstanceOf[js.Any])
        
        inline def setFcbmRatingUndefined: Self = StObject.set(x, "fcbmRating", js.undefined)
        
        inline def setFcoRating(value: String): Self = StObject.set(x, "fcoRating", value.asInstanceOf[js.Any])
        
        inline def setFcoRatingUndefined: Self = StObject.set(x, "fcoRating", js.undefined)
        
        inline def setFmocRating(value: String): Self = StObject.set(x, "fmocRating", value.asInstanceOf[js.Any])
        
        inline def setFmocRatingUndefined: Self = StObject.set(x, "fmocRating", js.undefined)
        
        inline def setFpbRating(value: String): Self = StObject.set(x, "fpbRating", value.asInstanceOf[js.Any])
        
        inline def setFpbRatingReasons(value: js.Array[String]): Self = StObject.set(x, "fpbRatingReasons", value.asInstanceOf[js.Any])
        
        inline def setFpbRatingReasonsUndefined: Self = StObject.set(x, "fpbRatingReasons", js.undefined)
        
        inline def setFpbRatingReasonsVarargs(value: String*): Self = StObject.set(x, "fpbRatingReasons", js.Array(value*))
        
        inline def setFpbRatingUndefined: Self = StObject.set(x, "fpbRating", js.undefined)
        
        inline def setFskRating(value: String): Self = StObject.set(x, "fskRating", value.asInstanceOf[js.Any])
        
        inline def setFskRatingUndefined: Self = StObject.set(x, "fskRating", js.undefined)
        
        inline def setGrfilmRating(value: String): Self = StObject.set(x, "grfilmRating", value.asInstanceOf[js.Any])
        
        inline def setGrfilmRatingUndefined: Self = StObject.set(x, "grfilmRating", js.undefined)
        
        inline def setIcaaRating(value: String): Self = StObject.set(x, "icaaRating", value.asInstanceOf[js.Any])
        
        inline def setIcaaRatingUndefined: Self = StObject.set(x, "icaaRating", js.undefined)
        
        inline def setIfcoRating(value: String): Self = StObject.set(x, "ifcoRating", value.asInstanceOf[js.Any])
        
        inline def setIfcoRatingUndefined: Self = StObject.set(x, "ifcoRating", js.undefined)
        
        inline def setIlfilmRating(value: String): Self = StObject.set(x, "ilfilmRating", value.asInstanceOf[js.Any])
        
        inline def setIlfilmRatingUndefined: Self = StObject.set(x, "ilfilmRating", js.undefined)
        
        inline def setIncaaRating(value: String): Self = StObject.set(x, "incaaRating", value.asInstanceOf[js.Any])
        
        inline def setIncaaRatingUndefined: Self = StObject.set(x, "incaaRating", js.undefined)
        
        inline def setKfcbRating(value: String): Self = StObject.set(x, "kfcbRating", value.asInstanceOf[js.Any])
        
        inline def setKfcbRatingUndefined: Self = StObject.set(x, "kfcbRating", js.undefined)
        
        inline def setKijkwijzerRating(value: String): Self = StObject.set(x, "kijkwijzerRating", value.asInstanceOf[js.Any])
        
        inline def setKijkwijzerRatingUndefined: Self = StObject.set(x, "kijkwijzerRating", js.undefined)
        
        inline def setKmrbRating(value: String): Self = StObject.set(x, "kmrbRating", value.asInstanceOf[js.Any])
        
        inline def setKmrbRatingUndefined: Self = StObject.set(x, "kmrbRating", js.undefined)
        
        inline def setLsfRating(value: String): Self = StObject.set(x, "lsfRating", value.asInstanceOf[js.Any])
        
        inline def setLsfRatingUndefined: Self = StObject.set(x, "lsfRating", js.undefined)
        
        inline def setMccaaRating(value: String): Self = StObject.set(x, "mccaaRating", value.asInstanceOf[js.Any])
        
        inline def setMccaaRatingUndefined: Self = StObject.set(x, "mccaaRating", js.undefined)
        
        inline def setMccypRating(value: String): Self = StObject.set(x, "mccypRating", value.asInstanceOf[js.Any])
        
        inline def setMccypRatingUndefined: Self = StObject.set(x, "mccypRating", js.undefined)
        
        inline def setMcstRating(value: String): Self = StObject.set(x, "mcstRating", value.asInstanceOf[js.Any])
        
        inline def setMcstRatingUndefined: Self = StObject.set(x, "mcstRating", js.undefined)
        
        inline def setMdaRating(value: String): Self = StObject.set(x, "mdaRating", value.asInstanceOf[js.Any])
        
        inline def setMdaRatingUndefined: Self = StObject.set(x, "mdaRating", js.undefined)
        
        inline def setMedietilsynetRating(value: String): Self = StObject.set(x, "medietilsynetRating", value.asInstanceOf[js.Any])
        
        inline def setMedietilsynetRatingUndefined: Self = StObject.set(x, "medietilsynetRating", js.undefined)
        
        inline def setMekuRating(value: String): Self = StObject.set(x, "mekuRating", value.asInstanceOf[js.Any])
        
        inline def setMekuRatingUndefined: Self = StObject.set(x, "mekuRating", js.undefined)
        
        inline def setMenaMpaaRating(value: String): Self = StObject.set(x, "menaMpaaRating", value.asInstanceOf[js.Any])
        
        inline def setMenaMpaaRatingUndefined: Self = StObject.set(x, "menaMpaaRating", js.undefined)
        
        inline def setMibacRating(value: String): Self = StObject.set(x, "mibacRating", value.asInstanceOf[js.Any])
        
        inline def setMibacRatingUndefined: Self = StObject.set(x, "mibacRating", js.undefined)
        
        inline def setMocRating(value: String): Self = StObject.set(x, "mocRating", value.asInstanceOf[js.Any])
        
        inline def setMocRatingUndefined: Self = StObject.set(x, "mocRating", js.undefined)
        
        inline def setMoctwRating(value: String): Self = StObject.set(x, "moctwRating", value.asInstanceOf[js.Any])
        
        inline def setMoctwRatingUndefined: Self = StObject.set(x, "moctwRating", js.undefined)
        
        inline def setMpaaRating(value: String): Self = StObject.set(x, "mpaaRating", value.asInstanceOf[js.Any])
        
        inline def setMpaaRatingUndefined: Self = StObject.set(x, "mpaaRating", js.undefined)
        
        inline def setMpaatRating(value: String): Self = StObject.set(x, "mpaatRating", value.asInstanceOf[js.Any])
        
        inline def setMpaatRatingUndefined: Self = StObject.set(x, "mpaatRating", js.undefined)
        
        inline def setMtrcbRating(value: String): Self = StObject.set(x, "mtrcbRating", value.asInstanceOf[js.Any])
        
        inline def setMtrcbRatingUndefined: Self = StObject.set(x, "mtrcbRating", js.undefined)
        
        inline def setNbcRating(value: String): Self = StObject.set(x, "nbcRating", value.asInstanceOf[js.Any])
        
        inline def setNbcRatingUndefined: Self = StObject.set(x, "nbcRating", js.undefined)
        
        inline def setNbcplRating(value: String): Self = StObject.set(x, "nbcplRating", value.asInstanceOf[js.Any])
        
        inline def setNbcplRatingUndefined: Self = StObject.set(x, "nbcplRating", js.undefined)
        
        inline def setNfrcRating(value: String): Self = StObject.set(x, "nfrcRating", value.asInstanceOf[js.Any])
        
        inline def setNfrcRatingUndefined: Self = StObject.set(x, "nfrcRating", js.undefined)
        
        inline def setNfvcbRating(value: String): Self = StObject.set(x, "nfvcbRating", value.asInstanceOf[js.Any])
        
        inline def setNfvcbRatingUndefined: Self = StObject.set(x, "nfvcbRating", js.undefined)
        
        inline def setNkclvRating(value: String): Self = StObject.set(x, "nkclvRating", value.asInstanceOf[js.Any])
        
        inline def setNkclvRatingUndefined: Self = StObject.set(x, "nkclvRating", js.undefined)
        
        inline def setOflcRating(value: String): Self = StObject.set(x, "oflcRating", value.asInstanceOf[js.Any])
        
        inline def setOflcRatingUndefined: Self = StObject.set(x, "oflcRating", js.undefined)
        
        inline def setPefilmRating(value: String): Self = StObject.set(x, "pefilmRating", value.asInstanceOf[js.Any])
        
        inline def setPefilmRatingUndefined: Self = StObject.set(x, "pefilmRating", js.undefined)
        
        inline def setRcnofRating(value: String): Self = StObject.set(x, "rcnofRating", value.asInstanceOf[js.Any])
        
        inline def setRcnofRatingUndefined: Self = StObject.set(x, "rcnofRating", js.undefined)
        
        inline def setResorteviolenciaRating(value: String): Self = StObject.set(x, "resorteviolenciaRating", value.asInstanceOf[js.Any])
        
        inline def setResorteviolenciaRatingUndefined: Self = StObject.set(x, "resorteviolenciaRating", js.undefined)
        
        inline def setRtcRating(value: String): Self = StObject.set(x, "rtcRating", value.asInstanceOf[js.Any])
        
        inline def setRtcRatingUndefined: Self = StObject.set(x, "rtcRating", js.undefined)
        
        inline def setRteRating(value: String): Self = StObject.set(x, "rteRating", value.asInstanceOf[js.Any])
        
        inline def setRteRatingUndefined: Self = StObject.set(x, "rteRating", js.undefined)
        
        inline def setRussiaRating(value: String): Self = StObject.set(x, "russiaRating", value.asInstanceOf[js.Any])
        
        inline def setRussiaRatingUndefined: Self = StObject.set(x, "russiaRating", js.undefined)
        
        inline def setSkfilmRating(value: String): Self = StObject.set(x, "skfilmRating", value.asInstanceOf[js.Any])
        
        inline def setSkfilmRatingUndefined: Self = StObject.set(x, "skfilmRating", js.undefined)
        
        inline def setSmaisRating(value: String): Self = StObject.set(x, "smaisRating", value.asInstanceOf[js.Any])
        
        inline def setSmaisRatingUndefined: Self = StObject.set(x, "smaisRating", js.undefined)
        
        inline def setSmsaRating(value: String): Self = StObject.set(x, "smsaRating", value.asInstanceOf[js.Any])
        
        inline def setSmsaRatingUndefined: Self = StObject.set(x, "smsaRating", js.undefined)
        
        inline def setTvpgRating(value: String): Self = StObject.set(x, "tvpgRating", value.asInstanceOf[js.Any])
        
        inline def setTvpgRatingUndefined: Self = StObject.set(x, "tvpgRating", js.undefined)
        
        inline def setYtRating(value: String): Self = StObject.set(x, "ytRating", value.asInstanceOf[js.Any])
        
        inline def setYtRatingUndefined: Self = StObject.set(x, "ytRating", js.undefined)
      }
    }
    
    trait GeoPoint extends StObject {
      
      var altitude: js.UndefOr[Double] = js.undefined
      
      var latitude: js.UndefOr[Double] = js.undefined
      
      var longitude: js.UndefOr[Double] = js.undefined
    }
    object GeoPoint {
      
      inline def apply(): GeoPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeoPoint]
      }
      
      extension [Self <: GeoPoint](x: Self) {
        
        inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
        
        inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
        
        inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
        
        inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
        
        inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
        
        inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      }
    }
    
    trait GuideCategory extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[GuideCategorySnippet] = js.undefined
    }
    object GuideCategory {
      
      inline def apply(): GuideCategory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GuideCategory]
      }
      
      extension [Self <: GuideCategory](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: GuideCategorySnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait GuideCategoryListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[GuideCategory]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object GuideCategoryListResponse {
      
      inline def apply(): GuideCategoryListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GuideCategoryListResponse]
      }
      
      extension [Self <: GuideCategoryListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[GuideCategory]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: GuideCategory*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait GuideCategorySnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object GuideCategorySnippet {
      
      inline def apply(): GuideCategorySnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GuideCategorySnippet]
      }
      
      extension [Self <: GuideCategorySnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait I18nLanguage extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[I18nLanguageSnippet] = js.undefined
    }
    object I18nLanguage {
      
      inline def apply(): I18nLanguage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[I18nLanguage]
      }
      
      extension [Self <: I18nLanguage](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: I18nLanguageSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait I18nLanguageListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[I18nLanguage]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object I18nLanguageListResponse {
      
      inline def apply(): I18nLanguageListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[I18nLanguageListResponse]
      }
      
      extension [Self <: I18nLanguageListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[I18nLanguage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: I18nLanguage*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait I18nLanguageSnippet extends StObject {
      
      var hl: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object I18nLanguageSnippet {
      
      inline def apply(): I18nLanguageSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[I18nLanguageSnippet]
      }
      
      extension [Self <: I18nLanguageSnippet](x: Self) {
        
        inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
        
        inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait I18nRegion extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[I18nRegionSnippet] = js.undefined
    }
    object I18nRegion {
      
      inline def apply(): I18nRegion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[I18nRegion]
      }
      
      extension [Self <: I18nRegion](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: I18nRegionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait I18nRegionListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[I18nRegion]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object I18nRegionListResponse {
      
      inline def apply(): I18nRegionListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[I18nRegionListResponse]
      }
      
      extension [Self <: I18nRegionListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[I18nRegion]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: I18nRegion*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait I18nRegionSnippet extends StObject {
      
      var gl: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object I18nRegionSnippet {
      
      inline def apply(): I18nRegionSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[I18nRegionSnippet]
      }
      
      extension [Self <: I18nRegionSnippet](x: Self) {
        
        inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
        
        inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ImageSettings extends StObject {
      
      var backgroundImageUrl: js.UndefOr[LocalizedProperty] = js.undefined
      
      var bannerExternalUrl: js.UndefOr[String] = js.undefined
      
      var bannerImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerMobileExtraHdImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerMobileHdImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerMobileImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerMobileLowImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerMobileMediumHdImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTabletExtraHdImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTabletHdImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTabletImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTabletLowImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTvHighImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTvImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTvLowImageUrl: js.UndefOr[String] = js.undefined
      
      var bannerTvMediumImageUrl: js.UndefOr[String] = js.undefined
      
      var largeBrandedBannerImageImapScript: js.UndefOr[LocalizedProperty] = js.undefined
      
      var largeBrandedBannerImageUrl: js.UndefOr[LocalizedProperty] = js.undefined
      
      var smallBrandedBannerImageImapScript: js.UndefOr[LocalizedProperty] = js.undefined
      
      var smallBrandedBannerImageUrl: js.UndefOr[LocalizedProperty] = js.undefined
      
      var trackingImageUrl: js.UndefOr[String] = js.undefined
      
      var watchIconImageUrl: js.UndefOr[String] = js.undefined
    }
    object ImageSettings {
      
      inline def apply(): ImageSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageSettings]
      }
      
      extension [Self <: ImageSettings](x: Self) {
        
        inline def setBackgroundImageUrl(value: LocalizedProperty): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
        
        inline def setBannerExternalUrl(value: String): Self = StObject.set(x, "bannerExternalUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerExternalUrlUndefined: Self = StObject.set(x, "bannerExternalUrl", js.undefined)
        
        inline def setBannerImageUrl(value: String): Self = StObject.set(x, "bannerImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerImageUrlUndefined: Self = StObject.set(x, "bannerImageUrl", js.undefined)
        
        inline def setBannerMobileExtraHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileExtraHdImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerMobileExtraHdImageUrlUndefined: Self = StObject.set(x, "bannerMobileExtraHdImageUrl", js.undefined)
        
        inline def setBannerMobileHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileHdImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerMobileHdImageUrlUndefined: Self = StObject.set(x, "bannerMobileHdImageUrl", js.undefined)
        
        inline def setBannerMobileImageUrl(value: String): Self = StObject.set(x, "bannerMobileImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerMobileImageUrlUndefined: Self = StObject.set(x, "bannerMobileImageUrl", js.undefined)
        
        inline def setBannerMobileLowImageUrl(value: String): Self = StObject.set(x, "bannerMobileLowImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerMobileLowImageUrlUndefined: Self = StObject.set(x, "bannerMobileLowImageUrl", js.undefined)
        
        inline def setBannerMobileMediumHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileMediumHdImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerMobileMediumHdImageUrlUndefined: Self = StObject.set(x, "bannerMobileMediumHdImageUrl", js.undefined)
        
        inline def setBannerTabletExtraHdImageUrl(value: String): Self = StObject.set(x, "bannerTabletExtraHdImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTabletExtraHdImageUrlUndefined: Self = StObject.set(x, "bannerTabletExtraHdImageUrl", js.undefined)
        
        inline def setBannerTabletHdImageUrl(value: String): Self = StObject.set(x, "bannerTabletHdImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTabletHdImageUrlUndefined: Self = StObject.set(x, "bannerTabletHdImageUrl", js.undefined)
        
        inline def setBannerTabletImageUrl(value: String): Self = StObject.set(x, "bannerTabletImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTabletImageUrlUndefined: Self = StObject.set(x, "bannerTabletImageUrl", js.undefined)
        
        inline def setBannerTabletLowImageUrl(value: String): Self = StObject.set(x, "bannerTabletLowImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTabletLowImageUrlUndefined: Self = StObject.set(x, "bannerTabletLowImageUrl", js.undefined)
        
        inline def setBannerTvHighImageUrl(value: String): Self = StObject.set(x, "bannerTvHighImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTvHighImageUrlUndefined: Self = StObject.set(x, "bannerTvHighImageUrl", js.undefined)
        
        inline def setBannerTvImageUrl(value: String): Self = StObject.set(x, "bannerTvImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTvImageUrlUndefined: Self = StObject.set(x, "bannerTvImageUrl", js.undefined)
        
        inline def setBannerTvLowImageUrl(value: String): Self = StObject.set(x, "bannerTvLowImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTvLowImageUrlUndefined: Self = StObject.set(x, "bannerTvLowImageUrl", js.undefined)
        
        inline def setBannerTvMediumImageUrl(value: String): Self = StObject.set(x, "bannerTvMediumImageUrl", value.asInstanceOf[js.Any])
        
        inline def setBannerTvMediumImageUrlUndefined: Self = StObject.set(x, "bannerTvMediumImageUrl", js.undefined)
        
        inline def setLargeBrandedBannerImageImapScript(value: LocalizedProperty): Self = StObject.set(x, "largeBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
        
        inline def setLargeBrandedBannerImageImapScriptUndefined: Self = StObject.set(x, "largeBrandedBannerImageImapScript", js.undefined)
        
        inline def setLargeBrandedBannerImageUrl(value: LocalizedProperty): Self = StObject.set(x, "largeBrandedBannerImageUrl", value.asInstanceOf[js.Any])
        
        inline def setLargeBrandedBannerImageUrlUndefined: Self = StObject.set(x, "largeBrandedBannerImageUrl", js.undefined)
        
        inline def setSmallBrandedBannerImageImapScript(value: LocalizedProperty): Self = StObject.set(x, "smallBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
        
        inline def setSmallBrandedBannerImageImapScriptUndefined: Self = StObject.set(x, "smallBrandedBannerImageImapScript", js.undefined)
        
        inline def setSmallBrandedBannerImageUrl(value: LocalizedProperty): Self = StObject.set(x, "smallBrandedBannerImageUrl", value.asInstanceOf[js.Any])
        
        inline def setSmallBrandedBannerImageUrlUndefined: Self = StObject.set(x, "smallBrandedBannerImageUrl", js.undefined)
        
        inline def setTrackingImageUrl(value: String): Self = StObject.set(x, "trackingImageUrl", value.asInstanceOf[js.Any])
        
        inline def setTrackingImageUrlUndefined: Self = StObject.set(x, "trackingImageUrl", js.undefined)
        
        inline def setWatchIconImageUrl(value: String): Self = StObject.set(x, "watchIconImageUrl", value.asInstanceOf[js.Any])
        
        inline def setWatchIconImageUrlUndefined: Self = StObject.set(x, "watchIconImageUrl", js.undefined)
      }
    }
    
    trait IngestionInfo extends StObject {
      
      var backupIngestionAddress: js.UndefOr[String] = js.undefined
      
      var ingestionAddress: js.UndefOr[String] = js.undefined
      
      var streamName: js.UndefOr[String] = js.undefined
    }
    object IngestionInfo {
      
      inline def apply(): IngestionInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IngestionInfo]
      }
      
      extension [Self <: IngestionInfo](x: Self) {
        
        inline def setBackupIngestionAddress(value: String): Self = StObject.set(x, "backupIngestionAddress", value.asInstanceOf[js.Any])
        
        inline def setBackupIngestionAddressUndefined: Self = StObject.set(x, "backupIngestionAddress", js.undefined)
        
        inline def setIngestionAddress(value: String): Self = StObject.set(x, "ingestionAddress", value.asInstanceOf[js.Any])
        
        inline def setIngestionAddressUndefined: Self = StObject.set(x, "ingestionAddress", js.undefined)
        
        inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
        
        inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
      }
    }
    
    trait InvideoBranding extends StObject {
      
      var imageBytes: js.UndefOr[String] = js.undefined
      
      var imageUrl: js.UndefOr[String] = js.undefined
      
      var position: js.UndefOr[InvideoPosition] = js.undefined
      
      var targetChannelId: js.UndefOr[String] = js.undefined
      
      var timing: js.UndefOr[InvideoTiming] = js.undefined
    }
    object InvideoBranding {
      
      inline def apply(): InvideoBranding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InvideoBranding]
      }
      
      extension [Self <: InvideoBranding](x: Self) {
        
        inline def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
        
        inline def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
        
        inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        inline def setPosition(value: InvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setTargetChannelId(value: String): Self = StObject.set(x, "targetChannelId", value.asInstanceOf[js.Any])
        
        inline def setTargetChannelIdUndefined: Self = StObject.set(x, "targetChannelId", js.undefined)
        
        inline def setTiming(value: InvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
        
        inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      }
    }
    
    trait InvideoPosition extends StObject {
      
      var cornerPosition: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object InvideoPosition {
      
      inline def apply(): InvideoPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InvideoPosition]
      }
      
      extension [Self <: InvideoPosition](x: Self) {
        
        inline def setCornerPosition(value: String): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
        
        inline def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait InvideoPromotion extends StObject {
      
      var defaultTiming: js.UndefOr[InvideoTiming] = js.undefined
      
      var items: js.UndefOr[js.Array[PromotedItem]] = js.undefined
      
      var position: js.UndefOr[InvideoPosition] = js.undefined
      
      var useSmartTiming: js.UndefOr[Boolean] = js.undefined
    }
    object InvideoPromotion {
      
      inline def apply(): InvideoPromotion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InvideoPromotion]
      }
      
      extension [Self <: InvideoPromotion](x: Self) {
        
        inline def setDefaultTiming(value: InvideoTiming): Self = StObject.set(x, "defaultTiming", value.asInstanceOf[js.Any])
        
        inline def setDefaultTimingUndefined: Self = StObject.set(x, "defaultTiming", js.undefined)
        
        inline def setItems(value: js.Array[PromotedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: PromotedItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setPosition(value: InvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setUseSmartTiming(value: Boolean): Self = StObject.set(x, "useSmartTiming", value.asInstanceOf[js.Any])
        
        inline def setUseSmartTimingUndefined: Self = StObject.set(x, "useSmartTiming", js.undefined)
      }
    }
    
    trait InvideoTiming extends StObject {
      
      var durationMs: js.UndefOr[String] = js.undefined
      
      var offsetMs: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object InvideoTiming {
      
      inline def apply(): InvideoTiming = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InvideoTiming]
      }
      
      extension [Self <: InvideoTiming](x: Self) {
        
        inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
        
        inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
        
        inline def setOffsetMs(value: String): Self = StObject.set(x, "offsetMs", value.asInstanceOf[js.Any])
        
        inline def setOffsetMsUndefined: Self = StObject.set(x, "offsetMs", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait LanguageTag extends StObject {
      
      var value: js.UndefOr[String] = js.undefined
    }
    object LanguageTag {
      
      inline def apply(): LanguageTag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LanguageTag]
      }
      
      extension [Self <: LanguageTag](x: Self) {
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait LiveBroadcast extends StObject {
      
      var contentDetails: js.UndefOr[LiveBroadcastContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[LiveBroadcastSnippet] = js.undefined
      
      var statistics: js.UndefOr[LiveBroadcastStatistics] = js.undefined
      
      var status: js.UndefOr[LiveBroadcastStatus] = js.undefined
    }
    object LiveBroadcast {
      
      inline def apply(): LiveBroadcast = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveBroadcast]
      }
      
      extension [Self <: LiveBroadcast](x: Self) {
        
        inline def setContentDetails(value: LiveBroadcastContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: LiveBroadcastSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setStatistics(value: LiveBroadcastStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
        
        inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
        
        inline def setStatus(value: LiveBroadcastStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait LiveBroadcastContentDetails extends StObject {
      
      var boundStreamId: js.UndefOr[String] = js.undefined
      
      var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.undefined
      
      var closedCaptionsType: js.UndefOr[String] = js.undefined
      
      var enableAutoStart: js.UndefOr[Boolean] = js.undefined
      
      var enableClosedCaptions: js.UndefOr[Boolean] = js.undefined
      
      var enableContentEncryption: js.UndefOr[Boolean] = js.undefined
      
      var enableDvr: js.UndefOr[Boolean] = js.undefined
      
      var enableEmbed: js.UndefOr[Boolean] = js.undefined
      
      var enableLowLatency: js.UndefOr[Boolean] = js.undefined
      
      var latencyPreference: js.UndefOr[String] = js.undefined
      
      var mesh: js.UndefOr[String] = js.undefined
      
      var monitorStream: js.UndefOr[MonitorStreamInfo] = js.undefined
      
      var projection: js.UndefOr[String] = js.undefined
      
      var recordFromStart: js.UndefOr[Boolean] = js.undefined
      
      var startWithSlate: js.UndefOr[Boolean] = js.undefined
      
      var stereoLayout: js.UndefOr[String] = js.undefined
    }
    object LiveBroadcastContentDetails {
      
      inline def apply(): LiveBroadcastContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveBroadcastContentDetails]
      }
      
      extension [Self <: LiveBroadcastContentDetails](x: Self) {
        
        inline def setBoundStreamId(value: String): Self = StObject.set(x, "boundStreamId", value.asInstanceOf[js.Any])
        
        inline def setBoundStreamIdUndefined: Self = StObject.set(x, "boundStreamId", js.undefined)
        
        inline def setBoundStreamLastUpdateTimeMs(value: String): Self = StObject.set(x, "boundStreamLastUpdateTimeMs", value.asInstanceOf[js.Any])
        
        inline def setBoundStreamLastUpdateTimeMsUndefined: Self = StObject.set(x, "boundStreamLastUpdateTimeMs", js.undefined)
        
        inline def setClosedCaptionsType(value: String): Self = StObject.set(x, "closedCaptionsType", value.asInstanceOf[js.Any])
        
        inline def setClosedCaptionsTypeUndefined: Self = StObject.set(x, "closedCaptionsType", js.undefined)
        
        inline def setEnableAutoStart(value: Boolean): Self = StObject.set(x, "enableAutoStart", value.asInstanceOf[js.Any])
        
        inline def setEnableAutoStartUndefined: Self = StObject.set(x, "enableAutoStart", js.undefined)
        
        inline def setEnableClosedCaptions(value: Boolean): Self = StObject.set(x, "enableClosedCaptions", value.asInstanceOf[js.Any])
        
        inline def setEnableClosedCaptionsUndefined: Self = StObject.set(x, "enableClosedCaptions", js.undefined)
        
        inline def setEnableContentEncryption(value: Boolean): Self = StObject.set(x, "enableContentEncryption", value.asInstanceOf[js.Any])
        
        inline def setEnableContentEncryptionUndefined: Self = StObject.set(x, "enableContentEncryption", js.undefined)
        
        inline def setEnableDvr(value: Boolean): Self = StObject.set(x, "enableDvr", value.asInstanceOf[js.Any])
        
        inline def setEnableDvrUndefined: Self = StObject.set(x, "enableDvr", js.undefined)
        
        inline def setEnableEmbed(value: Boolean): Self = StObject.set(x, "enableEmbed", value.asInstanceOf[js.Any])
        
        inline def setEnableEmbedUndefined: Self = StObject.set(x, "enableEmbed", js.undefined)
        
        inline def setEnableLowLatency(value: Boolean): Self = StObject.set(x, "enableLowLatency", value.asInstanceOf[js.Any])
        
        inline def setEnableLowLatencyUndefined: Self = StObject.set(x, "enableLowLatency", js.undefined)
        
        inline def setLatencyPreference(value: String): Self = StObject.set(x, "latencyPreference", value.asInstanceOf[js.Any])
        
        inline def setLatencyPreferenceUndefined: Self = StObject.set(x, "latencyPreference", js.undefined)
        
        inline def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
        
        inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
        
        inline def setMonitorStream(value: MonitorStreamInfo): Self = StObject.set(x, "monitorStream", value.asInstanceOf[js.Any])
        
        inline def setMonitorStreamUndefined: Self = StObject.set(x, "monitorStream", js.undefined)
        
        inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        inline def setRecordFromStart(value: Boolean): Self = StObject.set(x, "recordFromStart", value.asInstanceOf[js.Any])
        
        inline def setRecordFromStartUndefined: Self = StObject.set(x, "recordFromStart", js.undefined)
        
        inline def setStartWithSlate(value: Boolean): Self = StObject.set(x, "startWithSlate", value.asInstanceOf[js.Any])
        
        inline def setStartWithSlateUndefined: Self = StObject.set(x, "startWithSlate", js.undefined)
        
        inline def setStereoLayout(value: String): Self = StObject.set(x, "stereoLayout", value.asInstanceOf[js.Any])
        
        inline def setStereoLayoutUndefined: Self = StObject.set(x, "stereoLayout", js.undefined)
      }
    }
    
    trait LiveBroadcastListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[LiveBroadcast]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object LiveBroadcastListResponse {
      
      inline def apply(): LiveBroadcastListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveBroadcastListResponse]
      }
      
      extension [Self <: LiveBroadcastListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[LiveBroadcast]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: LiveBroadcast*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait LiveBroadcastSnippet extends StObject {
      
      var actualEndTime: js.UndefOr[String] = js.undefined
      
      var actualStartTime: js.UndefOr[String] = js.undefined
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var isDefaultBroadcast: js.UndefOr[Boolean] = js.undefined
      
      var liveChatId: js.UndefOr[String] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var scheduledEndTime: js.UndefOr[String] = js.undefined
      
      var scheduledStartTime: js.UndefOr[String] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object LiveBroadcastSnippet {
      
      inline def apply(): LiveBroadcastSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveBroadcastSnippet]
      }
      
      extension [Self <: LiveBroadcastSnippet](x: Self) {
        
        inline def setActualEndTime(value: String): Self = StObject.set(x, "actualEndTime", value.asInstanceOf[js.Any])
        
        inline def setActualEndTimeUndefined: Self = StObject.set(x, "actualEndTime", js.undefined)
        
        inline def setActualStartTime(value: String): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
        
        inline def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setIsDefaultBroadcast(value: Boolean): Self = StObject.set(x, "isDefaultBroadcast", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultBroadcastUndefined: Self = StObject.set(x, "isDefaultBroadcast", js.undefined)
        
        inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
        
        inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setScheduledEndTime(value: String): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
        
        inline def setScheduledStartTime(value: String): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait LiveBroadcastStatistics extends StObject {
      
      var concurrentViewers: js.UndefOr[String] = js.undefined
      
      var totalChatCount: js.UndefOr[String] = js.undefined
    }
    object LiveBroadcastStatistics {
      
      inline def apply(): LiveBroadcastStatistics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveBroadcastStatistics]
      }
      
      extension [Self <: LiveBroadcastStatistics](x: Self) {
        
        inline def setConcurrentViewers(value: String): Self = StObject.set(x, "concurrentViewers", value.asInstanceOf[js.Any])
        
        inline def setConcurrentViewersUndefined: Self = StObject.set(x, "concurrentViewers", js.undefined)
        
        inline def setTotalChatCount(value: String): Self = StObject.set(x, "totalChatCount", value.asInstanceOf[js.Any])
        
        inline def setTotalChatCountUndefined: Self = StObject.set(x, "totalChatCount", js.undefined)
      }
    }
    
    trait LiveBroadcastStatus extends StObject {
      
      var lifeCycleStatus: js.UndefOr[String] = js.undefined
      
      var liveBroadcastPriority: js.UndefOr[String] = js.undefined
      
      var privacyStatus: js.UndefOr[String] = js.undefined
      
      var recordingStatus: js.UndefOr[String] = js.undefined
    }
    object LiveBroadcastStatus {
      
      inline def apply(): LiveBroadcastStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveBroadcastStatus]
      }
      
      extension [Self <: LiveBroadcastStatus](x: Self) {
        
        inline def setLifeCycleStatus(value: String): Self = StObject.set(x, "lifeCycleStatus", value.asInstanceOf[js.Any])
        
        inline def setLifeCycleStatusUndefined: Self = StObject.set(x, "lifeCycleStatus", js.undefined)
        
        inline def setLiveBroadcastPriority(value: String): Self = StObject.set(x, "liveBroadcastPriority", value.asInstanceOf[js.Any])
        
        inline def setLiveBroadcastPriorityUndefined: Self = StObject.set(x, "liveBroadcastPriority", js.undefined)
        
        inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
        
        inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
        
        inline def setRecordingStatus(value: String): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
        
        inline def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
      }
    }
    
    trait LiveChatBan extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[LiveChatBanSnippet] = js.undefined
    }
    object LiveChatBan {
      
      inline def apply(): LiveChatBan = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatBan]
      }
      
      extension [Self <: LiveChatBan](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: LiveChatBanSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait LiveChatBanSnippet extends StObject {
      
      var banDurationSeconds: js.UndefOr[String] = js.undefined
      
      var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
      
      var liveChatId: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object LiveChatBanSnippet {
      
      inline def apply(): LiveChatBanSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatBanSnippet]
      }
      
      extension [Self <: LiveChatBanSnippet](x: Self) {
        
        inline def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
        
        inline def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
        
        inline def setBannedUserDetails(value: ChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
        
        inline def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
        
        inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
        
        inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait LiveChatFanFundingEventDetails extends StObject {
      
      var amountDisplayString: js.UndefOr[String] = js.undefined
      
      var amountMicros: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var userComment: js.UndefOr[String] = js.undefined
    }
    object LiveChatFanFundingEventDetails {
      
      inline def apply(): LiveChatFanFundingEventDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatFanFundingEventDetails]
      }
      
      extension [Self <: LiveChatFanFundingEventDetails](x: Self) {
        
        inline def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
        
        inline def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
        
        inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
        
        inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
        
        inline def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
      }
    }
    
    trait LiveChatMessage extends StObject {
      
      var authorDetails: js.UndefOr[LiveChatMessageAuthorDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[LiveChatMessageSnippet] = js.undefined
    }
    object LiveChatMessage {
      
      inline def apply(): LiveChatMessage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatMessage]
      }
      
      extension [Self <: LiveChatMessage](x: Self) {
        
        inline def setAuthorDetails(value: LiveChatMessageAuthorDetails): Self = StObject.set(x, "authorDetails", value.asInstanceOf[js.Any])
        
        inline def setAuthorDetailsUndefined: Self = StObject.set(x, "authorDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: LiveChatMessageSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait LiveChatMessageAuthorDetails extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelUrl: js.UndefOr[String] = js.undefined
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var isChatModerator: js.UndefOr[Boolean] = js.undefined
      
      var isChatOwner: js.UndefOr[Boolean] = js.undefined
      
      var isChatSponsor: js.UndefOr[Boolean] = js.undefined
      
      var isVerified: js.UndefOr[Boolean] = js.undefined
      
      var profileImageUrl: js.UndefOr[String] = js.undefined
    }
    object LiveChatMessageAuthorDetails {
      
      inline def apply(): LiveChatMessageAuthorDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatMessageAuthorDetails]
      }
      
      extension [Self <: LiveChatMessageAuthorDetails](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
        
        inline def setChannelUrlUndefined: Self = StObject.set(x, "channelUrl", js.undefined)
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setIsChatModerator(value: Boolean): Self = StObject.set(x, "isChatModerator", value.asInstanceOf[js.Any])
        
        inline def setIsChatModeratorUndefined: Self = StObject.set(x, "isChatModerator", js.undefined)
        
        inline def setIsChatOwner(value: Boolean): Self = StObject.set(x, "isChatOwner", value.asInstanceOf[js.Any])
        
        inline def setIsChatOwnerUndefined: Self = StObject.set(x, "isChatOwner", js.undefined)
        
        inline def setIsChatSponsor(value: Boolean): Self = StObject.set(x, "isChatSponsor", value.asInstanceOf[js.Any])
        
        inline def setIsChatSponsorUndefined: Self = StObject.set(x, "isChatSponsor", js.undefined)
        
        inline def setIsVerified(value: Boolean): Self = StObject.set(x, "isVerified", value.asInstanceOf[js.Any])
        
        inline def setIsVerifiedUndefined: Self = StObject.set(x, "isVerified", js.undefined)
        
        inline def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
        
        inline def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
      }
    }
    
    trait LiveChatMessageDeletedDetails extends StObject {
      
      var deletedMessageId: js.UndefOr[String] = js.undefined
    }
    object LiveChatMessageDeletedDetails {
      
      inline def apply(): LiveChatMessageDeletedDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatMessageDeletedDetails]
      }
      
      extension [Self <: LiveChatMessageDeletedDetails](x: Self) {
        
        inline def setDeletedMessageId(value: String): Self = StObject.set(x, "deletedMessageId", value.asInstanceOf[js.Any])
        
        inline def setDeletedMessageIdUndefined: Self = StObject.set(x, "deletedMessageId", js.undefined)
      }
    }
    
    trait LiveChatMessageListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[LiveChatMessage]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var offlineAt: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var pollingIntervalMillis: js.UndefOr[Double] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object LiveChatMessageListResponse {
      
      inline def apply(): LiveChatMessageListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatMessageListResponse]
      }
      
      extension [Self <: LiveChatMessageListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[LiveChatMessage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: LiveChatMessage*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setOfflineAt(value: String): Self = StObject.set(x, "offlineAt", value.asInstanceOf[js.Any])
        
        inline def setOfflineAtUndefined: Self = StObject.set(x, "offlineAt", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
        
        inline def setPollingIntervalMillisUndefined: Self = StObject.set(x, "pollingIntervalMillis", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait LiveChatMessageRetractedDetails extends StObject {
      
      var retractedMessageId: js.UndefOr[String] = js.undefined
    }
    object LiveChatMessageRetractedDetails {
      
      inline def apply(): LiveChatMessageRetractedDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatMessageRetractedDetails]
      }
      
      extension [Self <: LiveChatMessageRetractedDetails](x: Self) {
        
        inline def setRetractedMessageId(value: String): Self = StObject.set(x, "retractedMessageId", value.asInstanceOf[js.Any])
        
        inline def setRetractedMessageIdUndefined: Self = StObject.set(x, "retractedMessageId", js.undefined)
      }
    }
    
    trait LiveChatMessageSnippet extends StObject {
      
      var authorChannelId: js.UndefOr[String] = js.undefined
      
      var displayMessage: js.UndefOr[String] = js.undefined
      
      var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.undefined
      
      var hasDisplayContent: js.UndefOr[Boolean] = js.undefined
      
      var liveChatId: js.UndefOr[String] = js.undefined
      
      var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.undefined
      
      var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.undefined
      
      var pollClosedDetails: js.UndefOr[LiveChatPollClosedDetails] = js.undefined
      
      var pollEditedDetails: js.UndefOr[LiveChatPollEditedDetails] = js.undefined
      
      var pollOpenedDetails: js.UndefOr[LiveChatPollOpenedDetails] = js.undefined
      
      var pollVotedDetails: js.UndefOr[LiveChatPollVotedDetails] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.undefined
      
      var superStickerDetails: js.UndefOr[LiveChatSuperStickerDetails] = js.undefined
      
      var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var userBannedDetails: js.UndefOr[LiveChatUserBannedMessageDetails] = js.undefined
    }
    object LiveChatMessageSnippet {
      
      inline def apply(): LiveChatMessageSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatMessageSnippet]
      }
      
      extension [Self <: LiveChatMessageSnippet](x: Self) {
        
        inline def setAuthorChannelId(value: String): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
        
        inline def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
        
        inline def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
        
        inline def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
        
        inline def setFanFundingEventDetails(value: LiveChatFanFundingEventDetails): Self = StObject.set(x, "fanFundingEventDetails", value.asInstanceOf[js.Any])
        
        inline def setFanFundingEventDetailsUndefined: Self = StObject.set(x, "fanFundingEventDetails", js.undefined)
        
        inline def setHasDisplayContent(value: Boolean): Self = StObject.set(x, "hasDisplayContent", value.asInstanceOf[js.Any])
        
        inline def setHasDisplayContentUndefined: Self = StObject.set(x, "hasDisplayContent", js.undefined)
        
        inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
        
        inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
        
        inline def setMessageDeletedDetails(value: LiveChatMessageDeletedDetails): Self = StObject.set(x, "messageDeletedDetails", value.asInstanceOf[js.Any])
        
        inline def setMessageDeletedDetailsUndefined: Self = StObject.set(x, "messageDeletedDetails", js.undefined)
        
        inline def setMessageRetractedDetails(value: LiveChatMessageRetractedDetails): Self = StObject.set(x, "messageRetractedDetails", value.asInstanceOf[js.Any])
        
        inline def setMessageRetractedDetailsUndefined: Self = StObject.set(x, "messageRetractedDetails", js.undefined)
        
        inline def setPollClosedDetails(value: LiveChatPollClosedDetails): Self = StObject.set(x, "pollClosedDetails", value.asInstanceOf[js.Any])
        
        inline def setPollClosedDetailsUndefined: Self = StObject.set(x, "pollClosedDetails", js.undefined)
        
        inline def setPollEditedDetails(value: LiveChatPollEditedDetails): Self = StObject.set(x, "pollEditedDetails", value.asInstanceOf[js.Any])
        
        inline def setPollEditedDetailsUndefined: Self = StObject.set(x, "pollEditedDetails", js.undefined)
        
        inline def setPollOpenedDetails(value: LiveChatPollOpenedDetails): Self = StObject.set(x, "pollOpenedDetails", value.asInstanceOf[js.Any])
        
        inline def setPollOpenedDetailsUndefined: Self = StObject.set(x, "pollOpenedDetails", js.undefined)
        
        inline def setPollVotedDetails(value: LiveChatPollVotedDetails): Self = StObject.set(x, "pollVotedDetails", value.asInstanceOf[js.Any])
        
        inline def setPollVotedDetailsUndefined: Self = StObject.set(x, "pollVotedDetails", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setSuperChatDetails(value: LiveChatSuperChatDetails): Self = StObject.set(x, "superChatDetails", value.asInstanceOf[js.Any])
        
        inline def setSuperChatDetailsUndefined: Self = StObject.set(x, "superChatDetails", js.undefined)
        
        inline def setSuperStickerDetails(value: LiveChatSuperStickerDetails): Self = StObject.set(x, "superStickerDetails", value.asInstanceOf[js.Any])
        
        inline def setSuperStickerDetailsUndefined: Self = StObject.set(x, "superStickerDetails", js.undefined)
        
        inline def setTextMessageDetails(value: LiveChatTextMessageDetails): Self = StObject.set(x, "textMessageDetails", value.asInstanceOf[js.Any])
        
        inline def setTextMessageDetailsUndefined: Self = StObject.set(x, "textMessageDetails", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUserBannedDetails(value: LiveChatUserBannedMessageDetails): Self = StObject.set(x, "userBannedDetails", value.asInstanceOf[js.Any])
        
        inline def setUserBannedDetailsUndefined: Self = StObject.set(x, "userBannedDetails", js.undefined)
      }
    }
    
    trait LiveChatModerator extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[LiveChatModeratorSnippet] = js.undefined
    }
    object LiveChatModerator {
      
      inline def apply(): LiveChatModerator = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatModerator]
      }
      
      extension [Self <: LiveChatModerator](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: LiveChatModeratorSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait LiveChatModeratorListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[LiveChatModerator]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object LiveChatModeratorListResponse {
      
      inline def apply(): LiveChatModeratorListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatModeratorListResponse]
      }
      
      extension [Self <: LiveChatModeratorListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[LiveChatModerator]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: LiveChatModerator*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait LiveChatModeratorSnippet extends StObject {
      
      var liveChatId: js.UndefOr[String] = js.undefined
      
      var moderatorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
    }
    object LiveChatModeratorSnippet {
      
      inline def apply(): LiveChatModeratorSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatModeratorSnippet]
      }
      
      extension [Self <: LiveChatModeratorSnippet](x: Self) {
        
        inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
        
        inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
        
        inline def setModeratorDetails(value: ChannelProfileDetails): Self = StObject.set(x, "moderatorDetails", value.asInstanceOf[js.Any])
        
        inline def setModeratorDetailsUndefined: Self = StObject.set(x, "moderatorDetails", js.undefined)
      }
    }
    
    trait LiveChatPollClosedDetails extends StObject {
      
      var pollId: js.UndefOr[String] = js.undefined
    }
    object LiveChatPollClosedDetails {
      
      inline def apply(): LiveChatPollClosedDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatPollClosedDetails]
      }
      
      extension [Self <: LiveChatPollClosedDetails](x: Self) {
        
        inline def setPollId(value: String): Self = StObject.set(x, "pollId", value.asInstanceOf[js.Any])
        
        inline def setPollIdUndefined: Self = StObject.set(x, "pollId", js.undefined)
      }
    }
    
    trait LiveChatPollEditedDetails extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[LiveChatPollItem]] = js.undefined
      
      var prompt: js.UndefOr[String] = js.undefined
    }
    object LiveChatPollEditedDetails {
      
      inline def apply(): LiveChatPollEditedDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatPollEditedDetails]
      }
      
      extension [Self <: LiveChatPollEditedDetails](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setItems(value: js.Array[LiveChatPollItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: LiveChatPollItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      }
    }
    
    trait LiveChatPollItem extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var itemId: js.UndefOr[String] = js.undefined
    }
    object LiveChatPollItem {
      
      inline def apply(): LiveChatPollItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatPollItem]
      }
      
      extension [Self <: LiveChatPollItem](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
        
        inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      }
    }
    
    trait LiveChatPollOpenedDetails extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[LiveChatPollItem]] = js.undefined
      
      var prompt: js.UndefOr[String] = js.undefined
    }
    object LiveChatPollOpenedDetails {
      
      inline def apply(): LiveChatPollOpenedDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatPollOpenedDetails]
      }
      
      extension [Self <: LiveChatPollOpenedDetails](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setItems(value: js.Array[LiveChatPollItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: LiveChatPollItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      }
    }
    
    trait LiveChatPollVotedDetails extends StObject {
      
      var itemId: js.UndefOr[String] = js.undefined
      
      var pollId: js.UndefOr[String] = js.undefined
    }
    object LiveChatPollVotedDetails {
      
      inline def apply(): LiveChatPollVotedDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatPollVotedDetails]
      }
      
      extension [Self <: LiveChatPollVotedDetails](x: Self) {
        
        inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
        
        inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
        
        inline def setPollId(value: String): Self = StObject.set(x, "pollId", value.asInstanceOf[js.Any])
        
        inline def setPollIdUndefined: Self = StObject.set(x, "pollId", js.undefined)
      }
    }
    
    trait LiveChatSuperChatDetails extends StObject {
      
      var amountDisplayString: js.UndefOr[String] = js.undefined
      
      var amountMicros: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var tier: js.UndefOr[Double] = js.undefined
      
      var userComment: js.UndefOr[String] = js.undefined
    }
    object LiveChatSuperChatDetails {
      
      inline def apply(): LiveChatSuperChatDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatSuperChatDetails]
      }
      
      extension [Self <: LiveChatSuperChatDetails](x: Self) {
        
        inline def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
        
        inline def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
        
        inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
        
        inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
        
        inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
        
        inline def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
        
        inline def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
      }
    }
    
    trait LiveChatSuperStickerDetails extends StObject {
      
      var amountDisplayString: js.UndefOr[String] = js.undefined
      
      var amountMicros: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.undefined
      
      var tier: js.UndefOr[Double] = js.undefined
    }
    object LiveChatSuperStickerDetails {
      
      inline def apply(): LiveChatSuperStickerDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatSuperStickerDetails]
      }
      
      extension [Self <: LiveChatSuperStickerDetails](x: Self) {
        
        inline def setAmountDisplayString(value: String): Self = StObject.set(x, "amountDisplayString", value.asInstanceOf[js.Any])
        
        inline def setAmountDisplayStringUndefined: Self = StObject.set(x, "amountDisplayString", js.undefined)
        
        inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
        
        inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setSuperStickerMetadata(value: SuperStickerMetadata): Self = StObject.set(x, "superStickerMetadata", value.asInstanceOf[js.Any])
        
        inline def setSuperStickerMetadataUndefined: Self = StObject.set(x, "superStickerMetadata", js.undefined)
        
        inline def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
        
        inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
      }
    }
    
    trait LiveChatTextMessageDetails extends StObject {
      
      var messageText: js.UndefOr[String] = js.undefined
    }
    object LiveChatTextMessageDetails {
      
      inline def apply(): LiveChatTextMessageDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatTextMessageDetails]
      }
      
      extension [Self <: LiveChatTextMessageDetails](x: Self) {
        
        inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
        
        inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
      }
    }
    
    trait LiveChatUserBannedMessageDetails extends StObject {
      
      var banDurationSeconds: js.UndefOr[String] = js.undefined
      
      var banType: js.UndefOr[String] = js.undefined
      
      var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
    }
    object LiveChatUserBannedMessageDetails {
      
      inline def apply(): LiveChatUserBannedMessageDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveChatUserBannedMessageDetails]
      }
      
      extension [Self <: LiveChatUserBannedMessageDetails](x: Self) {
        
        inline def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
        
        inline def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
        
        inline def setBanType(value: String): Self = StObject.set(x, "banType", value.asInstanceOf[js.Any])
        
        inline def setBanTypeUndefined: Self = StObject.set(x, "banType", js.undefined)
        
        inline def setBannedUserDetails(value: ChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
        
        inline def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
      }
    }
    
    trait LiveStream extends StObject {
      
      var cdn: js.UndefOr[CdnSettings] = js.undefined
      
      var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[LiveStreamSnippet] = js.undefined
      
      var status: js.UndefOr[LiveStreamStatus] = js.undefined
    }
    object LiveStream {
      
      inline def apply(): LiveStream = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStream]
      }
      
      extension [Self <: LiveStream](x: Self) {
        
        inline def setCdn(value: CdnSettings): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
        
        inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
        
        inline def setContentDetails(value: LiveStreamContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: LiveStreamSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setStatus(value: LiveStreamStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait LiveStreamConfigurationIssue extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var reason: js.UndefOr[String] = js.undefined
      
      var severity: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object LiveStreamConfigurationIssue {
      
      inline def apply(): LiveStreamConfigurationIssue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStreamConfigurationIssue]
      }
      
      extension [Self <: LiveStreamConfigurationIssue](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
        
        inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait LiveStreamContentDetails extends StObject {
      
      var closedCaptionsIngestionUrl: js.UndefOr[String] = js.undefined
      
      var isReusable: js.UndefOr[Boolean] = js.undefined
    }
    object LiveStreamContentDetails {
      
      inline def apply(): LiveStreamContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStreamContentDetails]
      }
      
      extension [Self <: LiveStreamContentDetails](x: Self) {
        
        inline def setClosedCaptionsIngestionUrl(value: String): Self = StObject.set(x, "closedCaptionsIngestionUrl", value.asInstanceOf[js.Any])
        
        inline def setClosedCaptionsIngestionUrlUndefined: Self = StObject.set(x, "closedCaptionsIngestionUrl", js.undefined)
        
        inline def setIsReusable(value: Boolean): Self = StObject.set(x, "isReusable", value.asInstanceOf[js.Any])
        
        inline def setIsReusableUndefined: Self = StObject.set(x, "isReusable", js.undefined)
      }
    }
    
    trait LiveStreamHealthStatus extends StObject {
      
      var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.undefined
      
      var lastUpdateTimeSeconds: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
    }
    object LiveStreamHealthStatus {
      
      inline def apply(): LiveStreamHealthStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStreamHealthStatus]
      }
      
      extension [Self <: LiveStreamHealthStatus](x: Self) {
        
        inline def setConfigurationIssues(value: js.Array[LiveStreamConfigurationIssue]): Self = StObject.set(x, "configurationIssues", value.asInstanceOf[js.Any])
        
        inline def setConfigurationIssuesUndefined: Self = StObject.set(x, "configurationIssues", js.undefined)
        
        inline def setConfigurationIssuesVarargs(value: LiveStreamConfigurationIssue*): Self = StObject.set(x, "configurationIssues", js.Array(value*))
        
        inline def setLastUpdateTimeSeconds(value: String): Self = StObject.set(x, "lastUpdateTimeSeconds", value.asInstanceOf[js.Any])
        
        inline def setLastUpdateTimeSecondsUndefined: Self = StObject.set(x, "lastUpdateTimeSeconds", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait LiveStreamListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[LiveStream]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object LiveStreamListResponse {
      
      inline def apply(): LiveStreamListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStreamListResponse]
      }
      
      extension [Self <: LiveStreamListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[LiveStream]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: LiveStream*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait LiveStreamSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var isDefaultStream: js.UndefOr[Boolean] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object LiveStreamSnippet {
      
      inline def apply(): LiveStreamSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStreamSnippet]
      }
      
      extension [Self <: LiveStreamSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setIsDefaultStream(value: Boolean): Self = StObject.set(x, "isDefaultStream", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultStreamUndefined: Self = StObject.set(x, "isDefaultStream", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait LiveStreamStatus extends StObject {
      
      var healthStatus: js.UndefOr[LiveStreamHealthStatus] = js.undefined
      
      var streamStatus: js.UndefOr[String] = js.undefined
    }
    object LiveStreamStatus {
      
      inline def apply(): LiveStreamStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LiveStreamStatus]
      }
      
      extension [Self <: LiveStreamStatus](x: Self) {
        
        inline def setHealthStatus(value: LiveStreamHealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
        
        inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
        
        inline def setStreamStatus(value: String): Self = StObject.set(x, "streamStatus", value.asInstanceOf[js.Any])
        
        inline def setStreamStatusUndefined: Self = StObject.set(x, "streamStatus", js.undefined)
      }
    }
    
    trait LocalizedProperty extends StObject {
      
      var default: js.UndefOr[String] = js.undefined
      
      var defaultLanguage: js.UndefOr[LanguageTag] = js.undefined
      
      var localized: js.UndefOr[js.Array[LocalizedString]] = js.undefined
    }
    object LocalizedProperty {
      
      inline def apply(): LocalizedProperty = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocalizedProperty]
      }
      
      extension [Self <: LocalizedProperty](x: Self) {
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguage(value: LanguageTag): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setLocalized(value: js.Array[LocalizedString]): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
        
        inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
        
        inline def setLocalizedVarargs(value: LocalizedString*): Self = StObject.set(x, "localized", js.Array(value*))
      }
    }
    
    trait LocalizedString extends StObject {
      
      var language: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object LocalizedString {
      
      inline def apply(): LocalizedString = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocalizedString]
      }
      
      extension [Self <: LocalizedString](x: Self) {
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait MonitorStreamInfo extends StObject {
      
      var broadcastStreamDelayMs: js.UndefOr[Double] = js.undefined
      
      var embedHtml: js.UndefOr[String] = js.undefined
      
      var enableMonitorStream: js.UndefOr[Boolean] = js.undefined
    }
    object MonitorStreamInfo {
      
      inline def apply(): MonitorStreamInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MonitorStreamInfo]
      }
      
      extension [Self <: MonitorStreamInfo](x: Self) {
        
        inline def setBroadcastStreamDelayMs(value: Double): Self = StObject.set(x, "broadcastStreamDelayMs", value.asInstanceOf[js.Any])
        
        inline def setBroadcastStreamDelayMsUndefined: Self = StObject.set(x, "broadcastStreamDelayMs", js.undefined)
        
        inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
        
        inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
        
        inline def setEnableMonitorStream(value: Boolean): Self = StObject.set(x, "enableMonitorStream", value.asInstanceOf[js.Any])
        
        inline def setEnableMonitorStreamUndefined: Self = StObject.set(x, "enableMonitorStream", js.undefined)
      }
    }
    
    trait Nonprofit extends StObject {
      
      var nonprofitId: js.UndefOr[NonprofitId] = js.undefined
      
      var nonprofitLegalName: js.UndefOr[String] = js.undefined
    }
    object Nonprofit {
      
      inline def apply(): Nonprofit = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Nonprofit]
      }
      
      extension [Self <: Nonprofit](x: Self) {
        
        inline def setNonprofitId(value: NonprofitId): Self = StObject.set(x, "nonprofitId", value.asInstanceOf[js.Any])
        
        inline def setNonprofitIdUndefined: Self = StObject.set(x, "nonprofitId", js.undefined)
        
        inline def setNonprofitLegalName(value: String): Self = StObject.set(x, "nonprofitLegalName", value.asInstanceOf[js.Any])
        
        inline def setNonprofitLegalNameUndefined: Self = StObject.set(x, "nonprofitLegalName", js.undefined)
      }
    }
    
    trait NonprofitId extends StObject {
      
      var value: js.UndefOr[String] = js.undefined
    }
    object NonprofitId {
      
      inline def apply(): NonprofitId = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonprofitId]
      }
      
      extension [Self <: NonprofitId](x: Self) {
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait PageInfo extends StObject {
      
      var resultsPerPage: js.UndefOr[Double] = js.undefined
      
      var totalResults: js.UndefOr[Double] = js.undefined
    }
    object PageInfo {
      
      inline def apply(): PageInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageInfo]
      }
      
      extension [Self <: PageInfo](x: Self) {
        
        inline def setResultsPerPage(value: Double): Self = StObject.set(x, "resultsPerPage", value.asInstanceOf[js.Any])
        
        inline def setResultsPerPageUndefined: Self = StObject.set(x, "resultsPerPage", js.undefined)
        
        inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
        
        inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
      }
    }
    
    trait Playlist extends StObject {
      
      var contentDetails: js.UndefOr[PlaylistContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var localizations: js.UndefOr[js.Object] = js.undefined
      
      var player: js.UndefOr[PlaylistPlayer] = js.undefined
      
      var snippet: js.UndefOr[PlaylistSnippet] = js.undefined
      
      var status: js.UndefOr[PlaylistStatus] = js.undefined
    }
    object Playlist {
      
      inline def apply(): Playlist = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Playlist]
      }
      
      extension [Self <: Playlist](x: Self) {
        
        inline def setContentDetails(value: PlaylistContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocalizations(value: js.Object): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
        
        inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
        
        inline def setPlayer(value: PlaylistPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
        
        inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
        
        inline def setSnippet(value: PlaylistSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setStatus(value: PlaylistStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait PlaylistContentDetails extends StObject {
      
      var itemCount: js.UndefOr[Double] = js.undefined
    }
    object PlaylistContentDetails {
      
      inline def apply(): PlaylistContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistContentDetails]
      }
      
      extension [Self <: PlaylistContentDetails](x: Self) {
        
        inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
        
        inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      }
    }
    
    trait PlaylistItem extends StObject {
      
      var contentDetails: js.UndefOr[PlaylistItemContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[PlaylistItemSnippet] = js.undefined
      
      var status: js.UndefOr[PlaylistItemStatus] = js.undefined
    }
    object PlaylistItem {
      
      inline def apply(): PlaylistItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistItem]
      }
      
      extension [Self <: PlaylistItem](x: Self) {
        
        inline def setContentDetails(value: PlaylistItemContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: PlaylistItemSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setStatus(value: PlaylistItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait PlaylistItemContentDetails extends StObject {
      
      var endAt: js.UndefOr[String] = js.undefined
      
      var note: js.UndefOr[String] = js.undefined
      
      var startAt: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
      
      var videoPublishedAt: js.UndefOr[String] = js.undefined
    }
    object PlaylistItemContentDetails {
      
      inline def apply(): PlaylistItemContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistItemContentDetails]
      }
      
      extension [Self <: PlaylistItemContentDetails](x: Self) {
        
        inline def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
        
        inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
        
        inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
        
        inline def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
        
        inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
        
        inline def setVideoPublishedAt(value: String): Self = StObject.set(x, "videoPublishedAt", value.asInstanceOf[js.Any])
        
        inline def setVideoPublishedAtUndefined: Self = StObject.set(x, "videoPublishedAt", js.undefined)
      }
    }
    
    trait PlaylistItemListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[PlaylistItem]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object PlaylistItemListResponse {
      
      inline def apply(): PlaylistItemListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistItemListResponse]
      }
      
      extension [Self <: PlaylistItemListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[PlaylistItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: PlaylistItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait PlaylistItemSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelTitle: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var playlistId: js.UndefOr[String] = js.undefined
      
      var position: js.UndefOr[Double] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object PlaylistItemSnippet {
      
      inline def apply(): PlaylistItemSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistItemSnippet]
      }
      
      extension [Self <: PlaylistItemSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
        
        inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
        
        inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
        
        inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait PlaylistItemStatus extends StObject {
      
      var privacyStatus: js.UndefOr[String] = js.undefined
    }
    object PlaylistItemStatus {
      
      inline def apply(): PlaylistItemStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistItemStatus]
      }
      
      extension [Self <: PlaylistItemStatus](x: Self) {
        
        inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
        
        inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
      }
    }
    
    trait PlaylistListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Playlist]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object PlaylistListResponse {
      
      inline def apply(): PlaylistListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistListResponse]
      }
      
      extension [Self <: PlaylistListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Playlist]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Playlist*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait PlaylistLocalization extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object PlaylistLocalization {
      
      inline def apply(): PlaylistLocalization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistLocalization]
      }
      
      extension [Self <: PlaylistLocalization](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait PlaylistPlayer extends StObject {
      
      var embedHtml: js.UndefOr[String] = js.undefined
    }
    object PlaylistPlayer {
      
      inline def apply(): PlaylistPlayer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistPlayer]
      }
      
      extension [Self <: PlaylistPlayer](x: Self) {
        
        inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
        
        inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
      }
    }
    
    trait PlaylistSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelTitle: js.UndefOr[String] = js.undefined
      
      var defaultLanguage: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var localized: js.UndefOr[PlaylistLocalization] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var tags: js.UndefOr[js.Array[String]] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object PlaylistSnippet {
      
      inline def apply(): PlaylistSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistSnippet]
      }
      
      extension [Self <: PlaylistSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
        
        inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
        
        inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setLocalized(value: PlaylistLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
        
        inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait PlaylistStatus extends StObject {
      
      var privacyStatus: js.UndefOr[String] = js.undefined
    }
    object PlaylistStatus {
      
      inline def apply(): PlaylistStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlaylistStatus]
      }
      
      extension [Self <: PlaylistStatus](x: Self) {
        
        inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
        
        inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
      }
    }
    
    trait PromotedItem extends StObject {
      
      var customMessage: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[PromotedItemId] = js.undefined
      
      var promotedByContentOwner: js.UndefOr[Boolean] = js.undefined
      
      var timing: js.UndefOr[InvideoTiming] = js.undefined
    }
    object PromotedItem {
      
      inline def apply(): PromotedItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PromotedItem]
      }
      
      extension [Self <: PromotedItem](x: Self) {
        
        inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
        
        inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
        
        inline def setId(value: PromotedItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setPromotedByContentOwner(value: Boolean): Self = StObject.set(x, "promotedByContentOwner", value.asInstanceOf[js.Any])
        
        inline def setPromotedByContentOwnerUndefined: Self = StObject.set(x, "promotedByContentOwner", js.undefined)
        
        inline def setTiming(value: InvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
        
        inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      }
    }
    
    trait PromotedItemId extends StObject {
      
      var recentlyUploadedBy: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
      
      var websiteUrl: js.UndefOr[String] = js.undefined
    }
    object PromotedItemId {
      
      inline def apply(): PromotedItemId = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PromotedItemId]
      }
      
      extension [Self <: PromotedItemId](x: Self) {
        
        inline def setRecentlyUploadedBy(value: String): Self = StObject.set(x, "recentlyUploadedBy", value.asInstanceOf[js.Any])
        
        inline def setRecentlyUploadedByUndefined: Self = StObject.set(x, "recentlyUploadedBy", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
        
        inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
        
        inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
      }
    }
    
    trait PropertyValue extends StObject {
      
      var property: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object PropertyValue {
      
      inline def apply(): PropertyValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PropertyValue]
      }
      
      extension [Self <: PropertyValue](x: Self) {
        
        inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ResourceId extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var playlistId: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object ResourceId {
      
      inline def apply(): ResourceId = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResourceId]
      }
      
      extension [Self <: ResourceId](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
        
        inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait SearchListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[SearchResult]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var regionCode: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object SearchListResponse {
      
      inline def apply(): SearchListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchListResponse]
      }
      
      extension [Self <: SearchListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[SearchResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SearchResult*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
        
        inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait SearchResult extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[ResourceId] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[SearchResultSnippet] = js.undefined
    }
    object SearchResult {
      
      inline def apply(): SearchResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchResult]
      }
      
      extension [Self <: SearchResult](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: SearchResultSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait SearchResultSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelTitle: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var liveBroadcastContent: js.UndefOr[String] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object SearchResultSnippet {
      
      inline def apply(): SearchResultSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchResultSnippet]
      }
      
      extension [Self <: SearchResultSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
        
        inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
        
        inline def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait Sponsor extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[SponsorSnippet] = js.undefined
    }
    object Sponsor {
      
      inline def apply(): Sponsor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Sponsor]
      }
      
      extension [Self <: Sponsor](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: SponsorSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait SponsorListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Sponsor]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object SponsorListResponse {
      
      inline def apply(): SponsorListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SponsorListResponse]
      }
      
      extension [Self <: SponsorListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Sponsor]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Sponsor*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait SponsorSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var cumulativeDurationMonths: js.UndefOr[Double] = js.undefined
      
      var sponsorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
      
      var sponsorSince: js.UndefOr[String] = js.undefined
    }
    object SponsorSnippet {
      
      inline def apply(): SponsorSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SponsorSnippet]
      }
      
      extension [Self <: SponsorSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setCumulativeDurationMonths(value: Double): Self = StObject.set(x, "cumulativeDurationMonths", value.asInstanceOf[js.Any])
        
        inline def setCumulativeDurationMonthsUndefined: Self = StObject.set(x, "cumulativeDurationMonths", js.undefined)
        
        inline def setSponsorDetails(value: ChannelProfileDetails): Self = StObject.set(x, "sponsorDetails", value.asInstanceOf[js.Any])
        
        inline def setSponsorDetailsUndefined: Self = StObject.set(x, "sponsorDetails", js.undefined)
        
        inline def setSponsorSince(value: String): Self = StObject.set(x, "sponsorSince", value.asInstanceOf[js.Any])
        
        inline def setSponsorSinceUndefined: Self = StObject.set(x, "sponsorSince", js.undefined)
      }
    }
    
    trait Subscription extends StObject {
      
      var contentDetails: js.UndefOr[SubscriptionContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[SubscriptionSnippet] = js.undefined
      
      var subscriberSnippet: js.UndefOr[SubscriptionSubscriberSnippet] = js.undefined
    }
    object Subscription {
      
      inline def apply(): Subscription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscription]
      }
      
      extension [Self <: Subscription](x: Self) {
        
        inline def setContentDetails(value: SubscriptionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: SubscriptionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setSubscriberSnippet(value: SubscriptionSubscriberSnippet): Self = StObject.set(x, "subscriberSnippet", value.asInstanceOf[js.Any])
        
        inline def setSubscriberSnippetUndefined: Self = StObject.set(x, "subscriberSnippet", js.undefined)
      }
    }
    
    trait SubscriptionContentDetails extends StObject {
      
      var activityType: js.UndefOr[String] = js.undefined
      
      var newItemCount: js.UndefOr[Double] = js.undefined
      
      var totalItemCount: js.UndefOr[Double] = js.undefined
    }
    object SubscriptionContentDetails {
      
      inline def apply(): SubscriptionContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionContentDetails]
      }
      
      extension [Self <: SubscriptionContentDetails](x: Self) {
        
        inline def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
        
        inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
        
        inline def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
        
        inline def setNewItemCountUndefined: Self = StObject.set(x, "newItemCount", js.undefined)
        
        inline def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
        
        inline def setTotalItemCountUndefined: Self = StObject.set(x, "totalItemCount", js.undefined)
      }
    }
    
    trait SubscriptionListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Subscription]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object SubscriptionListResponse {
      
      inline def apply(): SubscriptionListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionListResponse]
      }
      
      extension [Self <: SubscriptionListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Subscription]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Subscription*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait SubscriptionSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelTitle: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var resourceId: js.UndefOr[ResourceId] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object SubscriptionSnippet {
      
      inline def apply(): SubscriptionSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionSnippet]
      }
      
      extension [Self <: SubscriptionSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
        
        inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SubscriptionSubscriberSnippet extends StObject {
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object SubscriptionSubscriberSnippet {
      
      inline def apply(): SubscriptionSubscriberSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionSubscriberSnippet]
      }
      
      extension [Self <: SubscriptionSubscriberSnippet](x: Self) {
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SuperChatEvent extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[SuperChatEventSnippet] = js.undefined
    }
    object SuperChatEvent {
      
      inline def apply(): SuperChatEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuperChatEvent]
      }
      
      extension [Self <: SuperChatEvent](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: SuperChatEventSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait SuperChatEventListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[SuperChatEvent]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object SuperChatEventListResponse {
      
      inline def apply(): SuperChatEventListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuperChatEventListResponse]
      }
      
      extension [Self <: SuperChatEventListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[SuperChatEvent]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SuperChatEvent*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait SuperChatEventSnippet extends StObject {
      
      var amountMicros: js.UndefOr[String] = js.undefined
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var commentText: js.UndefOr[String] = js.undefined
      
      var createdAt: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var displayString: js.UndefOr[String] = js.undefined
      
      var isSuperChatForGood: js.UndefOr[Boolean] = js.undefined
      
      var isSuperStickerEvent: js.UndefOr[Boolean] = js.undefined
      
      var messageType: js.UndefOr[Double] = js.undefined
      
      var nonprofit: js.UndefOr[Nonprofit] = js.undefined
      
      var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.undefined
      
      var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
    }
    object SuperChatEventSnippet {
      
      inline def apply(): SuperChatEventSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuperChatEventSnippet]
      }
      
      extension [Self <: SuperChatEventSnippet](x: Self) {
        
        inline def setAmountMicros(value: String): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
        
        inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setCommentText(value: String): Self = StObject.set(x, "commentText", value.asInstanceOf[js.Any])
        
        inline def setCommentTextUndefined: Self = StObject.set(x, "commentText", js.undefined)
        
        inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
        
        inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setDisplayString(value: String): Self = StObject.set(x, "displayString", value.asInstanceOf[js.Any])
        
        inline def setDisplayStringUndefined: Self = StObject.set(x, "displayString", js.undefined)
        
        inline def setIsSuperChatForGood(value: Boolean): Self = StObject.set(x, "isSuperChatForGood", value.asInstanceOf[js.Any])
        
        inline def setIsSuperChatForGoodUndefined: Self = StObject.set(x, "isSuperChatForGood", js.undefined)
        
        inline def setIsSuperStickerEvent(value: Boolean): Self = StObject.set(x, "isSuperStickerEvent", value.asInstanceOf[js.Any])
        
        inline def setIsSuperStickerEventUndefined: Self = StObject.set(x, "isSuperStickerEvent", js.undefined)
        
        inline def setMessageType(value: Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
        
        inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
        
        inline def setNonprofit(value: Nonprofit): Self = StObject.set(x, "nonprofit", value.asInstanceOf[js.Any])
        
        inline def setNonprofitUndefined: Self = StObject.set(x, "nonprofit", js.undefined)
        
        inline def setSuperStickerMetadata(value: SuperStickerMetadata): Self = StObject.set(x, "superStickerMetadata", value.asInstanceOf[js.Any])
        
        inline def setSuperStickerMetadataUndefined: Self = StObject.set(x, "superStickerMetadata", js.undefined)
        
        inline def setSupporterDetails(value: ChannelProfileDetails): Self = StObject.set(x, "supporterDetails", value.asInstanceOf[js.Any])
        
        inline def setSupporterDetailsUndefined: Self = StObject.set(x, "supporterDetails", js.undefined)
      }
    }
    
    trait SuperStickerMetadata extends StObject {
      
      var altText: js.UndefOr[String] = js.undefined
      
      var altTextLanguage: js.UndefOr[String] = js.undefined
      
      var stickerId: js.UndefOr[String] = js.undefined
    }
    object SuperStickerMetadata {
      
      inline def apply(): SuperStickerMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuperStickerMetadata]
      }
      
      extension [Self <: SuperStickerMetadata](x: Self) {
        
        inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
        
        inline def setAltTextLanguage(value: String): Self = StObject.set(x, "altTextLanguage", value.asInstanceOf[js.Any])
        
        inline def setAltTextLanguageUndefined: Self = StObject.set(x, "altTextLanguage", js.undefined)
        
        inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
        
        inline def setStickerId(value: String): Self = StObject.set(x, "stickerId", value.asInstanceOf[js.Any])
        
        inline def setStickerIdUndefined: Self = StObject.set(x, "stickerId", js.undefined)
      }
    }
    
    trait Thumbnail extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object Thumbnail {
      
      inline def apply(): Thumbnail = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Thumbnail]
      }
      
      extension [Self <: Thumbnail](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait ThumbnailDetails extends StObject {
      
      var default: js.UndefOr[Thumbnail] = js.undefined
      
      var high: js.UndefOr[Thumbnail] = js.undefined
      
      var maxres: js.UndefOr[Thumbnail] = js.undefined
      
      var medium: js.UndefOr[Thumbnail] = js.undefined
      
      var standard: js.UndefOr[Thumbnail] = js.undefined
    }
    object ThumbnailDetails {
      
      inline def apply(): ThumbnailDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ThumbnailDetails]
      }
      
      extension [Self <: ThumbnailDetails](x: Self) {
        
        inline def setDefault(value: Thumbnail): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setHigh(value: Thumbnail): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
        
        inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
        
        inline def setMaxres(value: Thumbnail): Self = StObject.set(x, "maxres", value.asInstanceOf[js.Any])
        
        inline def setMaxresUndefined: Self = StObject.set(x, "maxres", js.undefined)
        
        inline def setMedium(value: Thumbnail): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
        
        inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
        
        inline def setStandard(value: Thumbnail): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
        
        inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      }
    }
    
    trait ThumbnailSetResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[ThumbnailDetails]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object ThumbnailSetResponse {
      
      inline def apply(): ThumbnailSetResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ThumbnailSetResponse]
      }
      
      extension [Self <: ThumbnailSetResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[ThumbnailDetails]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: ThumbnailDetails*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait Video extends StObject {
      
      var ageGating: js.UndefOr[VideoAgeGating] = js.undefined
      
      var contentDetails: js.UndefOr[VideoContentDetails] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var fileDetails: js.UndefOr[VideoFileDetails] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.undefined
      
      var localizations: js.UndefOr[js.Object] = js.undefined
      
      var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.undefined
      
      var player: js.UndefOr[VideoPlayer] = js.undefined
      
      var processingDetails: js.UndefOr[VideoProcessingDetails] = js.undefined
      
      var projectDetails: js.UndefOr[VideoProjectDetails] = js.undefined
      
      var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.undefined
      
      var snippet: js.UndefOr[VideoSnippet] = js.undefined
      
      var statistics: js.UndefOr[VideoStatistics] = js.undefined
      
      var status: js.UndefOr[VideoStatus] = js.undefined
      
      var suggestions: js.UndefOr[VideoSuggestions] = js.undefined
      
      var topicDetails: js.UndefOr[VideoTopicDetails] = js.undefined
    }
    object Video {
      
      inline def apply(): Video = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Video]
      }
      
      extension [Self <: Video](x: Self) {
        
        inline def setAgeGating(value: VideoAgeGating): Self = StObject.set(x, "ageGating", value.asInstanceOf[js.Any])
        
        inline def setAgeGatingUndefined: Self = StObject.set(x, "ageGating", js.undefined)
        
        inline def setContentDetails(value: VideoContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setFileDetails(value: VideoFileDetails): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
        
        inline def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLiveStreamingDetails(value: VideoLiveStreamingDetails): Self = StObject.set(x, "liveStreamingDetails", value.asInstanceOf[js.Any])
        
        inline def setLiveStreamingDetailsUndefined: Self = StObject.set(x, "liveStreamingDetails", js.undefined)
        
        inline def setLocalizations(value: js.Object): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
        
        inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
        
        inline def setMonetizationDetails(value: VideoMonetizationDetails): Self = StObject.set(x, "monetizationDetails", value.asInstanceOf[js.Any])
        
        inline def setMonetizationDetailsUndefined: Self = StObject.set(x, "monetizationDetails", js.undefined)
        
        inline def setPlayer(value: VideoPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
        
        inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
        
        inline def setProcessingDetails(value: VideoProcessingDetails): Self = StObject.set(x, "processingDetails", value.asInstanceOf[js.Any])
        
        inline def setProcessingDetailsUndefined: Self = StObject.set(x, "processingDetails", js.undefined)
        
        inline def setProjectDetails(value: VideoProjectDetails): Self = StObject.set(x, "projectDetails", value.asInstanceOf[js.Any])
        
        inline def setProjectDetailsUndefined: Self = StObject.set(x, "projectDetails", js.undefined)
        
        inline def setRecordingDetails(value: VideoRecordingDetails): Self = StObject.set(x, "recordingDetails", value.asInstanceOf[js.Any])
        
        inline def setRecordingDetailsUndefined: Self = StObject.set(x, "recordingDetails", js.undefined)
        
        inline def setSnippet(value: VideoSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setStatistics(value: VideoStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
        
        inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
        
        inline def setStatus(value: VideoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setSuggestions(value: VideoSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
        
        inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
        
        inline def setTopicDetails(value: VideoTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
        
        inline def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
      }
    }
    
    trait VideoAbuseReport extends StObject {
      
      var comments: js.UndefOr[String] = js.undefined
      
      var language: js.UndefOr[String] = js.undefined
      
      var reasonId: js.UndefOr[String] = js.undefined
      
      var secondaryReasonId: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object VideoAbuseReport {
      
      inline def apply(): VideoAbuseReport = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoAbuseReport]
      }
      
      extension [Self <: VideoAbuseReport](x: Self) {
        
        inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
        
        inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        inline def setReasonId(value: String): Self = StObject.set(x, "reasonId", value.asInstanceOf[js.Any])
        
        inline def setReasonIdUndefined: Self = StObject.set(x, "reasonId", js.undefined)
        
        inline def setSecondaryReasonId(value: String): Self = StObject.set(x, "secondaryReasonId", value.asInstanceOf[js.Any])
        
        inline def setSecondaryReasonIdUndefined: Self = StObject.set(x, "secondaryReasonId", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait VideoAbuseReportReason extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[VideoAbuseReportReasonSnippet] = js.undefined
    }
    object VideoAbuseReportReason {
      
      inline def apply(): VideoAbuseReportReason = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoAbuseReportReason]
      }
      
      extension [Self <: VideoAbuseReportReason](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: VideoAbuseReportReasonSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait VideoAbuseReportReasonListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[VideoAbuseReportReason]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object VideoAbuseReportReasonListResponse {
      
      inline def apply(): VideoAbuseReportReasonListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoAbuseReportReasonListResponse]
      }
      
      extension [Self <: VideoAbuseReportReasonListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[VideoAbuseReportReason]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: VideoAbuseReportReason*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait VideoAbuseReportReasonSnippet extends StObject {
      
      var label: js.UndefOr[String] = js.undefined
      
      var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.undefined
    }
    object VideoAbuseReportReasonSnippet {
      
      inline def apply(): VideoAbuseReportReasonSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
      }
      
      extension [Self <: VideoAbuseReportReasonSnippet](x: Self) {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setSecondaryReasons(value: js.Array[VideoAbuseReportSecondaryReason]): Self = StObject.set(x, "secondaryReasons", value.asInstanceOf[js.Any])
        
        inline def setSecondaryReasonsUndefined: Self = StObject.set(x, "secondaryReasons", js.undefined)
        
        inline def setSecondaryReasonsVarargs(value: VideoAbuseReportSecondaryReason*): Self = StObject.set(x, "secondaryReasons", js.Array(value*))
      }
    }
    
    trait VideoAbuseReportSecondaryReason extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
    }
    object VideoAbuseReportSecondaryReason {
      
      inline def apply(): VideoAbuseReportSecondaryReason = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoAbuseReportSecondaryReason]
      }
      
      extension [Self <: VideoAbuseReportSecondaryReason](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      }
    }
    
    trait VideoAgeGating extends StObject {
      
      var alcoholContent: js.UndefOr[Boolean] = js.undefined
      
      var restricted: js.UndefOr[Boolean] = js.undefined
      
      var videoGameRating: js.UndefOr[String] = js.undefined
    }
    object VideoAgeGating {
      
      inline def apply(): VideoAgeGating = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoAgeGating]
      }
      
      extension [Self <: VideoAgeGating](x: Self) {
        
        inline def setAlcoholContent(value: Boolean): Self = StObject.set(x, "alcoholContent", value.asInstanceOf[js.Any])
        
        inline def setAlcoholContentUndefined: Self = StObject.set(x, "alcoholContent", js.undefined)
        
        inline def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
        
        inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
        
        inline def setVideoGameRating(value: String): Self = StObject.set(x, "videoGameRating", value.asInstanceOf[js.Any])
        
        inline def setVideoGameRatingUndefined: Self = StObject.set(x, "videoGameRating", js.undefined)
      }
    }
    
    trait VideoCategory extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[VideoCategorySnippet] = js.undefined
    }
    object VideoCategory {
      
      inline def apply(): VideoCategory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoCategory]
      }
      
      extension [Self <: VideoCategory](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: VideoCategorySnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait VideoCategoryListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[VideoCategory]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object VideoCategoryListResponse {
      
      inline def apply(): VideoCategoryListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoCategoryListResponse]
      }
      
      extension [Self <: VideoCategoryListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[VideoCategory]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: VideoCategory*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait VideoCategorySnippet extends StObject {
      
      var assignable: js.UndefOr[Boolean] = js.undefined
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object VideoCategorySnippet {
      
      inline def apply(): VideoCategorySnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoCategorySnippet]
      }
      
      extension [Self <: VideoCategorySnippet](x: Self) {
        
        inline def setAssignable(value: Boolean): Self = StObject.set(x, "assignable", value.asInstanceOf[js.Any])
        
        inline def setAssignableUndefined: Self = StObject.set(x, "assignable", js.undefined)
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait VideoContentDetails extends StObject {
      
      var caption: js.UndefOr[String] = js.undefined
      
      var contentRating: js.UndefOr[ContentRating] = js.undefined
      
      var countryRestriction: js.UndefOr[AccessPolicy] = js.undefined
      
      var definition: js.UndefOr[String] = js.undefined
      
      var dimension: js.UndefOr[String] = js.undefined
      
      var duration: js.UndefOr[String] = js.undefined
      
      var hasCustomThumbnail: js.UndefOr[Boolean] = js.undefined
      
      var licensedContent: js.UndefOr[Boolean] = js.undefined
      
      var projection: js.UndefOr[String] = js.undefined
      
      var regionRestriction: js.UndefOr[VideoContentDetailsRegionRestriction] = js.undefined
    }
    object VideoContentDetails {
      
      inline def apply(): VideoContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoContentDetails]
      }
      
      extension [Self <: VideoContentDetails](x: Self) {
        
        inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
        
        inline def setContentRating(value: ContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
        
        inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
        
        inline def setCountryRestriction(value: AccessPolicy): Self = StObject.set(x, "countryRestriction", value.asInstanceOf[js.Any])
        
        inline def setCountryRestrictionUndefined: Self = StObject.set(x, "countryRestriction", js.undefined)
        
        inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
        
        inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
        
        inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
        
        inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
        
        inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
        
        inline def setHasCustomThumbnail(value: Boolean): Self = StObject.set(x, "hasCustomThumbnail", value.asInstanceOf[js.Any])
        
        inline def setHasCustomThumbnailUndefined: Self = StObject.set(x, "hasCustomThumbnail", js.undefined)
        
        inline def setLicensedContent(value: Boolean): Self = StObject.set(x, "licensedContent", value.asInstanceOf[js.Any])
        
        inline def setLicensedContentUndefined: Self = StObject.set(x, "licensedContent", js.undefined)
        
        inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        inline def setRegionRestriction(value: VideoContentDetailsRegionRestriction): Self = StObject.set(x, "regionRestriction", value.asInstanceOf[js.Any])
        
        inline def setRegionRestrictionUndefined: Self = StObject.set(x, "regionRestriction", js.undefined)
      }
    }
    
    trait VideoContentDetailsRegionRestriction extends StObject {
      
      var allowed: js.UndefOr[js.Array[String]] = js.undefined
      
      var blocked: js.UndefOr[js.Array[String]] = js.undefined
    }
    object VideoContentDetailsRegionRestriction {
      
      inline def apply(): VideoContentDetailsRegionRestriction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoContentDetailsRegionRestriction]
      }
      
      extension [Self <: VideoContentDetailsRegionRestriction](x: Self) {
        
        inline def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
        
        inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
        
        inline def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value*))
        
        inline def setBlocked(value: js.Array[String]): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
        
        inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
        
        inline def setBlockedVarargs(value: String*): Self = StObject.set(x, "blocked", js.Array(value*))
      }
    }
    
    trait VideoFileDetails extends StObject {
      
      var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.undefined
      
      var bitrateBps: js.UndefOr[String] = js.undefined
      
      var container: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var durationMs: js.UndefOr[String] = js.undefined
      
      var fileName: js.UndefOr[String] = js.undefined
      
      var fileSize: js.UndefOr[String] = js.undefined
      
      var fileType: js.UndefOr[String] = js.undefined
      
      var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.undefined
    }
    object VideoFileDetails {
      
      inline def apply(): VideoFileDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoFileDetails]
      }
      
      extension [Self <: VideoFileDetails](x: Self) {
        
        inline def setAudioStreams(value: js.Array[VideoFileDetailsAudioStream]): Self = StObject.set(x, "audioStreams", value.asInstanceOf[js.Any])
        
        inline def setAudioStreamsUndefined: Self = StObject.set(x, "audioStreams", js.undefined)
        
        inline def setAudioStreamsVarargs(value: VideoFileDetailsAudioStream*): Self = StObject.set(x, "audioStreams", js.Array(value*))
        
        inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
        
        inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
        
        inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
        
        inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
        
        inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
        
        inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
        
        inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
        
        inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
        
        inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
        
        inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
        
        inline def setVideoStreams(value: js.Array[VideoFileDetailsVideoStream]): Self = StObject.set(x, "videoStreams", value.asInstanceOf[js.Any])
        
        inline def setVideoStreamsUndefined: Self = StObject.set(x, "videoStreams", js.undefined)
        
        inline def setVideoStreamsVarargs(value: VideoFileDetailsVideoStream*): Self = StObject.set(x, "videoStreams", js.Array(value*))
      }
    }
    
    trait VideoFileDetailsAudioStream extends StObject {
      
      var bitrateBps: js.UndefOr[String] = js.undefined
      
      var channelCount: js.UndefOr[Double] = js.undefined
      
      var codec: js.UndefOr[String] = js.undefined
      
      var vendor: js.UndefOr[String] = js.undefined
    }
    object VideoFileDetailsAudioStream {
      
      inline def apply(): VideoFileDetailsAudioStream = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoFileDetailsAudioStream]
      }
      
      extension [Self <: VideoFileDetailsAudioStream](x: Self) {
        
        inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
        
        inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
        
        inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
        
        inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
        
        inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
        
        inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
        
        inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
        
        inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
      }
    }
    
    trait VideoFileDetailsVideoStream extends StObject {
      
      var aspectRatio: js.UndefOr[Double] = js.undefined
      
      var bitrateBps: js.UndefOr[String] = js.undefined
      
      var codec: js.UndefOr[String] = js.undefined
      
      var frameRateFps: js.UndefOr[Double] = js.undefined
      
      var heightPixels: js.UndefOr[Double] = js.undefined
      
      var rotation: js.UndefOr[String] = js.undefined
      
      var vendor: js.UndefOr[String] = js.undefined
      
      var widthPixels: js.UndefOr[Double] = js.undefined
    }
    object VideoFileDetailsVideoStream {
      
      inline def apply(): VideoFileDetailsVideoStream = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoFileDetailsVideoStream]
      }
      
      extension [Self <: VideoFileDetailsVideoStream](x: Self) {
        
        inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
        
        inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
        
        inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
        
        inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
        
        inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
        
        inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
        
        inline def setFrameRateFps(value: Double): Self = StObject.set(x, "frameRateFps", value.asInstanceOf[js.Any])
        
        inline def setFrameRateFpsUndefined: Self = StObject.set(x, "frameRateFps", js.undefined)
        
        inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
        
        inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
        
        inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
        
        inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
        
        inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
        
        inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
        
        inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
        
        inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
      }
    }
    
    trait VideoGetRatingResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[VideoRating]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object VideoGetRatingResponse {
      
      inline def apply(): VideoGetRatingResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoGetRatingResponse]
      }
      
      extension [Self <: VideoGetRatingResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[VideoRating]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: VideoRating*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait VideoListResponse extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var eventId: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Video]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var pageInfo: js.UndefOr[PageInfo] = js.undefined
      
      var prevPageToken: js.UndefOr[String] = js.undefined
      
      var tokenPagination: js.UndefOr[Any] = js.undefined
      
      // Schema.TokenPagination
      var visitorId: js.UndefOr[String] = js.undefined
    }
    object VideoListResponse {
      
      inline def apply(): VideoListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoListResponse]
      }
      
      extension [Self <: VideoListResponse](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
        
        inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
        
        inline def setItems(value: js.Array[Video]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Video*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
        
        inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
        
        inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
        
        inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
      }
    }
    
    trait VideoLiveStreamingDetails extends StObject {
      
      var activeLiveChatId: js.UndefOr[String] = js.undefined
      
      var actualEndTime: js.UndefOr[String] = js.undefined
      
      var actualStartTime: js.UndefOr[String] = js.undefined
      
      var concurrentViewers: js.UndefOr[String] = js.undefined
      
      var scheduledEndTime: js.UndefOr[String] = js.undefined
      
      var scheduledStartTime: js.UndefOr[String] = js.undefined
    }
    object VideoLiveStreamingDetails {
      
      inline def apply(): VideoLiveStreamingDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoLiveStreamingDetails]
      }
      
      extension [Self <: VideoLiveStreamingDetails](x: Self) {
        
        inline def setActiveLiveChatId(value: String): Self = StObject.set(x, "activeLiveChatId", value.asInstanceOf[js.Any])
        
        inline def setActiveLiveChatIdUndefined: Self = StObject.set(x, "activeLiveChatId", js.undefined)
        
        inline def setActualEndTime(value: String): Self = StObject.set(x, "actualEndTime", value.asInstanceOf[js.Any])
        
        inline def setActualEndTimeUndefined: Self = StObject.set(x, "actualEndTime", js.undefined)
        
        inline def setActualStartTime(value: String): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
        
        inline def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
        
        inline def setConcurrentViewers(value: String): Self = StObject.set(x, "concurrentViewers", value.asInstanceOf[js.Any])
        
        inline def setConcurrentViewersUndefined: Self = StObject.set(x, "concurrentViewers", js.undefined)
        
        inline def setScheduledEndTime(value: String): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
        
        inline def setScheduledStartTime(value: String): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
      }
    }
    
    trait VideoLocalization extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object VideoLocalization {
      
      inline def apply(): VideoLocalization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoLocalization]
      }
      
      extension [Self <: VideoLocalization](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait VideoMonetizationDetails extends StObject {
      
      var access: js.UndefOr[AccessPolicy] = js.undefined
    }
    object VideoMonetizationDetails {
      
      inline def apply(): VideoMonetizationDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoMonetizationDetails]
      }
      
      extension [Self <: VideoMonetizationDetails](x: Self) {
        
        inline def setAccess(value: AccessPolicy): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
        
        inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
      }
    }
    
    trait VideoPlayer extends StObject {
      
      var embedHeight: js.UndefOr[String] = js.undefined
      
      var embedHtml: js.UndefOr[String] = js.undefined
      
      var embedWidth: js.UndefOr[String] = js.undefined
    }
    object VideoPlayer {
      
      inline def apply(): VideoPlayer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoPlayer]
      }
      
      extension [Self <: VideoPlayer](x: Self) {
        
        inline def setEmbedHeight(value: String): Self = StObject.set(x, "embedHeight", value.asInstanceOf[js.Any])
        
        inline def setEmbedHeightUndefined: Self = StObject.set(x, "embedHeight", js.undefined)
        
        inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
        
        inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
        
        inline def setEmbedWidth(value: String): Self = StObject.set(x, "embedWidth", value.asInstanceOf[js.Any])
        
        inline def setEmbedWidthUndefined: Self = StObject.set(x, "embedWidth", js.undefined)
      }
    }
    
    trait VideoProcessingDetails extends StObject {
      
      var editorSuggestionsAvailability: js.UndefOr[String] = js.undefined
      
      var fileDetailsAvailability: js.UndefOr[String] = js.undefined
      
      var processingFailureReason: js.UndefOr[String] = js.undefined
      
      var processingIssuesAvailability: js.UndefOr[String] = js.undefined
      
      var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.undefined
      
      var processingStatus: js.UndefOr[String] = js.undefined
      
      var tagSuggestionsAvailability: js.UndefOr[String] = js.undefined
      
      var thumbnailsAvailability: js.UndefOr[String] = js.undefined
    }
    object VideoProcessingDetails {
      
      inline def apply(): VideoProcessingDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoProcessingDetails]
      }
      
      extension [Self <: VideoProcessingDetails](x: Self) {
        
        inline def setEditorSuggestionsAvailability(value: String): Self = StObject.set(x, "editorSuggestionsAvailability", value.asInstanceOf[js.Any])
        
        inline def setEditorSuggestionsAvailabilityUndefined: Self = StObject.set(x, "editorSuggestionsAvailability", js.undefined)
        
        inline def setFileDetailsAvailability(value: String): Self = StObject.set(x, "fileDetailsAvailability", value.asInstanceOf[js.Any])
        
        inline def setFileDetailsAvailabilityUndefined: Self = StObject.set(x, "fileDetailsAvailability", js.undefined)
        
        inline def setProcessingFailureReason(value: String): Self = StObject.set(x, "processingFailureReason", value.asInstanceOf[js.Any])
        
        inline def setProcessingFailureReasonUndefined: Self = StObject.set(x, "processingFailureReason", js.undefined)
        
        inline def setProcessingIssuesAvailability(value: String): Self = StObject.set(x, "processingIssuesAvailability", value.asInstanceOf[js.Any])
        
        inline def setProcessingIssuesAvailabilityUndefined: Self = StObject.set(x, "processingIssuesAvailability", js.undefined)
        
        inline def setProcessingProgress(value: VideoProcessingDetailsProcessingProgress): Self = StObject.set(x, "processingProgress", value.asInstanceOf[js.Any])
        
        inline def setProcessingProgressUndefined: Self = StObject.set(x, "processingProgress", js.undefined)
        
        inline def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
        
        inline def setProcessingStatusUndefined: Self = StObject.set(x, "processingStatus", js.undefined)
        
        inline def setTagSuggestionsAvailability(value: String): Self = StObject.set(x, "tagSuggestionsAvailability", value.asInstanceOf[js.Any])
        
        inline def setTagSuggestionsAvailabilityUndefined: Self = StObject.set(x, "tagSuggestionsAvailability", js.undefined)
        
        inline def setThumbnailsAvailability(value: String): Self = StObject.set(x, "thumbnailsAvailability", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsAvailabilityUndefined: Self = StObject.set(x, "thumbnailsAvailability", js.undefined)
      }
    }
    
    trait VideoProcessingDetailsProcessingProgress extends StObject {
      
      var partsProcessed: js.UndefOr[String] = js.undefined
      
      var partsTotal: js.UndefOr[String] = js.undefined
      
      var timeLeftMs: js.UndefOr[String] = js.undefined
    }
    object VideoProcessingDetailsProcessingProgress {
      
      inline def apply(): VideoProcessingDetailsProcessingProgress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoProcessingDetailsProcessingProgress]
      }
      
      extension [Self <: VideoProcessingDetailsProcessingProgress](x: Self) {
        
        inline def setPartsProcessed(value: String): Self = StObject.set(x, "partsProcessed", value.asInstanceOf[js.Any])
        
        inline def setPartsProcessedUndefined: Self = StObject.set(x, "partsProcessed", js.undefined)
        
        inline def setPartsTotal(value: String): Self = StObject.set(x, "partsTotal", value.asInstanceOf[js.Any])
        
        inline def setPartsTotalUndefined: Self = StObject.set(x, "partsTotal", js.undefined)
        
        inline def setTimeLeftMs(value: String): Self = StObject.set(x, "timeLeftMs", value.asInstanceOf[js.Any])
        
        inline def setTimeLeftMsUndefined: Self = StObject.set(x, "timeLeftMs", js.undefined)
      }
    }
    
    trait VideoProjectDetails extends StObject {
      
      var tags: js.UndefOr[js.Array[String]] = js.undefined
    }
    object VideoProjectDetails {
      
      inline def apply(): VideoProjectDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoProjectDetails]
      }
      
      extension [Self <: VideoProjectDetails](x: Self) {
        
        inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
    
    trait VideoRating extends StObject {
      
      var rating: js.UndefOr[String] = js.undefined
      
      var videoId: js.UndefOr[String] = js.undefined
    }
    object VideoRating {
      
      inline def apply(): VideoRating = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoRating]
      }
      
      extension [Self <: VideoRating](x: Self) {
        
        inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
        
        inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
        
        inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
        
        inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      }
    }
    
    trait VideoRecordingDetails extends StObject {
      
      var location: js.UndefOr[GeoPoint] = js.undefined
      
      var locationDescription: js.UndefOr[String] = js.undefined
      
      var recordingDate: js.UndefOr[String] = js.undefined
    }
    object VideoRecordingDetails {
      
      inline def apply(): VideoRecordingDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoRecordingDetails]
      }
      
      extension [Self <: VideoRecordingDetails](x: Self) {
        
        inline def setLocation(value: GeoPoint): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationDescription(value: String): Self = StObject.set(x, "locationDescription", value.asInstanceOf[js.Any])
        
        inline def setLocationDescriptionUndefined: Self = StObject.set(x, "locationDescription", js.undefined)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setRecordingDate(value: String): Self = StObject.set(x, "recordingDate", value.asInstanceOf[js.Any])
        
        inline def setRecordingDateUndefined: Self = StObject.set(x, "recordingDate", js.undefined)
      }
    }
    
    trait VideoSnippet extends StObject {
      
      var categoryId: js.UndefOr[String] = js.undefined
      
      var channelId: js.UndefOr[String] = js.undefined
      
      var channelTitle: js.UndefOr[String] = js.undefined
      
      var defaultAudioLanguage: js.UndefOr[String] = js.undefined
      
      var defaultLanguage: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var liveBroadcastContent: js.UndefOr[String] = js.undefined
      
      var localized: js.UndefOr[VideoLocalization] = js.undefined
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var tags: js.UndefOr[js.Array[String]] = js.undefined
      
      var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object VideoSnippet {
      
      inline def apply(): VideoSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoSnippet]
      }
      
      extension [Self <: VideoSnippet](x: Self) {
        
        inline def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
        
        inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
        
        inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
        
        inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
        
        inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
        
        inline def setDefaultAudioLanguage(value: String): Self = StObject.set(x, "defaultAudioLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultAudioLanguageUndefined: Self = StObject.set(x, "defaultAudioLanguage", js.undefined)
        
        inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
        
        inline def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
        
        inline def setLocalized(value: VideoLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
        
        inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
        
        inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
        
        inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait VideoStatistics extends StObject {
      
      var commentCount: js.UndefOr[String] = js.undefined
      
      var dislikeCount: js.UndefOr[String] = js.undefined
      
      var favoriteCount: js.UndefOr[String] = js.undefined
      
      var likeCount: js.UndefOr[String] = js.undefined
      
      var viewCount: js.UndefOr[String] = js.undefined
    }
    object VideoStatistics {
      
      inline def apply(): VideoStatistics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoStatistics]
      }
      
      extension [Self <: VideoStatistics](x: Self) {
        
        inline def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
        
        inline def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
        
        inline def setDislikeCount(value: String): Self = StObject.set(x, "dislikeCount", value.asInstanceOf[js.Any])
        
        inline def setDislikeCountUndefined: Self = StObject.set(x, "dislikeCount", js.undefined)
        
        inline def setFavoriteCount(value: String): Self = StObject.set(x, "favoriteCount", value.asInstanceOf[js.Any])
        
        inline def setFavoriteCountUndefined: Self = StObject.set(x, "favoriteCount", js.undefined)
        
        inline def setLikeCount(value: String): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
        
        inline def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
        
        inline def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
        
        inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
      }
    }
    
    trait VideoStatus extends StObject {
      
      var embeddable: js.UndefOr[Boolean] = js.undefined
      
      var failureReason: js.UndefOr[String] = js.undefined
      
      var license: js.UndefOr[String] = js.undefined
      
      var privacyStatus: js.UndefOr[String] = js.undefined
      
      var publicStatsViewable: js.UndefOr[Boolean] = js.undefined
      
      var publishAt: js.UndefOr[String] = js.undefined
      
      var rejectionReason: js.UndefOr[String] = js.undefined
      
      var uploadStatus: js.UndefOr[String] = js.undefined
    }
    object VideoStatus {
      
      inline def apply(): VideoStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoStatus]
      }
      
      extension [Self <: VideoStatus](x: Self) {
        
        inline def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
        
        inline def setEmbeddableUndefined: Self = StObject.set(x, "embeddable", js.undefined)
        
        inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
        
        inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
        
        inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
        
        inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
        
        inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
        
        inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
        
        inline def setPublicStatsViewable(value: Boolean): Self = StObject.set(x, "publicStatsViewable", value.asInstanceOf[js.Any])
        
        inline def setPublicStatsViewableUndefined: Self = StObject.set(x, "publicStatsViewable", js.undefined)
        
        inline def setPublishAt(value: String): Self = StObject.set(x, "publishAt", value.asInstanceOf[js.Any])
        
        inline def setPublishAtUndefined: Self = StObject.set(x, "publishAt", js.undefined)
        
        inline def setRejectionReason(value: String): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
        
        inline def setRejectionReasonUndefined: Self = StObject.set(x, "rejectionReason", js.undefined)
        
        inline def setUploadStatus(value: String): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
        
        inline def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
      }
    }
    
    trait VideoSuggestions extends StObject {
      
      var editorSuggestions: js.UndefOr[js.Array[String]] = js.undefined
      
      var processingErrors: js.UndefOr[js.Array[String]] = js.undefined
      
      var processingHints: js.UndefOr[js.Array[String]] = js.undefined
      
      var processingWarnings: js.UndefOr[js.Array[String]] = js.undefined
      
      var tagSuggestions: js.UndefOr[js.Array[VideoSuggestionsTagSuggestion]] = js.undefined
    }
    object VideoSuggestions {
      
      inline def apply(): VideoSuggestions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoSuggestions]
      }
      
      extension [Self <: VideoSuggestions](x: Self) {
        
        inline def setEditorSuggestions(value: js.Array[String]): Self = StObject.set(x, "editorSuggestions", value.asInstanceOf[js.Any])
        
        inline def setEditorSuggestionsUndefined: Self = StObject.set(x, "editorSuggestions", js.undefined)
        
        inline def setEditorSuggestionsVarargs(value: String*): Self = StObject.set(x, "editorSuggestions", js.Array(value*))
        
        inline def setProcessingErrors(value: js.Array[String]): Self = StObject.set(x, "processingErrors", value.asInstanceOf[js.Any])
        
        inline def setProcessingErrorsUndefined: Self = StObject.set(x, "processingErrors", js.undefined)
        
        inline def setProcessingErrorsVarargs(value: String*): Self = StObject.set(x, "processingErrors", js.Array(value*))
        
        inline def setProcessingHints(value: js.Array[String]): Self = StObject.set(x, "processingHints", value.asInstanceOf[js.Any])
        
        inline def setProcessingHintsUndefined: Self = StObject.set(x, "processingHints", js.undefined)
        
        inline def setProcessingHintsVarargs(value: String*): Self = StObject.set(x, "processingHints", js.Array(value*))
        
        inline def setProcessingWarnings(value: js.Array[String]): Self = StObject.set(x, "processingWarnings", value.asInstanceOf[js.Any])
        
        inline def setProcessingWarningsUndefined: Self = StObject.set(x, "processingWarnings", js.undefined)
        
        inline def setProcessingWarningsVarargs(value: String*): Self = StObject.set(x, "processingWarnings", js.Array(value*))
        
        inline def setTagSuggestions(value: js.Array[VideoSuggestionsTagSuggestion]): Self = StObject.set(x, "tagSuggestions", value.asInstanceOf[js.Any])
        
        inline def setTagSuggestionsUndefined: Self = StObject.set(x, "tagSuggestions", js.undefined)
        
        inline def setTagSuggestionsVarargs(value: VideoSuggestionsTagSuggestion*): Self = StObject.set(x, "tagSuggestions", js.Array(value*))
      }
    }
    
    trait VideoSuggestionsTagSuggestion extends StObject {
      
      var categoryRestricts: js.UndefOr[js.Array[String]] = js.undefined
      
      var tag: js.UndefOr[String] = js.undefined
    }
    object VideoSuggestionsTagSuggestion {
      
      inline def apply(): VideoSuggestionsTagSuggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoSuggestionsTagSuggestion]
      }
      
      extension [Self <: VideoSuggestionsTagSuggestion](x: Self) {
        
        inline def setCategoryRestricts(value: js.Array[String]): Self = StObject.set(x, "categoryRestricts", value.asInstanceOf[js.Any])
        
        inline def setCategoryRestrictsUndefined: Self = StObject.set(x, "categoryRestricts", js.undefined)
        
        inline def setCategoryRestrictsVarargs(value: String*): Self = StObject.set(x, "categoryRestricts", js.Array(value*))
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    trait VideoTopicDetails extends StObject {
      
      var relevantTopicIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var topicCategories: js.UndefOr[js.Array[String]] = js.undefined
      
      var topicIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object VideoTopicDetails {
      
      inline def apply(): VideoTopicDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoTopicDetails]
      }
      
      extension [Self <: VideoTopicDetails](x: Self) {
        
        inline def setRelevantTopicIds(value: js.Array[String]): Self = StObject.set(x, "relevantTopicIds", value.asInstanceOf[js.Any])
        
        inline def setRelevantTopicIdsUndefined: Self = StObject.set(x, "relevantTopicIds", js.undefined)
        
        inline def setRelevantTopicIdsVarargs(value: String*): Self = StObject.set(x, "relevantTopicIds", js.Array(value*))
        
        inline def setTopicCategories(value: js.Array[String]): Self = StObject.set(x, "topicCategories", value.asInstanceOf[js.Any])
        
        inline def setTopicCategoriesUndefined: Self = StObject.set(x, "topicCategories", js.undefined)
        
        inline def setTopicCategoriesVarargs(value: String*): Self = StObject.set(x, "topicCategories", js.Array(value*))
        
        inline def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
        
        inline def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
        
        inline def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value*))
      }
    }
    
    trait WatchSettings extends StObject {
      
      var backgroundColor: js.UndefOr[String] = js.undefined
      
      var featuredPlaylistId: js.UndefOr[String] = js.undefined
      
      var textColor: js.UndefOr[String] = js.undefined
    }
    object WatchSettings {
      
      inline def apply(): WatchSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WatchSettings]
      }
      
      extension [Self <: WatchSettings](x: Self) {
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setFeaturedPlaylistId(value: String): Self = StObject.set(x, "featuredPlaylistId", value.asInstanceOf[js.Any])
        
        inline def setFeaturedPlaylistIdUndefined: Self = StObject.set(x, "featuredPlaylistId", js.undefined)
        
        inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
        
        inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      }
    }
  }
  
  extension [Self <: YouTube](x: Self) {
    
    inline def setActivities(value: ActivitiesCollection): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setCaptions(value: CaptionsCollection): Self = StObject.set(x, "Captions", value.asInstanceOf[js.Any])
    
    inline def setCaptionsUndefined: Self = StObject.set(x, "Captions", js.undefined)
    
    inline def setChannelBanners(value: ChannelBannersCollection): Self = StObject.set(x, "ChannelBanners", value.asInstanceOf[js.Any])
    
    inline def setChannelBannersUndefined: Self = StObject.set(x, "ChannelBanners", js.undefined)
    
    inline def setChannelSections(value: ChannelSectionsCollection): Self = StObject.set(x, "ChannelSections", value.asInstanceOf[js.Any])
    
    inline def setChannelSectionsUndefined: Self = StObject.set(x, "ChannelSections", js.undefined)
    
    inline def setChannels(value: ChannelsCollection): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setCommentThreads(value: CommentThreadsCollection): Self = StObject.set(x, "CommentThreads", value.asInstanceOf[js.Any])
    
    inline def setCommentThreadsUndefined: Self = StObject.set(x, "CommentThreads", js.undefined)
    
    inline def setComments(value: CommentsCollection): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    inline def setGuideCategories(value: GuideCategoriesCollection): Self = StObject.set(x, "GuideCategories", value.asInstanceOf[js.Any])
    
    inline def setGuideCategoriesUndefined: Self = StObject.set(x, "GuideCategories", js.undefined)
    
    inline def setI18nLanguages(value: I18nLanguagesCollection): Self = StObject.set(x, "I18nLanguages", value.asInstanceOf[js.Any])
    
    inline def setI18nLanguagesUndefined: Self = StObject.set(x, "I18nLanguages", js.undefined)
    
    inline def setI18nRegions(value: I18nRegionsCollection): Self = StObject.set(x, "I18nRegions", value.asInstanceOf[js.Any])
    
    inline def setI18nRegionsUndefined: Self = StObject.set(x, "I18nRegions", js.undefined)
    
    inline def setLiveBroadcasts(value: LiveBroadcastsCollection): Self = StObject.set(x, "LiveBroadcasts", value.asInstanceOf[js.Any])
    
    inline def setLiveBroadcastsUndefined: Self = StObject.set(x, "LiveBroadcasts", js.undefined)
    
    inline def setLiveChatBans(value: LiveChatBansCollection): Self = StObject.set(x, "LiveChatBans", value.asInstanceOf[js.Any])
    
    inline def setLiveChatBansUndefined: Self = StObject.set(x, "LiveChatBans", js.undefined)
    
    inline def setLiveChatMessages(value: LiveChatMessagesCollection): Self = StObject.set(x, "LiveChatMessages", value.asInstanceOf[js.Any])
    
    inline def setLiveChatMessagesUndefined: Self = StObject.set(x, "LiveChatMessages", js.undefined)
    
    inline def setLiveChatModerators(value: LiveChatModeratorsCollection): Self = StObject.set(x, "LiveChatModerators", value.asInstanceOf[js.Any])
    
    inline def setLiveChatModeratorsUndefined: Self = StObject.set(x, "LiveChatModerators", js.undefined)
    
    inline def setLiveStreams(value: LiveStreamsCollection): Self = StObject.set(x, "LiveStreams", value.asInstanceOf[js.Any])
    
    inline def setLiveStreamsUndefined: Self = StObject.set(x, "LiveStreams", js.undefined)
    
    inline def setNewAccessPolicy(value: CallbackTo[AccessPolicy]): Self = StObject.set(x, "newAccessPolicy", value.toJsFn)
    
    inline def setNewActivity(value: CallbackTo[Activity]): Self = StObject.set(x, "newActivity", value.toJsFn)
    
    inline def setNewActivityContentDetails(value: CallbackTo[ActivityContentDetails]): Self = StObject.set(x, "newActivityContentDetails", value.toJsFn)
    
    inline def setNewActivityContentDetailsBulletin(value: CallbackTo[ActivityContentDetailsBulletin]): Self = StObject.set(x, "newActivityContentDetailsBulletin", value.toJsFn)
    
    inline def setNewActivityContentDetailsChannelItem(value: CallbackTo[ActivityContentDetailsChannelItem]): Self = StObject.set(x, "newActivityContentDetailsChannelItem", value.toJsFn)
    
    inline def setNewActivityContentDetailsComment(value: CallbackTo[ActivityContentDetailsComment]): Self = StObject.set(x, "newActivityContentDetailsComment", value.toJsFn)
    
    inline def setNewActivityContentDetailsFavorite(value: CallbackTo[ActivityContentDetailsFavorite]): Self = StObject.set(x, "newActivityContentDetailsFavorite", value.toJsFn)
    
    inline def setNewActivityContentDetailsLike(value: CallbackTo[ActivityContentDetailsLike]): Self = StObject.set(x, "newActivityContentDetailsLike", value.toJsFn)
    
    inline def setNewActivityContentDetailsPlaylistItem(value: CallbackTo[ActivityContentDetailsPlaylistItem]): Self = StObject.set(x, "newActivityContentDetailsPlaylistItem", value.toJsFn)
    
    inline def setNewActivityContentDetailsPromotedItem(value: CallbackTo[ActivityContentDetailsPromotedItem]): Self = StObject.set(x, "newActivityContentDetailsPromotedItem", value.toJsFn)
    
    inline def setNewActivityContentDetailsRecommendation(value: CallbackTo[ActivityContentDetailsRecommendation]): Self = StObject.set(x, "newActivityContentDetailsRecommendation", value.toJsFn)
    
    inline def setNewActivityContentDetailsSocial(value: CallbackTo[ActivityContentDetailsSocial]): Self = StObject.set(x, "newActivityContentDetailsSocial", value.toJsFn)
    
    inline def setNewActivityContentDetailsSubscription(value: CallbackTo[ActivityContentDetailsSubscription]): Self = StObject.set(x, "newActivityContentDetailsSubscription", value.toJsFn)
    
    inline def setNewActivityContentDetailsUpload(value: CallbackTo[ActivityContentDetailsUpload]): Self = StObject.set(x, "newActivityContentDetailsUpload", value.toJsFn)
    
    inline def setNewActivitySnippet(value: CallbackTo[ActivitySnippet]): Self = StObject.set(x, "newActivitySnippet", value.toJsFn)
    
    inline def setNewCaption(value: CallbackTo[Caption]): Self = StObject.set(x, "newCaption", value.toJsFn)
    
    inline def setNewCaptionSnippet(value: CallbackTo[CaptionSnippet]): Self = StObject.set(x, "newCaptionSnippet", value.toJsFn)
    
    inline def setNewCdnSettings(value: CallbackTo[CdnSettings]): Self = StObject.set(x, "newCdnSettings", value.toJsFn)
    
    inline def setNewChannel(value: CallbackTo[Channel]): Self = StObject.set(x, "newChannel", value.toJsFn)
    
    inline def setNewChannelAuditDetails(value: CallbackTo[ChannelAuditDetails]): Self = StObject.set(x, "newChannelAuditDetails", value.toJsFn)
    
    inline def setNewChannelBannerResource(value: CallbackTo[ChannelBannerResource]): Self = StObject.set(x, "newChannelBannerResource", value.toJsFn)
    
    inline def setNewChannelBrandingSettings(value: CallbackTo[ChannelBrandingSettings]): Self = StObject.set(x, "newChannelBrandingSettings", value.toJsFn)
    
    inline def setNewChannelContentDetails(value: CallbackTo[ChannelContentDetails]): Self = StObject.set(x, "newChannelContentDetails", value.toJsFn)
    
    inline def setNewChannelContentDetailsRelatedPlaylists(value: CallbackTo[ChannelContentDetailsRelatedPlaylists]): Self = StObject.set(x, "newChannelContentDetailsRelatedPlaylists", value.toJsFn)
    
    inline def setNewChannelContentOwnerDetails(value: CallbackTo[ChannelContentOwnerDetails]): Self = StObject.set(x, "newChannelContentOwnerDetails", value.toJsFn)
    
    inline def setNewChannelConversionPing(value: CallbackTo[ChannelConversionPing]): Self = StObject.set(x, "newChannelConversionPing", value.toJsFn)
    
    inline def setNewChannelConversionPings(value: CallbackTo[ChannelConversionPings]): Self = StObject.set(x, "newChannelConversionPings", value.toJsFn)
    
    inline def setNewChannelLocalization(value: CallbackTo[ChannelLocalization]): Self = StObject.set(x, "newChannelLocalization", value.toJsFn)
    
    inline def setNewChannelProfileDetails(value: CallbackTo[ChannelProfileDetails]): Self = StObject.set(x, "newChannelProfileDetails", value.toJsFn)
    
    inline def setNewChannelSection(value: CallbackTo[ChannelSection]): Self = StObject.set(x, "newChannelSection", value.toJsFn)
    
    inline def setNewChannelSectionContentDetails(value: CallbackTo[ChannelSectionContentDetails]): Self = StObject.set(x, "newChannelSectionContentDetails", value.toJsFn)
    
    inline def setNewChannelSectionLocalization(value: CallbackTo[ChannelSectionLocalization]): Self = StObject.set(x, "newChannelSectionLocalization", value.toJsFn)
    
    inline def setNewChannelSectionSnippet(value: CallbackTo[ChannelSectionSnippet]): Self = StObject.set(x, "newChannelSectionSnippet", value.toJsFn)
    
    inline def setNewChannelSectionTargeting(value: CallbackTo[ChannelSectionTargeting]): Self = StObject.set(x, "newChannelSectionTargeting", value.toJsFn)
    
    inline def setNewChannelSettings(value: CallbackTo[ChannelSettings]): Self = StObject.set(x, "newChannelSettings", value.toJsFn)
    
    inline def setNewChannelSnippet(value: CallbackTo[ChannelSnippet]): Self = StObject.set(x, "newChannelSnippet", value.toJsFn)
    
    inline def setNewChannelStatistics(value: CallbackTo[ChannelStatistics]): Self = StObject.set(x, "newChannelStatistics", value.toJsFn)
    
    inline def setNewChannelStatus(value: CallbackTo[ChannelStatus]): Self = StObject.set(x, "newChannelStatus", value.toJsFn)
    
    inline def setNewChannelTopicDetails(value: CallbackTo[ChannelTopicDetails]): Self = StObject.set(x, "newChannelTopicDetails", value.toJsFn)
    
    inline def setNewComment(value: CallbackTo[Comment]): Self = StObject.set(x, "newComment", value.toJsFn)
    
    inline def setNewCommentSnippet(value: CallbackTo[CommentSnippet]): Self = StObject.set(x, "newCommentSnippet", value.toJsFn)
    
    inline def setNewCommentThread(value: CallbackTo[CommentThread]): Self = StObject.set(x, "newCommentThread", value.toJsFn)
    
    inline def setNewCommentThreadReplies(value: CallbackTo[CommentThreadReplies]): Self = StObject.set(x, "newCommentThreadReplies", value.toJsFn)
    
    inline def setNewCommentThreadSnippet(value: CallbackTo[CommentThreadSnippet]): Self = StObject.set(x, "newCommentThreadSnippet", value.toJsFn)
    
    inline def setNewContentRating(value: CallbackTo[ContentRating]): Self = StObject.set(x, "newContentRating", value.toJsFn)
    
    inline def setNewGeoPoint(value: CallbackTo[GeoPoint]): Self = StObject.set(x, "newGeoPoint", value.toJsFn)
    
    inline def setNewImageSettings(value: CallbackTo[ImageSettings]): Self = StObject.set(x, "newImageSettings", value.toJsFn)
    
    inline def setNewIngestionInfo(value: CallbackTo[IngestionInfo]): Self = StObject.set(x, "newIngestionInfo", value.toJsFn)
    
    inline def setNewInvideoBranding(value: CallbackTo[InvideoBranding]): Self = StObject.set(x, "newInvideoBranding", value.toJsFn)
    
    inline def setNewInvideoPosition(value: CallbackTo[InvideoPosition]): Self = StObject.set(x, "newInvideoPosition", value.toJsFn)
    
    inline def setNewInvideoPromotion(value: CallbackTo[InvideoPromotion]): Self = StObject.set(x, "newInvideoPromotion", value.toJsFn)
    
    inline def setNewInvideoTiming(value: CallbackTo[InvideoTiming]): Self = StObject.set(x, "newInvideoTiming", value.toJsFn)
    
    inline def setNewLanguageTag(value: CallbackTo[LanguageTag]): Self = StObject.set(x, "newLanguageTag", value.toJsFn)
    
    inline def setNewLiveBroadcast(value: CallbackTo[LiveBroadcast]): Self = StObject.set(x, "newLiveBroadcast", value.toJsFn)
    
    inline def setNewLiveBroadcastContentDetails(value: CallbackTo[LiveBroadcastContentDetails]): Self = StObject.set(x, "newLiveBroadcastContentDetails", value.toJsFn)
    
    inline def setNewLiveBroadcastSnippet(value: CallbackTo[LiveBroadcastSnippet]): Self = StObject.set(x, "newLiveBroadcastSnippet", value.toJsFn)
    
    inline def setNewLiveBroadcastStatistics(value: CallbackTo[LiveBroadcastStatistics]): Self = StObject.set(x, "newLiveBroadcastStatistics", value.toJsFn)
    
    inline def setNewLiveBroadcastStatus(value: CallbackTo[LiveBroadcastStatus]): Self = StObject.set(x, "newLiveBroadcastStatus", value.toJsFn)
    
    inline def setNewLiveChatBan(value: CallbackTo[LiveChatBan]): Self = StObject.set(x, "newLiveChatBan", value.toJsFn)
    
    inline def setNewLiveChatBanSnippet(value: CallbackTo[LiveChatBanSnippet]): Self = StObject.set(x, "newLiveChatBanSnippet", value.toJsFn)
    
    inline def setNewLiveChatFanFundingEventDetails(value: CallbackTo[LiveChatFanFundingEventDetails]): Self = StObject.set(x, "newLiveChatFanFundingEventDetails", value.toJsFn)
    
    inline def setNewLiveChatMessage(value: CallbackTo[LiveChatMessage]): Self = StObject.set(x, "newLiveChatMessage", value.toJsFn)
    
    inline def setNewLiveChatMessageAuthorDetails(value: CallbackTo[LiveChatMessageAuthorDetails]): Self = StObject.set(x, "newLiveChatMessageAuthorDetails", value.toJsFn)
    
    inline def setNewLiveChatMessageDeletedDetails(value: CallbackTo[LiveChatMessageDeletedDetails]): Self = StObject.set(x, "newLiveChatMessageDeletedDetails", value.toJsFn)
    
    inline def setNewLiveChatMessageRetractedDetails(value: CallbackTo[LiveChatMessageRetractedDetails]): Self = StObject.set(x, "newLiveChatMessageRetractedDetails", value.toJsFn)
    
    inline def setNewLiveChatMessageSnippet(value: CallbackTo[LiveChatMessageSnippet]): Self = StObject.set(x, "newLiveChatMessageSnippet", value.toJsFn)
    
    inline def setNewLiveChatModerator(value: CallbackTo[LiveChatModerator]): Self = StObject.set(x, "newLiveChatModerator", value.toJsFn)
    
    inline def setNewLiveChatModeratorSnippet(value: CallbackTo[LiveChatModeratorSnippet]): Self = StObject.set(x, "newLiveChatModeratorSnippet", value.toJsFn)
    
    inline def setNewLiveChatPollClosedDetails(value: CallbackTo[LiveChatPollClosedDetails]): Self = StObject.set(x, "newLiveChatPollClosedDetails", value.toJsFn)
    
    inline def setNewLiveChatPollEditedDetails(value: CallbackTo[LiveChatPollEditedDetails]): Self = StObject.set(x, "newLiveChatPollEditedDetails", value.toJsFn)
    
    inline def setNewLiveChatPollItem(value: CallbackTo[LiveChatPollItem]): Self = StObject.set(x, "newLiveChatPollItem", value.toJsFn)
    
    inline def setNewLiveChatPollOpenedDetails(value: CallbackTo[LiveChatPollOpenedDetails]): Self = StObject.set(x, "newLiveChatPollOpenedDetails", value.toJsFn)
    
    inline def setNewLiveChatPollVotedDetails(value: CallbackTo[LiveChatPollVotedDetails]): Self = StObject.set(x, "newLiveChatPollVotedDetails", value.toJsFn)
    
    inline def setNewLiveChatSuperChatDetails(value: CallbackTo[LiveChatSuperChatDetails]): Self = StObject.set(x, "newLiveChatSuperChatDetails", value.toJsFn)
    
    inline def setNewLiveChatSuperStickerDetails(value: CallbackTo[LiveChatSuperStickerDetails]): Self = StObject.set(x, "newLiveChatSuperStickerDetails", value.toJsFn)
    
    inline def setNewLiveChatTextMessageDetails(value: CallbackTo[LiveChatTextMessageDetails]): Self = StObject.set(x, "newLiveChatTextMessageDetails", value.toJsFn)
    
    inline def setNewLiveChatUserBannedMessageDetails(value: CallbackTo[LiveChatUserBannedMessageDetails]): Self = StObject.set(x, "newLiveChatUserBannedMessageDetails", value.toJsFn)
    
    inline def setNewLiveStream(value: CallbackTo[LiveStream]): Self = StObject.set(x, "newLiveStream", value.toJsFn)
    
    inline def setNewLiveStreamConfigurationIssue(value: CallbackTo[LiveStreamConfigurationIssue]): Self = StObject.set(x, "newLiveStreamConfigurationIssue", value.toJsFn)
    
    inline def setNewLiveStreamContentDetails(value: CallbackTo[LiveStreamContentDetails]): Self = StObject.set(x, "newLiveStreamContentDetails", value.toJsFn)
    
    inline def setNewLiveStreamHealthStatus(value: CallbackTo[LiveStreamHealthStatus]): Self = StObject.set(x, "newLiveStreamHealthStatus", value.toJsFn)
    
    inline def setNewLiveStreamSnippet(value: CallbackTo[LiveStreamSnippet]): Self = StObject.set(x, "newLiveStreamSnippet", value.toJsFn)
    
    inline def setNewLiveStreamStatus(value: CallbackTo[LiveStreamStatus]): Self = StObject.set(x, "newLiveStreamStatus", value.toJsFn)
    
    inline def setNewLocalizedProperty(value: CallbackTo[LocalizedProperty]): Self = StObject.set(x, "newLocalizedProperty", value.toJsFn)
    
    inline def setNewLocalizedString(value: CallbackTo[LocalizedString]): Self = StObject.set(x, "newLocalizedString", value.toJsFn)
    
    inline def setNewMonitorStreamInfo(value: CallbackTo[MonitorStreamInfo]): Self = StObject.set(x, "newMonitorStreamInfo", value.toJsFn)
    
    inline def setNewPlaylist(value: CallbackTo[Playlist]): Self = StObject.set(x, "newPlaylist", value.toJsFn)
    
    inline def setNewPlaylistContentDetails(value: CallbackTo[PlaylistContentDetails]): Self = StObject.set(x, "newPlaylistContentDetails", value.toJsFn)
    
    inline def setNewPlaylistItem(value: CallbackTo[PlaylistItem]): Self = StObject.set(x, "newPlaylistItem", value.toJsFn)
    
    inline def setNewPlaylistItemContentDetails(value: CallbackTo[PlaylistItemContentDetails]): Self = StObject.set(x, "newPlaylistItemContentDetails", value.toJsFn)
    
    inline def setNewPlaylistItemSnippet(value: CallbackTo[PlaylistItemSnippet]): Self = StObject.set(x, "newPlaylistItemSnippet", value.toJsFn)
    
    inline def setNewPlaylistItemStatus(value: CallbackTo[PlaylistItemStatus]): Self = StObject.set(x, "newPlaylistItemStatus", value.toJsFn)
    
    inline def setNewPlaylistLocalization(value: CallbackTo[PlaylistLocalization]): Self = StObject.set(x, "newPlaylistLocalization", value.toJsFn)
    
    inline def setNewPlaylistPlayer(value: CallbackTo[PlaylistPlayer]): Self = StObject.set(x, "newPlaylistPlayer", value.toJsFn)
    
    inline def setNewPlaylistSnippet(value: CallbackTo[PlaylistSnippet]): Self = StObject.set(x, "newPlaylistSnippet", value.toJsFn)
    
    inline def setNewPlaylistStatus(value: CallbackTo[PlaylistStatus]): Self = StObject.set(x, "newPlaylistStatus", value.toJsFn)
    
    inline def setNewPromotedItem(value: CallbackTo[PromotedItem]): Self = StObject.set(x, "newPromotedItem", value.toJsFn)
    
    inline def setNewPromotedItemId(value: CallbackTo[PromotedItemId]): Self = StObject.set(x, "newPromotedItemId", value.toJsFn)
    
    inline def setNewPropertyValue(value: CallbackTo[PropertyValue]): Self = StObject.set(x, "newPropertyValue", value.toJsFn)
    
    inline def setNewResourceId(value: CallbackTo[ResourceId]): Self = StObject.set(x, "newResourceId", value.toJsFn)
    
    inline def setNewSubscription(value: CallbackTo[Subscription]): Self = StObject.set(x, "newSubscription", value.toJsFn)
    
    inline def setNewSubscriptionContentDetails(value: CallbackTo[SubscriptionContentDetails]): Self = StObject.set(x, "newSubscriptionContentDetails", value.toJsFn)
    
    inline def setNewSubscriptionSnippet(value: CallbackTo[SubscriptionSnippet]): Self = StObject.set(x, "newSubscriptionSnippet", value.toJsFn)
    
    inline def setNewSubscriptionSubscriberSnippet(value: CallbackTo[SubscriptionSubscriberSnippet]): Self = StObject.set(x, "newSubscriptionSubscriberSnippet", value.toJsFn)
    
    inline def setNewSuperStickerMetadata(value: CallbackTo[SuperStickerMetadata]): Self = StObject.set(x, "newSuperStickerMetadata", value.toJsFn)
    
    inline def setNewThumbnail(value: CallbackTo[Thumbnail]): Self = StObject.set(x, "newThumbnail", value.toJsFn)
    
    inline def setNewThumbnailDetails(value: CallbackTo[ThumbnailDetails]): Self = StObject.set(x, "newThumbnailDetails", value.toJsFn)
    
    inline def setNewVideo(value: CallbackTo[Video]): Self = StObject.set(x, "newVideo", value.toJsFn)
    
    inline def setNewVideoAbuseReport(value: CallbackTo[VideoAbuseReport]): Self = StObject.set(x, "newVideoAbuseReport", value.toJsFn)
    
    inline def setNewVideoAgeGating(value: CallbackTo[VideoAgeGating]): Self = StObject.set(x, "newVideoAgeGating", value.toJsFn)
    
    inline def setNewVideoContentDetails(value: CallbackTo[VideoContentDetails]): Self = StObject.set(x, "newVideoContentDetails", value.toJsFn)
    
    inline def setNewVideoContentDetailsRegionRestriction(value: CallbackTo[VideoContentDetailsRegionRestriction]): Self = StObject.set(x, "newVideoContentDetailsRegionRestriction", value.toJsFn)
    
    inline def setNewVideoFileDetails(value: CallbackTo[VideoFileDetails]): Self = StObject.set(x, "newVideoFileDetails", value.toJsFn)
    
    inline def setNewVideoFileDetailsAudioStream(value: CallbackTo[VideoFileDetailsAudioStream]): Self = StObject.set(x, "newVideoFileDetailsAudioStream", value.toJsFn)
    
    inline def setNewVideoFileDetailsVideoStream(value: CallbackTo[VideoFileDetailsVideoStream]): Self = StObject.set(x, "newVideoFileDetailsVideoStream", value.toJsFn)
    
    inline def setNewVideoLiveStreamingDetails(value: CallbackTo[VideoLiveStreamingDetails]): Self = StObject.set(x, "newVideoLiveStreamingDetails", value.toJsFn)
    
    inline def setNewVideoLocalization(value: CallbackTo[VideoLocalization]): Self = StObject.set(x, "newVideoLocalization", value.toJsFn)
    
    inline def setNewVideoMonetizationDetails(value: CallbackTo[VideoMonetizationDetails]): Self = StObject.set(x, "newVideoMonetizationDetails", value.toJsFn)
    
    inline def setNewVideoPlayer(value: CallbackTo[VideoPlayer]): Self = StObject.set(x, "newVideoPlayer", value.toJsFn)
    
    inline def setNewVideoProcessingDetails(value: CallbackTo[VideoProcessingDetails]): Self = StObject.set(x, "newVideoProcessingDetails", value.toJsFn)
    
    inline def setNewVideoProcessingDetailsProcessingProgress(value: CallbackTo[VideoProcessingDetailsProcessingProgress]): Self = StObject.set(x, "newVideoProcessingDetailsProcessingProgress", value.toJsFn)
    
    inline def setNewVideoProjectDetails(value: CallbackTo[VideoProjectDetails]): Self = StObject.set(x, "newVideoProjectDetails", value.toJsFn)
    
    inline def setNewVideoRecordingDetails(value: CallbackTo[VideoRecordingDetails]): Self = StObject.set(x, "newVideoRecordingDetails", value.toJsFn)
    
    inline def setNewVideoSnippet(value: CallbackTo[VideoSnippet]): Self = StObject.set(x, "newVideoSnippet", value.toJsFn)
    
    inline def setNewVideoStatistics(value: CallbackTo[VideoStatistics]): Self = StObject.set(x, "newVideoStatistics", value.toJsFn)
    
    inline def setNewVideoStatus(value: CallbackTo[VideoStatus]): Self = StObject.set(x, "newVideoStatus", value.toJsFn)
    
    inline def setNewVideoSuggestions(value: CallbackTo[VideoSuggestions]): Self = StObject.set(x, "newVideoSuggestions", value.toJsFn)
    
    inline def setNewVideoSuggestionsTagSuggestion(value: CallbackTo[VideoSuggestionsTagSuggestion]): Self = StObject.set(x, "newVideoSuggestionsTagSuggestion", value.toJsFn)
    
    inline def setNewVideoTopicDetails(value: CallbackTo[VideoTopicDetails]): Self = StObject.set(x, "newVideoTopicDetails", value.toJsFn)
    
    inline def setNewWatchSettings(value: CallbackTo[WatchSettings]): Self = StObject.set(x, "newWatchSettings", value.toJsFn)
    
    inline def setPlaylistItems(value: PlaylistItemsCollection): Self = StObject.set(x, "PlaylistItems", value.asInstanceOf[js.Any])
    
    inline def setPlaylistItemsUndefined: Self = StObject.set(x, "PlaylistItems", js.undefined)
    
    inline def setPlaylists(value: PlaylistsCollection): Self = StObject.set(x, "Playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsUndefined: Self = StObject.set(x, "Playlists", js.undefined)
    
    inline def setSearch(value: SearchCollection): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "Search", js.undefined)
    
    inline def setSponsors(value: SponsorsCollection): Self = StObject.set(x, "Sponsors", value.asInstanceOf[js.Any])
    
    inline def setSponsorsUndefined: Self = StObject.set(x, "Sponsors", js.undefined)
    
    inline def setSubscriptions(value: SubscriptionsCollection): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    inline def setSuperChatEvents(value: SuperChatEventsCollection): Self = StObject.set(x, "SuperChatEvents", value.asInstanceOf[js.Any])
    
    inline def setSuperChatEventsUndefined: Self = StObject.set(x, "SuperChatEvents", js.undefined)
    
    inline def setThumbnails(value: ThumbnailsCollection): Self = StObject.set(x, "Thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "Thumbnails", js.undefined)
    
    inline def setVideoAbuseReportReasons(value: VideoAbuseReportReasonsCollection): Self = StObject.set(x, "VideoAbuseReportReasons", value.asInstanceOf[js.Any])
    
    inline def setVideoAbuseReportReasonsUndefined: Self = StObject.set(x, "VideoAbuseReportReasons", js.undefined)
    
    inline def setVideoCategories(value: VideoCategoriesCollection): Self = StObject.set(x, "VideoCategories", value.asInstanceOf[js.Any])
    
    inline def setVideoCategoriesUndefined: Self = StObject.set(x, "VideoCategories", js.undefined)
    
    inline def setVideos(value: VideosCollection): Self = StObject.set(x, "Videos", value.asInstanceOf[js.Any])
    
    inline def setVideosUndefined: Self = StObject.set(x, "Videos", js.undefined)
    
    inline def setWatermarks(value: WatermarksCollection): Self = StObject.set(x, "Watermarks", value.asInstanceOf[js.Any])
    
    inline def setWatermarksUndefined: Self = StObject.set(x, "Watermarks", js.undefined)
  }
}
