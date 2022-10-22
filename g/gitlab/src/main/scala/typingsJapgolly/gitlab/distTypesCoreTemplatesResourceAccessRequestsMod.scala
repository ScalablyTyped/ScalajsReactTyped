package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.accessLevelAccessLevelund
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreTemplatesResourceAccessRequestsMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceAccessRequests", "ResourceAccessRequests")
  @js.native
  open class ResourceAccessRequests protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    
    def approve(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def approve(resourceId: String, userId: Double, hasAccessLevel: accessLevelAccessLevelund): js.Promise[js.Object] = js.native
    def approve(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    def approve(resourceId: Double, userId: Double, hasAccessLevel: accessLevelAccessLevelund): js.Promise[js.Object] = js.native
    
    def deny(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def deny(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    
    def request(resourceId: String): js.Promise[js.Object] = js.native
    def request(resourceId: Double): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gitlab.gitlabInts.`10`
    - typingsJapgolly.gitlab.gitlabInts.`20`
    - typingsJapgolly.gitlab.gitlabInts.`30`
    - typingsJapgolly.gitlab.gitlabInts.`40`
    - typingsJapgolly.gitlab.gitlabInts.`50`
  */
  trait AccessLevel extends StObject
  object AccessLevel {
    
    inline def `10`: typingsJapgolly.gitlab.gitlabInts.`10` = 10.asInstanceOf[typingsJapgolly.gitlab.gitlabInts.`10`]
    
    inline def `20`: typingsJapgolly.gitlab.gitlabInts.`20` = 20.asInstanceOf[typingsJapgolly.gitlab.gitlabInts.`20`]
    
    inline def `30`: typingsJapgolly.gitlab.gitlabInts.`30` = 30.asInstanceOf[typingsJapgolly.gitlab.gitlabInts.`30`]
    
    inline def `40`: typingsJapgolly.gitlab.gitlabInts.`40` = 40.asInstanceOf[typingsJapgolly.gitlab.gitlabInts.`40`]
    
    inline def `50`: typingsJapgolly.gitlab.gitlabInts.`50` = 50.asInstanceOf[typingsJapgolly.gitlab.gitlabInts.`50`]
  }
}
