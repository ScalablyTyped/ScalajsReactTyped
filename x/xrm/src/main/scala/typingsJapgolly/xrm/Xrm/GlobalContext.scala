package typingsJapgolly.xrm.Xrm

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.xrm.Xrm.Async.PromiseLike
import typingsJapgolly.xrm.xrmStrings.MaxChildIncidentNumber
import typingsJapgolly.xrm.xrmStrings.MaxIncidentMergeNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the xRM application context.
  * GetGlobalContext()
  */
trait GlobalContext extends StObject {
  
  /**
    * The client's context instance.
    */
  var client: ClientContext
  
  /**
    * Returns information about the advanced configuration settings for the organization.
    * @param setting Name of the configuration setting.
    * @see {@link XrmEnum.AdvancedConfigSettingOption}
    */
  def getAdvancedConfigSetting(setting: MaxChildIncidentNumber | MaxIncidentMergeNumber): Double
  
  /**
    * Gets client's base URL for Dynamics CRM
    * @returns The client's base URL
    * @example
    * * For Dynamics CRM On-Premises:               http(s)://server/org
    * * For Dynamics CRM Online:                    https://org.crm.dynamics.com
    * * For Dynamics CRM for Outlook (Offline):     http://localhost:2525
    */
  def getClientUrl(): String
  
  /**
    * Returns the name of the current business app in Customer Engagement.
    */
  def getCurrentAppName(): PromiseLike[String]
  
  /**
    * Returns the properties of the current business app in Customer Engagement.
    */
  def getCurrentAppProperties(): PromiseLike[AppProperties]
  
  /**
    * Gets the current value of a settings row.
    * @param settingName Name of the setting youd like to receive the value from.
    * @returns The current value of the setting.
    */
  def getCurrentAppSetting(settingName: String): String | Double | Boolean
  
  /**
    * Returns the URL of the current business app in Customer Engagement.
    * @example
    * * Online        https:// **org**.crm.dynamics.com/main.aspx?appid=**GUID**
    * * OnPrem        https:// **server**\/ **org**\/main.aspx?appid=**GUID**
    * @returns A string containing the url of the current business app.
    */
  def getCurrentAppUrl(): String
  
  /**
    * Gets current styling theme.
    * @remarks This function does not work with Dynamics CRM for tablets or in the unified interface.
    * @returns The name of the current theme, as either "default", "Office12Blue", or "Office14Silver"
    */
  def getCurrentTheme(): Theme
  
  /**
    * Gets whether automatic save is enabled.
    * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.isAutoSaveEnabled globalContext.organizationSettings.isAutoSaveEnabled} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns true if automatic saving is enabled, otherwise false.
    */
  def getIsAutoSaveEnabled(): Boolean
  
  /**
    * Gets organization's LCID (language code).
    * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.languageId globalContext.organizationSettings.languageId} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The organization language code.
    * @see {@link http://msdn.microsoft.com/en-us/library/ms912047(WinEmbedded.10).aspx External Link: Microsoft Locale ID Values}
    */
  def getOrgLcid(): Double
  
  /**
    * Gets organization's unique name.
    * @remarks This value can be found on the Developer Resources page within Dynamics CRM.
    * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.uniqueName} globalContext.organizationSettings.uniqueName instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The organization's unique name.
    */
  def getOrgUniqueName(): String
  
  /**
    * Gets query string parameters.
    * @returns The query string parameters, in a dictionary object representing name and value pairs.
    * @deprecated Deprecated in v9 (Still applicable in Web Client).
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def getQueryStringParameters(): StringDictionary[Any]
  
  /**
    * Returns the difference between the local time and Coordinated Universal Time (UTC).
    * @returns The time zone offset, in minutes.
    */
  def getTimeZoneOffsetMinutes(): Double
  
  /**
    * Gets user's unique identifier.
    * @deprecated Deprecated in v9.  Use {@link Xrm.UserSettings.userId globalContext.userSettings.userId} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The user's identifier in Guid format.
    * @example Example: "{B05EC7CE-5D51-DF11-97E0-00155DB232D0}"
    */
  def getUserId(): String
  
  /**
    * Gets user's LCID (language code).
    * @deprecated Deprecated in v9. Use {@link Xrm.UserSettings.languageId globalContext.userSetings.languageId} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The user's language code.
    * @see {@link http://msdn.microsoft.com/en-us/library/ms912047(WinEmbedded.10).aspx External Link: Microsoft Locale ID Values}
    */
  def getUserLcid(): Double
  
  /**
    * Gets the name of the current user.
    * @deprecated Deprecated in v9. Use {@link Xrm.UserSettings.userName globalContext.userSettings.userName} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The user's name.
    */
  def getUserName(): String
  
  /**
    * Gets all user security roles.
    * @deprecated Deprecated in v9.  Use {@link Xrm.UserSettings.roles globalContext.userSettings.roles} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns An array of user role identifiers, in Guid format.
    * @example Example: ["cf4cc7ce-5d51-df11-97e0-00155db232d0"]
    */
  def getUserRoles(): js.Array[String]
  
  /**
    * Returns the version number of the Dynamics 365 server.
    * @returns The version number
    */
  def getVersion(): String
  
  /**
    * Returns a boolean value indicating if the Customer Engagement instance is hosted on- premises or online.
    */
  def isOnPremise(): Boolean
  
  /**
    * Returns information about the current organization settings.
    */
  var organizationSettings: OrganizationSettings
  
