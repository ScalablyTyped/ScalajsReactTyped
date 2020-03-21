package typingsJapgolly.firebaseAdmin.admin.projectManagement

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Firebase iOS app.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.iosApp()`](admin.projectManagement.ProjectManagement#iosApp).
  */
trait IosApp extends js.Object {
  var appId: String
  /**
    * Gets the configuration artifact associated with this app.
    *
    * @return A promise that resolves to the iOS app's Firebase
    *     config file, in UTF-8 string format. This string is typically intended to
    *     be written to a plist file that gets shipped with your iOS app.
    */
  def getConfig(): js.Promise[String]
  /**
    * Retrieves metadata about this iOS app.
    *
    * @return {!Promise<admin.projectManagement.IosAppMetadata>} A promise that
    *     resolves to the retrieved metadata about this iOS app.
    */
  def getMetadata(): js.Promise[IosAppMetadata]
  /**
    * Sets the optional user-assigned display name of the app.
    *
    * @param newDisplayName The new display name to set.
    *
    * @return A promise that resolves when the display name has
    *     been set.
    */
  def setDisplayName(newDisplayName: String): js.Promise[Unit]
}

object IosApp {
  @scala.inline
  def apply(
    appId: String,
    getConfig: CallbackTo[js.Promise[String]],
    getMetadata: CallbackTo[js.Promise[IosAppMetadata]],
    setDisplayName: String => CallbackTo[js.Promise[Unit]]
  ): IosApp = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.updateDynamic("getConfig")(getConfig.toJsFn)
    __obj.updateDynamic("getMetadata")(getMetadata.toJsFn)
    __obj.updateDynamic("setDisplayName")(js.Any.fromFunction1((t0: java.lang.String) => setDisplayName(t0).runNow()))
    __obj.asInstanceOf[IosApp]
  }
}

