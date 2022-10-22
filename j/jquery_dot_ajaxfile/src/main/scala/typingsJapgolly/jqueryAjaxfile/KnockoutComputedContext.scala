package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutComputedContext extends StObject {
  
  def getDependenciesCount(): Double
  
  def isInitial(): Boolean
  
  var isSleeping: Boolean
}
object KnockoutComputedContext {
  
  inline def apply(getDependenciesCount: CallbackTo[Double], isInitial: CallbackTo[Boolean], isSleeping: Boolean): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(getDependenciesCount = getDependenciesCount.toJsFn, isInitial = isInitial.toJsFn, isSleeping = isSleeping.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutComputedContext]
  }
  
  extension [Self <: KnockoutComputedContext](x: Self) {
    
    inline def setGetDependenciesCount(value: CallbackTo[Double]): Self = StObject.set(x, "getDependenciesCount", value.toJsFn)
    
    inline def setIsInitial(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInitial", value.toJsFn)
    
    inline def setIsSleeping(value: Boolean): Self = StObject.set(x, "isSleeping", value.asInstanceOf[js.Any])
  }
}
