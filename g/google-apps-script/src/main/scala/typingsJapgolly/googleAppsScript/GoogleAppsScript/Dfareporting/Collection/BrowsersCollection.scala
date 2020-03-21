package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.BrowsersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersCollection extends js.Object {
  // Retrieves a list of browsers.
  def list(profileId: String): BrowsersListResponse
}

object BrowsersCollection {
  @scala.inline
  def apply(list: String => CallbackTo[BrowsersListResponse]): BrowsersCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[BrowsersCollection]
  }
}

