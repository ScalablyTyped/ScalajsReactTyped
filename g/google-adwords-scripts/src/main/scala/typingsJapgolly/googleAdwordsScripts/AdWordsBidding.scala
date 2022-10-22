package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsBidding extends StObject {
  
  def getStrategy(): BiddingStrategy
  
  def getStrategySource(): BiddingStrategySource
  
  def getStrategyType(): String
}
object AdWordsBidding {
  
  inline def apply(
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[BiddingStrategySource],
    getStrategyType: CallbackTo[String]
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal(getStrategy = getStrategy.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn)
    __obj.asInstanceOf[AdWordsBidding]
  }
  
  extension [Self <: AdWordsBidding](x: Self) {
    
    inline def setGetStrategy(value: CallbackTo[BiddingStrategy]): Self = StObject.set(x, "getStrategy", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[BiddingStrategySource]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
  }
}
