package typingsJapgolly.w3cWebUsb

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBConnectionEvent")
@js.native
class USBConnectionEvent protected () extends Event_ {
  def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  val device: USBDevice = js.native
}

