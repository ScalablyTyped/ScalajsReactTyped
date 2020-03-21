package typingsJapgolly.vsoNodeApi

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.formInputInterfacesMod.InputValuesQuery
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.AgentArtifactDefinition
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ApprovalFilters
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ApprovalStatus
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ApprovalType
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.Artifact
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ArtifactTypeDefinition
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ArtifactVersionQueryResult
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.AutoTriggerIssue
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.Change
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.DefinitionEnvironmentReference
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.Deployment
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.DeploymentQueryParameters
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.DeploymentStatus
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.FavoriteItem
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.Folder
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.FolderPathQueryOrder
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.MailMessage
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ManualIntervention
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ManualInterventionUpdateMetadata
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.Metric
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ProjectReference
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.Release
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseApproval
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinition
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionRevision
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSummary
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionUndeleteParameter
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseEnvironment
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseEnvironmentUpdateMetadata
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseExpands
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseQueryOrder
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseRevision
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseSettings
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseStartMetadata
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseStatus
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseTask
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseTaskAttachment
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseUpdateMetadata
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.ReleaseWorkItemRef
import typingsJapgolly.vsoNodeApi.releaseInterfacesMod.SummaryMailSection
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ReleaseApi", JSImport.Namespace)
@js.native
object releaseApiMod extends js.Object {
  @js.native
  trait IReleaseApi extends ClientApiBase {
    def addDefinitionTag(project: String, releaseDefinitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    def addDefinitionTags(tags: js.Array[String], project: String, releaseDefinitionId: Double): js.Promise[js.Array[String]] = js.native
    def addReleaseTag(project: String, releaseId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    def addReleaseTags(tags: js.Array[String], project: String, releaseId: Double): js.Promise[js.Array[String]] = js.native
    def createDefinitionEnvironmentTemplate(template: ReleaseDefinitionEnvironmentTemplate, project: String): js.Promise[ReleaseDefinitionEnvironmentTemplate] = js.native
    def createFavorites(favoriteItems: js.Array[FavoriteItem], project: String, scope: String): js.Promise[js.Array[FavoriteItem]] = js.native
    def createFavorites(favoriteItems: js.Array[FavoriteItem], project: String, scope: String, identityId: String): js.Promise[js.Array[FavoriteItem]] = js.native
    def createFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
    def createRelease(releaseStartMetadata: ReleaseStartMetadata, project: String): js.Promise[Release] = js.native
    def createReleaseDefinition(releaseDefinition: ReleaseDefinition, project: String): js.Promise[ReleaseDefinition] = js.native
    def deleteDefinitionEnvironmentTemplate(project: String, templateId: String): js.Promise[Unit] = js.native
    def deleteDefinitionTag(project: String, releaseDefinitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    def deleteFavorites(project: String, scope: String): js.Promise[Unit] = js.native
    def deleteFavorites(project: String, scope: String, identityId: String): js.Promise[Unit] = js.native
    def deleteFavorites(project: String, scope: String, identityId: String, favoriteItemIds: String): js.Promise[Unit] = js.native
    def deleteFolder(project: String, path: String): js.Promise[Unit] = js.native
    def deleteRelease(project: String, releaseId: Double): js.Promise[Unit] = js.native
    def deleteRelease(project: String, releaseId: Double, comment: String): js.Promise[Unit] = js.native
    def deleteReleaseDefinition(project: String, definitionId: Double): js.Promise[Unit] = js.native
    def deleteReleaseDefinition(project: String, definitionId: Double, comment: String): js.Promise[Unit] = js.native
    def deleteReleaseDefinition(project: String, definitionId: Double, comment: String, forceDelete: Boolean): js.Promise[Unit] = js.native
    def deleteReleaseTag(project: String, releaseId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    def getAgentArtifactDefinitions(project: String, releaseId: Double): js.Promise[js.Array[AgentArtifactDefinition]] = js.native
    def getApproval(project: String, approvalId: Double): js.Promise[ReleaseApproval] = js.native
    def getApproval(project: String, approvalId: Double, includeHistory: Boolean): js.Promise[ReleaseApproval] = js.native
    def getApprovalHistory(project: String, approvalStepId: Double): js.Promise[ReleaseApproval] = js.native
    def getApprovals(
      project: String,
      assignedToFilter: js.UndefOr[String],
      statusFilter: js.UndefOr[ApprovalStatus],
      releaseIdsFilter: js.UndefOr[js.Array[Double]],
      typeFilter: js.UndefOr[ApprovalType],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[Double],
      queryOrder: js.UndefOr[ReleaseQueryOrder],
      includeMyGroupApprovals: js.UndefOr[Boolean]
    ): js.Promise[js.Array[ReleaseApproval]] = js.native
    def getArtifactTypeDefinitions(project: String): js.Promise[js.Array[ArtifactTypeDefinition]] = js.native
    def getArtifactVersions(project: String, releaseDefinitionId: Double): js.Promise[ArtifactVersionQueryResult] = js.native
    def getArtifactVersionsForSources(artifacts: js.Array[Artifact], project: String): js.Promise[ArtifactVersionQueryResult] = js.native
    def getAutoTriggerIssues(artifactType: String, sourceId: String, artifactVersionId: String): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    def getAutoTriggerIssues(artifactType: String, sourceId: String, artifactVersionId: String, project: String): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    def getDefinitionEnvironmentTemplate(project: String, templateId: String): js.Promise[ReleaseDefinitionEnvironmentTemplate] = js.native
    def getDefinitionEnvironments(project: String): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    def getDefinitionEnvironments(project: String, taskGroupId: String): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    def getDefinitionEnvironments(project: String, taskGroupId: String, propertyFilters: js.Array[String]): js.Promise[js.Array[DefinitionEnvironmentReference]] = js.native
    def getDefinitionRevision(project: String, definitionId: Double, revision: Double): js.Promise[ReadableStream] = js.native
    def getDefinitionTags(project: String, releaseDefinitionId: Double): js.Promise[js.Array[String]] = js.native
    def getDeploymentBadge(projectId: String, releaseDefinitionId: Double, environmentId: Double): js.Promise[String] = js.native
    def getDeploymentBadge(projectId: String, releaseDefinitionId: Double, environmentId: Double, branchName: String): js.Promise[String] = js.native
    def getDeployments(
      project: String,
      definitionId: js.UndefOr[Double],
      definitionEnvironmentId: js.UndefOr[Double],
      createdBy: js.UndefOr[String],
      minModifiedTime: js.UndefOr[js.Date],
      maxModifiedTime: js.UndefOr[js.Date],
      deploymentStatus: js.UndefOr[DeploymentStatus],
      operationStatus: js.UndefOr[DeploymentOperationStatus],
      latestAttemptsOnly: js.UndefOr[Boolean],
      queryOrder: js.UndefOr[ReleaseQueryOrder],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[Double],
      createdFor: js.UndefOr[String]
    ): js.Promise[js.Array[Deployment]] = js.native
    def getDeploymentsForMultipleEnvironments(queryParameters: DeploymentQueryParameters, project: String): js.Promise[js.Array[Deployment]] = js.native
    def getFavorites(project: String, scope: String): js.Promise[js.Array[FavoriteItem]] = js.native
    def getFavorites(project: String, scope: String, identityId: String): js.Promise[js.Array[FavoriteItem]] = js.native
    def getFolders(project: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String, queryOrder: FolderPathQueryOrder): js.Promise[js.Array[Folder]] = js.native
    def getGateLog(project: String, releaseId: Double, environmentId: Double, gateId: Double, taskId: Double): js.Promise[ReadableStream] = js.native
    def getInputValues(query: InputValuesQuery, project: String): js.Promise[InputValuesQuery] = js.native
    def getIssues(project: String, buildId: Double): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    def getIssues(project: String, buildId: Double, sourceId: String): js.Promise[js.Array[AutoTriggerIssue]] = js.native
    def getLog(project: String, releaseId: Double, environmentId: Double, taskId: Double): js.Promise[ReadableStream] = js.native
    def getLog(project: String, releaseId: Double, environmentId: Double, taskId: Double, attemptId: Double): js.Promise[ReadableStream] = js.native
    def getLogs(project: String, releaseId: Double): js.Promise[ReadableStream] = js.native
    def getManualIntervention(project: String, releaseId: Double, manualInterventionId: Double): js.Promise[ManualIntervention] = js.native
    def getManualInterventions(project: String, releaseId: Double): js.Promise[js.Array[ManualIntervention]] = js.native
    def getMetrics(project: String): js.Promise[js.Array[Metric]] = js.native
    def getMetrics(project: String, minMetricsTime: js.Date): js.Promise[js.Array[Metric]] = js.native
    def getRelease(project: String, releaseId: Double): js.Promise[Release] = js.native
    def getRelease(project: String, releaseId: Double, approvalFilters: ApprovalFilters): js.Promise[Release] = js.native
    def getRelease(
      project: String,
      releaseId: Double,
      approvalFilters: ApprovalFilters,
      propertyFilters: js.Array[String]
    ): js.Promise[Release] = js.native
    def getReleaseChanges(project: String, releaseId: Double): js.Promise[js.Array[Change]] = js.native
    def getReleaseChanges(project: String, releaseId: Double, baseReleaseId: Double): js.Promise[js.Array[Change]] = js.native
    def getReleaseChanges(project: String, releaseId: Double, baseReleaseId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
    def getReleaseDefinition(project: String, definitionId: Double): js.Promise[ReleaseDefinition] = js.native
    def getReleaseDefinition(project: String, definitionId: Double, propertyFilters: js.Array[String]): js.Promise[ReleaseDefinition] = js.native
    def getReleaseDefinitionHistory(project: String, definitionId: Double): js.Promise[js.Array[ReleaseDefinitionRevision]] = js.native
    def getReleaseDefinitionRevision(project: String, definitionId: Double, revision: Double): js.Promise[ReadableStream] = js.native
    def getReleaseDefinitionSummary(project: String, definitionId: Double, releaseCount: Double): js.Promise[ReleaseDefinitionSummary] = js.native
    def getReleaseDefinitionSummary(project: String, definitionId: Double, releaseCount: Double, includeArtifact: Boolean): js.Promise[ReleaseDefinitionSummary] = js.native
    def getReleaseDefinitionSummary(
      project: String,
      definitionId: Double,
      releaseCount: Double,
      includeArtifact: Boolean,
      definitionEnvironmentIdsFilter: js.Array[Double]
    ): js.Promise[ReleaseDefinitionSummary] = js.native
    def getReleaseDefinitions(
      project: String,
      searchText: js.UndefOr[String],
      expand: js.UndefOr[ReleaseDefinitionExpands],
      artifactType: js.UndefOr[String],
      artifactSourceId: js.UndefOr[String],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String],
      queryOrder: js.UndefOr[ReleaseDefinitionQueryOrder],
      path: js.UndefOr[String],
      isExactNameMatch: js.UndefOr[Boolean],
      tagFilter: js.UndefOr[js.Array[String]],
      propertyFilters: js.UndefOr[js.Array[String]],
      definitionIdFilter: js.UndefOr[js.Array[String]],
      isDeleted: js.UndefOr[Boolean]
    ): js.Promise[js.Array[ReleaseDefinition]] = js.native
    def getReleaseEnvironment(project: String, releaseId: Double, environmentId: Double): js.Promise[ReleaseEnvironment] = js.native
    def getReleaseHistory(project: String, releaseId: Double): js.Promise[js.Array[ReleaseRevision]] = js.native
    def getReleaseProjects(artifactType: String, artifactSourceId: String): js.Promise[js.Array[ProjectReference]] = js.native
    def getReleaseRevision(project: String, releaseId: Double, definitionSnapshotRevision: Double): js.Promise[ReadableStream] = js.native
    def getReleaseSettings(project: String): js.Promise[ReleaseSettings] = js.native
    def getReleaseTags(project: String, releaseId: Double): js.Promise[js.Array[String]] = js.native
    def getReleaseWorkItemsRefs(project: String, releaseId: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    def getReleaseWorkItemsRefs(project: String, releaseId: Double, baseReleaseId: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    def getReleaseWorkItemsRefs(project: String, releaseId: Double, baseReleaseId: Double, top: Double): js.Promise[js.Array[ReleaseWorkItemRef]] = js.native
    def getReleases(
      project: js.UndefOr[String],
      definitionId: js.UndefOr[Double],
      definitionEnvironmentId: js.UndefOr[Double],
      searchText: js.UndefOr[String],
      createdBy: js.UndefOr[String],
      statusFilter: js.UndefOr[ReleaseStatus],
      environmentStatusFilter: js.UndefOr[Double],
      minCreatedTime: js.UndefOr[js.Date],
      maxCreatedTime: js.UndefOr[js.Date],
      queryOrder: js.UndefOr[ReleaseQueryOrder],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[Double],
      expand: js.UndefOr[ReleaseExpands],
      artifactTypeId: js.UndefOr[String],
      sourceId: js.UndefOr[String],
      artifactVersionId: js.UndefOr[String],
      sourceBranchFilter: js.UndefOr[String],
      isDeleted: js.UndefOr[Boolean],
      tagFilter: js.UndefOr[js.Array[String]],
      propertyFilters: js.UndefOr[js.Array[String]],
      releaseIdFilter: js.UndefOr[js.Array[Double]]
    ): js.Promise[js.Array[Release]] = js.native
    def getSourceBranches(project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
    def getSummaryMailSections(project: String, releaseId: Double): js.Promise[js.Array[SummaryMailSection]] = js.native
    def getTags(project: String): js.Promise[js.Array[String]] = js.native
    def getTaskAttachmentContent(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[ReadableStream] = js.native
    def getTaskAttachments(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      `type`: String
    ): js.Promise[js.Array[ReleaseTaskAttachment]] = js.native
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double,
      startLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog(
      project: String,
      releaseId: Double,
      environmentId: Double,
      releaseDeployPhaseId: Double,
      taskId: Double,
      startLine: Double,
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double,
      startLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTaskLog2(
      project: String,
      releaseId: Double,
      environmentId: Double,
      attemptId: Double,
      timelineId: String,
      taskId: Double,
      startLine: Double,
      endLine: Double
    ): js.Promise[ReadableStream] = js.native
    def getTasks(project: String, releaseId: Double, environmentId: Double): js.Promise[js.Array[ReleaseTask]] = js.native
    def getTasks(project: String, releaseId: Double, environmentId: Double, attemptId: Double): js.Promise[js.Array[ReleaseTask]] = js.native
    def getTasks2(project: String, releaseId: Double, environmentId: Double, attemptId: Double, timelineId: String): js.Promise[js.Array[ReleaseTask]] = js.native
    def getTasksForTaskGroup(project: String, releaseId: Double, environmentId: Double, releaseDeployPhaseId: Double): js.Promise[js.Array[ReleaseTask]] = js.native
    def listDefinitionEnvironmentTemplates(project: String): js.Promise[js.Array[ReleaseDefinitionEnvironmentTemplate]] = js.native
    def listDefinitionEnvironmentTemplates(project: String, isDeleted: Boolean): js.Promise[js.Array[ReleaseDefinitionEnvironmentTemplate]] = js.native
    def sendSummaryMail(mailMessage: MailMessage, project: String, releaseId: Double): js.Promise[Unit] = js.native
    def undeleteRelease(project: String, releaseId: Double, comment: String): js.Promise[Unit] = js.native
    def undeleteReleaseDefinition(
      releaseDefinitionUndeleteParameter: ReleaseDefinitionUndeleteParameter,
      project: String,
      definitionId: Double
    ): js.Promise[ReleaseDefinition] = js.native
    def undeleteReleaseDefinitionEnvironmentTemplate(project: String, templateId: String): js.Promise[ReleaseDefinitionEnvironmentTemplate] = js.native
    def updateFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
    def updateManualIntervention(
      manualInterventionUpdateMetadata: ManualInterventionUpdateMetadata,
      project: String,
      releaseId: Double,
      manualInterventionId: Double
    ): js.Promise[ManualIntervention] = js.native
    def updateRelease(release: Release, project: String, releaseId: Double): js.Promise[Release] = js.native
    def updateReleaseApproval(approval: ReleaseApproval, project: String, approvalId: Double): js.Promise[ReleaseApproval] = js.native
    def updateReleaseApprovals(approvals: js.Array[ReleaseApproval], project: String): js.Promise[js.Array[ReleaseApproval]] = js.native
    def updateReleaseDefinition(releaseDefinition: ReleaseDefinition, project: String): js.Promise[ReleaseDefinition] = js.native
    def updateReleaseEnvironment(
      environmentUpdateData: ReleaseEnvironmentUpdateMetadata,
      project: String,
      releaseId: Double,
      environmentId: Double
    ): js.Promise[ReleaseEnvironment] = js.native
    def updateReleaseResource(releaseUpdateMetadata: ReleaseUpdateMetadata, project: String, releaseId: Double): js.Promise[Release] = js.native
    def updateReleaseSettings(releaseSettings: ReleaseSettings, project: String): js.Promise[ReleaseSettings] = js.native
  }
  
  @js.native
  class ReleaseApi protected () extends IReleaseApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  /* static members */
  @js.native
  object ReleaseApi extends js.Object {
    val RESOURCE_AREA_ID: String = js.native
  }
  
}

