package typingsJapgolly.gulp.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.vinyl.mod.File
import typingsJapgolly.vinylFs.mod.DestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestMethod extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
}

