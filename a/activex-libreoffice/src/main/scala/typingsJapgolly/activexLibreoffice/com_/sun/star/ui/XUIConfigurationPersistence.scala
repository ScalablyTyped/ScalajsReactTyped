package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a persistence interface which supports to load/store user interface configuration data to a storage and to retrieve information about the
  * current state.
  * @since OOo 2.0
  */
trait XUIConfigurationPersistence
  extends StObject
     with XInterface {
  
  /**
    * provides the current modify state of the configuration manager instance.
    * @returns `TRUE` if the configuration manager has changed since the last {@link store()} call. `FALSE` if the configuration manager has not been changed.
    */
  def isModified(): Boolean
  
  /**
    * provides the current read-only state of the user configuration manager. Storing a user interface configuration to a read-only storage is not possible.
    * A read-only configuration manager instance will also not support any changes to its configuration settings.
    * @returns `TRUE` if the configuration manager storage is read-only otherwise `FALSE` .
    */
  def isReadOnly(): Boolean
  
  /**
    * reloads the configuration data from the storage and reinitialize the user interface configuration manager instance with this data.
    *
    * It is up to the implementation if it defers the first loading process until the first data request using {@link XUIConfigurationManager} interface.
    */
  def reload(): Unit
  
  /**
    * stores the configuration data to the storage provided by setStorage() from the storage and initialize the user interface configuration manager
    * instance with the newly data. This call can throw an {@link com.sun.star.io.IOException} if {@link store()} cannot store its data into the internal
    * storage.
    */
  def store(): Unit
  
  /**
    * stores the configuration data to the provided storage, ignoring the previously set storage by setStorage(). Can be used to make copy of the current
    * user interface configuration data to another storage. This call will throw an {@link com.sun.star.io.IOException} if the provided storage is in
    * read-only mode.
    * @param Storage all configuration data will be stored to this storage.
    */
  def storeToStorage(Storage: XStorage): Unit
}
object XUIConfigurationPersistence {
  
  inline def apply(
    acquire: Callback,
    isModified: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: Callback,
    store: Callback,
    storeToStorage: XStorage => Callback
  ): XUIConfigurationPersistence = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[XUIConfigurationPersistence]
  }
  
  extension [Self <: XUIConfigurationPersistence](x: Self) {
    
    inline def setIsModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "isModified", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
    
    inline def setStore(value: Callback): Self = StObject.set(x, "store", value.toJsFn)
    
    inline def setStoreToStorage(value: XStorage => Callback): Self = StObject.set(x, "storeToStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
  }
}
