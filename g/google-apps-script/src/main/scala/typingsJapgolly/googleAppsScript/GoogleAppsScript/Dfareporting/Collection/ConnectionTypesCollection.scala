package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConnectionType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConnectionTypesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesCollection extends js.Object {
  // Gets one connection type by ID.
  def get(profileId: String, id: String): ConnectionType
  // Retrieves a list of connection types.
  def list(profileId: String): ConnectionTypesListResponse
}

object ConnectionTypesCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[ConnectionType],
    list: String => CallbackTo[ConnectionTypesListResponse]
  ): ConnectionTypesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[ConnectionTypesCollection]
  }
}

