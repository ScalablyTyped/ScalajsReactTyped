package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Groups

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Aliases
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasesCollection extends js.Object {
  // Add a alias for the group
  def insert(resource: Alias, groupKey: String): Alias
  // List all aliases for a group
  def list(groupKey: String): Aliases
  // Remove a alias for the group
  def remove(groupKey: String, alias: String): Unit
}

object AliasesCollection {
  @scala.inline
  def apply(
    insert: (Alias, String) => CallbackTo[Alias],
    list: String => CallbackTo[Aliases],
    remove: (String, String) => Callback
  ): AliasesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias, t1: java.lang.String) => insert(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[AliasesCollection]
  }
}

