package typingsJapgolly.xrm.Xrm

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds information about the current user settings.
  */
trait UserSettings extends js.Object {
  /**
    * Returns the ID of the default dashboard for the current user.
    */
  var defaultDashboardId: String
  /**
    * Indicates whether guided help is enabled for the current user.
    */
  var isGuidedHelpEnabled: Boolean
  /**
    * Indicates whether high contrast is enabled for the current user.
    */
  var isHighContrastEnabled: Boolean
  /**
    * Indicates whether the language for the current user is a right-to-left (RTL) language.
    */
  var isRTL: Boolean
  /**
    * Returns the language ID for the current user.
    */
  var languageId: Double
  /**
    * Returns an array of strings that represent the GUID values of each of the security role privilege that the user is associated with or any teams that the user is associated with.
    */
  var securityRolePrivileges: js.Array[String]
  /**
    * Returns an array of strings that represent the GUID values of each of the security role that the user is associated with or any teams that the user is associated with.
    */
  var securityRoles: js.Array[String]
  /**
    * Returns the transaction currency ID for the current user.
    */
  var transactionCurrencyId: String
  /**
    * Returns the GUID of the SystemUser.Id value for the current user.
    */
  var userId: String
  /**
    * Returns the name of the current user.
    */
  var userName: String
  /**
    * Returns the date formatting information for the current user.
    */
  def dateFormattingInfo(): DateFormattingInfo
  /**
    * Returns the difference in minutes between the local time and Coordinated Universal Time (UTC).
    */
  def getTimeZoneOffsetMinutes(): Double
}

object UserSettings {
  @scala.inline
  def apply(
    dateFormattingInfo: CallbackTo[DateFormattingInfo],
    defaultDashboardId: String,
    getTimeZoneOffsetMinutes: CallbackTo[Double],
    isGuidedHelpEnabled: Boolean,
    isHighContrastEnabled: Boolean,
    isRTL: Boolean,
    languageId: Double,
    securityRolePrivileges: js.Array[String],
    securityRoles: js.Array[String],
    transactionCurrencyId: String,
    userId: String,
    userName: String
  ): UserSettings = {
    val __obj = js.Dynamic.literal(defaultDashboardId = defaultDashboardId.asInstanceOf[js.Any], isGuidedHelpEnabled = isGuidedHelpEnabled.asInstanceOf[js.Any], isHighContrastEnabled = isHighContrastEnabled.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], securityRolePrivileges = securityRolePrivileges.asInstanceOf[js.Any], securityRoles = securityRoles.asInstanceOf[js.Any], transactionCurrencyId = transactionCurrencyId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.updateDynamic("dateFormattingInfo")(dateFormattingInfo.toJsFn)
    __obj.updateDynamic("getTimeZoneOffsetMinutes")(getTimeZoneOffsetMinutes.toJsFn)
    __obj.asInstanceOf[UserSettings]
  }
}

