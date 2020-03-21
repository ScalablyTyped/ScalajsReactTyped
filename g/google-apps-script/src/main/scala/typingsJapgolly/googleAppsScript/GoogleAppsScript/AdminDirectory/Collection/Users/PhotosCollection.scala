package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Users

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotosCollection extends js.Object {
  // Retrieve photo of a user
  def get(userKey: String): UserPhoto
  // Add a photo for the user. This method supports patch semantics.
  def patch(resource: UserPhoto, userKey: String): UserPhoto
  // Remove photos for the user
  def remove(userKey: String): Unit
  // Add a photo for the user
  def update(resource: UserPhoto, userKey: String): UserPhoto
}

object PhotosCollection {
  @scala.inline
  def apply(
    get: String => CallbackTo[UserPhoto],
    patch: (UserPhoto, String) => CallbackTo[UserPhoto],
    remove: String => Callback,
    update: (UserPhoto, String) => CallbackTo[UserPhoto]
  ): PhotosCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto, t1: java.lang.String) => patch(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto, t1: java.lang.String) => update(t0, t1).runNow()))
    __obj.asInstanceOf[PhotosCollection]
  }
}

