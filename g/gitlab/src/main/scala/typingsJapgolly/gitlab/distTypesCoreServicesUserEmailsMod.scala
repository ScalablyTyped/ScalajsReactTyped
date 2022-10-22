package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.userIdnumberundefinedBase
import typingsJapgolly.gitlab.anon.userIdnumberundefinedPagi
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesUserEmailsMod {
  
  @JSImport("gitlab/dist/types/core/services/UserEmails", "UserEmails")
  @js.native
  open class UserEmails () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(email: Any): js.Promise[js.Object] = js.native
    def add(email: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def remove(emailId: Any): js.Promise[js.Object] = js.native
    def remove(emailId: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(emailId: Any): js.Promise[GetResponse] = js.native
    def show(emailId: Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
