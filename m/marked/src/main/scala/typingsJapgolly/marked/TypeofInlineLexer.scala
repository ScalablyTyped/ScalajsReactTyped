package typingsJapgolly.marked

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.marked.mod.InlineLexer_
import typingsJapgolly.marked.mod.MarkedOptions
import typingsJapgolly.marked.mod.Rules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofInlineLexer
  extends Instantiable1[/* links */ js.Array[String], InlineLexer_]
     with Instantiable2[/* links */ js.Array[String], /* options */ MarkedOptions, InlineLexer_] {
  var rules: Rules = js.native
  def escapes(text: String): String = js.native
  def output(src: String, links: js.Array[String]): String = js.native
  def output(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
}

