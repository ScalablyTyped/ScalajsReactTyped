package typingsJapgolly.popmotion.mod

import typingsJapgolly.std.Element
import typingsJapgolly.std.Window_
import typingsJapgolly.stylefire.typesMod.Props
import typingsJapgolly.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "styler")
@js.native
object styler extends js.Object {
  def apply(nodeOrSelector: String): Styler = js.native
  def apply(nodeOrSelector: String, props: Props): Styler = js.native
  def apply(nodeOrSelector: Element): Styler = js.native
  def apply(nodeOrSelector: Element, props: Props): Styler = js.native
  def apply(nodeOrSelector: Window_): Styler = js.native
  def apply(nodeOrSelector: Window_, props: Props): Styler = js.native
}

