package typingsJapgolly.gulpPostcss.mod

import typingsJapgolly.gulpPostcss.AnonOptions
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-postcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(callback: js.Function1[/* file */ File, AnonOptions]): ReadWriteStream = js.native
  def apply(plugins: js.Array[_]): ReadWriteStream = js.native
  def apply(plugins: js.Array[_], options: Options): ReadWriteStream = js.native
}

