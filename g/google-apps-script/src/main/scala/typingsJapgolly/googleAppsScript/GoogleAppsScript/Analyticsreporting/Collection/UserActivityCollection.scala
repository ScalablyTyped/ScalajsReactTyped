package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivityCollection extends js.Object {
  // Returns User Activity data.
  def search(resource: SearchUserActivityRequest): SearchUserActivityResponse
}

object UserActivityCollection {
  @scala.inline
  def apply(search: SearchUserActivityRequest => CallbackTo[SearchUserActivityResponse]): UserActivityCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest) => search(t0).runNow()))
    __obj.asInstanceOf[UserActivityCollection]
  }
}

