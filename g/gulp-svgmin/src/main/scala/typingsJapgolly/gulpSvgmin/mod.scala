package typingsJapgolly.gulpSvgmin

import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.svgo.mod.Options
import typingsJapgolly.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-svgmin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Transform = js.native
  def apply(cb: js.Function1[/* file */ File, Options]): Transform = js.native
  def apply(options: Options): Transform = js.native
}

