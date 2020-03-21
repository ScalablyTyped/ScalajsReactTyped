package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.IdentityData
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.Process
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.ProjectInfo
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.ProjectProperty
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.Proxy
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamProject
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamProjectCollection
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamProjectCollectionReference
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.WebApiConnectedService
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.WebApiConnectedServiceDetails
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.WebApiTeam
import typingsJapgolly.vsoNodeApi.operationsInterfacesMod.OperationReference
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.IdentityRef
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.JsonPatchDocument
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.TeamMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/CoreApi", JSImport.Namespace)
@js.native
object coreApiMod extends js.Object {
  @js.native
  class CoreApi protected () extends ICoreApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ICoreApi extends ClientApiBase {
    def createConnectedService(connectedServiceCreationData: WebApiConnectedServiceDetails, projectId: String): js.Promise[WebApiConnectedService] = js.native
    def createIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    def createOrUpdateProxy(proxy: Proxy): js.Promise[Proxy] = js.native
    def createTeam(team: WebApiTeam, projectId: String): js.Promise[WebApiTeam] = js.native
    def deleteIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    def deleteProxy(proxyUrl: String): js.Promise[Unit] = js.native
    def deleteProxy(proxyUrl: String, site: String): js.Promise[Unit] = js.native
    def deleteTeam(projectId: String, teamId: String): js.Promise[Unit] = js.native
    def getAllTeams(): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getConnectedServiceDetails(projectId: String, name: String): js.Promise[WebApiConnectedServiceDetails] = js.native
    def getConnectedServices(projectId: String): js.Promise[js.Array[WebApiConnectedService]] = js.native
    def getConnectedServices(projectId: String, kind: ConnectedServiceKind): js.Promise[js.Array[WebApiConnectedService]] = js.native
    def getIdentityMru(mruName: String): js.Promise[js.Array[IdentityRef]] = js.native
    def getProcessById(processId: String): js.Promise[Process] = js.native
    def getProcesses(): js.Promise[js.Array[Process]] = js.native
    def getProject(projectId: String): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Boolean): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Boolean, includeHistory: Boolean): js.Promise[TeamProject] = js.native
    def getProjectCollection(collectionId: String): js.Promise[TeamProjectCollection] = js.native
    def getProjectCollections(): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Double, skip: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectHistoryEntries(): js.Promise[js.Array[ProjectInfo]] = js.native
    def getProjectHistoryEntries(minRevision: Double): js.Promise[js.Array[ProjectInfo]] = js.native
    def getProjectProperties(projectId: String): js.Promise[js.Array[ProjectProperty]] = js.native
    def getProjectProperties(projectId: String, keys: js.Array[String]): js.Promise[js.Array[ProjectProperty]] = js.native
    def getProjects(): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProxies(): js.Promise[js.Array[Proxy]] = js.native
    def getProxies(proxyUrl: String): js.Promise[js.Array[Proxy]] = js.native
    def getTeam(projectId: String, teamId: String): js.Promise[WebApiTeam] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Double): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Double, skip: Double): js.Promise[js.Array[TeamMember]] = js.native
    def getTeams(projectId: String): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def queueCreateProject(projectToCreate: TeamProject): js.Promise[OperationReference] = js.native
    def queueDeleteProject(projectId: String): js.Promise[OperationReference] = js.native
    def setProjectProperties(customHeaders: js.Any, projectId: String, patchDocument: JsonPatchDocument): js.Promise[Unit] = js.native
    def updateIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    def updateProject(projectUpdate: TeamProject, projectId: String): js.Promise[OperationReference] = js.native
    def updateTeam(teamData: WebApiTeam, projectId: String, teamId: String): js.Promise[WebApiTeam] = js.native
  }
  
  /* static members */
  @js.native
  object CoreApi extends js.Object {
    val RESOURCE_AREA_ID: String = js.native
  }
  
}

