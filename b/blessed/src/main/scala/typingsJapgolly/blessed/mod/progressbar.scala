package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.ProgressBarElement
import typingsJapgolly.blessed.mod.Widgets.ProgressBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "progressbar")
@js.native
object progressbar extends js.Object {
  def apply(): ProgressBarElement = js.native
  def apply(options: ProgressBarOptions): ProgressBarElement = js.native
}

