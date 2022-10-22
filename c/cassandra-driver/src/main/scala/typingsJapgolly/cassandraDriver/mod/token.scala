package typingsJapgolly.cassandraDriver.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object token {
  
  trait Token extends StObject {
    
    def compare(other: Token): Double
    
    def equals(other: Token): Boolean
    
    def getType(): Code
    
    def getValue(): Any
  }
  object Token {
    
    inline def apply(
      compare: Token => Double,
      equals_ : Token => Boolean,
      getType: CallbackTo[Code],
      getValue: CallbackTo[Any]
    ): Token = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), getType = getType.toJsFn, getValue = getValue.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setCompare(value: Token => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Token => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetType(value: CallbackTo[Code]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    }
  }
  
  trait TokenRange extends StObject {
    
    def compare(other: TokenRange): Double
    
    def contains(token: Token): Boolean
    
    var end: Token
    
    def equals(other: TokenRange): Boolean
    
    def isEmpty(): Boolean
    
    def isWrappedAround(): Boolean
    
    def splitEvenly(numberOfSplits: Double): js.Array[TokenRange]
    
    var start: Token
    
    def unwrap(): js.Array[TokenRange]
  }
  object TokenRange {
    
    inline def apply(
      compare: TokenRange => Double,
      contains: Token => Boolean,
      end: Token,
      equals_ : TokenRange => Boolean,
      isEmpty: CallbackTo[Boolean],
      isWrappedAround: CallbackTo[Boolean],
      splitEvenly: Double => js.Array[TokenRange],
      start: Token,
      unwrap: CallbackTo[js.Array[TokenRange]]
    ): TokenRange = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), contains = js.Any.fromFunction1(contains), end = end.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, isWrappedAround = isWrappedAround.toJsFn, splitEvenly = js.Any.fromFunction1(splitEvenly), start = start.asInstanceOf[js.Any], unwrap = unwrap.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TokenRange]
    }
    
    extension [Self <: TokenRange](x: Self) {
      
      inline def setCompare(value: TokenRange => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setContains(value: Token => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setEnd(value: Token): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: TokenRange => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setIsWrappedAround(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWrappedAround", value.toJsFn)
      
      inline def setSplitEvenly(value: Double => js.Array[TokenRange]): Self = StObject.set(x, "splitEvenly", js.Any.fromFunction1(value))
      
      inline def setStart(value: Token): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUnwrap(value: CallbackTo[js.Array[TokenRange]]): Self = StObject.set(x, "unwrap", value.toJsFn)
    }
  }
}
