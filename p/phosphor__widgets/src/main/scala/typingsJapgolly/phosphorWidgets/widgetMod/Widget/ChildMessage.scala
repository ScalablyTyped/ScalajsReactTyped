package typingsJapgolly.phosphorWidgets.widgetMod.Widget

import typingsJapgolly.phosphorMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message class for child related messages.
  */
@JSImport("@phosphor/widgets/lib/widget", "Widget.ChildMessage")
@js.native
class ChildMessage protected () extends Message {
  /**
    * Construct a new child message.
    *
    * @param type - The message type.
    *
    * @param child - The child widget for the message.
    */
  def this(`type`: String, child: typingsJapgolly.phosphorWidgets.widgetMod.Widget) = this()
  /**
    * The child widget for the message.
    */
  val child: typingsJapgolly.phosphorWidgets.widgetMod.Widget = js.native
}

