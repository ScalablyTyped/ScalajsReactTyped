package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MetrosListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosCollection extends js.Object {
  // Retrieves a list of metros.
  def list(profileId: String): MetrosListResponse
}

object MetrosCollection {
  @scala.inline
  def apply(list: String => CallbackTo[MetrosListResponse]): MetrosCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[MetrosCollection]
  }
}

