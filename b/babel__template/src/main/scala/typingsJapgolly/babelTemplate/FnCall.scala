package typingsJapgolly.babelTemplate

import typingsJapgolly.babelTemplate.mod.TemplateBuilderOptions
import typingsJapgolly.babelTypes.mod.Statement
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(tpl: String): Statement | js.Array[Statement] = js.native
  def apply(tpl: String, opts: TemplateBuilderOptions): Statement | js.Array[Statement] = js.native
  def apply(tpl: TemplateStringsArray, args: js.Any*): Statement | js.Array[Statement] = js.native
}

