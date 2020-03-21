package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode
import typingsJapgolly.sharepoint.SPClientTemplates.ListSchema
import typingsJapgolly.sharepoint.SPClientTemplates.RenderCallback
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContext
import typingsJapgolly.sharepoint.SPClientTemplates.Templates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextInfo extends RenderContext {
  var AllowCreateFolder: Boolean
  var AllowGridMode: Boolean
  var BasePermissions: js.Any
  var CanShareLinkForNewDocument: Boolean
  var CascadeDeleteWarningMessage: String
  var ContentTypesEnabled: Boolean
  @JSName("CurrentSelectedItems")
  var CurrentSelectedItems_ContextInfo: Boolean
  var CurrentUserId: Double
  var CurrentUserIsSiteAdmin: Boolean
  var EnableMinorVersions: Boolean
  var ExcludeFromOfflineClient: Boolean
  var ExternalDataList: Boolean
  var HasRelatedCascadeLists: Boolean
  var HttpPath: String
  var HttpRoot: String
  var IsAppWeb: Boolean
  var IsClientRendering: Boolean
  var LastRowIndexSelected: Double
  var LastSelectableRowIdx: Double
  var LastSelectedItemIID: Double
  var ListData: js.Any
   // SPClientTemplates.ListData_InView | SPClientTemplates.ListData_InForm
  var ListSchema: typingsJapgolly.sharepoint.SPClientTemplates.ListSchema
  var ListTitle: String
  var ModerationStatus: Double
  var NewWOPIDocumentEnabled: Boolean
  var NewWOPIDocumentUrl: String
  var PortalUrl: String
  var RecycleBinEnabled: Double
  var RowFocusTimerID: Double
  var SelectAllCbx: HTMLElement
  var SendToLocationName: String
  var SendToLocationUrl: String
  var SiteTemplateId: Double
  var SiteTitle: String
  var StateInitDone: Boolean
  var TotalListItems: Double
  var WorkflowsAssociated: Boolean
  var clvp: js.Any
  var ctxId: Double
  var ctxType: js.Any
  var dictSel: js.Any
  var displayFormUrl: String
  var editFormUrl: String
  var imagesPath: String
  var inGridFullRender: Boolean
  var inGridMode: Boolean
  var isForceCheckout: Boolean
  var isModerated: Boolean
  var isPortalTemplate: Boolean
  var isVersions: Boolean
  var isWebEditorPreview: Boolean
  var leavingGridMode: Boolean
  var listBaseType: Double
  var listName: String
  var listTemplate: String
  var listUrlDir: String
  var loadingAsyncData: Boolean
  var newFormUrl: String
  var noGroupCollapse: Boolean
  var overrideDeleteConfirmation: String
  var overrideFilterQstring: String
  var queryString: String
  var recursiveView: Boolean
  var rootFolder: String
  var rootFolderForDisplay: String
  var serverUrl: String
  var verEnabled: Boolean
  var view: String
  var wpq: String
  def TableCbxFocusHandler(instance: js.Any, eventArgs: js.Any): Unit
  def TableMouseoverHandler(instance: js.Any, eventArgs: js.Any): Unit
  @JSName("onRefreshFailed")
  def onRefreshFailed_MContextInfo(context: js.Any, requrest: js.Any, response: js.Any): Unit
}

