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

object distTypesCoreServicesUserKeysMod {
  
  @JSImport("gitlab/dist/types/core/services/UserKeys", "UserKeys")
  @js.native
  open class UserKeys () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def create(title: Any, key: Any): js.Promise[js.Object] = js.native
    def create(title: Any, key: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def remove(keyId: Any): js.Promise[js.Object] = js.native
    def remove(keyId: Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(keyId: Any): js.Promise[GetResponse] = js.native
    def show(keyId: Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
