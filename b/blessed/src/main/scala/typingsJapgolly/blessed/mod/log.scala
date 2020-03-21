package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.Log
import typingsJapgolly.blessed.mod.Widgets.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "log")
@js.native
object log extends js.Object {
  def apply(): Log = js.native
  def apply(options: LogOptions): Log = js.native
}

