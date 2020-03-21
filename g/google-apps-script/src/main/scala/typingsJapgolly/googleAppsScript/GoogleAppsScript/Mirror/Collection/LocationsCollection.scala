package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.LocationsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsCollection extends js.Object {
  // Gets a single location by ID.
  def get(id: String): Location
  // Retrieves a list of locations for the user.
  def list(): LocationsListResponse
}

object LocationsCollection {
  @scala.inline
  def apply(get: String => CallbackTo[Location], list: CallbackTo[LocationsListResponse]): LocationsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[LocationsCollection]
  }
}

