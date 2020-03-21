package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.accountRepositoryMod.AccountRepository
import typingsJapgolly.instagramPrivateApi.addressBookRepositoryMod.AddressBookRepository
import typingsJapgolly.instagramPrivateApi.adsRepositoryMod.AdsRepository
import typingsJapgolly.instagramPrivateApi.attributionRepositoryMod.AttributionRepository
import typingsJapgolly.instagramPrivateApi.challengeRepositoryMod.ChallengeRepository
import typingsJapgolly.instagramPrivateApi.consentRepositoryMod.ConsentRepository
import typingsJapgolly.instagramPrivateApi.creativesRepositoryMod.CreativesRepository
import typingsJapgolly.instagramPrivateApi.directRepositoryMod.DirectRepository
import typingsJapgolly.instagramPrivateApi.directThreadRepositoryMod.DirectThreadRepository
import typingsJapgolly.instagramPrivateApi.discoverRepositoryMod.DiscoverRepository
import typingsJapgolly.instagramPrivateApi.entityFactoryMod.EntityFactory
import typingsJapgolly.instagramPrivateApi.fbsearchRepositoryMod.FbsearchRepository
import typingsJapgolly.instagramPrivateApi.feedFactoryMod.FeedFactory
import typingsJapgolly.instagramPrivateApi.friendshipRepositoryMod.FriendshipRepository
import typingsJapgolly.instagramPrivateApi.highlightsRepositoryMod.HighlightsRepository
import typingsJapgolly.instagramPrivateApi.igtvRepositoryMod.IgtvRepository
import typingsJapgolly.instagramPrivateApi.insightsServiceMod.InsightsService
import typingsJapgolly.instagramPrivateApi.launcherRepositoryMod.LauncherRepository
import typingsJapgolly.instagramPrivateApi.linkedAccountRepositoryMod.LinkedAccountRepository
import typingsJapgolly.instagramPrivateApi.liveRepositoryMod.LiveRepository
import typingsJapgolly.instagramPrivateApi.locationRepositoryMod.LocationRepository
import typingsJapgolly.instagramPrivateApi.locationSearchRepositoryMod.LocationSearch
import typingsJapgolly.instagramPrivateApi.loomRepositoryMod.LoomRepository
import typingsJapgolly.instagramPrivateApi.mediaRepositoryMod.MediaRepository
import typingsJapgolly.instagramPrivateApi.musicRepositoryMod.MusicRepository
import typingsJapgolly.instagramPrivateApi.newsRepositoryMod.NewsRepository
import typingsJapgolly.instagramPrivateApi.publishServiceMod.PublishService
import typingsJapgolly.instagramPrivateApi.qeRepositoryMod.QeRepository
import typingsJapgolly.instagramPrivateApi.qpRepositoryMod.QpRepository
import typingsJapgolly.instagramPrivateApi.requestMod.Request
import typingsJapgolly.instagramPrivateApi.restrictActionRepositoryMod.RestrictActionRepository
import typingsJapgolly.instagramPrivateApi.searchServiceMod.SearchService
import typingsJapgolly.instagramPrivateApi.simulateServiceMod.SimulateService
import typingsJapgolly.instagramPrivateApi.stateMod.State
import typingsJapgolly.instagramPrivateApi.statusRepositoryMod.StatusRepository
import typingsJapgolly.instagramPrivateApi.storyServiceMod.StoryService
import typingsJapgolly.instagramPrivateApi.tagRepositoryMod.TagRepository
import typingsJapgolly.instagramPrivateApi.uploadRepositoryMod.UploadRepository
import typingsJapgolly.instagramPrivateApi.userRepositoryMod.UserRepository
import typingsJapgolly.instagramPrivateApi.zrRepositoryMod.ZrRepository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  @js.native
  class IgApiClient () extends js.Object {
    var account: AccountRepository = js.native
    var addressBook: AddressBookRepository = js.native
    var ads: AdsRepository = js.native
    var attribution: AttributionRepository = js.native
    var challenge: ChallengeRepository = js.native
    var consent: ConsentRepository = js.native
    var creatives: CreativesRepository = js.native
    var direct: DirectRepository = js.native
    var directThread: DirectThreadRepository = js.native
    var discover: DiscoverRepository = js.native
    var entity: EntityFactory = js.native
    var fbsearch: FbsearchRepository = js.native
    var feed: FeedFactory = js.native
    var friendship: FriendshipRepository = js.native
    var highlights: HighlightsRepository = js.native
    var igtv: IgtvRepository = js.native
    var insights: InsightsService = js.native
    var launcher: LauncherRepository = js.native
    var linkedAccount: LinkedAccountRepository = js.native
    var live: LiveRepository = js.native
    var location: LocationRepository = js.native
    var locationSearch: LocationSearch = js.native
    var loom: LoomRepository = js.native
    var media: MediaRepository = js.native
    var music: MusicRepository = js.native
    var news: NewsRepository = js.native
    var publish: PublishService = js.native
    var qe: QeRepository = js.native
    var qp: QpRepository = js.native
    var request: Request = js.native
    var restrictAction: RestrictActionRepository = js.native
    var search: SearchService = js.native
    var simulate: SimulateService = js.native
    var state: State = js.native
    var status: StatusRepository = js.native
    var story: StoryService = js.native
    var tag: TagRepository = js.native
    var upload: UploadRepository = js.native
    var user: UserRepository = js.native
    var zr: ZrRepository = js.native
    def destroy(): Unit = js.native
  }
  
}

