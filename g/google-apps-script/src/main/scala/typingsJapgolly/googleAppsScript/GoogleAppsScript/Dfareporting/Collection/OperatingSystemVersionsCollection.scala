package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemVersion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemVersionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsCollection extends js.Object {
  // Gets one operating system version by ID.
  def get(profileId: String, id: String): OperatingSystemVersion
  // Retrieves a list of operating system versions.
  def list(profileId: String): OperatingSystemVersionsListResponse
}

object OperatingSystemVersionsCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[OperatingSystemVersion],
    list: String => CallbackTo[OperatingSystemVersionsListResponse]
  ): OperatingSystemVersionsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[OperatingSystemVersionsCollection]
  }
}

