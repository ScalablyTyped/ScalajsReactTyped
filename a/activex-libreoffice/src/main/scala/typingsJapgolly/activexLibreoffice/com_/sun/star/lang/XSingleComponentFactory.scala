package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Factory interface to create instances of an implementation of a service specification.
  * @see XInitialization
  */
trait XSingleComponentFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an instance of a component and initializes the new instance with the given arguments and context.
    * @param Arguments arguments passed to implementation
    * @param Context the instance gets its deployment values from this
    * @returns component instance
    */
  def createInstanceWithArgumentsAndContext(Arguments: SeqEquiv[Any], Context: XComponentContext): XInterface
  
  /**
    * Creates an instance of a service implementation.
    * @param Context the instance gets its deployment values from this
    * @returns component instance
    */
  def createInstanceWithContext(Context: XComponentContext): XInterface
}
object XSingleComponentFactory {
  
  inline def apply(
    acquire: Callback,
    createInstanceWithArgumentsAndContext: (SeqEquiv[Any], XComponentContext) => XInterface,
    createInstanceWithContext: XComponentContext => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XSingleComponentFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstanceWithArgumentsAndContext = js.Any.fromFunction2(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction1(createInstanceWithContext), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSingleComponentFactory]
  }
  
  extension [Self <: XSingleComponentFactory](x: Self) {
    
    inline def setCreateInstanceWithArgumentsAndContext(value: (SeqEquiv[Any], XComponentContext) => XInterface): Self = StObject.set(x, "createInstanceWithArgumentsAndContext", js.Any.fromFunction2(value))
    
    inline def setCreateInstanceWithContext(value: XComponentContext => XInterface): Self = StObject.set(x, "createInstanceWithContext", js.Any.fromFunction1(value))
  }
}
