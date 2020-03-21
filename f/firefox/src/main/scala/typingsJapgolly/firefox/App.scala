package typingsJapgolly.firefox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var installOrigin: String
  var installTime: Double
  var manifest: js.Any
  var manifestURL: String
  var origin: String
  var receipts: js.Array[_]
  def checkForUpdate(): DOMRequest[_]
  def launch(): Unit
}

object App {
  @scala.inline
  def apply(
    checkForUpdate: CallbackTo[DOMRequest[js.Any]],
    installOrigin: String,
    installTime: Double,
    launch: Callback,
    manifest: js.Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[_]
  ): App = {
    val __obj = js.Dynamic.literal(installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.updateDynamic("checkForUpdate")(checkForUpdate.toJsFn)
    __obj.updateDynamic("launch")(launch.toJsFn)
    __obj.asInstanceOf[App]
  }
}

