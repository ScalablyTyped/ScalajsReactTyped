package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workspace extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Workspace {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    description: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    workspaceId: String = null
  ): Workspace = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
}

