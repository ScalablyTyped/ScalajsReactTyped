package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationAcceptor extends StObject {
  
  def accept(issue: ValidationIssue): Any
  
  def acceptUnique(issue: ValidationIssue): Any
  
  def begin(): Any
  
  def end(): Any
}
object ValidationAcceptor {
  
  inline def apply(
    accept: ValidationIssue => Any,
    acceptUnique: ValidationIssue => Any,
    begin: CallbackTo[Any],
    end: CallbackTo[Any]
  ): ValidationAcceptor = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acceptUnique = js.Any.fromFunction1(acceptUnique), begin = begin.toJsFn, end = end.toJsFn)
    __obj.asInstanceOf[ValidationAcceptor]
  }
  
  extension [Self <: ValidationAcceptor](x: Self) {
    
    inline def setAccept(value: ValidationIssue => Any): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setAcceptUnique(value: ValidationIssue => Any): Self = StObject.set(x, "acceptUnique", js.Any.fromFunction1(value))
    
    inline def setBegin(value: CallbackTo[Any]): Self = StObject.set(x, "begin", value.toJsFn)
    
    inline def setEnd(value: CallbackTo[Any]): Self = StObject.set(x, "end", value.toJsFn)
  }
}
