package typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateAstVisitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* ast */ TemplateAst, /* context */ js.Any, _]] = js.undefined
  def visitAttr(ast: AttrAst, context: js.Any): js.Any
  def visitBoundText(ast: BoundTextAst, context: js.Any): js.Any
  def visitDirective(ast: DirectiveAst, context: js.Any): js.Any
  def visitDirectiveProperty(ast: BoundDirectivePropertyAst, context: js.Any): js.Any
  def visitElement(ast: ElementAst, context: js.Any): js.Any
  def visitElementProperty(ast: BoundElementPropertyAst, context: js.Any): js.Any
  def visitEmbeddedTemplate(ast: EmbeddedTemplateAst, context: js.Any): js.Any
  def visitEvent(ast: BoundEventAst, context: js.Any): js.Any
  def visitNgContent(ast: NgContentAst, context: js.Any): js.Any
  def visitReference(ast: ReferenceAst, context: js.Any): js.Any
  def visitText(ast: TextAst, context: js.Any): js.Any
  def visitVariable(ast: VariableAst, context: js.Any): js.Any
}

object TemplateAstVisitor {
  @scala.inline
  def apply(
    visitAttr: (AttrAst, js.Any) => CallbackTo[js.Any],
    visitBoundText: (BoundTextAst, js.Any) => CallbackTo[js.Any],
    visitDirective: (DirectiveAst, js.Any) => CallbackTo[js.Any],
    visitDirectiveProperty: (BoundDirectivePropertyAst, js.Any) => CallbackTo[js.Any],
    visitElement: (ElementAst, js.Any) => CallbackTo[js.Any],
    visitElementProperty: (BoundElementPropertyAst, js.Any) => CallbackTo[js.Any],
    visitEmbeddedTemplate: (EmbeddedTemplateAst, js.Any) => CallbackTo[js.Any],
    visitEvent: (BoundEventAst, js.Any) => CallbackTo[js.Any],
    visitNgContent: (NgContentAst, js.Any) => CallbackTo[js.Any],
    visitReference: (ReferenceAst, js.Any) => CallbackTo[js.Any],
    visitText: (TextAst, js.Any) => CallbackTo[js.Any],
    visitVariable: (VariableAst, js.Any) => CallbackTo[js.Any],
    visit: (/* ast */ TemplateAst, /* context */ js.Any) => CallbackTo[_] = null
  ): TemplateAstVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitAttr")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.AttrAst, t1: js.Any) => visitAttr(t0, t1).runNow()))
    __obj.updateDynamic("visitBoundText")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundTextAst, t1: js.Any) => visitBoundText(t0, t1).runNow()))
    __obj.updateDynamic("visitDirective")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.DirectiveAst, t1: js.Any) => visitDirective(t0, t1).runNow()))
    __obj.updateDynamic("visitDirectiveProperty")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundDirectivePropertyAst, t1: js.Any) => visitDirectiveProperty(t0, t1).runNow()))
    __obj.updateDynamic("visitElement")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ElementAst, t1: js.Any) => visitElement(t0, t1).runNow()))
    __obj.updateDynamic("visitElementProperty")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst, t1: js.Any) => visitElementProperty(t0, t1).runNow()))
    __obj.updateDynamic("visitEmbeddedTemplate")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.EmbeddedTemplateAst, t1: js.Any) => visitEmbeddedTemplate(t0, t1).runNow()))
    __obj.updateDynamic("visitEvent")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst, t1: js.Any) => visitEvent(t0, t1).runNow()))
    __obj.updateDynamic("visitNgContent")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.NgContentAst, t1: js.Any) => visitNgContent(t0, t1).runNow()))
    __obj.updateDynamic("visitReference")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ReferenceAst, t1: js.Any) => visitReference(t0, t1).runNow()))
    __obj.updateDynamic("visitText")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TextAst, t1: js.Any) => visitText(t0, t1).runNow()))
    __obj.updateDynamic("visitVariable")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst, t1: js.Any) => visitVariable(t0, t1).runNow()))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: /* ast */ typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst, t1: /* context */ js.Any) => visit(t0, t1).runNow()))
    __obj.asInstanceOf[TemplateAstVisitor]
  }
}

