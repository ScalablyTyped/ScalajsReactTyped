package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PostalCode
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PostalCodesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesCollection extends js.Object {
  // Gets one postal code by ID.
  def get(profileId: String, code: String): PostalCode
  // Retrieves a list of postal codes.
  def list(profileId: String): PostalCodesListResponse
}

object PostalCodesCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[PostalCode],
    list: String => CallbackTo[PostalCodesListResponse]
  ): PostalCodesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[PostalCodesCollection]
  }
}

