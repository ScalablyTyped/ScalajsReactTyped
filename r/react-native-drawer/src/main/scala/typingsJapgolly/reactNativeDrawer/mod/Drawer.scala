package typingsJapgolly.reactNativeDrawer.mod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawer
  extends Component[DrawerProperties, js.Object, js.Any] {
  /** Close the drawer programmatically. */
  def close(): Unit = js.native
  /** Open the drawer programmatically. */
  def open(): Unit = js.native
}

