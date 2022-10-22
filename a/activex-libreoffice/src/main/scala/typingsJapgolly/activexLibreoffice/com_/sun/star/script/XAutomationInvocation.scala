package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAutomationInvocation
  extends StObject
     with XInvocation {
  
  def invokeGetProperty(
    aFunctionName: String,
    aParams: SeqEquiv[Any],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[Any]]
  ): Any
  
  def invokePutProperty(
    aFunctionName: String,
    aParams: SeqEquiv[Any],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[Any]]
  ): Any
}
object XAutomationInvocation {
  
  inline def apply(
    Introspection: XIntrospectionAccess,
    acquire: Callback,
    getIntrospection: CallbackTo[XIntrospectionAccess],
    getValue: String => Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
    invokeGetProperty: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
    invokePutProperty: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
    queryInterface: `type` => Any,
    release: Callback,
    setValue: (String, Any) => Callback
  ): XAutomationInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection.asInstanceOf[js.Any], acquire = acquire.toJsFn, getIntrospection = getIntrospection.toJsFn, getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), invokeGetProperty = js.Any.fromFunction4(invokeGetProperty), invokePutProperty = js.Any.fromFunction4(invokePutProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setValue = js.Any.fromFunction2((t0: String, t1: Any) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XAutomationInvocation]
  }
  
  extension [Self <: XAutomationInvocation](x: Self) {
    
    inline def setInvokeGetProperty(value: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any): Self = StObject.set(x, "invokeGetProperty", js.Any.fromFunction4(value))
    
    inline def setInvokePutProperty(value: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any): Self = StObject.set(x, "invokePutProperty", js.Any.fromFunction4(value))
  }
}
