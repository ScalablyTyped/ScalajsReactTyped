package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface can be implemented by clients that need access to the toolkits window message loop. */
trait XEventHandler
  extends StObject
     with XInterface {
  
  /**
    * requests the implementor of this interface to handle a platform dependent event.
    * @param event the platform dependent event.
    * @returns `TRUE` if the event was handled properly and no further handling should take place, `FALSE` otherwise.
    */
  def handleEvent(event: Any): Boolean
}
object XEventHandler {
  
  inline def apply(acquire: Callback, handleEvent: Any => Boolean, queryInterface: `type` => Any, release: Callback): XEventHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEventHandler]
  }
  
  extension [Self <: XEventHandler](x: Self) {
    
    inline def setHandleEvent(value: Any => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
