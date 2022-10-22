package typingsJapgolly.angularCompiler.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullVisitor
  extends StObject
     with Visitor3[Unit]
object NullVisitor {
  
  inline def apply(
    visitBoundAttribute: TmplAstBoundAttribute => Callback,
    visitBoundEvent: TmplAstBoundEvent => Callback,
    visitBoundText: TmplAstBoundText => Callback,
    visitContent: TmplAstContent => Callback,
    visitElement: TmplAstElement => Callback,
    visitIcu: TmplAstIcu => Callback,
    visitReference: TmplAstReference => Callback,
    visitTemplate: TmplAstTemplate => Callback,
    visitText: TmplAstText => Callback,
    visitTextAttribute: TmplAstTextAttribute => Callback,
    visitVariable: TmplAstVariable => Callback
  ): NullVisitor = {
    val __obj = js.Dynamic.literal(visitBoundAttribute = js.Any.fromFunction1((t0: TmplAstBoundAttribute) => visitBoundAttribute(t0).runNow()), visitBoundEvent = js.Any.fromFunction1((t0: TmplAstBoundEvent) => visitBoundEvent(t0).runNow()), visitBoundText = js.Any.fromFunction1((t0: TmplAstBoundText) => visitBoundText(t0).runNow()), visitContent = js.Any.fromFunction1((t0: TmplAstContent) => visitContent(t0).runNow()), visitElement = js.Any.fromFunction1((t0: TmplAstElement) => visitElement(t0).runNow()), visitIcu = js.Any.fromFunction1((t0: TmplAstIcu) => visitIcu(t0).runNow()), visitReference = js.Any.fromFunction1((t0: TmplAstReference) => visitReference(t0).runNow()), visitTemplate = js.Any.fromFunction1((t0: TmplAstTemplate) => visitTemplate(t0).runNow()), visitText = js.Any.fromFunction1((t0: TmplAstText) => visitText(t0).runNow()), visitTextAttribute = js.Any.fromFunction1((t0: TmplAstTextAttribute) => visitTextAttribute(t0).runNow()), visitVariable = js.Any.fromFunction1((t0: TmplAstVariable) => visitVariable(t0).runNow()))
    __obj.asInstanceOf[NullVisitor]
  }
}
