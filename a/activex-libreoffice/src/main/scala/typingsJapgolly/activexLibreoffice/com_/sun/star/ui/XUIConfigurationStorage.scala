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
  * supplies functions to change or get information about the storage of a user interface configuration manager.
  * @since OOo 2.0
  */
trait XUIConfigurationStorage
  extends StObject
     with XInterface {
  
  /**
    * checks if an instance has already a storage to load/store its data.
    * @returns `TRUE` if the instance has a storage otherwise `FALSE` .
    */
  def hasStorage(): Boolean
  
  /**
    * connects a storage to the user interface configuration manager which is used on subsequent calls of load() and store().
    * @param Storage all configuration data is loaded/stored from/into this storage. If the storage is in read/write mode load() and store() can be used other
    */
  def setStorage(Storage: XStorage): Unit
}
object XUIConfigurationStorage {
  
  inline def apply(
    acquire: Callback,
    hasStorage: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setStorage: XStorage => Callback
  ): XUIConfigurationStorage = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasStorage = hasStorage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setStorage = js.Any.fromFunction1((t0: XStorage) => setStorage(t0).runNow()))
    __obj.asInstanceOf[XUIConfigurationStorage]
  }
  
  extension [Self <: XUIConfigurationStorage](x: Self) {
    
    inline def setHasStorage(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasStorage", value.toJsFn)
    
    inline def setSetStorage(value: XStorage => Callback): Self = StObject.set(x, "setStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
  }
}
