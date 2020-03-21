package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Token
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Tokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensCollection extends js.Object {
  // Get information about an access token issued by a user.
  def get(userKey: String, clientId: String): Token
  // Returns the set of tokens specified user has issued to 3rd party applications.
  def list(userKey: String): Tokens
  // Delete all access tokens issued by a user for an application.
  def remove(userKey: String, clientId: String): Unit
}

object TokensCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[Token],
    list: String => CallbackTo[Tokens],
    remove: (String, String) => Callback
  ): TokensCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[TokensCollection]
  }
}

