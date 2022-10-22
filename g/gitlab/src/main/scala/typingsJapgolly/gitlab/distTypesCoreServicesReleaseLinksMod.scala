package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.namestringSudo
import typingsJapgolly.gitlab.anon.urlstringSudo
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesReleaseLinksMod {
  
  @JSImport("gitlab/dist/types/core/services/ReleaseLinks", "ReleaseLinks")
  @js.native
  open class ReleaseLinks () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String, tagName: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, tagName: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def all(projectId: Double, tagName: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, tagName: String, name: String, url: String): js.Promise[js.Object] = js.native
    def create(projectId: String, tagName: String, name: String, url: String, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, tagName: String, name: String, url: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, tagName: String, name: String, url: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, tagName: String, linkId: Double, options: namestringSudo | urlstringSudo): js.Promise[js.Object] = js.native
    def edit(projectId: Double, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, tagName: String, linkId: Double, options: namestringSudo | urlstringSudo): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, tagName: String, linkId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, tagName: String, linkId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, tagName: String, linkId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, tagName: String, linkId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, linkId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, linkId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
