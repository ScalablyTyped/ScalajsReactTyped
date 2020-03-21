package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Filter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListFiltersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersCollection extends js.Object {
  // Creates a filter.
  def create(resource: Filter, userId: String): Filter
  // Gets a filter.
  def get(userId: String, id: String): Filter
  // Lists the message filters of a Gmail user.
  def list(userId: String): ListFiltersResponse
  // Deletes a filter.
  def remove(userId: String, id: String): Unit
}

object FiltersCollection {
  @scala.inline
  def apply(
    create: (Filter, String) => CallbackTo[Filter],
    get: (String, String) => CallbackTo[Filter],
    list: String => CallbackTo[ListFiltersResponse],
    remove: (String, String) => Callback
  ): FiltersCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Filter, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[FiltersCollection]
  }
}

