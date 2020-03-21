package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.std.Element
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "on")
@js.native
object on extends js.Object {
  def apply(element: Element, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def apply(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(element: Window_, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def apply(
    element: Window_,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
}

