package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.projectIdstringnumberunde
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesPagesDomainsMod {
  
  @JSImport("gitlab/dist/types/core/services/PagesDomains", "PagesDomains")
  @js.native
  open class PagesDomains () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdOptions: projectIdstringnumberunde): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, domain: String): js.Promise[js.Object] = js.native
    def create(projectId: String, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, domain: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, domain: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, domain: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, domain: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, domain: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, domain: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, domain: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, domain: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, domain: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, domain: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, domain: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
