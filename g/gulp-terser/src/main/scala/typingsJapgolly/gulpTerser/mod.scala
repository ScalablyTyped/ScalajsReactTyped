package typingsJapgolly.gulpTerser

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.terser.mod.MinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-terser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(options: MinifyOptions): ReadWriteStream = js.native
}

