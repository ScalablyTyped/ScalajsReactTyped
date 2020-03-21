package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.projectAnalysisInterfacesMod.AggregationType
import typingsJapgolly.vsoNodeApi.projectAnalysisInterfacesMod.ProjectActivityMetrics
import typingsJapgolly.vsoNodeApi.projectAnalysisInterfacesMod.ProjectLanguageAnalytics
import typingsJapgolly.vsoNodeApi.projectAnalysisInterfacesMod.RepositoryActivityMetrics
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ProjectAnalysisApi", JSImport.Namespace)
@js.native
object projectAnalysisApiMod extends js.Object {
  @js.native
  trait IProjectAnalysisApi extends ClientApiBase {
    def getGitRepositoriesActivityMetrics(project: String, fromDate: js.Date, aggregationType: AggregationType, skip: Double, top: Double): js.Promise[js.Array[RepositoryActivityMetrics]] = js.native
    def getProjectActivityMetrics(project: String, fromDate: js.Date, aggregationType: AggregationType): js.Promise[ProjectActivityMetrics] = js.native
    def getProjectLanguageAnalytics(project: String): js.Promise[ProjectLanguageAnalytics] = js.native
    def getRepositoryActivityMetrics(project: String, repositoryId: String, fromDate: js.Date, aggregationType: AggregationType): js.Promise[RepositoryActivityMetrics] = js.native
  }
  
  @js.native
  class ProjectAnalysisApi protected () extends IProjectAnalysisApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

