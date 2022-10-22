package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access contents via a unique ID. */
trait XUniqueIDAccess
  extends StObject
     with XInterface {
  
  /** @returns the element with the specified unique ID. */
  def getByUniqueID(ID: String): Any
  
  /** removes the element with the specified unique ID from this container. */
  def removeByUniqueID(ID: String): Unit
}
object XUniqueIDAccess {
  
  inline def apply(
    acquire: Callback,
    getByUniqueID: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeByUniqueID: String => Callback
  ): XUniqueIDAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getByUniqueID = js.Any.fromFunction1(getByUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByUniqueID = js.Any.fromFunction1((t0: String) => removeByUniqueID(t0).runNow()))
    __obj.asInstanceOf[XUniqueIDAccess]
  }
  
  extension [Self <: XUniqueIDAccess](x: Self) {
    
    inline def setGetByUniqueID(value: String => Any): Self = StObject.set(x, "getByUniqueID", js.Any.fromFunction1(value))
    
    inline def setRemoveByUniqueID(value: String => Callback): Self = StObject.set(x, "removeByUniqueID", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
