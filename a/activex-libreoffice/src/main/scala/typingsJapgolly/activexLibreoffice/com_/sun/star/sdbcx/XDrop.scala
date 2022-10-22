package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to remove an element of its container and to drop it from the related database. */
trait XDrop
  extends StObject
     with XInterface {
  
  /**
    * drops an object of the related container identified by its position.
    * @param index the position of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByIndex(index: Double): Unit
  
  /**
    * drops an object of the related container identified by its name.
    * @param elementName the name of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByName(elementName: String): Unit
}
object XDrop {
  
  inline def apply(
    acquire: Callback,
    dropByIndex: Double => Callback,
    dropByName: String => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDrop = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dropByIndex = js.Any.fromFunction1((t0: Double) => dropByIndex(t0).runNow()), dropByName = js.Any.fromFunction1((t0: String) => dropByName(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDrop]
  }
  
  extension [Self <: XDrop](x: Self) {
    
    inline def setDropByIndex(value: Double => Callback): Self = StObject.set(x, "dropByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDropByName(value: String => Callback): Self = StObject.set(x, "dropByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
