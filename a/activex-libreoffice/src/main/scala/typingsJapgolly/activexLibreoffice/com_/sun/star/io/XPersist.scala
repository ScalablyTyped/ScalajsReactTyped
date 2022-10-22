package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to write this object to an URL or read it from an URL. */
trait XPersist
  extends StObject
     with XInterface {
  
  /** reads all the persistent data of the object from the URL. */
  def read(URL: String): Unit
  
  /** writes all the persistent data of the object to the URL. */
  def write(URL: String): Unit
}
object XPersist {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    read: String => Callback,
    release: Callback,
    write: String => Callback
  ): XPersist = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1((t0: String) => read(t0).runNow()), release = release.toJsFn, write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
    __obj.asInstanceOf[XPersist]
  }
  
  extension [Self <: XPersist](x: Self) {
    
    inline def setRead(value: String => Callback): Self = StObject.set(x, "read", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
