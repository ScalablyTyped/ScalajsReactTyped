package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAcceptor[T] extends StObject {
  
  def acceptProposal(c: T): Any
  
  def calculationComplete(): Any
  
  def calculationStarts(): Any
}
object IAcceptor {
  
  inline def apply[T](acceptProposal: T => Any, calculationComplete: CallbackTo[Any], calculationStarts: CallbackTo[Any]): IAcceptor[T] = {
    val __obj = js.Dynamic.literal(acceptProposal = js.Any.fromFunction1(acceptProposal), calculationComplete = calculationComplete.toJsFn, calculationStarts = calculationStarts.toJsFn)
    __obj.asInstanceOf[IAcceptor[T]]
  }
  
  extension [Self <: IAcceptor[?], T](x: Self & IAcceptor[T]) {
    
    inline def setAcceptProposal(value: T => Any): Self = StObject.set(x, "acceptProposal", js.Any.fromFunction1(value))
    
    inline def setCalculationComplete(value: CallbackTo[Any]): Self = StObject.set(x, "calculationComplete", value.toJsFn)
    
    inline def setCalculationStarts(value: CallbackTo[Any]): Self = StObject.set(x, "calculationStarts", value.toJsFn)
  }
}