  /**
    * Prefixes the current organization's unique name to a string; typically a URL path.
    * @param sPath Local pathname of the resource.
    * @returns A path string with the organization name. Format: "/"+ OrgName + sPath
    */
  def prependOrgName(sPath: String): String
  
  /**
    * Returns information about the current user settings.
    */
  var userSettings: UserSettings
}
object GlobalContext {
  
  inline def apply(
    client: ClientContext,
    getAdvancedConfigSetting: MaxChildIncidentNumber | MaxIncidentMergeNumber => Double,
    getClientUrl: CallbackTo[String],
    getCurrentAppName: CallbackTo[PromiseLike[String]],
    getCurrentAppProperties: CallbackTo[PromiseLike[AppProperties]],
    getCurrentAppSetting: String => String | Double | Boolean,
    getCurrentAppUrl: CallbackTo[String],
    getCurrentTheme: CallbackTo[Theme],
    getIsAutoSaveEnabled: CallbackTo[Boolean],
    getOrgLcid: CallbackTo[Double],
    getOrgUniqueName: CallbackTo[String],
    getQueryStringParameters: CallbackTo[StringDictionary[Any]],
    getTimeZoneOffsetMinutes: CallbackTo[Double],
    getUserId: CallbackTo[String],
    getUserLcid: CallbackTo[Double],
    getUserName: CallbackTo[String],
    getUserRoles: CallbackTo[js.Array[String]],
    getVersion: CallbackTo[String],
    isOnPremise: CallbackTo[Boolean],
    organizationSettings: OrganizationSettings,
    prependOrgName: String => String,
    userSettings: UserSettings
  ): GlobalContext = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], getAdvancedConfigSetting = js.Any.fromFunction1(getAdvancedConfigSetting), getClientUrl = getClientUrl.toJsFn, getCurrentAppName = getCurrentAppName.toJsFn, getCurrentAppProperties = getCurrentAppProperties.toJsFn, getCurrentAppSetting = js.Any.fromFunction1(getCurrentAppSetting), getCurrentAppUrl = getCurrentAppUrl.toJsFn, getCurrentTheme = getCurrentTheme.toJsFn, getIsAutoSaveEnabled = getIsAutoSaveEnabled.toJsFn, getOrgLcid = getOrgLcid.toJsFn, getOrgUniqueName = getOrgUniqueName.toJsFn, getQueryStringParameters = getQueryStringParameters.toJsFn, getTimeZoneOffsetMinutes = getTimeZoneOffsetMinutes.toJsFn, getUserId = getUserId.toJsFn, getUserLcid = getUserLcid.toJsFn, getUserName = getUserName.toJsFn, getUserRoles = getUserRoles.toJsFn, getVersion = getVersion.toJsFn, isOnPremise = isOnPremise.toJsFn, organizationSettings = organizationSettings.asInstanceOf[js.Any], prependOrgName = js.Any.fromFunction1(prependOrgName), userSettings = userSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalContext]
  }
  
  extension [Self <: GlobalContext](x: Self) {
    
    inline def setClient(value: ClientContext): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setGetAdvancedConfigSetting(value: MaxChildIncidentNumber | MaxIncidentMergeNumber => Double): Self = StObject.set(x, "getAdvancedConfigSetting", js.Any.fromFunction1(value))
    
    inline def setGetClientUrl(value: CallbackTo[String]): Self = StObject.set(x, "getClientUrl", value.toJsFn)
    
    inline def setGetCurrentAppName(value: CallbackTo[PromiseLike[String]]): Self = StObject.set(x, "getCurrentAppName", value.toJsFn)
    
    inline def setGetCurrentAppProperties(value: CallbackTo[PromiseLike[AppProperties]]): Self = StObject.set(x, "getCurrentAppProperties", value.toJsFn)
    
    inline def setGetCurrentAppSetting(value: String => String | Double | Boolean): Self = StObject.set(x, "getCurrentAppSetting", js.Any.fromFunction1(value))
    
    inline def setGetCurrentAppUrl(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentAppUrl", value.toJsFn)
    
    inline def setGetCurrentTheme(value: CallbackTo[Theme]): Self = StObject.set(x, "getCurrentTheme", value.toJsFn)
    
    inline def setGetIsAutoSaveEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsAutoSaveEnabled", value.toJsFn)
    
    inline def setGetOrgLcid(value: CallbackTo[Double]): Self = StObject.set(x, "getOrgLcid", value.toJsFn)
    
    inline def setGetOrgUniqueName(value: CallbackTo[String]): Self = StObject.set(x, "getOrgUniqueName", value.toJsFn)
    
    inline def setGetQueryStringParameters(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "getQueryStringParameters", value.toJsFn)
    
    inline def setGetTimeZoneOffsetMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeZoneOffsetMinutes", value.toJsFn)
    
    inline def setGetUserId(value: CallbackTo[String]): Self = StObject.set(x, "getUserId", value.toJsFn)
    
    inline def setGetUserLcid(value: CallbackTo[Double]): Self = StObject.set(x, "getUserLcid", value.toJsFn)
    
    inline def setGetUserName(value: CallbackTo[String]): Self = StObject.set(x, "getUserName", value.toJsFn)
    
    inline def setGetUserRoles(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getUserRoles", value.toJsFn)
    
    inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
    
    inline def setIsOnPremise(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOnPremise", value.toJsFn)
    
    inline def setOrganizationSettings(value: OrganizationSettings): Self = StObject.set(x, "organizationSettings", value.asInstanceOf[js.Any])
    
    inline def setPrependOrgName(value: String => String): Self = StObject.set(x, "prependOrgName", js.Any.fromFunction1(value))
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
  }
}
