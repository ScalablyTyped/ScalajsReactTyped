package typingsJapgolly.reactNativeFirebaseApp.ReactNativeFirebase

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  /**
    * The name (identifier) for this App. '[DEFAULT]' is the default App.
    */
  val name: String
  /**
    * The (read-only) configuration options from the app initialization.
    */
  val options: FirebaseAppOptions
  /**
    * Make this app unusable and free up resources.
    */
  def delete(): js.Promise[Unit]
}

object FirebaseApp {
  @scala.inline
  def apply(delete: CallbackTo[js.Promise[Unit]], name: String, options: FirebaseAppOptions): FirebaseApp = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.asInstanceOf[FirebaseApp]
  }
}

