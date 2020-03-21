package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Power
////////////////////
/**
  * Use the chrome.power API to override the system's power management features.
  * Permissions:  "power"
  * @since Chrome 27.
  */
@JSGlobal("chrome.power")
@js.native
object power extends js.Object {
  def releaseKeepAwake(): Unit = js.native
  def requestKeepAwake(level: String): Unit = js.native
}

