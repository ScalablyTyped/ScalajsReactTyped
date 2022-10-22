package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.SP.DateTimeUtil.SimpleDate
import typingsJapgolly.sharepoint.SP.ListItemCollection
import typingsJapgolly.sharepoint.SP.UserCollection
import typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat
import typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource
import typingsJapgolly.sharepoint.SP.Utilities.PrincipalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utilities {
  
  @JSGlobal("SP.Utilities.DateTimeFormat")
  @js.native
  object DateTimeFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat & Double] = js.native
    
    /* 1 */ val dateOnly: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.dateOnly & Double = js.native
    
    /* 0 */ val dateTime: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.dateTime & Double = js.native
    
    /* 3 */ val iSO8601: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.iSO8601 & Double = js.native
    
    /* 6 */ val longDate: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.longDate & Double = js.native
    
    /* 4 */ val monthDayOnly: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.monthDayOnly & Double = js.native
    
    /* 5 */ val monthYearOnly: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.monthYearOnly & Double = js.native
    
    /* 2 */ val timeOnly: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.timeOnly & Double = js.native
    
    /* 7 */ val unknownFormat: typingsJapgolly.sharepoint.SP.Utilities.DateTimeFormat.unknownFormat & Double = js.native
  }
  
  @JSGlobal("SP.Utilities.DateUtility")
  @js.native
  open class DateUtility ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.DateUtility
  object DateUtility {
    
    @JSGlobal("SP.Utilities.DateUtility")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def dateToJulianDay(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateToJulianDay")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def daysInMonth(year: Double, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysInMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def julianDayToDate(julianDay: Double): SimpleDate = ^.asInstanceOf[js.Dynamic].applyDynamic("julianDayToDate")(julianDay.asInstanceOf[js.Any]).asInstanceOf[SimpleDate]
  }
  
  @JSGlobal("SP.Utilities.EmailProperties")
  @js.native
  open class EmailProperties ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.EmailProperties {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_additionalHeaders(): Any = js.native
    
    /* CompleteClass */
    override def get_bCC(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def get_body(): String = js.native
    
    /* CompleteClass */
    override def get_cC(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def get_from(): String = js.native
    
    /* CompleteClass */
    override def get_subject(): String = js.native
    
    /* CompleteClass */
    override def get_to(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_additionalHeaders(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def set_bCC(value: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def set_body(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_cC(value: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def set_from(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_subject(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_to(value: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Utilities.HttpUtility")
  @js.native
  open class HttpUtility ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.HttpUtility
  object HttpUtility {
    
    @JSGlobal("SP.Utilities.HttpUtility")
    @js.native
    val ^ : js.Any = js.native
    
    /** Appends correct "Source" parameter to the specified url, and then navigates to this url.
      "Source" parameter is recognized in many places in SharePoint, usually to determine "Cancel" behavior. */
    /* static member */
    inline def appendSourceAndNavigateTo(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("appendSourceAndNavigateTo")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def ecmaScriptStringLiteralEncode(scriptLiteralToEncode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ecmaScriptStringLiteralEncode")(scriptLiteralToEncode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def escapeXmlText(stringToEscape: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXmlText")(stringToEscape.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Official version of STSHtmlEncode. Calls it internally. */
    /* static member */
    inline def htmlEncode(stringToEncode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(stringToEncode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def navigateHttpFolder(urlSrc: String, frameTarget: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateHttpFolder")(urlSrc.asInstanceOf[js.Any], frameTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def navigateTo(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def urlKeyValueEncode(keyOrValueToEncode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlKeyValueEncode")(keyOrValueToEncode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def urlPathEncode(stringToEncode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlPathEncode")(stringToEncode.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("SP.Utilities.IconSize")
  @js.native
  object IconSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Utilities.IconSize & Double] = js.native
    
    /* 0 */ val size16: typingsJapgolly.sharepoint.SP.Utilities.IconSize.size16 & Double = js.native
    
    /* 2 */ val size256: typingsJapgolly.sharepoint.SP.Utilities.IconSize.size256 & Double = js.native
    
    /* 1 */ val size32: typingsJapgolly.sharepoint.SP.Utilities.IconSize.size32 & Double = js.native
  }
  
  @JSGlobal("SP.Utilities.LocUtility")
  @js.native
  open class LocUtility ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.LocUtility
  object LocUtility {
    
    @JSGlobal("SP.Utilities.LocUtility")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getLocalizedCountValue(locText: String, intervals: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedCountValue")(locText.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSGlobal("SP.Utilities.LogAppErrorResult")
  @js.native
  object LogAppErrorResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Utilities.LogAppErrorResult & Double] = js.native
    
    /* 2 */ val accessDenied: typingsJapgolly.sharepoint.SP.Utilities.LogAppErrorResult.accessDenied & Double = js.native
    
    /* 1 */ val errorsThrottled: typingsJapgolly.sharepoint.SP.Utilities.LogAppErrorResult.errorsThrottled & Double = js.native
    
    /* 0 */ val success: typingsJapgolly.sharepoint.SP.Utilities.LogAppErrorResult.success & Double = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalInfo")
  @js.native
  open class PrincipalInfo ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.PrincipalInfo {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_department(): String = js.native
    
    /* CompleteClass */
    override def get_displayName(): String = js.native
    
    /* CompleteClass */
    override def get_email(): String = js.native
    
    /* CompleteClass */
    override def get_jobTitle(): String = js.native
    
    /* CompleteClass */
    override def get_loginName(): String = js.native
    
    /* CompleteClass */
    override def get_mobile(): String = js.native
    
    /* CompleteClass */
    override def get_principalId(): Double = js.native
    
    /* CompleteClass */
    override def get_principalType(): PrincipalType = js.native
    
    /* CompleteClass */
    override def get_sIPAddress(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalSource")
  @js.native
  object PrincipalSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource & Double] = js.native
    
    /* 5 */ val all: typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource.all & Double = js.native
    
    /* 3 */ val membershipProvider: typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource.membershipProvider & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource.none & Double = js.native
    
    /* 4 */ val roleProvider: typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource.roleProvider & Double = js.native
    
    /* 1 */ val userInfoList: typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource.userInfoList & Double = js.native
    
    /* 2 */ val windows: typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource.windows & Double = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalType")
  @js.native
  object PrincipalType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Utilities.PrincipalType & Double] = js.native
    
    /* 5 */ val all: typingsJapgolly.sharepoint.SP.Utilities.PrincipalType.all & Double = js.native
    
    /* 2 */ val distributionList: typingsJapgolly.sharepoint.SP.Utilities.PrincipalType.distributionList & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.Utilities.PrincipalType.none & Double = js.native
    
    /* 3 */ val securityGroup: typingsJapgolly.sharepoint.SP.Utilities.PrincipalType.securityGroup & Double = js.native
    
    /* 4 */ val sharePointGroup: typingsJapgolly.sharepoint.SP.Utilities.PrincipalType.sharePointGroup & Double = js.native
    
    /* 1 */ val user: typingsJapgolly.sharepoint.SP.Utilities.PrincipalType.user & Double = js.native
  }
  
  @JSGlobal("SP.Utilities.SPWOPIFrameAction")
  @js.native
  object SPWOPIFrameAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Utilities.SPWOPIFrameAction & Double] = js.native
    
    /* 1 */ val edit: typingsJapgolly.sharepoint.SP.Utilities.SPWOPIFrameAction.edit & Double = js.native
    
    /* 3 */ val interactivePreview: typingsJapgolly.sharepoint.SP.Utilities.SPWOPIFrameAction.interactivePreview & Double = js.native
    
    /* 2 */ val mobileView: typingsJapgolly.sharepoint.SP.Utilities.SPWOPIFrameAction.mobileView & Double = js.native
    
    /* 0 */ val view: typingsJapgolly.sharepoint.SP.Utilities.SPWOPIFrameAction.view & Double = js.native
  }
  
  @JSGlobal("SP.Utilities.Set")
  @js.native
  open class Set ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.Set {
    def this(items: NumberDictionary[Double]) = this()
    def this(items: StringDictionary[Double]) = this()
    
    /** Adds an item to the set */
    /* CompleteClass */
    override def Add(item: Any): Any = js.native
    
    /** Adds all items from array to the set, and returns the set */
    /* CompleteClass */
    override def AddArray(array: js.Array[Any]): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Clears all the items from set */
    /* CompleteClass */
    override def Clear(): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Returns a copy of this set */
    /* CompleteClass */
    override def Clone(): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Returns true if item exists in this set */
    /* CompleteClass */
    override def Contains(item: Any): Boolean = js.native
    
    /** Returns a set that contains all the items that are in this set but not in the otherSet */
    /* CompleteClass */
    override def Difference(otherSet: typingsJapgolly.sharepoint.SP.Utilities.Set): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Returns first item in the set */
    /* CompleteClass */
    override def First(): Any = js.native
    
    /** Returns the underlying collection of items as dictionary.
      Items are the keys, and values are always 1.
      So the return value may be either { [item: string]: number } or { [item: number]: number } */
    /* CompleteClass */
    override def GetCollection(): Any = js.native
    
    /** Returns a new set, that contains only items that exist both in this set and the otherSet */
    /* CompleteClass */
    override def Intersection(otherSet: typingsJapgolly.sharepoint.SP.Utilities.Set): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Returns true if the set is empty */
    /* CompleteClass */
    override def IsEmpty(): Boolean = js.native
    
    /** Removes the specified item from the set and returns the removed item */
    /* CompleteClass */
    override def Remove(item: Any): Any = js.native
    
    /** Returns a set that contains all the items that exist only in one of the sets (this and other), but not in both */
    /* CompleteClass */
    override def SymmetricDifference(otherSet: typingsJapgolly.sharepoint.SP.Utilities.Set): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Returns all items from the set as an array */
    /* CompleteClass */
    override def ToArray(): js.Array[Any] = js.native
    
    /** Returns a new set, that contains items from this set and otherSet */
    /* CompleteClass */
    override def Union(otherSet: typingsJapgolly.sharepoint.SP.Utilities.Set): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
    
    /** Adds all items from otherSet to this set, and returns this set */
    /* CompleteClass */
    override def UnionWith(otherSet: typingsJapgolly.sharepoint.SP.Utilities.Set): typingsJapgolly.sharepoint.SP.Utilities.Set = js.native
  }
  
  @JSGlobal("SP.Utilities.UrlBuilder")
  @js.native
  open class UrlBuilder protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.UrlBuilder {
    def this(path: String) = this()
    
    /* CompleteClass */
    override def addKeyValueQueryString(key: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def combinePath(path: String): Unit = js.native
    
    /** Returns the resulting url */
    /* CompleteClass */
    override def get_url(): String = js.native
  }
  object UrlBuilder {
    
    @JSGlobal("SP.Utilities.UrlBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def removeQueryString(url: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQueryString")(url.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def replaceOrAddQueryString(url: String, key: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceOrAddQueryString")(url.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def urlCombine(path1: String, path2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlCombine")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSGlobal("SP.Utilities.Utility")
  @js.native
  open class Utility ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.Utility {
    
    /* CompleteClass */
    var lAYOUTS_LATESTVERSION_RELATIVE_URL: String = js.native
    
    /* CompleteClass */
    var lAYOUTS_LATESTVERSION_URL: String = js.native
  }
  object Utility {
    
    @JSGlobal("SP.Utilities.Utility")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createEmailBodyForInvitation(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, pageAddress: String): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmailBodyForInvitation")(context.asInstanceOf[js.Any], pageAddress.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
    
    /* static member */
    inline def createNewDiscussion[T](
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      list: typingsJapgolly.sharepoint.SP.List[Any],
      title: String
    ): typingsJapgolly.sharepoint.SP.ListItem[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNewDiscussion")(context.asInstanceOf[js.Any], list.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ListItem[T]]
    
    /* static member */
    inline def createNewDiscussionReply[T](
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      parent: typingsJapgolly.sharepoint.SP.ListItem[T]
    ): typingsJapgolly.sharepoint.SP.ListItem[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNewDiscussionReply")(context.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ListItem[T]]
    
    /* static member */
    inline def createWikiPageInContextWeb(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      parameters: typingsJapgolly.sharepoint.SP.Utilities.WikiPageCreationInformation
    ): typingsJapgolly.sharepoint.SP.File = (^.asInstanceOf[js.Dynamic].applyDynamic("createWikiPageInContextWeb")(context.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.File]
    
    /* static member */
    inline def formatDateTime(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web,
      datetime: js.Date,
      format: DateTimeFormat
    ): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTime")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], datetime.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
    
    /* static member */
    inline def getAppLicenseDeploymentId(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.GuidResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppLicenseDeploymentId")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.GuidResult]
    
    /* static member */
    inline def getAppLicenseInformation(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      productId: typingsJapgolly.sharepoint.SP.Guid
    ): typingsJapgolly.sharepoint.SP.AppLicenseCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppLicenseInformation")(context.asInstanceOf[js.Any], productId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.AppLicenseCollection]
    
    /* static member */
    inline def getCurrentUserEmailAddresses(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.StringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUserEmailAddresses")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
    
    /* static member */
    inline def getImageUrl(imageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageUrl")(imageName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getLayoutsLatestVersionRelativeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_layoutsLatestVersionRelativeUrl")().asInstanceOf[String]
    
    /* static member */
    inline def getLayoutsLatestVersionUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_layoutsLatestVersionUrl")().asInstanceOf[String]
    
    /* static member */
    inline def getLayoutsPageUrl(pageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutsPageUrl")(pageName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getLocalizedString(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      source: String,
      defaultResourceFile: String,
      language: Double
    ): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedString")(context.asInstanceOf[js.Any], source.asInstanceOf[js.Any], defaultResourceFile.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
    
    /* static member */
    inline def getLowerCaseString(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, sourceValue: String, lcid: Double): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getLowerCaseString")(context.asInstanceOf[js.Any], sourceValue.asInstanceOf[js.Any], lcid.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
    
    /* static member */
    inline def getPeoplePickerURL(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web,
      fieldUser: typingsJapgolly.sharepoint.SP.FieldUser
    ): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getPeoplePickerURL")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], fieldUser.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
    
    /* static member */
    inline def importAppLicense(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      licenseTokenToImport: String,
      contentMarket: String,
      billingMarket: String,
      appName: String,
      iconUrl: String,
      providerName: String,
      appSubtype: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("importAppLicense")(context.asInstanceOf[js.Any], licenseTokenToImport.asInstanceOf[js.Any], contentMarket.asInstanceOf[js.Any], billingMarket.asInstanceOf[js.Any], appName.asInstanceOf[js.Any], iconUrl.asInstanceOf[js.Any], providerName.asInstanceOf[js.Any], appSubtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def isUserLicensedForEntityInContext(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, licensableEntity: String): typingsJapgolly.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isUserLicensedForEntityInContext")(context.asInstanceOf[js.Any], licensableEntity.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BooleanResult]
    
    /* static member */
    inline def localizeWebPartGallery(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, items: ListItemCollection[Any]): typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.ListItem[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("localizeWebPartGallery")(context.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.ListItem[Any]]]
    
    /* static member */
    inline def logCustomAppError(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, error: String): typingsJapgolly.sharepoint.SP.IntResult = (^.asInstanceOf[js.Dynamic].applyDynamic("logCustomAppError")(context.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.IntResult]
    
    /* static member */
    inline def logCustomRemoteAppError(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      productId: typingsJapgolly.sharepoint.SP.Guid,
      error: String
    ): typingsJapgolly.sharepoint.SP.IntResult = (^.asInstanceOf[js.Dynamic].applyDynamic("logCustomRemoteAppError")(context.asInstanceOf[js.Any], productId.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.IntResult]
    
    /* static member */
    inline def markDiscussionAsFeatured(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, listID: String, topicIDs: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markDiscussionAsFeatured")(context.asInstanceOf[js.Any], listID.asInstanceOf[js.Any], topicIDs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def resolvePrincipal(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web,
      input: String,
      scopes: PrincipalType,
      sources: PrincipalSource,
      usersContainer: UserCollection,
      inputIsEmailOnly: Boolean
    ): typingsJapgolly.sharepoint.SP.Utilities.PrincipalInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePrincipal")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], input.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], usersContainer.asInstanceOf[js.Any], inputIsEmailOnly.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.Utilities.PrincipalInfo]
    
    /* static member */
    inline def searchPrincipals(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web,
      input: String,
      scopes: PrincipalType,
      sources: PrincipalSource,
      usersContainer: UserCollection,
      maxCount: Double
    ): js.Array[typingsJapgolly.sharepoint.SP.Utilities.PrincipalInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPrincipals")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], input.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], usersContainer.asInstanceOf[js.Any], maxCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.sharepoint.SP.Utilities.PrincipalInfo]]
    
    /* static member */
    inline def unmarkDiscussionAsFeatured(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, listID: String, topicIDs: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarkDiscussionAsFeatured")(context.asInstanceOf[js.Any], listID.asInstanceOf[js.Any], topicIDs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("SP.Utilities.VersionUtility")
  @js.native
  open class VersionUtility ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.VersionUtility
  object VersionUtility {
    
    @JSGlobal("SP.Utilities.VersionUtility")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getImageUrl(imageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageUrl")(imageName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def getLayoutsLatestVersionRelativeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_layoutsLatestVersionRelativeUrl")().asInstanceOf[String]
    
    /* static member */
    inline def getLayoutsLatestVersionUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_layoutsLatestVersionUrl")().asInstanceOf[String]
    
    /* static member */
    inline def getLayoutsPageUrl(pageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutsPageUrl")(pageName.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("SP.Utilities.WikiPageCreationInformation")
  @js.native
  open class WikiPageCreationInformation ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Utilities.WikiPageCreationInformation {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_serverRelativeUrl(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_wikiHtmlContent(): String = js.native
    
    /* CompleteClass */
    override def set_serverRelativeUrl(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_wikiHtmlContent(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
}
