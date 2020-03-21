package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarrier
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarriersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersCollection extends js.Object {
  // Gets one mobile carrier by ID.
  def get(profileId: String, id: String): MobileCarrier
  // Retrieves a list of mobile carriers.
  def list(profileId: String): MobileCarriersListResponse
}

object MobileCarriersCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[MobileCarrier],
    list: String => CallbackTo[MobileCarriersListResponse]
  ): MobileCarriersCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[MobileCarriersCollection]
  }
}

