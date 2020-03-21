package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountActiveAdSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesCollection extends js.Object {
  // Gets the account's active ad summary by account ID.
  def get(profileId: String, summaryAccountId: String): AccountActiveAdSummary
}

object AccountActiveAdSummariesCollection {
  @scala.inline
  def apply(get: (String, String) => CallbackTo[AccountActiveAdSummary]): AccountActiveAdSummariesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.asInstanceOf[AccountActiveAdSummariesCollection]
  }
}

