package typingsJapgolly.clipboardJs.mod

import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClipboardJsStatic extends js.Object {
  def copy(`val`: String): js.Promise[Unit] = js.native
  def copy(`val`: Element): js.Promise[Unit] = js.native
  def paste(): js.Promise[String] = js.native
}

