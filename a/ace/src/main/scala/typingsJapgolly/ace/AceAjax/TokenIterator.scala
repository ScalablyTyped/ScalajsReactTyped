package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenIterator extends StObject {
  
  /**
    * Returns the current tokenized string.
    **/
  def getCurrentToken(): TokenInfo
  
  /**
    * Returns the current column.
    **/
  def getCurrentTokenColumn(): Double
  
  /**
    * Returns the current row.
    **/
  def getCurrentTokenRow(): Double
  
  /**
    * Tokenizes all the items from the current point to the row prior in the document.
    **/
  def stepBackward(): js.Array[String]
  
  /**
    * Tokenizes all the items from the current point until the next row in the document. If the current point is at the end of the file, this function returns `null`. Otherwise, it returns the tokenized string.
    **/
  def stepForward(): String
}
object TokenIterator {
  
  inline def apply(
    getCurrentToken: CallbackTo[TokenInfo],
    getCurrentTokenColumn: CallbackTo[Double],
    getCurrentTokenRow: CallbackTo[Double],
    stepBackward: CallbackTo[js.Array[String]],
    stepForward: CallbackTo[String]
  ): TokenIterator = {
    val __obj = js.Dynamic.literal(getCurrentToken = getCurrentToken.toJsFn, getCurrentTokenColumn = getCurrentTokenColumn.toJsFn, getCurrentTokenRow = getCurrentTokenRow.toJsFn, stepBackward = stepBackward.toJsFn, stepForward = stepForward.toJsFn)
    __obj.asInstanceOf[TokenIterator]
  }
  
  extension [Self <: TokenIterator](x: Self) {
    
    inline def setGetCurrentToken(value: CallbackTo[TokenInfo]): Self = StObject.set(x, "getCurrentToken", value.toJsFn)
    
    inline def setGetCurrentTokenColumn(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTokenColumn", value.toJsFn)
    
    inline def setGetCurrentTokenRow(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTokenRow", value.toJsFn)
    
    inline def setStepBackward(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "stepBackward", value.toJsFn)
    
    inline def setStepForward(value: CallbackTo[String]): Self = StObject.set(x, "stepForward", value.toJsFn)
  }
}
