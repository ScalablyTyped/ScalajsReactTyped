package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLink extends js.Object {
  var appUrl: js.UndefOr[String] = js.undefined
  var fallbackUrl: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mobileApp: js.UndefOr[MobileApp] = js.undefined
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.undefined
}

object DeepLink {
  @scala.inline
  def apply(
    appUrl: String = null,
    fallbackUrl: String = null,
    kind: String = null,
    mobileApp: MobileApp = null,
    remarketingListIds: js.Array[String] = null
  ): DeepLink = {
    val __obj = js.Dynamic.literal()
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl.asInstanceOf[js.Any])
    if (fallbackUrl != null) __obj.updateDynamic("fallbackUrl")(fallbackUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileApp != null) __obj.updateDynamic("mobileApp")(mobileApp.asInstanceOf[js.Any])
    if (remarketingListIds != null) __obj.updateDynamic("remarketingListIds")(remarketingListIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLink]
  }
}

