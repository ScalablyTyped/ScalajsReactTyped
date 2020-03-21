package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.ListElement
import typingsJapgolly.blessed.mod.Widgets.ListElementStyle
import typingsJapgolly.blessed.mod.Widgets.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "list")
@js.native
object list extends js.Object {
  def apply(): ListElement = js.native
  def apply(options: ListOptions[ListElementStyle]): ListElement = js.native
}

