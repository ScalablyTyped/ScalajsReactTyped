package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a list of URLs bound to events of this object */
trait XEventsSupplier
  extends StObject
     with XInterface {
  
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  val Events: XNameReplace
  
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  def getEvents(): XNameReplace
}
object XEventsSupplier {
  
  inline def apply(
    Events: XNameReplace,
    acquire: Callback,
    getEvents: CallbackTo[XNameReplace],
    queryInterface: `type` => Any,
    release: Callback
  ): XEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEvents = getEvents.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEventsSupplier]
  }
  
  extension [Self <: XEventsSupplier](x: Self) {
    
    inline def setEvents(value: XNameReplace): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetEvents(value: CallbackTo[XNameReplace]): Self = StObject.set(x, "getEvents", value.toJsFn)
  }
}
