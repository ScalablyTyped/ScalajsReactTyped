package typingsJapgolly.gulpUglify.composerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gulpUglify.FnCall
import typingsJapgolly.uglifyJs.mod.MinifyOptions
import typingsJapgolly.uglifyJs.mod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uglify extends js.Object {
  @JSName("minify")
  var minify_Original: FnCall = js.native
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
}

