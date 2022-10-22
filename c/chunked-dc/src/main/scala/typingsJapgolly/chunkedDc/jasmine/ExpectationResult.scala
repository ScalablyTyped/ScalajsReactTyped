package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectationResult
  extends StObject
     with Result {
  
  var actual: scala.Any
  
  var expected: scala.Any
  
  var matcherName: String
  
  var message: String
  
  def passed(): Boolean
  
  var trace: Trace
}
object ExpectationResult {
  
  inline def apply(
    actual: scala.Any,
    expected: scala.Any,
    matcherName: String,
    message: String,
    passed: CallbackTo[Boolean],
    trace: Trace,
    `type`: String
  ): ExpectationResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = passed.toJsFn, trace = trace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationResult]
  }
  
  extension [Self <: ExpectationResult](x: Self) {
    
    inline def setActual(value: scala.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setExpected(value: scala.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setMatcherName(value: String): Self = StObject.set(x, "matcherName", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPassed(value: CallbackTo[Boolean]): Self = StObject.set(x, "passed", value.toJsFn)
    
    inline def setTrace(value: Trace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
  }
}
