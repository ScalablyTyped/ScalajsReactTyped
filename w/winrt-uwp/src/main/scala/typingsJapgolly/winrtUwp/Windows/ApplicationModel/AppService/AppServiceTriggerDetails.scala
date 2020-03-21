package typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details associated with the background task for the app service. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceTriggerDetails")
@js.native
abstract class AppServiceTriggerDetails () extends js.Object {
  /** Gets the connection to the endpoint of the other app service. */
  var appServiceConnection: AppServiceConnection = js.native
  /** Gets the name of the package family for the client app that called the background task for the app service. */
  var callerPackageFamilyName: String = js.native
  /** Gets the name of the app service. */
  var name: String = js.native
}

