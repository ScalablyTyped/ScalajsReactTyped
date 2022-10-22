package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HP extends StObject {
  
  def Close(): Unit
  
  var CommonActions: String
  
  var CommonBody: String
  
  var CommonHeader: String
  
  def Follow(): Unit
  
  def GetAuthorsHtml(): String
  
  def GetBodySectionContent(): String
  
  def GetBodySectionHeading(): String
  
  def GetEmailLink(title: String, path: String, client: String, url: String): String
  
  def GetFriendlyNameForFileType(fileType: Any): String
  
  def GetNowDateTimeDifference(): String
  
  def GetPeopleFollowingControl(): String
  
  def Hide(): Unit
  
  def Init(): Unit
  
  def InitPostLoad(): Unit
  
  def IsNumeric(): Boolean
  
  def Resize(): Unit
  
  def SetPreviewOnHideCallback(): Unit
  
  def SetWidth(width: Double): Unit
  
  def Show(): Unit
  
  def ViewDuplicates(): Boolean
  
  def getDateString(): String
  
  def getStringFromDate(): String
  
  var ids: HPIds
  
  def loadSiteViewer(id: String, idinner: String, idviewer: String, path: String, idglass: String): Unit
  
  def loadViewer(
    id: String,
    idinner: String,
    idviewer: String,
    idpreview: String,
    embedUrl: String,
    previewUrl: String
  ): Unit
  
  var postActionEventName: String
}
object HP {
  
  inline def apply(
    Close: Callback,
    CommonActions: String,
    CommonBody: String,
    CommonHeader: String,
    Follow: Callback,
    GetAuthorsHtml: CallbackTo[String],
    GetBodySectionContent: CallbackTo[String],
    GetBodySectionHeading: CallbackTo[String],
    GetEmailLink: (String, String, String, String) => String,
    GetFriendlyNameForFileType: Any => String,
    GetNowDateTimeDifference: CallbackTo[String],
    GetPeopleFollowingControl: CallbackTo[String],
    Hide: Callback,
    Init: Callback,
    InitPostLoad: Callback,
    IsNumeric: CallbackTo[Boolean],
    Resize: Callback,
    SetPreviewOnHideCallback: Callback,
    SetWidth: Double => Callback,
    Show: Callback,
    ViewDuplicates: CallbackTo[Boolean],
    getDateString: CallbackTo[String],
    getStringFromDate: CallbackTo[String],
    ids: HPIds,
    loadSiteViewer: (String, String, String, String, String) => Callback,
    loadViewer: (String, String, String, String, String, String) => Callback,
    postActionEventName: String
  ): HP = {
    val __obj = js.Dynamic.literal(Close = Close.toJsFn, CommonActions = CommonActions.asInstanceOf[js.Any], CommonBody = CommonBody.asInstanceOf[js.Any], CommonHeader = CommonHeader.asInstanceOf[js.Any], Follow = Follow.toJsFn, GetAuthorsHtml = GetAuthorsHtml.toJsFn, GetBodySectionContent = GetBodySectionContent.toJsFn, GetBodySectionHeading = GetBodySectionHeading.toJsFn, GetEmailLink = js.Any.fromFunction4(GetEmailLink), GetFriendlyNameForFileType = js.Any.fromFunction1(GetFriendlyNameForFileType), GetNowDateTimeDifference = GetNowDateTimeDifference.toJsFn, GetPeopleFollowingControl = GetPeopleFollowingControl.toJsFn, Hide = Hide.toJsFn, Init = Init.toJsFn, InitPostLoad = InitPostLoad.toJsFn, IsNumeric = IsNumeric.toJsFn, Resize = Resize.toJsFn, SetPreviewOnHideCallback = SetPreviewOnHideCallback.toJsFn, SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Show = Show.toJsFn, ViewDuplicates = ViewDuplicates.toJsFn, getDateString = getDateString.toJsFn, getStringFromDate = getStringFromDate.toJsFn, ids = ids.asInstanceOf[js.Any], loadSiteViewer = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (loadSiteViewer(t0, t1, t2, t3, t4)).runNow()), loadViewer = js.Any.fromFunction6((t0: String, t1: String, t2: String, t3: String, t4: String, t5: String) => (loadViewer(t0, t1, t2, t3, t4, t5)).runNow()), postActionEventName = postActionEventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HP]
  }
  
  extension [Self <: HP](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setCommonActions(value: String): Self = StObject.set(x, "CommonActions", value.asInstanceOf[js.Any])
    
    inline def setCommonBody(value: String): Self = StObject.set(x, "CommonBody", value.asInstanceOf[js.Any])
    
    inline def setCommonHeader(value: String): Self = StObject.set(x, "CommonHeader", value.asInstanceOf[js.Any])
    
    inline def setFollow(value: Callback): Self = StObject.set(x, "Follow", value.toJsFn)
    
    inline def setGetAuthorsHtml(value: CallbackTo[String]): Self = StObject.set(x, "GetAuthorsHtml", value.toJsFn)
    
    inline def setGetBodySectionContent(value: CallbackTo[String]): Self = StObject.set(x, "GetBodySectionContent", value.toJsFn)
    
    inline def setGetBodySectionHeading(value: CallbackTo[String]): Self = StObject.set(x, "GetBodySectionHeading", value.toJsFn)
    
    inline def setGetDateString(value: CallbackTo[String]): Self = StObject.set(x, "getDateString", value.toJsFn)
    
    inline def setGetEmailLink(value: (String, String, String, String) => String): Self = StObject.set(x, "GetEmailLink", js.Any.fromFunction4(value))
    
    inline def setGetFriendlyNameForFileType(value: Any => String): Self = StObject.set(x, "GetFriendlyNameForFileType", js.Any.fromFunction1(value))
    
    inline def setGetNowDateTimeDifference(value: CallbackTo[String]): Self = StObject.set(x, "GetNowDateTimeDifference", value.toJsFn)
    
    inline def setGetPeopleFollowingControl(value: CallbackTo[String]): Self = StObject.set(x, "GetPeopleFollowingControl", value.toJsFn)
    
    inline def setGetStringFromDate(value: CallbackTo[String]): Self = StObject.set(x, "getStringFromDate", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "Hide", value.toJsFn)
    
    inline def setIds(value: HPIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Callback): Self = StObject.set(x, "Init", value.toJsFn)
    
    inline def setInitPostLoad(value: Callback): Self = StObject.set(x, "InitPostLoad", value.toJsFn)
    
    inline def setIsNumeric(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsNumeric", value.toJsFn)
    
    inline def setLoadSiteViewer(value: (String, String, String, String, String) => Callback): Self = StObject.set(x, "loadSiteViewer", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setLoadViewer(value: (String, String, String, String, String, String) => Callback): Self = StObject.set(x, "loadViewer", js.Any.fromFunction6((t0: String, t1: String, t2: String, t3: String, t4: String, t5: String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setPostActionEventName(value: String): Self = StObject.set(x, "postActionEventName", value.asInstanceOf[js.Any])
    
    inline def setResize(value: Callback): Self = StObject.set(x, "Resize", value.toJsFn)
    
    inline def setSetPreviewOnHideCallback(value: Callback): Self = StObject.set(x, "SetPreviewOnHideCallback", value.toJsFn)
    
    inline def setSetWidth(value: Double => Callback): Self = StObject.set(x, "SetWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "Show", value.toJsFn)
    
    inline def setViewDuplicates(value: CallbackTo[Boolean]): Self = StObject.set(x, "ViewDuplicates", value.toJsFn)
  }
}
