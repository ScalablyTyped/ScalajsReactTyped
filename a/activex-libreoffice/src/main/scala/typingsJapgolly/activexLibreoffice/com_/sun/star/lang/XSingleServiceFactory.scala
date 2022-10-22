package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Factory interface to produce instances of an implementation of a service specification.
  *
  * This interface is deprecated. Please use {@link XSingleComponentFactory} .
  * @deprecated Deprecated
  * @see XInitialization
  */
trait XSingleServiceFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an instance of a service implementation.
    * @returns service instance
    */
  def createInstance(): XInterface
  
  /**
    * Creates an instance of a service implementation initialized with some arguments.
    * @param aArguments arguments passed to implementation
    * @returns service instance
    */
  def createInstanceWithArguments(aArguments: SeqEquiv[Any]): XInterface
}
object XSingleServiceFactory {
  
  inline def apply(
    acquire: Callback,
    createInstance: CallbackTo[XInterface],
    createInstanceWithArguments: SeqEquiv[Any] => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XSingleServiceFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstance = createInstance.toJsFn, createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSingleServiceFactory]
  }
  
  extension [Self <: XSingleServiceFactory](x: Self) {
    
    inline def setCreateInstance(value: CallbackTo[XInterface]): Self = StObject.set(x, "createInstance", value.toJsFn)
    
    inline def setCreateInstanceWithArguments(value: SeqEquiv[Any] => XInterface): Self = StObject.set(x, "createInstanceWithArguments", js.Any.fromFunction1(value))
  }
}
