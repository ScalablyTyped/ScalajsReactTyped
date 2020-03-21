package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.MessageElement
import typingsJapgolly.blessed.mod.Widgets.MessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "message")
@js.native
object message extends js.Object {
  def apply(): MessageElement = js.native
  def apply(options: MessageOptions): MessageElement = js.native
}

