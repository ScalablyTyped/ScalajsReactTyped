package typingsJapgolly.firebaseAdmin.admin.projectManagement

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Firebase Android app.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.androidApp()`](admin.projectManagement.ProjectManagement#androidApp).
  */
trait AndroidApp extends js.Object {
  var appId: String
  /**
    * Adds the given SHA certificate to this Android app.
    *
    * @param certificateToAdd The SHA certificate to add.
    *
    * @return A promise that resolves when the given certificate
    *     has been added to the Android app.
    */
  def addShaCertificate(certificateToAdd: ShaCertificate): js.Promise[Unit]
  /**
    * Deletes the specified SHA certificate from this Android app.
    *
    * @param  certificateToDelete The SHA certificate to delete.
    *
    * @return A promise that resolves when the specified
    *     certificate has been removed from the Android app.
    */
  def deleteShaCertificate(certificateToRemove: ShaCertificate): js.Promise[Unit]
  /**
    * Gets the configuration artifact associated with this app.
    *
    * @return A promise that resolves to the Android app's
    *     Firebase config file, in UTF-8 string format. This string is typically
    *     intended to be written to a JSON file that gets shipped with your Android
    *     app.
    */
  def getConfig(): js.Promise[String]
  /**
    * Retrieves metadata about this Android app.
    *
    * @return A promise that resolves to the retrieved metadata about this Android app.
    */
  def getMetadata(): js.Promise[AndroidAppMetadata]
  /**
    * Gets the list of SHA certificates associated with this Android app in Firebase.
    *
    * @return The list of SHA-1 and SHA-256 certificates associated with this Android app in
    *     Firebase.
    */
  def getShaCertificates(): js.Promise[js.Array[ShaCertificate]]
  /**
    * Sets the optional user-assigned display name of the app.
    *
    * @param newDisplayName The new display name to set.
    *
    * @return A promise that resolves when the display name has been set.
    */
  def setDisplayName(newDisplayName: String): js.Promise[Unit]
}

object AndroidApp {
  @scala.inline
  def apply(
    addShaCertificate: ShaCertificate => CallbackTo[js.Promise[Unit]],
    appId: String,
    deleteShaCertificate: ShaCertificate => CallbackTo[js.Promise[Unit]],
    getConfig: CallbackTo[js.Promise[String]],
    getMetadata: CallbackTo[js.Promise[AndroidAppMetadata]],
    getShaCertificates: CallbackTo[js.Promise[js.Array[ShaCertificate]]],
    setDisplayName: String => CallbackTo[js.Promise[Unit]]
  ): AndroidApp = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.updateDynamic("addShaCertificate")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseAdmin.admin.projectManagement.ShaCertificate) => addShaCertificate(t0).runNow()))
    __obj.updateDynamic("deleteShaCertificate")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseAdmin.admin.projectManagement.ShaCertificate) => deleteShaCertificate(t0).runNow()))
    __obj.updateDynamic("getConfig")(getConfig.toJsFn)
    __obj.updateDynamic("getMetadata")(getMetadata.toJsFn)
    __obj.updateDynamic("getShaCertificates")(getShaCertificates.toJsFn)
    __obj.updateDynamic("setDisplayName")(js.Any.fromFunction1((t0: java.lang.String) => setDisplayName(t0).runNow()))
    __obj.asInstanceOf[AndroidApp]
  }
}

