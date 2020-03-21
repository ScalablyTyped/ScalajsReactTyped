package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedApps extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var trustedApps: js.UndefOr[js.Array[TrustedAppId]] = js.undefined
}

object TrustedApps {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    trustedApps: js.Array[TrustedAppId] = null
  ): TrustedApps = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (trustedApps != null) __obj.updateDynamic("trustedApps")(trustedApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedApps]
  }
}

