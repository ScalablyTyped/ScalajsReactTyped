package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredicateVisitor extends StObject {
  
  def andOrPredicate(context: PredicateContext): String
  
  def anyAllPredicate(context: PredicateContext): String
  
  def binaryPredicate(context: PredicateContext): String
  
  def fnExpr(context: PredicateContext): String
  
  def litExpr(): Any
  
  def passthruPredicate(): String
  
  def propExpr(context: PredicateContext): String
  
  def unaryPredicate(context: PredicateContext): String
}
object PredicateVisitor {
  
  inline def apply(
    andOrPredicate: PredicateContext => String,
    anyAllPredicate: PredicateContext => String,
    binaryPredicate: PredicateContext => String,
    fnExpr: PredicateContext => String,
    litExpr: CallbackTo[Any],
    passthruPredicate: CallbackTo[String],
    propExpr: PredicateContext => String,
    unaryPredicate: PredicateContext => String
  ): PredicateVisitor = {
    val __obj = js.Dynamic.literal(andOrPredicate = js.Any.fromFunction1(andOrPredicate), anyAllPredicate = js.Any.fromFunction1(anyAllPredicate), binaryPredicate = js.Any.fromFunction1(binaryPredicate), fnExpr = js.Any.fromFunction1(fnExpr), litExpr = litExpr.toJsFn, passthruPredicate = passthruPredicate.toJsFn, propExpr = js.Any.fromFunction1(propExpr), unaryPredicate = js.Any.fromFunction1(unaryPredicate))
    __obj.asInstanceOf[PredicateVisitor]
  }
  
  extension [Self <: PredicateVisitor](x: Self) {
    
    inline def setAndOrPredicate(value: PredicateContext => String): Self = StObject.set(x, "andOrPredicate", js.Any.fromFunction1(value))
    
    inline def setAnyAllPredicate(value: PredicateContext => String): Self = StObject.set(x, "anyAllPredicate", js.Any.fromFunction1(value))
    
    inline def setBinaryPredicate(value: PredicateContext => String): Self = StObject.set(x, "binaryPredicate", js.Any.fromFunction1(value))
    
    inline def setFnExpr(value: PredicateContext => String): Self = StObject.set(x, "fnExpr", js.Any.fromFunction1(value))
    
    inline def setLitExpr(value: CallbackTo[Any]): Self = StObject.set(x, "litExpr", value.toJsFn)
    
    inline def setPassthruPredicate(value: CallbackTo[String]): Self = StObject.set(x, "passthruPredicate", value.toJsFn)
    
    inline def setPropExpr(value: PredicateContext => String): Self = StObject.set(x, "propExpr", js.Any.fromFunction1(value))
    
    inline def setUnaryPredicate(value: PredicateContext => String): Self = StObject.set(x, "unaryPredicate", js.Any.fromFunction1(value))
  }
}
