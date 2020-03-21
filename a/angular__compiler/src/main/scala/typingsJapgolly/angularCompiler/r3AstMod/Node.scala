package typingsJapgolly.angularCompiler.r3AstMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var sourceSpan: ParseSourceSpan
  def visit[Result](visitor: Visitor[Result]): Result
}

object Node {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => CallbackTo[js.Any]): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Visitor[js.Any]) => visit(t0).runNow()))
    __obj.asInstanceOf[Node]
  }
}

