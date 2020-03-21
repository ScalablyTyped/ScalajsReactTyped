package typingsJapgolly.atom.mod

import org.scalajs.dom.raw.Node
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCompatible[Element /* <: Node */] extends Iterable[Element] {
  var jquery: String = js.native
}

