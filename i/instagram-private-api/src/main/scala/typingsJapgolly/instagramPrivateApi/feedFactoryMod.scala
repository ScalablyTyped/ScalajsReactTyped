package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.clientMod.IgApiClient
import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsJapgolly.instagramPrivateApi.feedsMod.AccountFollowersFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.AccountFollowingFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.BlockedUsersFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.DirectInboxFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.DirectPendingInboxFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.DirectThreadFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.DiscoverFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.IgtvBrowseFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.IgtvChannelFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.LikedFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.LocationFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.MediaCommentsFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.MusicGenreFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.MusicMoodFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.MusicSearchFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.MusicTrendingFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.NewsFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.PendingFriendshipsFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.PostsInsightsFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.ReelsMediaFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.ReelsTrayFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.SavedFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.StoriesInsightsFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.TagFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.TagsFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.TimelineFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.UserFeed
import typingsJapgolly.instagramPrivateApi.feedsMod.UsertagsFeed
import typingsJapgolly.instagramPrivateApi.insightsOptionsMod.PostsInsightsFeedOptions
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ONE_DAY
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.TWO_WEEKS
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.cold_start
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.places
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.ranked
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.recent
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.top
import typingsJapgolly.instagramPrivateApi.listReelMediaViewerFeedMod.ListReelMediaViewerFeed
import typingsJapgolly.instagramPrivateApi.mediaInlineChildCommentsFeedMod.MediaInlineChildCommentsFeed
import typingsJapgolly.instagramPrivateApi.mediaStickerResponsesFeedMod.MediaStickerResponsesFeed
import typingsJapgolly.instagramPrivateApi.storyPollVotersFeedResponseMod.StoryPollVotersFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.storyPollVotersFeedResponseMod.StoryPollVotersFeedResponseVotersItem
import typingsJapgolly.instagramPrivateApi.storyQuestionResponsesFeedResponseMod.StoryQuestionResponsesFeedResponseRespondersItem
import typingsJapgolly.instagramPrivateApi.storyQuestionResponsesFeedResponseMod.StoryQuestionResponsesFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.storyQuizParticipantsFeedResponseMod.StoryQuizParticipantsFeedResponseParticipantsItem
import typingsJapgolly.instagramPrivateApi.storyQuizParticipantsFeedResponseMod.StoryQuizParticipantsFeedResponseRootObject
import typingsJapgolly.instagramPrivateApi.storySliderVotersFeedResponseResponseMod.StorySliderVotersFeedResponseResponseRootObject
import typingsJapgolly.instagramPrivateApi.storySliderVotersFeedResponseResponseMod.StorySliderVotersFeedResponseResponseVotersItem
import typingsJapgolly.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typingsJapgolly.instagramPrivateApi.userStoryFeedMod.UserStoryFeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/feed.factory", JSImport.Namespace)
@js.native
object feedFactoryMod extends js.Object {
  @js.native
  class FeedFactory protected () extends js.Object {
    def this(client: IgApiClient) = this()
    var client: js.Any = js.native
    def accountFollowers(): AccountFollowersFeed = js.native
    def accountFollowers(id: String): AccountFollowersFeed = js.native
    def accountFollowers(id: Double): AccountFollowersFeed = js.native
    def accountFollowing(): AccountFollowingFeed = js.native
    def accountFollowing(id: String): AccountFollowingFeed = js.native
    def accountFollowing(id: Double): AccountFollowingFeed = js.native
    def blockedUsers(): BlockedUsersFeed = js.native
    def directInbox(): DirectInboxFeed = js.native
    def directPending(): DirectPendingInboxFeed = js.native
    def directThread(options: PickDirectInboxFeedRespon): DirectThreadFeed = js.native
    def directThread(options: PickDirectInboxFeedRespon, seqId: Double): DirectThreadFeed = js.native
    def discover(): DiscoverFeed = js.native
    def igtvBrowse(): IgtvBrowseFeed = js.native
    def igtvBrowse(isPrefetch: Boolean): IgtvBrowseFeed = js.native
    def igtvChaining(id: String): IgtvChannelFeed = js.native
    def igtvChaining(id: Double): IgtvChannelFeed = js.native
    def igtvChannel(id: String): IgtvChannelFeed = js.native
    def igtvChannel(id: Double): IgtvChannelFeed = js.native
    def liked(): LikedFeed = js.native
    def listReelMediaViewers(mediaId: String): ListReelMediaViewerFeed = js.native
    def location(id: String): LocationFeed = js.native
    def location(id: Double): LocationFeed = js.native
    @JSName("location")
    def location_ranked(id: String, tab: ranked): LocationFeed = js.native
    @JSName("location")
    def location_ranked(id: Double, tab: ranked): LocationFeed = js.native
    @JSName("location")
    def location_recent(id: String, tab: recent): LocationFeed = js.native
    @JSName("location")
    def location_recent(id: Double, tab: recent): LocationFeed = js.native
    def mediaComments(id: String): MediaCommentsFeed = js.native
    def mediaInlineChildComments(mediaId: String, commentId: String): MediaInlineChildCommentsFeed = js.native
    def mediaInlineChildComments(mediaId: String, commentId: String, minId: String): MediaInlineChildCommentsFeed = js.native
    def musicGenre(id: String): MusicGenreFeed = js.native
    def musicGenre(id: String, product: IgAppModule): MusicGenreFeed = js.native
    def musicGenre(id: Double): MusicGenreFeed = js.native
    def musicGenre(id: Double, product: IgAppModule): MusicGenreFeed = js.native
    def musicMood(id: String): MusicMoodFeed = js.native
    def musicMood(id: String, product: IgAppModule): MusicMoodFeed = js.native
    def musicMood(id: Double): MusicMoodFeed = js.native
    def musicMood(id: Double, product: IgAppModule): MusicMoodFeed = js.native
    def musicSearch(query: String): MusicSearchFeed = js.native
    def musicSearch(query: String, product: IgAppModule): MusicSearchFeed = js.native
    def musicTrending(): MusicTrendingFeed = js.native
    def musicTrending(product: IgAppModule): MusicTrendingFeed = js.native
    def news(): NewsFeed = js.native
    def pendingFriendships(): PendingFriendshipsFeed = js.native
    def postsInsightsFeed(options: PostsInsightsFeedOptions): PostsInsightsFeed = js.native
    def reelsMedia(options: AnonSource): ReelsMediaFeed = js.native
    def reelsTray(): ReelsTrayFeed = js.native
    @JSName("reelsTray")
    def reelsTray_coldstart(reason: cold_start): ReelsTrayFeed = js.native
    @JSName("reelsTray")
    def reelsTray_pulltorefresh(reason: pull_to_refresh): ReelsTrayFeed = js.native
    def saved(): SavedFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_ONEDAY(timeframe: ONE_DAY): StoriesInsightsFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_ONEWEEK(timeframe: ONE_WEEK): StoriesInsightsFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_TWOWEEKS(timeframe: TWO_WEEKS): StoriesInsightsFeed = js.native
    def storyPollVoters(mediaId: String, stickerId: String): MediaStickerResponsesFeed[StoryPollVotersFeedResponseRootObject, StoryPollVotersFeedResponseVotersItem] = js.native
    def storyPollVoters(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[StoryPollVotersFeedResponseRootObject, StoryPollVotersFeedResponseVotersItem] = js.native
    def storyQuestionResponses(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StoryQuestionResponsesFeedResponseRootObject, 
        StoryQuestionResponsesFeedResponseRespondersItem
      ] = js.native
    def storyQuestionResponses(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StoryQuestionResponsesFeedResponseRootObject, 
        StoryQuestionResponsesFeedResponseRespondersItem
      ] = js.native
    def storyQuizParticipants(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StoryQuizParticipantsFeedResponseRootObject, 
        StoryQuizParticipantsFeedResponseParticipantsItem
      ] = js.native
    def storyQuizParticipants(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StoryQuizParticipantsFeedResponseRootObject, 
        StoryQuizParticipantsFeedResponseParticipantsItem
      ] = js.native
    def storySliderVoters(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StorySliderVotersFeedResponseResponseRootObject, 
        StorySliderVotersFeedResponseResponseVotersItem
      ] = js.native
    def storySliderVoters(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StorySliderVotersFeedResponseResponseRootObject, 
        StorySliderVotersFeedResponseResponseVotersItem
      ] = js.native
    def tag(tag: String): TagFeed = js.native
    def tags(tag: String): TagsFeed = js.native
    @JSName("tags")
    def tags_places(tag: String, tab: places): TagsFeed = js.native
    @JSName("tags")
    def tags_recent(tag: String, tab: recent): TagsFeed = js.native
    @JSName("tags")
    def tags_top(tag: String, tab: top): TagsFeed = js.native
    def timeline(): TimelineFeed = js.native
    def timeline(reason: TimelineFeedReason): TimelineFeed = js.native
    def user(id: String): UserFeed = js.native
    def user(id: Double): UserFeed = js.native
    def userStory(userId: String): UserStoryFeed = js.native
    def userStory(userId: Double): UserStoryFeed = js.native
    def usertags(id: String): UsertagsFeed = js.native
    def usertags(id: Double): UsertagsFeed = js.native
  }
  
}

