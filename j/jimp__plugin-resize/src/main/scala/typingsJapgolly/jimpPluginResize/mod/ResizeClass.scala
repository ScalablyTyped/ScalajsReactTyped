package typingsJapgolly.jimpPluginResize.mod

import typingsJapgolly.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeClass extends js.Object {
  def resize(w: Double, h: Double): this.type = js.native
  def resize(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  def resize(w: Double, h: Double, mode: String): this.type = js.native
  def resize(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
}

