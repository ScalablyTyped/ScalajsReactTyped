package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.BaseRequestOptions
import typingsJapgolly.gitlab.anon.groupIdstringnumberundefiDictkey
import typingsJapgolly.gitlab.anon.projectIdstringnumberundeDictkey
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesIssuesStatisticsMod {
  
  @JSImport("gitlab/dist/types/core/services/IssuesStatistics", "IssuesStatistics")
  @js.native
  open class IssuesStatistics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(
      hasProjectIdGroupIdOptions: projectIdstringnumberundeDictkey | groupIdstringnumberundefiDictkey | BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
  }
}
