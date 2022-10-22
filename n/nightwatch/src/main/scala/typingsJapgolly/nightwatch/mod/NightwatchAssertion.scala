package typingsJapgolly.nightwatch.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchAssertion[T, U] extends StObject {
  
  var api: NightwatchAPI
  
  var client: NightwatchClient
  
  def command(callback: js.Function1[/* result */ U, Unit]): this.type
  
  var expected: js.Function0[T] | T
  
  var failure: js.UndefOr[js.Function1[/* result */ U, Boolean]] = js.undefined
  
  var message: String
  
  def pass(value: T): Any
  
  def value(result: U): T
}
object NightwatchAssertion {
  
  inline def apply[T, U](
    api: NightwatchAPI,
    client: NightwatchClient,
    command: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U],
    expected: js.Function0[T] | T,
    message: String,
    pass: T => Any,
    value: U => T
  ): NightwatchAssertion[T, U] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], command = js.Any.fromFunction1(command), expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pass = js.Any.fromFunction1(pass), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[NightwatchAssertion[T, U]]
  }
  
  extension [Self <: NightwatchAssertion[?, ?], T, U](x: Self & (NightwatchAssertion[T, U])) {
    
    inline def setApi(value: NightwatchAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setClient(value: NightwatchClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U]): Self = StObject.set(x, "command", js.Any.fromFunction1(value))
    
    inline def setExpected(value: js.Function0[T] | T): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedCallbackTo(value: CallbackTo[T]): Self = StObject.set(x, "expected", value.toJsFn)
    
    inline def setFailure(value: /* result */ U => Boolean): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPass(value: T => Any): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
    
    inline def setValue(value: U => T): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
