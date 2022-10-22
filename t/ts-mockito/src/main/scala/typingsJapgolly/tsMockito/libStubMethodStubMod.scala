package typingsJapgolly.tsMockito

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStubMethodStubMod {
  
  trait MethodStub extends StObject {
    
    def execute(args: js.Array[Any]): Unit
    
    def getGroupIndex(): Double
    
    def getValue(): Any
    
    def isApplicable(args: js.Array[Any]): Boolean
  }
  object MethodStub {
    
    inline def apply(
      execute: js.Array[Any] => Callback,
      getGroupIndex: CallbackTo[Double],
      getValue: CallbackTo[Any],
      isApplicable: js.Array[Any] => Boolean
    ): MethodStub = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1((t0: js.Array[Any]) => execute(t0).runNow()), getGroupIndex = getGroupIndex.toJsFn, getValue = getValue.toJsFn, isApplicable = js.Any.fromFunction1(isApplicable))
      __obj.asInstanceOf[MethodStub]
    }
    
    extension [Self <: MethodStub](x: Self) {
      
      inline def setExecute(value: js.Array[Any] => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
      
      inline def setGetGroupIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getGroupIndex", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setIsApplicable(value: js.Array[Any] => Boolean): Self = StObject.set(x, "isApplicable", js.Any.fromFunction1(value))
    }
  }
}
