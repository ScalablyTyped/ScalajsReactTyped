package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointOfViewValidationAcceptor
  extends StObject
     with ValidationAcceptor {
  
  def getPrimaryUnit(): ICompilationUnit
}
object PointOfViewValidationAcceptor {
  
  inline def apply(
    accept: ValidationIssue => Any,
    acceptUnique: ValidationIssue => Any,
    begin: CallbackTo[Any],
    end: CallbackTo[Any],
    getPrimaryUnit: CallbackTo[ICompilationUnit]
  ): PointOfViewValidationAcceptor = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acceptUnique = js.Any.fromFunction1(acceptUnique), begin = begin.toJsFn, end = end.toJsFn, getPrimaryUnit = getPrimaryUnit.toJsFn)
    __obj.asInstanceOf[PointOfViewValidationAcceptor]
  }
  
  extension [Self <: PointOfViewValidationAcceptor](x: Self) {
    
    inline def setGetPrimaryUnit(value: CallbackTo[ICompilationUnit]): Self = StObject.set(x, "getPrimaryUnit", value.toJsFn)
  }
}
