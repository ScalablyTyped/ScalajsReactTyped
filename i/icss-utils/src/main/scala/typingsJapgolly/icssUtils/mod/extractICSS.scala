package typingsJapgolly.icssUtils.mod

import typingsJapgolly.postcss.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("icss-utils", "extractICSS")
@js.native
object extractICSS extends js.Object {
  def apply(css: Container): ExtractedICSS = js.native
  def apply(css: Container, removeRules: Boolean): ExtractedICSS = js.native
}

