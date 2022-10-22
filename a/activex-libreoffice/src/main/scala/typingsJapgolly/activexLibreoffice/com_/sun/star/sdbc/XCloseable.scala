package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for the releasing of resources acquired by the implementing object. */
trait XCloseable
  extends StObject
     with XInterface {
  
  /**
    * releases all resources connected to an object.
    * @throws SQLException if a database access error occurs.
    */
  def close(): Unit
}
object XCloseable {
  
  inline def apply(acquire: Callback, close: Callback, queryInterface: `type` => Any, release: Callback): XCloseable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, close = close.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCloseable]
  }
  
  extension [Self <: XCloseable](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
