package typingsJapgolly.vsoNodeApi

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.AssociatedWorkItem
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcBranch
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcBranchRef
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcChange
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcChangeset
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcChangesetRef
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcChangesetSearchCriteria
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcChangesetsRequestData
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcItem
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcItemRequestData
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcLabel
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcLabelRef
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcLabelRequestData
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcShelveset
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcShelvesetRef
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionDescriptor
import typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod.VersionControlRecursionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfvcApiMod {
  
  @JSImport("vso-node-api/TfvcApi", "TfvcApi")
  @js.native
  open class TfvcApi protected () extends ITfvcApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ITfvcApi extends ClientApiBase {
    
    def createChangeset(changeset: TfvcChangeset): js.Promise[TfvcChangesetRef] = js.native
    def createChangeset(changeset: TfvcChangeset, project: String): js.Promise[TfvcChangesetRef] = js.native
    
    def getBatchedChangesets(changesetsRequestData: TfvcChangesetsRequestData): js.Promise[js.Array[TfvcChangesetRef]] = js.native
    
    def getBranch(path: String): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Boolean, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Unit, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: Unit, includeParent: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: Unit, includeParent: Boolean, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: Unit, includeParent: Unit, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    
    def getBranchRefs(scopePath: String): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Boolean, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: Unit, includeDeleted: Boolean, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: Unit, includeDeleted: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    
    def getBranches(): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Unit, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Unit, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Unit, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Unit, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Unit, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Unit, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    
    def getChangeset(
      id: Double,
      project: js.UndefOr[String],
      maxChangeCount: js.UndefOr[Double],
      includeDetails: js.UndefOr[Boolean],
      includeWorkItems: js.UndefOr[Boolean],
      maxCommentLength: js.UndefOr[Double],
      includeSourceRename: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      orderby: js.UndefOr[String],
      searchCriteria: js.UndefOr[TfvcChangesetSearchCriteria]
    ): js.Promise[TfvcChangeset] = js.native
    
    def getChangesetChanges(): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Double, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Unit, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Unit, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Unit, skip: Double, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Unit, skip: Unit, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    
    def getChangesetWorkItems(): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getChangesetWorkItems(id: Double): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    
    def getChangesets(
      project: js.UndefOr[String],
      maxCommentLength: js.UndefOr[Double],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      orderby: js.UndefOr[String],
      searchCriteria: js.UndefOr[TfvcChangesetSearchCriteria]
    ): js.Promise[js.Array[TfvcChangesetRef]] = js.native
    
    def getItem(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[TfvcItem] = js.native
    
    def getItemContent(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItemText(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItemZip(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItems(): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: Unit, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: Unit, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: String, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: String, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: Unit, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: Unit, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: Unit, recursionLevel: VersionControlRecursionType, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    
    def getItemsBatch(itemRequestData: TfvcItemRequestData): js.Promise[js.Array[js.Array[TfvcItem]]] = js.native
    def getItemsBatch(itemRequestData: TfvcItemRequestData, project: String): js.Promise[js.Array[js.Array[TfvcItem]]] = js.native
    
    def getItemsBatchZip(itemRequestData: TfvcItemRequestData): js.Promise[ReadableStream] = js.native
    def getItemsBatchZip(itemRequestData: TfvcItemRequestData, project: String): js.Promise[ReadableStream] = js.native
    
    def getLabel(labelId: String, requestData: TfvcLabelRequestData): js.Promise[TfvcLabel] = js.native
    def getLabel(labelId: String, requestData: TfvcLabelRequestData, project: String): js.Promise[TfvcLabel] = js.native
    
    def getLabelItems(labelId: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Double): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Double, skip: Double): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Unit, skip: Double): js.Promise[js.Array[TfvcItem]] = js.native
    
    def getLabels(requestData: TfvcLabelRequestData): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Double, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Unit, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: Unit, top: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: Unit, top: Double, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: Unit, top: Unit, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    
    def getShelveset(shelvesetId: String): js.Promise[TfvcShelveset] = js.native
    def getShelveset(shelvesetId: String, requestData: TfvcShelvesetRequestData): js.Promise[TfvcShelveset] = js.native
    
    def getShelvesetChanges(shelvesetId: String): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Double, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Unit, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    
    def getShelvesetWorkItems(shelvesetId: String): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    
    def getShelvesets(): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: Unit, top: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: Unit, top: Double, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: Unit, top: Unit, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Double, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Unit, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
  }
}
