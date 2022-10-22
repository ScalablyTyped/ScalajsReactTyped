package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * may be implemented to hide the complexity of dropping a database catalog. Could normally be used only in offline mode, no connection on the database.
  * This should be checked by the driver.
  */
trait XDropCatalog
  extends StObject
     with XInterface {
  
  /**
    * drops a catalog identified by its name.
    * @param catalogName the catalog name
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropCatalog(catalogName: String, info: SeqEquiv[PropertyValue]): Unit
}
object XDropCatalog {
  
  inline def apply(
    acquire: Callback,
    dropCatalog: (String, SeqEquiv[PropertyValue]) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDropCatalog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dropCatalog = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (dropCatalog(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDropCatalog]
  }
  
  extension [Self <: XDropCatalog](x: Self) {
    
    inline def setDropCatalog(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "dropCatalog", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
  }
}
