package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows generic access to all spreadsheet functions.
  * @see com.sun.star.sheet.FunctionAccess
  */
trait XFunctionAccess
  extends StObject
     with XInterface {
  
  /**
    * calls a function and returns the result of the call.
    * @param aName the (programmatic) name of the function.
    * @param aArguments the arguments for the function call. Each element must be of one of the following types:  **long or double**: for a numeric value.;
    * @returns the result of the function call.  Possible types for the result are:  **VOID**: if no result is available.;   **double**: for a numeric result.;
    * @throws com::sun::star::container::NoSuchElementException if the named function does not exist.
    * @throws com::sun::star::lang::IllegalArgumentException if the function can not be called with these arguments.
    */
  def callFunction(aName: String, aArguments: SeqEquiv[Any]): Any
}
object XFunctionAccess {
  
  inline def apply(
    acquire: Callback,
    callFunction: (String, SeqEquiv[Any]) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XFunctionAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, callFunction = js.Any.fromFunction2(callFunction), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFunctionAccess]
  }
  
  extension [Self <: XFunctionAccess](x: Self) {
    
    inline def setCallFunction(value: (String, SeqEquiv[Any]) => Any): Self = StObject.set(x, "callFunction", js.Any.fromFunction2(value))
  }
}
