package typingsJapgolly.aceBuilds.mod.Ace

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenIterator extends StObject {
  
  def getCurrentToken(): Token
  
  def getCurrentTokenColumn(): Double
  
  def getCurrentTokenPosition(): Point
  
  def getCurrentTokenRange(): Range
  
  def getCurrentTokenRow(): Double
  
  def stepBackward(): Token
  
  def stepForward(): Token
}
object TokenIterator {
  
  inline def apply(
    getCurrentToken: CallbackTo[Token],
    getCurrentTokenColumn: CallbackTo[Double],
    getCurrentTokenPosition: CallbackTo[Point],
    getCurrentTokenRange: CallbackTo[Range],
    getCurrentTokenRow: CallbackTo[Double],
    stepBackward: CallbackTo[Token],
    stepForward: CallbackTo[Token]
  ): TokenIterator = {
    val __obj = js.Dynamic.literal(getCurrentToken = getCurrentToken.toJsFn, getCurrentTokenColumn = getCurrentTokenColumn.toJsFn, getCurrentTokenPosition = getCurrentTokenPosition.toJsFn, getCurrentTokenRange = getCurrentTokenRange.toJsFn, getCurrentTokenRow = getCurrentTokenRow.toJsFn, stepBackward = stepBackward.toJsFn, stepForward = stepForward.toJsFn)
    __obj.asInstanceOf[TokenIterator]
  }
  
  extension [Self <: TokenIterator](x: Self) {
    
    inline def setGetCurrentToken(value: CallbackTo[Token]): Self = StObject.set(x, "getCurrentToken", value.toJsFn)
    
    inline def setGetCurrentTokenColumn(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTokenColumn", value.toJsFn)
    
    inline def setGetCurrentTokenPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getCurrentTokenPosition", value.toJsFn)
    
    inline def setGetCurrentTokenRange(value: CallbackTo[Range]): Self = StObject.set(x, "getCurrentTokenRange", value.toJsFn)
    
    inline def setGetCurrentTokenRow(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTokenRow", value.toJsFn)
    
    inline def setStepBackward(value: CallbackTo[Token]): Self = StObject.set(x, "stepBackward", value.toJsFn)
    
    inline def setStepForward(value: CallbackTo[Token]): Self = StObject.set(x, "stepForward", value.toJsFn)
  }
}
