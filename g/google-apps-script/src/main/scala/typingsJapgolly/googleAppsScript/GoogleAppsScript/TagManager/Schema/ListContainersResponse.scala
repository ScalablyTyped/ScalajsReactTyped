package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainersResponse extends js.Object {
  var container: js.UndefOr[js.Array[Container]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListContainersResponse {
  @scala.inline
  def apply(container: js.Array[Container] = null, nextPageToken: String = null): ListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersResponse]
  }
}

