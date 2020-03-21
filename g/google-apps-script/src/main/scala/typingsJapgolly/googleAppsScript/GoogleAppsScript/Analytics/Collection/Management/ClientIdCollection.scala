package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientIdCollection extends js.Object {
  // Hashes the given Client ID.
  def hashClientId(resource: HashClientIdRequest): HashClientIdResponse
}

object ClientIdCollection {
  @scala.inline
  def apply(hashClientId: HashClientIdRequest => CallbackTo[HashClientIdResponse]): ClientIdCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashClientId")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest) => hashClientId(t0).runNow()))
    __obj.asInstanceOf[ClientIdCollection]
  }
}

