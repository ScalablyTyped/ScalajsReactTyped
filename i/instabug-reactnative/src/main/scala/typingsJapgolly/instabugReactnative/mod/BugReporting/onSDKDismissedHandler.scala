package typingsJapgolly.instabugReactnative.mod.BugReporting

import typingsJapgolly.instabugReactnative.mod.dismissType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "BugReporting.onSDKDismissedHandler")
@js.native
object onSDKDismissedHandler extends js.Object {
  def apply(handler: js.Function2[/* dismiss */ dismissType, /* report */ reportType, Unit]): Unit = js.native
}

