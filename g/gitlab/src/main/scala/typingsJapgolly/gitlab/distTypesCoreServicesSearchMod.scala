package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.projectIdstringnumberundeGroupId
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesSearchMod {
  
  @JSImport("gitlab/dist/types/core/services/Search", "Search")
  @js.native
  open class Search () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(scope: String, search: String, hasProjectIdGroupIdOptions: projectIdstringnumberundeGroupId): js.Promise[GetResponse] = js.native
  }
}
