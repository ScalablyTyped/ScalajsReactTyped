package typingsJapgolly.realm.Realm.Sync

import typingsJapgolly.realm.Realm
import typingsJapgolly.realm.Realm.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.Adapter")
@js.native
class Adapter protected () extends js.Object {
  def this(
    local_path: String,
    server_url: String,
    admin_user: User,
    filter: String,
    change_callback: js.Function
  ) = this()
  def this(
    local_path: String,
    server_url: String,
    admin_user: User,
    filter: RealmWatchPredicate,
    change_callback: js.Function
  ) = this()
  def this(
    local_path: String,
    server_url: String,
    admin_user: User,
    filter: String,
    change_callback: js.Function,
    ssl: SSLConfiguration
  ) = this()
  def this(
    local_path: String,
    server_url: String,
    admin_user: User,
    filter: RealmWatchPredicate,
    change_callback: js.Function,
    ssl: SSLConfiguration
  ) = this()
  /**
    * Advance the to the next transaction indicating that you are done processing the current instructions for the given Realm.
    * @param path the path for the Realm to advance
    */
  def advance(path: String): Unit = js.native
  def close(): Unit = js.native
  def current(path: String): js.Array[Instruction] = js.native
  def realmAtPath(path: String): Realm = js.native
  def realmAtPath(path: String, schema: js.Array[ObjectSchema]): Realm = js.native
}

