package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A registry (storage medium) for persistent property sets.
  * @author Kai Sommerfeld
  * @see XPersistentPropertySet
  * @version 1.0
  */
trait XPropertySetRegistry
  extends StObject
     with XInterface {
  
  /**
    * creates a new or opens an existing property set in the registry.
    * @param key The key to use for addressing the property set.
    * @param create Indicates whether a new set shall be created in case there does not already exist one for the given key.
    * @returns The property set.
    */
  def openPropertySet(key: String, create: Boolean): XPersistentPropertySet
  
  /**
    * removes a property set from the registry.
    * @param key The key to use for addressing the property set.
    */
  def removePropertySet(key: String): Unit
}
object XPropertySetRegistry {
  
  inline def apply(
    acquire: Callback,
    openPropertySet: (String, Boolean) => XPersistentPropertySet,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertySet: String => Callback
  ): XPropertySetRegistry = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, openPropertySet = js.Any.fromFunction2(openPropertySet), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertySet = js.Any.fromFunction1((t0: String) => removePropertySet(t0).runNow()))
    __obj.asInstanceOf[XPropertySetRegistry]
  }
  
  extension [Self <: XPropertySetRegistry](x: Self) {
    
    inline def setOpenPropertySet(value: (String, Boolean) => XPersistentPropertySet): Self = StObject.set(x, "openPropertySet", js.Any.fromFunction2(value))
    
    inline def setRemovePropertySet(value: String => Callback): Self = StObject.set(x, "removePropertySet", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
