package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OperatingSystemsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsCollection extends js.Object {
  // Gets one operating system by DART ID.
  def get(profileId: String, dartId: String): OperatingSystem
  // Retrieves a list of operating systems.
  def list(profileId: String): OperatingSystemsListResponse
}

object OperatingSystemsCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[OperatingSystem],
    list: String => CallbackTo[OperatingSystemsListResponse]
  ): OperatingSystemsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[OperatingSystemsCollection]
  }
}

