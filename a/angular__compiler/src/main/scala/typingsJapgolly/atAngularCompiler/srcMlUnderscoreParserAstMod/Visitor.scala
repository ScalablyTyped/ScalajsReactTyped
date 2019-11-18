package typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* node */ Node, /* context */ js.Any, _]] = js.undefined
  def visitAttribute(attribute: Attribute, context: js.Any): js.Any
  def visitComment(comment: Comment, context: js.Any): js.Any
  def visitElement(element: Element, context: js.Any): js.Any
  def visitExpansion(expansion: Expansion, context: js.Any): js.Any
  def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any
  def visitText(text: Text, context: js.Any): js.Any
}

object Visitor {
  @scala.inline
  def apply(
    visitAttribute: (Attribute, js.Any) => CallbackTo[js.Any],
    visitComment: (Comment, js.Any) => CallbackTo[js.Any],
    visitElement: (Element, js.Any) => CallbackTo[js.Any],
    visitExpansion: (Expansion, js.Any) => CallbackTo[js.Any],
    visitExpansionCase: (ExpansionCase, js.Any) => CallbackTo[js.Any],
    visitText: (Text, js.Any) => CallbackTo[js.Any],
    visit: (/* node */ Node, /* context */ js.Any) => CallbackTo[_] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitAttribute")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Attribute, t1: js.Any) => visitAttribute(t0, t1).runNow()))
    __obj.updateDynamic("visitComment")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Comment, t1: js.Any) => visitComment(t0, t1).runNow()))
    __obj.updateDynamic("visitElement")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Element, t1: js.Any) => visitElement(t0, t1).runNow()))
    __obj.updateDynamic("visitExpansion")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion, t1: js.Any) => visitExpansion(t0, t1).runNow()))
    __obj.updateDynamic("visitExpansionCase")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase, t1: js.Any) => visitExpansionCase(t0, t1).runNow()))
    __obj.updateDynamic("visitText")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Text, t1: js.Any) => visitText(t0, t1).runNow()))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserAstMod.Node, t1: /* context */ js.Any) => visit(t0, t1).runNow()))
    __obj.asInstanceOf[Visitor]
  }
}

