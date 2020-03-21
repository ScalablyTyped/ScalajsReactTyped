package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.UserDeletion

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequestCollection extends js.Object {
  // Insert or update a user deletion requests.
  def upsert(resource: UserDeletionRequest): UserDeletionRequest
}

object UserDeletionRequestCollection {
  @scala.inline
  def apply(upsert: UserDeletionRequest => CallbackTo[UserDeletionRequest]): UserDeletionRequestCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("upsert")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest) => upsert(t0).runNow()))
    __obj.asInstanceOf[UserDeletionRequestCollection]
  }
}

