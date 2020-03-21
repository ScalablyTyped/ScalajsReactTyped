package typingsJapgolly.angularCompiler.r3AstMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[Result] extends js.Object {
  var visit: js.UndefOr[js.Function1[/* node */ Node, Result]] = js.undefined
  def visitBoundAttribute(attribute: BoundAttribute): Result
  def visitBoundEvent(attribute: BoundEvent): Result
  def visitBoundText(text: BoundText): Result
  def visitContent(content: Content): Result
  def visitElement(element: Element): Result
  def visitIcu(icu: Icu): Result
  def visitReference(reference: Reference): Result
  def visitTemplate(template: Template): Result
  def visitText(text: Text): Result
  def visitTextAttribute(attribute: TextAttribute): Result
  def visitVariable(variable: Variable): Result
}

object Visitor {
  @scala.inline
  def apply[Result](
    visitBoundAttribute: BoundAttribute => CallbackTo[Result],
    visitBoundEvent: BoundEvent => CallbackTo[Result],
    visitBoundText: BoundText => CallbackTo[Result],
    visitContent: Content => CallbackTo[Result],
    visitElement: Element => CallbackTo[Result],
    visitIcu: Icu => CallbackTo[Result],
    visitReference: Reference => CallbackTo[Result],
    visitTemplate: Template => CallbackTo[Result],
    visitText: Text => CallbackTo[Result],
    visitTextAttribute: TextAttribute => CallbackTo[Result],
    visitVariable: Variable => CallbackTo[Result],
    visit: /* node */ Node => CallbackTo[Result] = null
  ): Visitor[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitBoundAttribute")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.BoundAttribute) => visitBoundAttribute(t0).runNow()))
    __obj.updateDynamic("visitBoundEvent")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.BoundEvent) => visitBoundEvent(t0).runNow()))
    __obj.updateDynamic("visitBoundText")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.BoundText) => visitBoundText(t0).runNow()))
    __obj.updateDynamic("visitContent")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Content) => visitContent(t0).runNow()))
    __obj.updateDynamic("visitElement")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Element) => visitElement(t0).runNow()))
    __obj.updateDynamic("visitIcu")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Icu) => visitIcu(t0).runNow()))
    __obj.updateDynamic("visitReference")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Reference) => visitReference(t0).runNow()))
    __obj.updateDynamic("visitTemplate")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Template) => visitTemplate(t0).runNow()))
    __obj.updateDynamic("visitText")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Text) => visitText(t0).runNow()))
    __obj.updateDynamic("visitTextAttribute")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.TextAttribute) => visitTextAttribute(t0).runNow()))
    __obj.updateDynamic("visitVariable")(js.Any.fromFunction1((t0: typingsJapgolly.angularCompiler.r3AstMod.Variable) => visitVariable(t0).runNow()))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.angularCompiler.r3AstMod.Node) => visit(t0).runNow()))
    __obj.asInstanceOf[Visitor[Result]]
  }
}

