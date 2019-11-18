package typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var sourceSpan: ParseSourceSpan
  def visit(visitor: Visitor, context: js.Any): js.Any
}

object Node {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: (Visitor, js.Any) => CallbackTo[js.Any]): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Visitor, t1: js.Any) => visit(t0, t1).runNow()))
    __obj.asInstanceOf[Node]
  }
}

