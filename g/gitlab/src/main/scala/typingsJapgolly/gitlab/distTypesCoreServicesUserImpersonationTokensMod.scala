package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesUserImpersonationTokensMod {
  
  @JSImport("gitlab/dist/types/core/services/UserImpersonationTokens", "UserImpersonationTokens")
  @js.native
  open class UserImpersonationTokens () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String): js.Promise[js.Object] = js.native
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(userId: Double): js.Promise[GetResponse] = js.native
    def all(userId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def revoke(userId: Double, tokenId: Double): js.Promise[js.Object] = js.native
    def revoke(userId: Double, tokenId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(userId: Double, tokenId: Double): js.Promise[GetResponse] = js.native
    def show(userId: Double, tokenId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gitlab.gitlabStrings.api
    - typingsJapgolly.gitlab.gitlabStrings.read_user
  */
  trait ImpersonationTokenScope extends StObject
  object ImpersonationTokenScope {
    
    inline def api: typingsJapgolly.gitlab.gitlabStrings.api = "api".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.api]
    
    inline def read_user: typingsJapgolly.gitlab.gitlabStrings.read_user = "read_user".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.read_user]
  }
}
