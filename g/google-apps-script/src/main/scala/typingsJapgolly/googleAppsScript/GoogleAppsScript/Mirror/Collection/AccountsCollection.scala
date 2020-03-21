package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCollection extends js.Object {
  // Inserts a new account for a user
  def insert(resource: Account, userToken: String, accountType: String, accountName: String): Account
}

object AccountsCollection {
  @scala.inline
  def apply(insert: (Account, String, String, String) => CallbackTo[Account]): AccountsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction4((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => insert(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AccountsCollection]
  }
}

