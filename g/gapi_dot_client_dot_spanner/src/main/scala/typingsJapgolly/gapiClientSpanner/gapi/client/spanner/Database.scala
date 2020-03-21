package typingsJapgolly.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  /**
    * Required. The name of the database. Values are of the form
    * `projects/<project>/instances/<instance>/databases/<database>`,
    * where `<database>` is as specified in the `CREATE DATABASE`
    * statement. This name can be passed to other API methods to
    * identify the database.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Output only. The current database state. */
  var state: js.UndefOr[String] = js.undefined
}

object Database {
  @scala.inline
  def apply(name: String = null, state: String = null): Database = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
}

