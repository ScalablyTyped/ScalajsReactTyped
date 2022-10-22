package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives load-related events from a loadable object.
  *
  * The interface is typically implemented by data-bound components, which want to listen to the data source that contains their database form.
  * @see com.sun.star.form.XLoadable
  * @see DataAwareControlModel
  */
trait XLoadListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when the object has successfully connected to a datasource.
    * @param aEvent the event happened.
    */
  def loaded(aEvent: EventObject): Unit
  
  /**
    * is invoked when the object has been reloaded.
    * @param aEvent the event happened.
    */
  def reloaded(aEvent: EventObject): Unit
  
  /**
    * is invoked when the object is about to be reloaded.
    *
    * Components may use this to stop any other event processing related to the event source until they get the reloaded event.
    * @param aEvent the event happened.
    */
  def reloading(aEvent: EventObject): Unit
  
  /**
    * is invoked after the object has disconnected from a datasource.
    * @param aEvent the event happened.
    */
  def unloaded(aEvent: EventObject): Unit
  
  /**
    * is invoked when the object is about to be unloaded.
    *
    * Components may use this to stop any other event processing related to the event source before the object is unloaded.
    * @param aEvent the event happened.
    */
  def unloading(aEvent: EventObject): Unit
}
object XLoadListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    loaded: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    reloaded: EventObject => Callback,
    reloading: EventObject => Callback,
    unloaded: EventObject => Callback,
    unloading: EventObject => Callback
  ): XLoadListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), loaded = js.Any.fromFunction1((t0: EventObject) => loaded(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reloaded = js.Any.fromFunction1((t0: EventObject) => reloaded(t0).runNow()), reloading = js.Any.fromFunction1((t0: EventObject) => reloading(t0).runNow()), unloaded = js.Any.fromFunction1((t0: EventObject) => unloaded(t0).runNow()), unloading = js.Any.fromFunction1((t0: EventObject) => unloading(t0).runNow()))
    __obj.asInstanceOf[XLoadListener]
  }
  
  extension [Self <: XLoadListener](x: Self) {
    
    inline def setLoaded(value: EventObject => Callback): Self = StObject.set(x, "loaded", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setReloaded(value: EventObject => Callback): Self = StObject.set(x, "reloaded", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setReloading(value: EventObject => Callback): Self = StObject.set(x, "reloading", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setUnloaded(value: EventObject => Callback): Self = StObject.set(x, "unloaded", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setUnloading(value: EventObject => Callback): Self = StObject.set(x, "unloading", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
