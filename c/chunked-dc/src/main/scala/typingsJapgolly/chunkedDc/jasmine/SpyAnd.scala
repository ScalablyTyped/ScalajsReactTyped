package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpyAnd extends StObject {
  
  /** By chaining the spy with and.callFake, all calls to the spy will delegate to the supplied function. */
  def callFake(fn: js.Function): Spy
  
  /** By chaining the spy with and.callThrough, the spy will still track all calls to it but in addition it will delegate to the actual implementation. */
  def callThrough(): Spy
  
  /** By chaining the spy with and.returnValue, all calls to the function will return a specific value. */
  def returnValue(`val`: scala.Any): Spy
  
  /** By chaining the spy with and.returnValues, all calls to the function will return specific values in order until it reaches the end of the return values list. */
  def returnValues(values: scala.Any*): Spy
  
  /** When a calling strategy is used for a spy, the original stubbing behavior can be returned at any time with and.stub. */
  def stub(): Spy
  
  /** By chaining the spy with and.throwError, all calls to the spy will throw the specified value. */
  def throwError(msg: String): Spy
}
object SpyAnd {
  
  inline def apply(
    callFake: js.Function => Spy,
    callThrough: CallbackTo[Spy],
    returnValue: scala.Any => Spy,
    returnValues: /* repeated */ scala.Any => Spy,
    stub: CallbackTo[Spy],
    throwError: String => Spy
  ): SpyAnd = {
    val __obj = js.Dynamic.literal(callFake = js.Any.fromFunction1(callFake), callThrough = callThrough.toJsFn, returnValue = js.Any.fromFunction1(returnValue), returnValues = js.Any.fromFunction1(returnValues), stub = stub.toJsFn, throwError = js.Any.fromFunction1(throwError))
    __obj.asInstanceOf[SpyAnd]
  }
  
  extension [Self <: SpyAnd](x: Self) {
    
    inline def setCallFake(value: js.Function => Spy): Self = StObject.set(x, "callFake", js.Any.fromFunction1(value))
    
    inline def setCallThrough(value: CallbackTo[Spy]): Self = StObject.set(x, "callThrough", value.toJsFn)
    
    inline def setReturnValue(value: scala.Any => Spy): Self = StObject.set(x, "returnValue", js.Any.fromFunction1(value))
    
    inline def setReturnValues(value: /* repeated */ scala.Any => Spy): Self = StObject.set(x, "returnValues", js.Any.fromFunction1(value))
    
    inline def setStub(value: CallbackTo[Spy]): Self = StObject.set(x, "stub", value.toJsFn)
    
    inline def setThrowError(value: String => Spy): Self = StObject.set(x, "throwError", js.Any.fromFunction1(value))
  }
}
