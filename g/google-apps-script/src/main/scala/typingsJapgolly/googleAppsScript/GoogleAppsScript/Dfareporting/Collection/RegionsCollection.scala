package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RegionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsCollection extends js.Object {
  // Retrieves a list of regions.
  def list(profileId: String): RegionsListResponse
}

object RegionsCollection {
  @scala.inline
  def apply(list: String => CallbackTo[RegionsListResponse]): RegionsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[RegionsCollection]
  }
}

