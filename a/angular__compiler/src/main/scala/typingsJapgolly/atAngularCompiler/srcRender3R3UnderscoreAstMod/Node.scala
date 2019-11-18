package typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
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
    __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Visitor[js.Any]) => visit(t0).runNow()))
    __obj.asInstanceOf[Node]
  }
}

