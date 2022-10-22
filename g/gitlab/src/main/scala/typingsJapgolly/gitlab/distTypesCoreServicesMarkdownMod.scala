package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.gfmstringundefinedproject
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesMarkdownMod {
  
  @JSImport("gitlab/dist/types/core/services/Markdown", "Markdown")
  @js.native
  open class Markdown () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def render(text: String): js.Promise[js.Object] = js.native
    def render(text: String, options: gfmstringundefinedproject): js.Promise[js.Object] = js.native
  }
}
