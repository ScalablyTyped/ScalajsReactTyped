package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schemas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemasCollection extends js.Object {
  // Retrieve schema
  def get(customerId: String, schemaKey: String): Schema
  // Create schema.
  def insert(resource: Schema, customerId: String): Schema
  // Retrieve all schemas for a customer
  def list(customerId: String): Schemas
  // Update schema. This method supports patch semantics.
  def patch(resource: Schema, customerId: String, schemaKey: String): Schema
  // Delete schema
  def remove(customerId: String, schemaKey: String): Unit
  // Update schema
  def update(resource: Schema, customerId: String, schemaKey: String): Schema
}

object SchemasCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[Schema],
    insert: (Schema, String) => CallbackTo[Schema],
    list: String => CallbackTo[Schemas],
    patch: (Schema, String, String) => CallbackTo[Schema],
    remove: (String, String) => Callback,
    update: (Schema, String, String) => CallbackTo[Schema]
  ): SchemasCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema, t1: java.lang.String) => insert(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema, t1: java.lang.String, t2: java.lang.String) => patch(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema, t1: java.lang.String, t2: java.lang.String) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SchemasCollection]
  }
}

