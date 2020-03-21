package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.IScreenOptions
import typingsJapgolly.blessed.mod.Widgets.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "screen")
@js.native
object screen extends js.Object {
  def apply(): Screen = js.native
  def apply(options: IScreenOptions): Screen = js.native
}

