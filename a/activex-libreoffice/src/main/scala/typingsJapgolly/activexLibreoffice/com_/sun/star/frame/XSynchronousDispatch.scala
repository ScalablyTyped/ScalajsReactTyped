package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * additional interfaces for dispatch objects: allow to execute with return value
  * @see XDispatch
  * @since OOo 2.0
  */
trait XSynchronousDispatch
  extends StObject
     with XInterface {
  
  /**
    * dispatches a URL synchronously and offers a return values
    *
    * After getting a dispatch object as a result of a queryDispatch call, this interface can be used to dispatch the URL synchronously and with a return
    * value.
    * @param URL full parsed URL which describe the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request They depend on the real implementation of the dispatch object.
    */
  def dispatchWithReturnValue(URL: URL, Arguments: SeqEquiv[PropertyValue]): Any
}
object XSynchronousDispatch {
  
  inline def apply(
    acquire: Callback,
    dispatchWithReturnValue: (URL, SeqEquiv[PropertyValue]) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XSynchronousDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dispatchWithReturnValue = js.Any.fromFunction2(dispatchWithReturnValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSynchronousDispatch]
  }
  
  extension [Self <: XSynchronousDispatch](x: Self) {
    
    inline def setDispatchWithReturnValue(value: (URL, SeqEquiv[PropertyValue]) => Any): Self = StObject.set(x, "dispatchWithReturnValue", js.Any.fromFunction2(value))
  }
}
