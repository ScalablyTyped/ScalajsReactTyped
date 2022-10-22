package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.interfacesCommonOperationsInterfacesMod.OperationReference
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.JsonPatchDocument
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.TeamMember
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ConnectedServiceKind
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.IdentityData
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.Process
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ProjectInfo
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ProjectProperty
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.Proxy
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.TeamProject
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectCollection
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectCollectionReference
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.WebApiConnectedService
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.WebApiConnectedServiceDetails
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.WebApiTeam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreApiMod {
  
  @JSImport("vso-node-api/CoreApi", "CoreApi")
  @js.native
  open class CoreApi protected () extends ICoreApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object CoreApi {
    
    @JSImport("vso-node-api/CoreApi", "CoreApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
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
    def getAllTeams(mine: Boolean, top: Unit, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Unit, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Unit, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Unit, top: Unit, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    
    def getConnectedServiceDetails(projectId: String, name: String): js.Promise[WebApiConnectedServiceDetails] = js.native
    
    def getConnectedServices(projectId: String): js.Promise[js.Array[WebApiConnectedService]] = js.native
    def getConnectedServices(projectId: String, kind: ConnectedServiceKind): js.Promise[js.Array[WebApiConnectedService]] = js.native
    
    def getIdentityMru(mruName: String): js.Promise[js.Array[IdentityRef]] = js.native
    
    def getProcessById(processId: String): js.Promise[Process] = js.native
    
    def getProcesses(): js.Promise[js.Array[Process]] = js.native
    
    def getProject(projectId: String): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Boolean): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Boolean, includeHistory: Boolean): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Unit, includeHistory: Boolean): js.Promise[TeamProject] = js.native
    
    def getProjectCollection(collectionId: String): js.Promise[TeamProjectCollection] = js.native
    
    def getProjectCollections(): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Double, skip: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Unit, skip: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    
    def getProjectHistoryEntries(): js.Promise[js.Array[ProjectInfo]] = js.native
    def getProjectHistoryEntries(minRevision: Double): js.Promise[js.Array[ProjectInfo]] = js.native
    
    def getProjectProperties(projectId: String): js.Promise[js.Array[ProjectProperty]] = js.native
    def getProjectProperties(projectId: String, keys: js.Array[String]): js.Promise[js.Array[ProjectProperty]] = js.native
    
    def getProjects(): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Double, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Double, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Double, skip: Unit, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Unit, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Unit, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Any, top: Unit, skip: Unit, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Double, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Double, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Double, skip: Unit, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Unit, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Unit, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: Unit, top: Unit, skip: Unit, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    
    def getProxies(): js.Promise[js.Array[Proxy]] = js.native
    def getProxies(proxyUrl: String): js.Promise[js.Array[Proxy]] = js.native
    
    def getTeam(projectId: String, teamId: String): js.Promise[WebApiTeam] = js.native
    
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Double): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Double, skip: Double): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Unit, skip: Double): js.Promise[js.Array[TeamMember]] = js.native
    
    def getTeams(projectId: String): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Unit, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Unit, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Unit, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Unit, top: Unit, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    
    def queueCreateProject(projectToCreate: TeamProject): js.Promise[OperationReference] = js.native
    
    def queueDeleteProject(projectId: String): js.Promise[OperationReference] = js.native
    
    def setProjectProperties(customHeaders: Any, projectId: String, patchDocument: JsonPatchDocument): js.Promise[Unit] = js.native
    
    def updateIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    
    def updateProject(projectUpdate: TeamProject, projectId: String): js.Promise[OperationReference] = js.native
    
    def updateTeam(teamData: WebApiTeam, projectId: String, teamId: String): js.Promise[WebApiTeam] = js.native
  }
}
