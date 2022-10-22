package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the initialization of a component with any source object. */
trait XSourceInitialization
  extends StObject
     with XInterface {
  
  /**
    * provides the initialization of a component with any source object.
    *
    * The service description has to specify which type of interface must be set as parameter.
    *
    * Hopefully you will only use this, when **Source** is an {@link com.sun.star.lang.XComponent} and this is an {@link com.sun.star.lang.XEventListener} .
    * Than you should call {@link com.sun.star.lang.XComponent.addEventListener()} from inside the implementation of this method.
    * @param Source the source.
    * @throws AlreadyInitializedException if this method is called more than once during the lifetime of the object implementing this interface.
    */
  def setSource(Source: XInterface): Unit
}
object XSourceInitialization {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setSource: XInterface => Callback
  ): XSourceInitialization = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSource = js.Any.fromFunction1((t0: XInterface) => setSource(t0).runNow()))
    __obj.asInstanceOf[XSourceInitialization]
  }
  
  extension [Self <: XSourceInitialization](x: Self) {
    
    inline def setSetSource(value: XInterface => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
  }
}
