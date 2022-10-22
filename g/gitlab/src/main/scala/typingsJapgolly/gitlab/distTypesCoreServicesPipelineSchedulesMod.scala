package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesPipelineSchedulesMod {
  
  @JSImport("gitlab/dist/types/core/services/PipelineSchedules", "PipelineSchedules")
  @js.native
  open class PipelineSchedules () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, description: String, ref: String, cron: String): js.Promise[js.Object] = js.native
    def create(projectId: String, description: String, ref: String, cron: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, description: String, ref: String, cron: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, description: String, ref: String, cron: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, scheduleId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, scheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, scheduleId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, scheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, scheduleId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, scheduleId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, scheduleId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, scheduleId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, scheduleId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, scheduleId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def takeOwnership(projectId: String, scheduleId: Double): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: String, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: Double, scheduleId: Double): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: Double, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
}
