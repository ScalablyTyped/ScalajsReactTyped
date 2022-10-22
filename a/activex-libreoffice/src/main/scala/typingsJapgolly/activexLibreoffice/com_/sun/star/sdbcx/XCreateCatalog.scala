package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** may be implemented to hide the complexity of creating a database catalog. */
trait XCreateCatalog
  extends StObject
     with XInterface {
  
  /**
    * creates the catalog by using a sequence of property values. The kind of properties depends on the provider.
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def createCatalog(info: SeqEquiv[PropertyValue]): Unit
}
object XCreateCatalog {
  
  inline def apply(
    acquire: Callback,
    createCatalog: SeqEquiv[PropertyValue] => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XCreateCatalog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createCatalog = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => createCatalog(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCreateCatalog]
  }
  
  extension [Self <: XCreateCatalog](x: Self) {
    
    inline def setCreateCatalog(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "createCatalog", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
