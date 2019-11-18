package typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateAst extends js.Object {
  /**
    * The source span from which this node was parsed.
    */
  var sourceSpan: ParseSourceSpan
  /**
    * Visit this node and possibly transform it.
    */
  def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any
}

object TemplateAst {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: (TemplateAstVisitor, js.Any) => CallbackTo[js.Any]): TemplateAst = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor, t1: js.Any) => visit(t0, t1).runNow()))
    __obj.asInstanceOf[TemplateAst]
  }
}

