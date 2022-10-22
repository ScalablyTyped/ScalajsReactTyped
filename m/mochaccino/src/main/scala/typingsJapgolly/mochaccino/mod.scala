package typingsJapgolly.mochaccino

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mochaccino.mochaccinoBooleans.`true`
import typingsJapgolly.mochaccino.mochaccinoStrings.document
import typingsJapgolly.mochaccino.mochaccinoStrings.navigator
import typingsJapgolly.mochaccino.mochaccinoStrings.window
import typingsJapgolly.sinon.mod.SinonStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mochaccino", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mochaccino", "dom")
  @js.native
  val dom: Dom_ = js.native
  
  inline def expect(value: Any): Expect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("expect")(value.asInstanceOf[js.Any]).asInstanceOf[Expect_]
  
  inline def spy(config: Any*): js.Function1[/* repeated */ Any, SpyProxy] = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(config.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, SpyProxy]]
  
  trait Dom_ extends StObject {
    
    def clear(): Unit
    
    def create(): Unit
    
    def destroy(): Unit
    
    var exposedProperties: js.Tuple3[window, navigator, document]
  }
  object Dom_ {
    
    inline def apply(
      clear: Callback,
      create: Callback,
      destroy: Callback,
      exposedProperties: js.Tuple3[window, navigator, document]
    ): Dom_ = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, create = create.toJsFn, destroy = destroy.toJsFn, exposedProperties = exposedProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dom_]
    }
    
    extension [Self <: Dom_](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setExposedProperties(value: js.Tuple3[window, navigator, document]): Self = StObject.set(x, "exposedProperties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expect_ extends StObject {
    
    var not: Expect_
    
    def toBe(arg: Any): Unit
    
    def toBeDefined(): Unit
    
    def toBeFalsy(): Unit
    
    def toBeGreaterThan(other: Double): Unit
    
    def toBeLessThan(other: Double): Unit
    
    def toBeNull(): Unit
    
    def toBeTruthy(): Unit
    
    def toBeUndefined(): Unit
    
    def toContain(arg: Any): Unit
    
    def toEqual(arg: Any): Unit
    
    def toHaveBeenCalled(): Unit
    
    def toHaveBeenCalledTimes(callCount: Double): Unit
    
    def toHaveBeenCalledWith(arg: Any*): Unit
    
    def toMatch(matchExpression: Any): Unit
    
    def toThrow(): Unit
    
    def toThrowError(errType: Any): Unit
  }
  object Expect_ {
    
    inline def apply(
      not: Expect_,
      toBe: Any => Callback,
      toBeDefined: Callback,
      toBeFalsy: Callback,
      toBeGreaterThan: Double => Callback,
      toBeLessThan: Double => Callback,
      toBeNull: Callback,
      toBeTruthy: Callback,
      toBeUndefined: Callback,
      toContain: Any => Callback,
      toEqual: Any => Callback,
      toHaveBeenCalled: Callback,
      toHaveBeenCalledTimes: Double => Callback,
      toHaveBeenCalledWith: /* repeated */ Any => Callback,
      toMatch: Any => Callback,
      toThrow: Callback,
      toThrowError: Any => Callback
    ): Expect_ = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], toBe = js.Any.fromFunction1((t0: Any) => toBe(t0).runNow()), toBeDefined = toBeDefined.toJsFn, toBeFalsy = toBeFalsy.toJsFn, toBeGreaterThan = js.Any.fromFunction1((t0: Double) => toBeGreaterThan(t0).runNow()), toBeLessThan = js.Any.fromFunction1((t0: Double) => toBeLessThan(t0).runNow()), toBeNull = toBeNull.toJsFn, toBeTruthy = toBeTruthy.toJsFn, toBeUndefined = toBeUndefined.toJsFn, toContain = js.Any.fromFunction1((t0: Any) => toContain(t0).runNow()), toEqual = js.Any.fromFunction1((t0: Any) => toEqual(t0).runNow()), toHaveBeenCalled = toHaveBeenCalled.toJsFn, toHaveBeenCalledTimes = js.Any.fromFunction1((t0: Double) => toHaveBeenCalledTimes(t0).runNow()), toHaveBeenCalledWith = js.Any.fromFunction1((t0: /* repeated */ Any) => toHaveBeenCalledWith(t0).runNow()), toMatch = js.Any.fromFunction1((t0: Any) => toMatch(t0).runNow()), toThrow = toThrow.toJsFn, toThrowError = js.Any.fromFunction1((t0: Any) => toThrowError(t0).runNow()))
      __obj.asInstanceOf[Expect_]
    }
    
    extension [Self <: Expect_](x: Self) {
      
      inline def setNot(value: Expect_): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setToBe(value: Any => Callback): Self = StObject.set(x, "toBe", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToBeDefined(value: Callback): Self = StObject.set(x, "toBeDefined", value.toJsFn)
      
      inline def setToBeFalsy(value: Callback): Self = StObject.set(x, "toBeFalsy", value.toJsFn)
      
      inline def setToBeGreaterThan(value: Double => Callback): Self = StObject.set(x, "toBeGreaterThan", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setToBeLessThan(value: Double => Callback): Self = StObject.set(x, "toBeLessThan", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setToBeNull(value: Callback): Self = StObject.set(x, "toBeNull", value.toJsFn)
      
      inline def setToBeTruthy(value: Callback): Self = StObject.set(x, "toBeTruthy", value.toJsFn)
      
      inline def setToBeUndefined(value: Callback): Self = StObject.set(x, "toBeUndefined", value.toJsFn)
      
      inline def setToContain(value: Any => Callback): Self = StObject.set(x, "toContain", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToEqual(value: Any => Callback): Self = StObject.set(x, "toEqual", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToHaveBeenCalled(value: Callback): Self = StObject.set(x, "toHaveBeenCalled", value.toJsFn)
      
      inline def setToHaveBeenCalledTimes(value: Double => Callback): Self = StObject.set(x, "toHaveBeenCalledTimes", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setToHaveBeenCalledWith(value: /* repeated */ Any => Callback): Self = StObject.set(x, "toHaveBeenCalledWith", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setToMatch(value: Any => Callback): Self = StObject.set(x, "toMatch", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToThrow(value: Callback): Self = StObject.set(x, "toThrow", value.toJsFn)
      
      inline def setToThrowError(value: Any => Callback): Self = StObject.set(x, "toThrowError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait SpyProxy extends StObject {
    
    var and: SpyProxy
    
    def callFake(fake: js.Function1[/* repeated */ Any, Any]): Unit
    
    def callThrough(): Unit
    
    def getSubject(): SinonStub[js.Array[Any], Any]
    
    def returnValue(obj: Any): Unit
    
    var spyProxy: `true`
  }
  object SpyProxy {
    
    inline def apply(
      and: SpyProxy,
      callFake: js.Function1[/* repeated */ Any, Any] => Callback,
      callThrough: Callback,
      getSubject: CallbackTo[SinonStub[js.Array[Any], Any]],
      returnValue: Any => Callback
    ): SpyProxy = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], callFake = js.Any.fromFunction1((t0: js.Function1[/* repeated */ Any, Any]) => callFake(t0).runNow()), callThrough = callThrough.toJsFn, getSubject = getSubject.toJsFn, returnValue = js.Any.fromFunction1((t0: Any) => returnValue(t0).runNow()), spyProxy = true)
      __obj.asInstanceOf[SpyProxy]
    }
    
    extension [Self <: SpyProxy](x: Self) {
      
      inline def setAnd(value: SpyProxy): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setCallFake(value: js.Function1[/* repeated */ Any, Any] => Callback): Self = StObject.set(x, "callFake", js.Any.fromFunction1((t0: js.Function1[/* repeated */ Any, Any]) => value(t0).runNow()))
      
      inline def setCallThrough(value: Callback): Self = StObject.set(x, "callThrough", value.toJsFn)
      
      inline def setGetSubject(value: CallbackTo[SinonStub[js.Array[Any], Any]]): Self = StObject.set(x, "getSubject", value.toJsFn)
      
      inline def setReturnValue(value: Any => Callback): Self = StObject.set(x, "returnValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSpyProxy(value: `true`): Self = StObject.set(x, "spyProxy", value.asInstanceOf[js.Any])
    }
  }
}