object ContextInfo {
  @scala.inline
  def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: js.Any,
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentSelectedItems: Boolean,
    CurrentUserId: Double,
    CurrentUserIsSiteAdmin: Boolean,
    EnableMinorVersions: Boolean,
    ExcludeFromOfflineClient: Boolean,
    ExternalDataList: Boolean,
    HasRelatedCascadeLists: Boolean,
    HttpPath: String,
    HttpRoot: String,
    IsAppWeb: Boolean,
    IsClientRendering: Boolean,
    LastRowIndexSelected: Double,
    LastSelectableRowIdx: Double,
    LastSelectedItemIID: Double,
    ListData: js.Any,
    ListSchema: ListSchema,
    ListTitle: String,
    ModerationStatus: Double,
    NewWOPIDocumentEnabled: Boolean,
    NewWOPIDocumentUrl: String,
    PortalUrl: String,
    RecycleBinEnabled: Double,
    RowFocusTimerID: Double,
    SelectAllCbx: HTMLElement,
    SendToLocationName: String,
    SendToLocationUrl: String,
    SiteTemplateId: Double,
    SiteTitle: String,
    StateInitDone: Boolean,
    TableCbxFocusHandler: (js.Any, js.Any) => Callback,
    TableMouseoverHandler: (js.Any, js.Any) => Callback,
    TotalListItems: Double,
    WorkflowsAssociated: Boolean,
    clvp: js.Any,
    ctxId: Double,
    ctxType: js.Any,
    dictSel: js.Any,
    displayFormUrl: String,
    editFormUrl: String,
    imagesPath: String,
    inGridFullRender: Boolean,
    inGridMode: Boolean,
    isForceCheckout: Boolean,
    isModerated: Boolean,
    isPortalTemplate: Boolean,
    isVersions: Boolean,
    isWebEditorPreview: Boolean,
    leavingGridMode: Boolean,
    listBaseType: Double,
    listName: String,
    listTemplate: String,
    listUrlDir: String,
    loadingAsyncData: Boolean,
    newFormUrl: String,
    noGroupCollapse: Boolean,
    onRefreshFailed: (js.Any, js.Any, js.Any) => Callback,
    overrideDeleteConfirmation: String,
    overrideFilterQstring: String,
    queryString: String,
    recursiveView: Boolean,
    rootFolder: String,
    rootFolderForDisplay: String,
    serverUrl: String,
    verEnabled: Boolean,
    view: String,
    wpq: String,
    BaseViewID: Int | Double = null,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: String = null,
    CurrentLanguage: Int | Double = null,
    CurrentUICultureName: String = null,
    ListTemplateType: Int | Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: ContextInfo => CallbackTo[String] = null,
    RenderFieldByName: (ContextInfo, /* fieldName */ String) => CallbackTo[String] = null,
    RenderFields: ContextInfo => CallbackTo[String] = null,
    RenderFooter: ContextInfo => CallbackTo[String] = null,
    RenderGroups: ContextInfo => CallbackTo[String] = null,
    RenderHeader: ContextInfo => CallbackTo[String] = null,
    RenderItems: ContextInfo => CallbackTo[String] = null,
    RenderView: ContextInfo => CallbackTo[String] = null,
    SiteClientTag: String = null,
    Templates: Templates = null
  ): ContextInfo = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder.asInstanceOf[js.Any], AllowGridMode = AllowGridMode.asInstanceOf[js.Any], BasePermissions = BasePermissions.asInstanceOf[js.Any], CanShareLinkForNewDocument = CanShareLinkForNewDocument.asInstanceOf[js.Any], CascadeDeleteWarningMessage = CascadeDeleteWarningMessage.asInstanceOf[js.Any], ContentTypesEnabled = ContentTypesEnabled.asInstanceOf[js.Any], CurrentSelectedItems = CurrentSelectedItems.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin.asInstanceOf[js.Any], EnableMinorVersions = EnableMinorVersions.asInstanceOf[js.Any], ExcludeFromOfflineClient = ExcludeFromOfflineClient.asInstanceOf[js.Any], ExternalDataList = ExternalDataList.asInstanceOf[js.Any], HasRelatedCascadeLists = HasRelatedCascadeLists.asInstanceOf[js.Any], HttpPath = HttpPath.asInstanceOf[js.Any], HttpRoot = HttpRoot.asInstanceOf[js.Any], IsAppWeb = IsAppWeb.asInstanceOf[js.Any], IsClientRendering = IsClientRendering.asInstanceOf[js.Any], LastRowIndexSelected = LastRowIndexSelected.asInstanceOf[js.Any], LastSelectableRowIdx = LastSelectableRowIdx.asInstanceOf[js.Any], LastSelectedItemIID = LastSelectedItemIID.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any], ListTitle = ListTitle.asInstanceOf[js.Any], ModerationStatus = ModerationStatus.asInstanceOf[js.Any], NewWOPIDocumentEnabled = NewWOPIDocumentEnabled.asInstanceOf[js.Any], NewWOPIDocumentUrl = NewWOPIDocumentUrl.asInstanceOf[js.Any], PortalUrl = PortalUrl.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], RowFocusTimerID = RowFocusTimerID.asInstanceOf[js.Any], SelectAllCbx = SelectAllCbx.asInstanceOf[js.Any], SendToLocationName = SendToLocationName.asInstanceOf[js.Any], SendToLocationUrl = SendToLocationUrl.asInstanceOf[js.Any], SiteTemplateId = SiteTemplateId.asInstanceOf[js.Any], SiteTitle = SiteTitle.asInstanceOf[js.Any], StateInitDone = StateInitDone.asInstanceOf[js.Any], TotalListItems = TotalListItems.asInstanceOf[js.Any], WorkflowsAssociated = WorkflowsAssociated.asInstanceOf[js.Any], clvp = clvp.asInstanceOf[js.Any], ctxId = ctxId.asInstanceOf[js.Any], ctxType = ctxType.asInstanceOf[js.Any], dictSel = dictSel.asInstanceOf[js.Any], displayFormUrl = displayFormUrl.asInstanceOf[js.Any], editFormUrl = editFormUrl.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], inGridFullRender = inGridFullRender.asInstanceOf[js.Any], inGridMode = inGridMode.asInstanceOf[js.Any], isForceCheckout = isForceCheckout.asInstanceOf[js.Any], isModerated = isModerated.asInstanceOf[js.Any], isPortalTemplate = isPortalTemplate.asInstanceOf[js.Any], isVersions = isVersions.asInstanceOf[js.Any], isWebEditorPreview = isWebEditorPreview.asInstanceOf[js.Any], leavingGridMode = leavingGridMode.asInstanceOf[js.Any], listBaseType = listBaseType.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], listTemplate = listTemplate.asInstanceOf[js.Any], listUrlDir = listUrlDir.asInstanceOf[js.Any], loadingAsyncData = loadingAsyncData.asInstanceOf[js.Any], newFormUrl = newFormUrl.asInstanceOf[js.Any], noGroupCollapse = noGroupCollapse.asInstanceOf[js.Any], overrideDeleteConfirmation = overrideDeleteConfirmation.asInstanceOf[js.Any], overrideFilterQstring = overrideFilterQstring.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], recursiveView = recursiveView.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], rootFolderForDisplay = rootFolderForDisplay.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], verEnabled = verEnabled.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wpq = wpq.asInstanceOf[js.Any])
    __obj.updateDynamic("TableCbxFocusHandler")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => TableCbxFocusHandler(t0, t1).runNow()))
    __obj.updateDynamic("TableMouseoverHandler")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => TableMouseoverHandler(t0, t1).runNow()))
    __obj.updateDynamic("onRefreshFailed")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => onRefreshFailed(t0, t1, t2).runNow()))
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode.asInstanceOf[js.Any])
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName.asInstanceOf[js.Any])
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName.asInstanceOf[js.Any])
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderBody(t0).runNow()))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.ContextInfo, t1: /* fieldName */ java.lang.String) => RenderFieldByName(t0, t1).runNow()))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderFields(t0).runNow()))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderFooter(t0).runNow()))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderGroups(t0).runNow()))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderHeader(t0).runNow()))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderItems(t0).runNow()))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.ContextInfo) => RenderView(t0).runNow()))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag.asInstanceOf[js.Any])
    if (Templates != null) __obj.updateDynamic("Templates")(Templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInfo]
  }
}

