package typingsJapgolly.hexo.mod.extend

import typingsJapgolly.hexo.mod.Box.File
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processor extends js.Object {
  def register(fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: js.Function1[/* str */ String, _], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def register(pattern: RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
}

