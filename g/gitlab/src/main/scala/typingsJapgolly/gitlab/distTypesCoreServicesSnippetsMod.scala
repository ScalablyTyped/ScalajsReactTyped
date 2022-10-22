package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.publicbooleanPaginatedReq
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesSnippetsMod {
  
  @JSImport("gitlab/dist/types/core/services/Snippets", "Snippets")
  @js.native
  open class Snippets () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasPOptions: publicbooleanPaginatedReq): js.Promise[GetResponse] = js.native
    
    def content(snippetId: Double): js.Promise[GetResponse] = js.native
    def content(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      title: String,
      fileName: String,
      content: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(snippetId: Double): js.Promise[js.Object] = js.native
    def edit(snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(snippetId: Double): js.Promise[js.Object] = js.native
    def remove(snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(snippetId: Double): js.Promise[GetResponse] = js.native
    def show(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def userAgentDetails(snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gitlab.gitlabStrings.`private`
    - typingsJapgolly.gitlab.gitlabStrings.public
    - typingsJapgolly.gitlab.gitlabStrings.internal
  */
  trait SnippetVisibility extends StObject
  object SnippetVisibility {
    
    inline def internal: typingsJapgolly.gitlab.gitlabStrings.internal = "internal".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.internal]
    
    inline def `private`: typingsJapgolly.gitlab.gitlabStrings.`private` = "private".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`private`]
    
    inline def public: typingsJapgolly.gitlab.gitlabStrings.public = "public".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.public]
  }
}
