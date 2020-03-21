package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Asp
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Asps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AspsCollection extends js.Object {
  // Get information about an ASP issued by a user.
  def get(userKey: String, codeId: Double): Asp
  // List the ASPs issued by a user.
  def list(userKey: String): Asps
  // Delete an ASP issued by a user.
  def remove(userKey: String, codeId: Double): Unit
}

object AspsCollection {
  @scala.inline
  def apply(
    get: (String, Double) => CallbackTo[Asp],
    list: String => CallbackTo[Asps],
    remove: (String, Double) => Callback
  ): AspsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[AspsCollection]
  }
}

