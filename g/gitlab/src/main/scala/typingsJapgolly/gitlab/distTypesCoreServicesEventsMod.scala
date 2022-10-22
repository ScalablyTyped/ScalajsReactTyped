package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.gitlabStrings.closed
import typingsJapgolly.gitlab.gitlabStrings.commented
import typingsJapgolly.gitlab.gitlabStrings.created
import typingsJapgolly.gitlab.gitlabStrings.destroyed
import typingsJapgolly.gitlab.gitlabStrings.expired
import typingsJapgolly.gitlab.gitlabStrings.issue
import typingsJapgolly.gitlab.gitlabStrings.joined
import typingsJapgolly.gitlab.gitlabStrings.left
import typingsJapgolly.gitlab.gitlabStrings.merge_request
import typingsJapgolly.gitlab.gitlabStrings.merged
import typingsJapgolly.gitlab.gitlabStrings.milestone
import typingsJapgolly.gitlab.gitlabStrings.note
import typingsJapgolly.gitlab.gitlabStrings.project
import typingsJapgolly.gitlab.gitlabStrings.pushed
import typingsJapgolly.gitlab.gitlabStrings.reopened
import typingsJapgolly.gitlab.gitlabStrings.snippet
import typingsJapgolly.gitlab.gitlabStrings.updated
import typingsJapgolly.gitlab.gitlabStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesEventsMod {
  
  @JSImport("gitlab/dist/types/core/services/Events", "Events")
  @js.native
  open class Events () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions & EventOptions): js.Promise[GetResponse] = js.native
  }
  
  trait EventOptions extends StObject {
    
    var action: js.UndefOr[
        created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ] = js.undefined
    
    var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    extension [Self <: EventOptions](x: Self) {
      
      inline def setAction(
        value: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTargetType(value: issue | milestone | merge_request | note | project | snippet | user): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
}
