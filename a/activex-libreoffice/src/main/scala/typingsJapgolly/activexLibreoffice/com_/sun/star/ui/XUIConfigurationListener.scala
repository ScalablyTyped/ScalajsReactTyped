package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supplies information about changes of a user interface configuration manager.
  * @since OOo 2.0
  */
trait XUIConfigurationListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a configuration has inserted an user interface element.
    * @param Event provides information about the element which has been inserted.
    */
  def elementInserted(Event: ConfigurationEvent): Unit
  
  /**
    * is invoked when a configuration has removed an user interface element.
    * @param Event provides information about the element which has been removed.
    */
  def elementRemoved(Event: ConfigurationEvent): Unit
  
  /**
    * is invoked when a configuration has replaced an user interface element.
    * @param Event provides information about the element which has been inserted/replaced.
    */
  def elementReplaced(Event: ConfigurationEvent): Unit
}
object XUIConfigurationListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    elementInserted: ConfigurationEvent => Callback,
    elementRemoved: ConfigurationEvent => Callback,
    elementReplaced: ConfigurationEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XUIConfigurationListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), elementInserted = js.Any.fromFunction1((t0: ConfigurationEvent) => elementInserted(t0).runNow()), elementRemoved = js.Any.fromFunction1((t0: ConfigurationEvent) => elementRemoved(t0).runNow()), elementReplaced = js.Any.fromFunction1((t0: ConfigurationEvent) => elementReplaced(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUIConfigurationListener]
  }
  
  extension [Self <: XUIConfigurationListener](x: Self) {
    
    inline def setElementInserted(value: ConfigurationEvent => Callback): Self = StObject.set(x, "elementInserted", js.Any.fromFunction1((t0: ConfigurationEvent) => value(t0).runNow()))
    
    inline def setElementRemoved(value: ConfigurationEvent => Callback): Self = StObject.set(x, "elementRemoved", js.Any.fromFunction1((t0: ConfigurationEvent) => value(t0).runNow()))
    
    inline def setElementReplaced(value: ConfigurationEvent => Callback): Self = StObject.set(x, "elementReplaced", js.Any.fromFunction1((t0: ConfigurationEvent) => value(t0).runNow()))
  }
}
