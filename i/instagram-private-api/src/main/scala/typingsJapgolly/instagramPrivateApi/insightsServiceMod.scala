package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.insightsOptionsMod.AccountInsightsOptions
import typingsJapgolly.instagramPrivateApi.insightsServiceAccountResponseMod.InsightsServiceAccountResponseRootObject
import typingsJapgolly.instagramPrivateApi.insightsServicePostResponseMod.InsightsServicePostResponseRootObject
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/insights.service", JSImport.Namespace)
@js.native
object insightsServiceMod extends js.Object {
  @js.native
  class InsightsService () extends Repository {
    def account(options: AccountInsightsOptions): js.Promise[InsightsServiceAccountResponseRootObject] = js.native
    def igtv(mediaId: String): js.Promise[AnonData] = js.native
    def post(mediaId: String): js.Promise[InsightsServicePostResponseRootObject] = js.native
    def story(storyId: String): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
  
}

