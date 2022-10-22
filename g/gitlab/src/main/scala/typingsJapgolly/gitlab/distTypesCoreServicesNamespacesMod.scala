package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.searchstringundefinedSudo
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesNamespacesMod {
  
  @JSImport("gitlab/dist/types/core/services/Namespaces", "Namespaces")
  @js.native
  open class Namespaces () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def show(namespaceId: String): js.Promise[GetResponse] = js.native
    def show(namespaceId: String, options: searchstringundefinedSudo): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double, options: searchstringundefinedSudo): js.Promise[GetResponse] = js.native
  }
}
