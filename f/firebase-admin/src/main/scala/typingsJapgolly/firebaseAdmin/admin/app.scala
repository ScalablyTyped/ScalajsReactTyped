package typingsJapgolly.firebaseAdmin.admin

import typingsJapgolly.firebaseAdmin.admin.auth.Auth
import typingsJapgolly.firebaseAdmin.admin.database.Database
import typingsJapgolly.firebaseAdmin.admin.firestore.Firestore
import typingsJapgolly.firebaseAdmin.admin.instanceId.InstanceId
import typingsJapgolly.firebaseAdmin.admin.messaging.Messaging
import typingsJapgolly.firebaseAdmin.admin.projectManagement.ProjectManagement
import typingsJapgolly.firebaseAdmin.admin.securityRules.SecurityRules
import typingsJapgolly.firebaseAdmin.admin.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.app")
@js.native
object app extends js.Object {
  /**
    * A Firebase app holds the initialization information for a collection of
    * services.
    *
    * Do not call this constructor directly. Instead, use
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *   `admin.initializeApp()`}
    * to create an app.
    */
  @js.native
  trait App extends js.Object {
    /**
      * The (read-only) name for this app.
      *
      * The default app's name is `"[DEFAULT]"`.
      *
      * @example
      * ```javascript
      * // The default app's name is "[DEFAULT]"
      * admin.initializeApp(defaultAppConfig);
      * console.log(admin.app().name);  // "[DEFAULT]"
      * ```
      *
      * @example
      * ```javascript
      * // A named app's name is what you provide to initializeApp()
      * var otherApp = admin.initializeApp(otherAppConfig, "other");
      * console.log(otherApp.name);  // "other"
      * ```
      */
    var name: String = js.native
    /**
      * The (read-only) configuration options for this app. These are the original
      * parameters given in
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}.
      *
      * @example
      * ```javascript
      * var app = admin.initializeApp(config);
      * console.log(app.options.credential === config.credential);  // true
      * console.log(app.options.databaseURL === config.databaseURL);  // true
      * ```
      */
    var options: AppOptions = js.native
    def auth(): Auth = js.native
    def database(): Database = js.native
    def database(url: String): Database = js.native
    /**
      * Renders this local `FirebaseApp` unusable and frees the resources of
      * all associated services (though it does *not* clean up any backend
      * resources). When running the SDK locally, this method
      * must be called to ensure graceful termination of the process.
      *
      * @example
      * ```javascript
      * app.delete()
      *   .then(function() {
      *     console.log("App deleted successfully");
      *   })
      *   .catch(function(error) {
      *     console.log("Error deleting app:", error);
      *   });
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    def firestore(): Firestore = js.native
    def instanceId(): InstanceId = js.native
    def messaging(): Messaging = js.native
    def projectManagement(): ProjectManagement = js.native
    def securityRules(): SecurityRules = js.native
    def storage(): Storage = js.native
  }
  
  def apply(): App = js.native
  def apply(name: String): App = js.native
}

