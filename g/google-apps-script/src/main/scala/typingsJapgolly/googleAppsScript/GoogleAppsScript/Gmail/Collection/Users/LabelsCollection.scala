package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListLabelsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsCollection extends js.Object {
  // Creates a new label.
  def create(resource: Label, userId: String): Label
  // Gets the specified label.
  def get(userId: String, id: String): Label
  // Lists all labels in the user's mailbox.
  def list(userId: String): ListLabelsResponse
  // Updates the specified label. This method supports patch semantics.
  def patch(resource: Label, userId: String, id: String): Label
  // Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to.
  def remove(userId: String, id: String): Unit
  // Updates the specified label.
  def update(resource: Label, userId: String, id: String): Label
}

object LabelsCollection {
  @scala.inline
  def apply(
    create: (Label, String) => CallbackTo[Label],
    get: (String, String) => CallbackTo[Label],
    list: String => CallbackTo[ListLabelsResponse],
    patch: (Label, String, String) => CallbackTo[Label],
    remove: (String, String) => Callback,
    update: (Label, String, String) => CallbackTo[Label]
  ): LabelsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label, t1: java.lang.String, t2: java.lang.String) => patch(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label, t1: java.lang.String, t2: java.lang.String) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[LabelsCollection]
  }
}

