package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.groupIdstringnumberPagina
import typingsJapgolly.gitlab.anon.groupIdstringnumberlevelN
import typingsJapgolly.gitlab.anon.projectIdstringnumberPagi
import typingsJapgolly.gitlab.anon.projectIdstringnumberleve
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesNotificationSettingsMod {
  
  @JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
  @js.native
  open class NotificationSettings () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdGroupIdOptions: groupIdstringnumberPagina): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def edit(hasProjectIdGroupIdOptions: groupIdstringnumberlevelN): js.Promise[js.Object] = js.native
    def edit(hasProjectIdGroupIdOptions: projectIdstringnumberleve): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gitlab.gitlabStrings.disabled
    - typingsJapgolly.gitlab.gitlabStrings.participating
    - typingsJapgolly.gitlab.gitlabStrings.watch
    - typingsJapgolly.gitlab.gitlabStrings.global
    - typingsJapgolly.gitlab.gitlabStrings.mention
    - typingsJapgolly.gitlab.gitlabStrings.custom
  */
  trait NotificationSettingLevel extends StObject
  object NotificationSettingLevel {
    
    inline def custom: typingsJapgolly.gitlab.gitlabStrings.custom = "custom".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.custom]
    
    inline def disabled: typingsJapgolly.gitlab.gitlabStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.disabled]
    
    inline def global: typingsJapgolly.gitlab.gitlabStrings.global = "global".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.global]
    
    inline def mention: typingsJapgolly.gitlab.gitlabStrings.mention = "mention".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.mention]
    
    inline def participating: typingsJapgolly.gitlab.gitlabStrings.participating = "participating".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.participating]
    
    inline def watch: typingsJapgolly.gitlab.gitlabStrings.watch = "watch".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.watch]
  }
}
