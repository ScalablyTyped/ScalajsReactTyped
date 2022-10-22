package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to implement objects which may be loaded.
  *
  * The object is typically implemented by high-level objects which can connect to a data source.
  * @see XLoadListener
  */
trait XLoadable
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive load-related events
    * @param aListener the listener to add.
    */
  def addLoadListener(aListener: XLoadListener): Unit
  
  /** returns if the object is in loaded state. */
  def isLoaded(): Boolean
  
  /**
    * loads the data.
    *
    * If the data is already loaded (->isLoaded), then the method returns silently. In this case, you should use ->reload.
    */
  def load(): Unit
  
  /**
    * does a smart refresh of the object.
    *
    * The final state will be the same as if unload and load were called, but reload is the more efficient way to do the same. If the object isn't loaded,
    * nothing happens.
    */
  def reload(): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    */
  def removeLoadListener(aListener: XLoadListener): Unit
  
  /** unloads the data. */
  def unload(): Unit
}
object XLoadable {
  
  inline def apply(
    acquire: Callback,
    addLoadListener: XLoadListener => Callback,
    isLoaded: CallbackTo[Boolean],
    load: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    reload: Callback,
    removeLoadListener: XLoadListener => Callback,
    unload: Callback
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addLoadListener = js.Any.fromFunction1((t0: XLoadListener) => addLoadListener(t0).runNow()), isLoaded = isLoaded.toJsFn, load = load.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeLoadListener = js.Any.fromFunction1((t0: XLoadListener) => removeLoadListener(t0).runNow()), unload = unload.toJsFn)
    __obj.asInstanceOf[XLoadable]
  }
  
  extension [Self <: XLoadable](x: Self) {
    
    inline def setAddLoadListener(value: XLoadListener => Callback): Self = StObject.set(x, "addLoadListener", js.Any.fromFunction1((t0: XLoadListener) => value(t0).runNow()))
    
    inline def setIsLoaded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoaded", value.toJsFn)
    
    inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
    
    inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
    
    inline def setRemoveLoadListener(value: XLoadListener => Callback): Self = StObject.set(x, "removeLoadListener", js.Any.fromFunction1((t0: XLoadListener) => value(t0).runNow()))
    
    inline def setUnload(value: Callback): Self = StObject.set(x, "unload", value.toJsFn)
  }
}
