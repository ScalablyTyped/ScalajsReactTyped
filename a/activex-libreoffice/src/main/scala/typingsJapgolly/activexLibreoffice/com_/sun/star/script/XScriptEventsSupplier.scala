package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gives access to an event container represented by an XNameContainer containing {@link ScriptEventDescriptor} instances. */
trait XScriptEventsSupplier
  extends StObject
     with XInterface {
  
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  val Events: XNameContainer
  
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  def getEvents(): XNameContainer
}
object XScriptEventsSupplier {
  
  inline def apply(
    Events: XNameContainer,
    acquire: Callback,
    getEvents: CallbackTo[XNameContainer],
    queryInterface: `type` => Any,
    release: Callback
  ): XScriptEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEvents = getEvents.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XScriptEventsSupplier]
  }
  
  extension [Self <: XScriptEventsSupplier](x: Self) {
    
    inline def setEvents(value: XNameContainer): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetEvents(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getEvents", value.toJsFn)
  }
}
