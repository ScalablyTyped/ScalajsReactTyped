package typingsJapgolly.regexpp.visitorMod

import typingsJapgolly.regexpp.astMod.Node
import typingsJapgolly.regexpp.visitorMod.RegExpVisitor.Handlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp/visitor", "RegExpVisitor")
@js.native
class RegExpVisitor_ protected () extends js.Object {
  def this(handlers: Handlers) = this()
  def visit(node: Node): Unit = js.native
}

