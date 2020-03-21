package typingsJapgolly.vsoNodeApi

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamContext
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.JsonPatchDocument
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.AccountMyWorkResult
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.AccountRecentActivityWorkItemModel
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.AccountRecentMentionWorkItemModel
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ArtifactUriQuery
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ArtifactUriQueryResult
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.AttachmentReference
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.CommentSortOrder
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.FieldsToEvaluate
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.GetFieldsExpand
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ProjectWorkItemStateColors
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ProvisioningResult
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.QueryHierarchyItem
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.QueryHierarchyItemsResult
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.QueryOption
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ReportingRevisionsExpand
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.TreeStructureGroup
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.Wiql
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkArtifactLink
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItem
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemClassificationNode
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemComment
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemComments
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemDelete
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemDeleteReference
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemDeleteUpdate
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemErrorPolicy
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemField
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemIcon
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemNextStateOnTransition
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemQueryResult
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemReference
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemRelationType
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemStateColor
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTemplate
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTemplateReference
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemType
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeCategory
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeFieldInstance
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeTemplate
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel
import typingsJapgolly.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WorkItemTrackingApi", JSImport.Namespace)
@js.native
object workItemTrackingApiMod extends js.Object {
  @js.native
  trait IWorkItemTrackingApi extends ClientApiBase {
    def createAttachment(customHeaders: js.Any, contentStream: ReadableStream): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: js.Any, contentStream: ReadableStream, fileName: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: js.Any, contentStream: ReadableStream, fileName: String, uploadType: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: String,
      uploadType: String,
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createOrUpdateClassificationNode(postedNode: WorkItemClassificationNode, project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def createOrUpdateClassificationNode(
      postedNode: WorkItemClassificationNode,
      project: String,
      structureGroup: TreeStructureGroup,
      path: String
    ): js.Promise[WorkItemClassificationNode] = js.native
    def createQuery(postedQuery: QueryHierarchyItem, project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    def createTemplate(template: WorkItemTemplate, teamContext: TeamContext): js.Promise[WorkItemTemplate] = js.native
    def createWorkItem(customHeaders: js.Any, document: JsonPatchDocument, project: String, `type`: String): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String, reclassifyId: Double): js.Promise[Unit] = js.native
    def deleteField(fieldNameOrRefName: String): js.Promise[Unit] = js.native
    def deleteField(fieldNameOrRefName: String, project: String): js.Promise[Unit] = js.native
    def deleteQuery(project: String, query: String): js.Promise[Unit] = js.native
    def deleteTemplate(teamContext: TeamContext, templateId: String): js.Promise[Unit] = js.native
    def deleteWorkItem(id: Double): js.Promise[WorkItemDelete] = js.native
    def deleteWorkItem(id: Double, destroy: Boolean): js.Promise[WorkItemDelete] = js.native
    def destroyWorkItem(id: Double): js.Promise[Unit] = js.native
    def destroyWorkItem(id: Double, project: String): js.Promise[Unit] = js.native
    def evaluateRulesOnField(ruleEngineInput: FieldsToEvaluate): js.Promise[Unit] = js.native
    def exportWorkItemTypeDefinition(): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: String, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def getAccountMyWorkData(): js.Promise[AccountMyWorkResult] = js.native
    def getAccountMyWorkData(queryOption: QueryOption): js.Promise[AccountMyWorkResult] = js.native
    def getAttachmentContent(id: String): js.Promise[ReadableStream] = js.native
    def getAttachmentContent(id: String, fileName: String): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(id: String): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(id: String, fileName: String): js.Promise[ReadableStream] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String, depth: Double): js.Promise[WorkItemClassificationNode] = js.native
    def getComment(id: Double, revision: Double): js.Promise[WorkItemComment] = js.native
    def getComments(id: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Double, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    def getDeletedWorkItem(id: Double): js.Promise[WorkItemDelete] = js.native
    def getDeletedWorkItem(id: Double, project: String): js.Promise[WorkItemDelete] = js.native
    def getDeletedWorkItemReferences(): js.Promise[js.Array[WorkItemReference]] = js.native
    def getDeletedWorkItemReferences(project: String): js.Promise[js.Array[WorkItemReference]] = js.native
    def getDeletedWorkItems(ids: js.Array[Double]): js.Promise[js.Array[WorkItemDeleteReference]] = js.native
    def getDeletedWorkItems(ids: js.Array[Double], project: String): js.Promise[js.Array[WorkItemDeleteReference]] = js.native
    def getField(fieldNameOrRefName: String): js.Promise[WorkItemField] = js.native
    def getField(fieldNameOrRefName: String, project: String): js.Promise[WorkItemField] = js.native
    def getFields(): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: String): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: String, expand: GetFieldsExpand): js.Promise[js.Array[WorkItemField]] = js.native
    def getQueries(project: String): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Double): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Double, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQuery(project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Double): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Double, includeDeleted: Boolean): js.Promise[QueryHierarchyItem] = js.native
    def getRecentActivityData(): js.Promise[js.Array[AccountRecentActivityWorkItemModel]] = js.native
    def getRecentMentions(): js.Promise[js.Array[AccountRecentMentionWorkItemModel]] = js.native
    def getRelationType(relation: String): js.Promise[WorkItemRelationType] = js.native
    def getRelationTypes(): js.Promise[js.Array[WorkItemRelationType]] = js.native
    def getReportingLinks(): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String]): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: String, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getRevision(id: Double, revisionNumber: Double): js.Promise[WorkItem] = js.native
    def getRevision(id: Double, revisionNumber: Double, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getRevisions(id: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Double, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getRootNodes(project: String): js.Promise[js.Array[WorkItemClassificationNode]] = js.native
    def getRootNodes(project: String, depth: Double): js.Promise[js.Array[WorkItemClassificationNode]] = js.native
    def getTemplate(teamContext: TeamContext, templateId: String): js.Promise[WorkItemTemplate] = js.native
    def getTemplates(teamContext: TeamContext): js.Promise[js.Array[WorkItemTemplateReference]] = js.native
    def getTemplates(teamContext: TeamContext, workitemtypename: String): js.Promise[js.Array[WorkItemTemplateReference]] = js.native
    def getUpdate(id: Double, updateNumber: Double): js.Promise[WorkItemUpdate] = js.native
    def getUpdates(id: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Double, skip: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getWorkArtifactLinkTypes(): js.Promise[js.Array[WorkArtifactLink]] = js.native
    def getWorkItem(id: Double): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String]): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: js.Date): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: js.Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItemIconJson(icon: String): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: String): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: String, v: Double): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconSvg(icon: String): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: String): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: String, v: Double): js.Promise[ReadableStream] = js.native
    def getWorkItemIcons(): js.Promise[js.Array[WorkItemIcon]] = js.native
    def getWorkItemNextStatesOnCheckinAction(ids: js.Array[Double]): js.Promise[js.Array[WorkItemNextStateOnTransition]] = js.native
    def getWorkItemNextStatesOnCheckinAction(ids: js.Array[Double], action: String): js.Promise[js.Array[WorkItemNextStateOnTransition]] = js.native
    def getWorkItemStateColors(projectNames: js.Array[String]): js.Promise[js.Array[ProjectWorkItemStateColors]] = js.native
    def getWorkItemTemplate(project: String, `type`: String): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: js.Date): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: js.Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItemType(project: String, `type`: String): js.Promise[WorkItemType] = js.native
    def getWorkItemTypeCategories(project: String): js.Promise[js.Array[WorkItemTypeCategory]] = js.native
    def getWorkItemTypeCategory(project: String, category: String): js.Promise[WorkItemTypeCategory] = js.native
    def getWorkItemTypeColorAndIcons(projectNames: js.Array[String]): js.Promise[js.Array[AnonValue]] = js.native
    def getWorkItemTypeColors(projectNames: js.Array[String]): js.Promise[js.Array[AnonKey]] = js.native
    def getWorkItemTypeField(project: String, `type`: String, field: String): js.Promise[WorkItemTypeFieldInstance] = js.native
    def getWorkItemTypeField(project: String, `type`: String, field: String, expand: WorkItemTypeFieldsExpandLevel): js.Promise[WorkItemTypeFieldInstance] = js.native
    def getWorkItemTypeFields(project: String, `type`: String): js.Promise[js.Array[WorkItemTypeFieldInstance]] = js.native
    def getWorkItemTypeFields(project: String, `type`: String, expand: WorkItemTypeFieldsExpandLevel): js.Promise[js.Array[WorkItemTypeFieldInstance]] = js.native
    def getWorkItemTypeStates(project: String, `type`: String): js.Promise[js.Array[WorkItemStateColor]] = js.native
    def getWorkItemTypes(project: String): js.Promise[js.Array[WorkItemType]] = js.native
    def getWorkItems(ids: js.Array[Double]): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String]): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: js.Date): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: js.Date, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: js.Date,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def queryById(id: String): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: TeamContext): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: TeamContext, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Boolean, top: Double): js.Promise[WorkItemQueryResult] = js.native
    def queryWorkItemsForArtifactUris(artifactUriQuery: ArtifactUriQuery): js.Promise[ArtifactUriQueryResult] = js.native
    def readReportingRevisionsGet(
      project: js.UndefOr[String],
      fields: js.UndefOr[js.Array[String]],
      types: js.UndefOr[js.Array[String]],
      continuationToken: js.UndefOr[String],
      startDateTime: js.UndefOr[js.Date],
      includeIdentityRef: js.UndefOr[Boolean],
      includeDeleted: js.UndefOr[Boolean],
      includeTagRef: js.UndefOr[Boolean],
      includeLatestOnly: js.UndefOr[Boolean],
      expand: js.UndefOr[ReportingRevisionsExpand],
      includeDiscussionChangesOnly: js.UndefOr[Boolean],
      maxPageSize: js.UndefOr[Double]
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: String, continuationToken: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: js.Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: js.Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def replaceTemplate(templateContent: WorkItemTemplate, teamContext: TeamContext, templateId: String): js.Promise[WorkItemTemplate] = js.native
    def restoreWorkItem(payload: WorkItemDeleteUpdate, id: Double): js.Promise[WorkItemDelete] = js.native
    def restoreWorkItem(payload: WorkItemDeleteUpdate, id: Double, project: String): js.Promise[WorkItemDelete] = js.native
    def searchQueries(project: String, filter: String): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: QueryExpand): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: QueryExpand, includeDeleted: Boolean): js.Promise[QueryHierarchyItemsResult] = js.native
    def updateClassificationNode(postedNode: WorkItemClassificationNode, project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def updateClassificationNode(
      postedNode: WorkItemClassificationNode,
      project: String,
      structureGroup: TreeStructureGroup,
      path: String
    ): js.Promise[WorkItemClassificationNode] = js.native
    def updateField(workItemField: WorkItemField, fieldNameOrRefName: String): js.Promise[Unit] = js.native
    def updateField(workItemField: WorkItemField, fieldNameOrRefName: String, project: String): js.Promise[Unit] = js.native
    def updateQuery(queryUpdate: QueryHierarchyItem, project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    def updateQuery(queryUpdate: QueryHierarchyItem, project: String, query: String, undeleteDescendants: Boolean): js.Promise[QueryHierarchyItem] = js.native
    def updateWorkItem(customHeaders: js.Any, document: JsonPatchDocument, id: Double): js.Promise[WorkItem] = js.native
    def updateWorkItem(customHeaders: js.Any, document: JsonPatchDocument, id: Double, validateOnly: Boolean): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItemTypeDefinition(updateModel: WorkItemTypeTemplateUpdateModel): js.Promise[ProvisioningResult] = js.native
    def updateWorkItemTypeDefinition(updateModel: WorkItemTypeTemplateUpdateModel, project: String): js.Promise[ProvisioningResult] = js.native
  }
  
  @js.native
  class WorkItemTrackingApi protected () extends IWorkItemTrackingApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  /* static members */
  @js.native
  object WorkItemTrackingApi extends js.Object {
    val RESOURCE_AREA_ID: String = js.native
  }
  
}

