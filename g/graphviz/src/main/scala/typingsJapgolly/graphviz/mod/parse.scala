package typingsJapgolly.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphviz", "parse")
@js.native
object parse extends js.Object {
  def apply(path: String, callback: ParseCallback): Unit = js.native
  def apply(path: String, callback: ParseCallback, errback: ErrorCallback): Unit = js.native
}

