package typingsJapgolly.snapsvg.mod

import typingsJapgolly.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snapsvg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var filter: Filter_ = js.native
  var path: Path_ = js.native
  def apply(DOM: SVGElement): Paper = js.native
  def apply(query: String): Paper = js.native
  def apply(width: String, height: String): Paper = js.native
  def apply(width: String, height: Double): Paper = js.native
  def apply(width: Double, height: String): Paper = js.native
  def apply(width: Double, height: Double): Paper = js.native
}

