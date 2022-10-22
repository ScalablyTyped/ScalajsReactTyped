package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * initializes an object directly after its creation.
  *
  * This interface works together with factories. If you want to initialize the object after creation, you should support this interface and you may
  * support other interfaces which offer type-safe initialization methods.
  *
  * Instead of calling {@link XSingleComponentFactory.createInstanceWithContext()} and later {@link initialize()} , you should call {@link
  * XSingleComponentFactory.createInstanceWithArgumentsAndContext()} to pass the arguments to the instance. The reason is, that a component may want to
  * return the same instance for the same set of parameters, and it can do so by implementing the factory itself.
  */
trait XInitialization
  extends StObject
     with XInterface {
  
  /**
    * initializes the object.
    *
    * It should be called directly after the object is created.
    */
  def initialize(aArguments: SeqEquiv[Any]): Unit
}
object XInitialization {
  
  inline def apply(
    acquire: Callback,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XInitialization = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInitialization]
  }
  
  extension [Self <: XInitialization](x: Self) {
    
    inline def setInitialize(value: SeqEquiv[Any] => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: SeqEquiv[Any]) => value(t0).runNow()))
  }
}
