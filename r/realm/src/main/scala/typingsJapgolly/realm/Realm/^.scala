package typingsJapgolly.realm.Realm

import typingsJapgolly.realm.ProgressPromise
import typingsJapgolly.realm.Realm.Sync.ProgressNotificationCallback
import typingsJapgolly.realm.Realm.Sync.User
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm")
@js.native
object ^ extends js.Object {
  var defaultPath: String = js.native
  /**
    * @deprecated in favor of `Realm.Sync.User.createConfiguration()`.
    * Return a configuration for a default Realm.
    * @param {Realm.Sync.User} optional user.
    */
  def automaticSyncConfiguration(): String = js.native
  def automaticSyncConfiguration(user: User): String = js.native
  /**
    * Clears the state by closing and deleting any Realm in the default directory and logout all users.
    * @private Not a part of the public API: It's primarily used from the library's tests.
    */
  def clearTestState(): Unit = js.native
  /**
    * Copy all bundled Realm files to app's default file folder.
    */
  def copyBundledRealmFiles(): Unit = js.native
  /**
    * @param {Realm.ObjectSchema} object schema describing the object that should be created.
    * @returns {T}
    */
  def createTemplateObject[T](objectSchema: ObjectSchema): T with Object = js.native
  /**
    * Delete the Realm file for the given configuration.
    * @param {Configuration} config
    */
  def deleteFile(config: Configuration): Unit = js.native
  /**
    * Checks if the Realm already exists on disk.
    */
  def exists(config: Configuration): Boolean = js.native
  /**
    * Open a realm asynchronously with a promise. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    */
  def open(config: Configuration): ProgressPromise = js.native
  /**
    * @deprecated in favor of `Realm.open`
    * Open a realm asynchronously with a callback. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    * @param {Function} callback will be called when the realm is ready.
    * @param {ProgressNotificationCallback} progressCallback? a progress notification callback for 'download' direction and 'forCurrentlyOutstandingWork' mode
    */
  def openAsync(config: Configuration, callback: js.Function2[/* error */ js.Any, /* realm */ this.type, Unit]): Unit = js.native
  def openAsync(
    config: Configuration,
    callback: js.Function2[/* error */ js.Any, /* realm */ this.type, Unit],
    progressCallback: ProgressNotificationCallback
  ): Unit = js.native
  /**
    * Get the current schema version of the Realm at the given path.
    * @param  {string} path
    * @param  {any} encryptionKey?
    * @returns number
    */
  def schemaVersion(path: String): Double = js.native
  def schemaVersion(path: String, encryptionKey: ArrayBuffer): Double = js.native
  def schemaVersion(path: String, encryptionKey: ArrayBufferView): Double = js.native
}

