package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.AppAccessCollections
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.TrustedApps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedAppAccessSettingsCollection extends js.Object {
  // Retrieves resolved app access settings of the logged in user.
  def GetSettings(): AppAccessCollections
  // Retrieves the list of apps trusted by the admin of the logged in user.
  def ListTrustedApps(): TrustedApps
}

object ResolvedAppAccessSettingsCollection {
  @scala.inline
  def apply(GetSettings: CallbackTo[AppAccessCollections], ListTrustedApps: CallbackTo[TrustedApps]): ResolvedAppAccessSettingsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetSettings")(GetSettings.toJsFn)
    __obj.updateDynamic("ListTrustedApps")(ListTrustedApps.toJsFn)
    __obj.asInstanceOf[ResolvedAppAccessSettingsCollection]
  }
}

